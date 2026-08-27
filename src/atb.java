import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.io.File;
import java.net.SocketAddress;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public abstract class atb {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final vu f = vu.c("chat.filtered_full");
   public static final vu g = vu.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<apg> l = Lists.newArrayList();
   private final Map<UUID, apg> m = Maps.newHashMap();
   private final ath n = new ath(b);
   private final asy o = new asy(c);
   private final atc p = new atc(d);
   private final atj q = new atj(e);
   private final Map<UUID, aue> r = Maps.newHashMap();
   private final Map<UUID, ajp> s = Maps.newHashMap();
   private final ekp t;
   private boolean u;
   private final is<ajq> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public atb(MinecraftServer $$0, is<ajq> $$1, ekp $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(us $$0, apg $$1, apu $$2) {
      GameProfile $$3 = $$1.fY();
      asx $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<ta> $$8 = this.a($$1);
      ajg<cxb> $$9 = $$8.<ajg<cxb>>flatMap($$0x -> dqo.a(new Dynamic(to.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(cxb.h);
      apf $$10 = this.k.a($$9);
      apf $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bn());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.dr(), $$1.dt(), $$1.dx()});
      eki $$14 = $$11.A_();
      $$1.c($$8.orElse(null));
      aqe $$15 = new aqe(this.k, $$0, $$1, $$2);
      $$0.a(aey.a.bind(vf.a(this.k.bd())), $$15);
      cwx $$16 = $$11.Z();
      boolean $$17 = $$16.b(cwx.D);
      boolean $$18 = $$16.b(cwx.q);
      boolean $$19 = $$16.b(cwx.w);
      $$15.b(new acd($$1.aj(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aB()));
      $$15.b(new aaz($$14.q(), $$14.r()));
      $$15.b(new acm($$1.ga()));
      $$15.b(new adl($$1.fZ().l));
      $$15.b(new aet(this.k.aJ().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      wi $$20;
      if ($$1.fY().getName().equalsIgnoreCase($$6)) {
         $$20 = vu.a("multiplayer.player.joined", $$1.O_());
      } else {
         $$20 = vu.a("multiplayer.player.joined.renamed", $$1.O_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
      aig $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(acs.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cw(), $$1);
      this.a(acs.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aO().a($$1);

      for (bok $$23 : $$1.eu()) {
         $$15.b(new aes($$1.aj(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         ta $$24 = $$8.get().p("RootVehicle");
         box $$25 = bpd.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cw().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (box $$28 : $$25.cT()) {
                  if ($$28.cw().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bO()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (box $$29 : $$25.cT()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ajy $$0, apg $$1) {
      Set<eqp> $$2 = Sets.newHashSet();

      for (eqs $$3 : $$0.g()) {
         $$1.d.b(ady.a($$3, true));
      }

      for (eqo $$4 : eqo.values()) {
         eqp $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (yb<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(apf $$0) {
      $$0.C_().a(new doq() {
         @Override
         public void a(dos $$0, double $$1) {
            atb.this.a(new adh($$0));
         }

         @Override
         public void a(dos $$0, double $$1, double $$2, long $$3) {
            atb.this.a(new adg($$0));
         }

         @Override
         public void a(dos $$0, double $$1, double $$2) {
            atb.this.a(new adf($$0));
         }

         @Override
         public void a(dos $$0, int $$1) {
            atb.this.a(new adi($$0));
         }

         @Override
         public void b(dos $$0, int $$1) {
            atb.this.a(new adj($$0));
         }

         @Override
         public void b(dos $$0, double $$1) {
         }

         @Override
         public void c(dos $$0, double $$1) {
         }
      });
   }

   public Optional<ta> a(apg $$0) {
      ta $$1 = this.k.bc().w();
      Optional<ta> $$2;
      if (this.k.a($$0.fY()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(apg $$0) {
      this.t.a($$0);
      aue $$1 = this.r.get($$0.cw());
      if ($$1 != null) {
         $$1.a();
      }

      ajp $$2 = this.s.get($$0.cw());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(apg $$0) {
      apf $$1 = $$0.z();
      $$0.a(aui.j);
      this.b($$0);
      if ($$0.bO()) {
         box $$2 = $$0.cW();
         if ($$2.cV()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cS().forEach($$0x -> $$0x.b(box.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, box.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aO().b($$0);
      UUID $$3 = $$0.cw();
      apg $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new acr(List.of($$0.cw())));
   }

   @Nullable
   public vu a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         ati $$2 = this.n.b($$1);
         wi $$3 = vu.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(vu.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return vu.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         asz $$4 = this.o.b($$0);
         wi $$5 = vu.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(vu.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? vu.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public apg a(GameProfile $$0, aou $$1) {
      return new apg(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<apg> $$2 = Sets.newIdentityHashSet();

      for (apg $$3 : this.l) {
         if ($$3.cw().equals($$1)) {
            $$2.add($$3);
         }
      }

      apg $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (apg $$5 : $$2) {
         $$5.d.b(g);
      }

      return !$$2.isEmpty();
   }

   public apg a(apg $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, box.c.b);
      ib $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      apf $$5 = this.k.a($$0.T());
      Optional<ept> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = ciu.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      apf $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      apg $$9 = new apg(this.k, $$8, $$0.fY(), $$0.B());
      $$9.d = $$0.d;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fr());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dnb $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(dae.pl);
         ept $$14 = $$6.get();
         float $$17;
         if (!$$12.a(aun.R) && !$$13) {
            $$17 = $$3;
         } else {
            ept $$15 = ept.c($$2).d($$14).d();
            $$17 = (float)aww.d(aww.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ad(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.d.b(new abt(abt.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dt() < (double)$$8.ak()) {
         $$9.a_($$9.dr(), $$9.dt() + 1.0, $$9.dx());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      apf $$19 = $$9.z();
      eki $$20 = $$19.A_();
      $$9.d.b(new acz($$9.d($$19), $$18));
      $$9.d.a($$9.dr(), $$9.dt(), $$9.dx(), $$9.dC(), $$9.dE());
      $$9.d.b(new ado($$8.T(), $$8.U()));
      $$9.d.b(new aaz($$20.q(), $$20.r()));
      $$9.d.b(new adu($$9.co, $$9.cn, $$9.cm));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cw(), $$9);
      $$9.h();
      $$9.t($$9.ex());
      if ($$11) {
         $$9.d.b(new aeg(aty.uZ, atz.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.E_().g()));
      }

      return $$9;
   }

   public void d(apg $$0) {
      GameProfile $$1 = $$0.fY();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new acs(EnumSet.of(acs.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(yb<?> $$0) {
      for (apg $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(yb<?> $$0, ajg<cxb> $$1) {
      for (apg $$2 : this.l) {
         if ($$2.dM().ad() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(ciu $$0, vu $$1) {
      eqz $$2 = $$0.cg();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            apg $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(ciu $$0, vu $$1) {
      eqz $$2 = $$0.cg();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            apg $$4 = this.l.get($$3);
            if ($$4.cg() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fY().getName();
      }

      return $$0;
   }

   public ath f() {
      return this.n;
   }

   public asy g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new atd($$0, this.k.k(), this.p.a($$0)));
      apg $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      apg $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(apg $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new abq($$0, $$2));
      }

      this.k.aH().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.bc().m() || this.y;
   }

   @Nullable
   public apg a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         apg $$3 = this.l.get($$2);
         if ($$3.fY().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable ciu $$0, double $$1, double $$2, double $$3, double $$4, ajg<cxb> $$5, yb<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         apg $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dM().ad() == $$5) {
            double $$9 = $$1 - $$8.dr();
            double $$10 = $$2 - $$8.dt();
            double $$11 = $$3 - $$8.dx();
            if ($$9 * $$9 + $$10 * $$10 + $$11 * $$11 < $$4 * $$4) {
               $$8.d.b($$6);
            }
         }
      }
   }

   public void h() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.b(this.l.get($$0));
      }
   }

   public atj i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public atc k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(apg $$0, apf $$1) {
      dos $$2 = this.k.I().C_();
      $$0.d.b(new abw($$2));
      $$0.d.b(new aec($$1.X(), $$1.Y(), $$1.Z().b(cwx.l)));
      $$0.d.b(new ado($$1.T(), $$1.U()));
      if ($$1.ab()) {
         $$0.d.b(new abt(abt.c, 0.0F));
         $$0.d.b(new abt(abt.i, $$1.d(1.0F)));
         $$0.d.b(new abt(abt.j, $$1.b(1.0F)));
      }

      $$0.d.b(new abt(abt.o, 0.0F));
      this.k.aR().a($$0);
   }

   public void e(apg $$0) {
      $$0.bY.b();
      $$0.w();
      $$0.d.b(new adl($$0.fZ().l));
   }

   public int m() {
      return this.l.size();
   }

   public int n() {
      return this.h;
   }

   public boolean o() {
      return this.u;
   }

   public void a(boolean $$0) {
      this.u = $$0;
   }

   public List<apg> b(String $$0) {
      List<apg> $$1 = Lists.newArrayList();

      for (apg $$2 : this.l) {
         if ($$2.A().equals($$0)) {
            $$1.add($$2);
         }
      }

      return $$1;
   }

   public int p() {
      return this.w;
   }

   public int q() {
      return this.x;
   }

   public MinecraftServer c() {
      return this.k;
   }

   @Nullable
   public ta r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).d.b(vu.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(vu $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(vu $$0, Function<apg, vu> $$1, boolean $$2) {
      this.k.a($$0);

      for (apg $$3 : this.l) {
         vu $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(wk $$0, du $$1, vq.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(wk $$0, apg $$1, vq.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(wk $$0, Predicate<apg> $$1, @Nullable apg $$2, vq.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      wj $$5 = wj.a($$0);
      boolean $$6 = false;

      for (apg $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(wk $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public aue a(ciu $$0) {
      UUID $$1 = $$0.cw();
      aue $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ekk.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new aue(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public ajp f(apg $$0) {
      UUID $$1 = $$0.cw();
      ajp $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ekk.a).resolve($$1 + ".json");
         $$2 = new ajp(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new adn($$0));

      for (apf $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new aea($$0));

      for (apf $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<apg> t() {
      return this.l;
   }

   @Nullable
   public apg a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (ajp $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new yq(avg.a(this.v)));
      aet $$1 = new aet(this.k.aJ().b());

      for (apg $$2 : this.l) {
         $$2.d.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
