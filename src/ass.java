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

public abstract class ass {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final vs f = vs.c("chat.filtered_full");
   public static final vs g = vs.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<apb> l = Lists.newArrayList();
   private final Map<UUID, apb> m = Maps.newHashMap();
   private final asy n = new asy(b);
   private final asp o = new asp(c);
   private final ast p = new ast(d);
   private final ata q = new ata(e);
   private final Map<UUID, atv> r = Maps.newHashMap();
   private final Map<UUID, ajk> s = Maps.newHashMap();
   private final ejr t;
   private boolean u;
   private final is<ajl> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public ass(MinecraftServer $$0, is<ajl> $$1, ejr $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(uq $$0, apb $$1, app $$2) {
      GameProfile $$3 = $$1.fU();
      aso $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<sy> $$8 = this.a($$1);
      ajb<cwe> $$9 = $$8.<ajb<cwe>>flatMap($$0x -> dpq.a(new Dynamic(tm.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(cwe.h);
      apa $$10 = this.k.a($$9);
      apa $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bn());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.do(), $$1.dq(), $$1.du()});
      ejk $$14 = $$11.B_();
      $$1.c($$8.orElse(null));
      apz $$15 = new apz(this.k, $$0, $$1, $$2);
      $$0.a(aeu.a.bind(vd.a(this.k.bd())), $$15);
      cwa $$16 = $$11.Z();
      boolean $$17 = $$16.b(cwa.D);
      boolean $$18 = $$16.b(cwa.q);
      boolean $$19 = $$16.b(cwa.w);
      $$15.b(new abz($$1.aj(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aB()));
      $$15.b(new aav($$14.q(), $$14.r()));
      $$15.b(new aci($$1.fW()));
      $$15.b(new adh($$1.fV().l));
      $$15.b(new aep(this.k.aJ().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      wg $$20;
      if ($$1.fU().getName().equalsIgnoreCase($$6)) {
         $$20 = vs.a("multiplayer.player.joined", $$1.Q_());
      } else {
         $$20 = vs.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.do(), $$1.dq(), $$1.du(), $$1.dz(), $$1.dB());
      aic $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(aco.a(this.l));
      this.l.add($$1);
      this.m.put($$1.ct(), $$1);
      this.a(aco.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aO().a($$1);

      for (bns $$23 : $$1.er()) {
         $$15.b(new aeo($$1.aj(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         sy $$24 = $$8.get().p("RootVehicle");
         bof $$25 = bol.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.ct().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (bof $$28 : $$25.cQ()) {
                  if ($$28.ct().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bL()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (bof $$29 : $$25.cQ()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ajt $$0, apb $$1) {
      Set<epr> $$2 = Sets.newHashSet();

      for (epu $$3 : $$0.g()) {
         $$1.d.b(adu.a($$3, true));
      }

      for (epq $$4 : epq.values()) {
         epr $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (xz<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(apa $$0) {
      $$0.D_().a(new dnt() {
         @Override
         public void a(dnv $$0, double $$1) {
            ass.this.a(new add($$0));
         }

         @Override
         public void a(dnv $$0, double $$1, double $$2, long $$3) {
            ass.this.a(new adc($$0));
         }

         @Override
         public void a(dnv $$0, double $$1, double $$2) {
            ass.this.a(new adb($$0));
         }

         @Override
         public void a(dnv $$0, int $$1) {
            ass.this.a(new ade($$0));
         }

         @Override
         public void b(dnv $$0, int $$1) {
            ass.this.a(new adf($$0));
         }

         @Override
         public void b(dnv $$0, double $$1) {
         }

         @Override
         public void c(dnv $$0, double $$1) {
         }
      });
   }

   public Optional<sy> a(apb $$0) {
      sy $$1 = this.k.bc().w();
      Optional<sy> $$2;
      if (this.k.a($$0.fU()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(apb $$0) {
      this.t.a($$0);
      atv $$1 = this.r.get($$0.ct());
      if ($$1 != null) {
         $$1.a();
      }

      ajk $$2 = this.s.get($$0.ct());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(apb $$0) {
      apa $$1 = $$0.z();
      $$0.a(atz.j);
      this.b($$0);
      if ($$0.bL()) {
         bof $$2 = $$0.cT();
         if ($$2.cS()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cP().forEach($$0x -> $$0x.b(bof.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, bof.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aO().b($$0);
      UUID $$3 = $$0.ct();
      apb $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new acn(List.of($$0.ct())));
   }

   @Nullable
   public vs a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         asz $$2 = this.n.b($$1);
         wg $$3 = vs.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(vs.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return vs.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         asq $$4 = this.o.b($$0);
         wg $$5 = vs.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(vs.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? vs.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public apb a(GameProfile $$0, aop $$1) {
      return new apb(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<apb> $$2 = Sets.newIdentityHashSet();

      for (apb $$3 : this.l) {
         if ($$3.ct().equals($$1)) {
            $$2.add($$3);
         }
      }

      apb $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (apb $$5 : $$2) {
         $$5.d.b(g);
      }

      return !$$2.isEmpty();
   }

   public apb a(apb $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, bof.c.b);
      ib $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      apa $$5 = this.k.a($$0.T());
      Optional<eov> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cia.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      apa $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      apb $$9 = new apb(this.k, $$8, $$0.fU(), $$0.B());
      $$9.d = $$0.d;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fo());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dme $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(czh.pl);
         eov $$14 = $$6.get();
         float $$17;
         if (!$$12.a(aue.R) && !$$13) {
            $$17 = $$3;
         } else {
            eov $$15 = eov.c($$2).d($$14).d();
            $$17 = (float)awm.d(awm.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ad(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.d.b(new abp(abp.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dq() < (double)$$8.ak()) {
         $$9.a_($$9.do(), $$9.dq() + 1.0, $$9.du());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      apa $$19 = $$9.z();
      ejk $$20 = $$19.B_();
      $$9.d.b(new acv($$9.d($$19), $$18));
      $$9.d.a($$9.do(), $$9.dq(), $$9.du(), $$9.dz(), $$9.dB());
      $$9.d.b(new adk($$8.T(), $$8.U()));
      $$9.d.b(new aav($$20.q(), $$20.r()));
      $$9.d.b(new adq($$9.cm, $$9.cl, $$9.ck));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.ct(), $$9);
      $$9.h();
      $$9.t($$9.eu());
      if ($$11) {
         $$9.d.b(new aec(atp.uR, atq.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.F_().g()));
      }

      return $$9;
   }

   public void d(apb $$0) {
      GameProfile $$1 = $$0.fU();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aco(EnumSet.of(aco.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(xz<?> $$0) {
      for (apb $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(xz<?> $$0, ajb<cwe> $$1) {
      for (apb $$2 : this.l) {
         if ($$2.dJ().ad() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(cia $$0, vs $$1) {
      eqb $$2 = $$0.cd();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            apb $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cia $$0, vs $$1) {
      eqb $$2 = $$0.cd();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            apb $$4 = this.l.get($$3);
            if ($$4.cd() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fU().getName();
      }

      return $$0;
   }

   public asy f() {
      return this.n;
   }

   public asp g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new asu($$0, this.k.k(), this.p.a($$0)));
      apb $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      apb $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(apb $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new abm($$0, $$2));
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
   public apb a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         apb $$3 = this.l.get($$2);
         if ($$3.fU().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cia $$0, double $$1, double $$2, double $$3, double $$4, ajb<cwe> $$5, xz<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         apb $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dJ().ad() == $$5) {
            double $$9 = $$1 - $$8.do();
            double $$10 = $$2 - $$8.dq();
            double $$11 = $$3 - $$8.du();
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

   public ata i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public ast k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(apb $$0, apa $$1) {
      dnv $$2 = this.k.I().D_();
      $$0.d.b(new abs($$2));
      $$0.d.b(new ady($$1.X(), $$1.Y(), $$1.Z().b(cwa.l)));
      $$0.d.b(new adk($$1.T(), $$1.U()));
      if ($$1.ab()) {
         $$0.d.b(new abp(abp.c, 0.0F));
         $$0.d.b(new abp(abp.i, $$1.d(1.0F)));
         $$0.d.b(new abp(abp.j, $$1.b(1.0F)));
      }

      $$0.d.b(new abp(abp.o, 0.0F));
      this.k.aR().a($$0);
   }

   public void e(apb $$0) {
      $$0.bW.b();
      $$0.w();
      $$0.d.b(new adh($$0.fV().l));
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

   public List<apb> b(String $$0) {
      List<apb> $$1 = Lists.newArrayList();

      for (apb $$2 : this.l) {
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
   public sy r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).d.b(vs.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(vs $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(vs $$0, Function<apb, vs> $$1, boolean $$2) {
      this.k.a($$0);

      for (apb $$3 : this.l) {
         vs $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(wi $$0, du $$1, vo.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(wi $$0, apb $$1, vo.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(wi $$0, Predicate<apb> $$1, @Nullable apb $$2, vo.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      wh $$5 = wh.a($$0);
      boolean $$6 = false;

      for (apb $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(wi $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public atv a(cia $$0) {
      UUID $$1 = $$0.ct();
      atv $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(ejm.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new atv(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public ajk f(apb $$0) {
      UUID $$1 = $$0.ct();
      ajk $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(ejm.a).resolve($$1 + ".json");
         $$2 = new ajk(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new adj($$0));

      for (apa $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new adw($$0));

      for (apa $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<apb> t() {
      return this.l;
   }

   @Nullable
   public apb a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (ajk $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new yo(auw.a(this.v)));
      aep $$1 = new aep(this.k.aJ().b());

      for (apb $$2 : this.l) {
         $$2.d.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
