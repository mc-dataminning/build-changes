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

public abstract class aso {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final vq f = vq.c("chat.filtered_full");
   public static final vq g = vq.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aox> l = Lists.newArrayList();
   private final Map<UUID, aox> m = Maps.newHashMap();
   private final asu n = new asu(b);
   private final asl o = new asl(c);
   private final asp p = new asp(d);
   private final asw q = new asw(e);
   private final Map<UUID, atr> r = Maps.newHashMap();
   private final Map<UUID, ajg> s = Maps.newHashMap();
   private final eiv t;
   private boolean u;
   private final iq<ajh> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public aso(MinecraftServer $$0, iq<ajh> $$1, eiv $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(uo $$0, aox $$1, apl $$2) {
      GameProfile $$3 = $$1.fS();
      ask $$4 = this.k.at();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<sw> $$8 = this.a($$1);
      aix<cvr> $$9 = $$8.<aix<cvr>>flatMap($$0x -> dov.a(new Dynamic(tk.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(cvr.h);
      aow $$10 = this.k.a($$9);
      aow $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.H();
      } else {
         $$11 = $$10;
      }

      $$1.c($$11);
      String $$13 = $$0.a(this.k.bl());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.ad().getString(), $$13, $$1.aj(), $$1.dr(), $$1.dt(), $$1.dx()});
      eio $$14 = $$11.B_();
      $$1.c($$8.orElse(null));
      apv $$15 = new apv(this.k, $$0, $$1, $$2);
      $$0.a(aer.a.bind(vb.a(this.k.bb())), $$15);
      cvn $$16 = $$11.Z();
      boolean $$17 = $$16.b(cvn.D);
      boolean $$18 = $$16.b(cvn.q);
      boolean $$19 = $$16.b(cvn.w);
      $$15.b(new abw($$1.aj(), $$14.l(), this.k.I(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.d($$11), this.k.aA()));
      $$15.b(new aat($$14.q(), $$14.r()));
      $$15.b(new acf($$1.fU()));
      $$15.b(new ade($$1.fT().l));
      $$15.b(new aem(this.k.aI().b()));
      this.d($$1);
      $$1.H().c();
      $$1.I().a($$1);
      this.a($$11.f(), $$1);
      this.k.av();
      we $$20;
      if ($$1.fS().getName().equalsIgnoreCase($$6)) {
         $$20 = vq.a("multiplayer.player.joined", $$1.Q_());
      } else {
         $$20 = vq.a("multiplayer.player.joined.renamed", $$1.Q_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dr(), $$1.dt(), $$1.dx(), $$1.dC(), $$1.dE());
      ahy $$22 = this.k.au();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(acl.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cw(), $$1);
      this.a(acl.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aN().a($$1);

      for (bnd $$23 : $$1.et()) {
         $$15.b(new ael($$1.aj(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         sw $$24 = $$8.get().p("RootVehicle");
         bnq $$25 = bnw.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
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
               for (bnq $$28 : $$25.cT()) {
                  if ($$28.cw().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bO()) {
               a.warn("Couldn't reattach entity to player");
               $$25.am();

               for (bnq $$29 : $$25.cT()) {
                  $$29.am();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(ajp $$0, aox $$1) {
      Set<eov> $$2 = Sets.newHashSet();

      for (eoy $$3 : $$0.g()) {
         $$1.d.b(adr.a($$3, true));
      }

      for (eou $$4 : eou.values()) {
         eov $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (xx<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aow $$0) {
      $$0.D_().a(new dmy() {
         @Override
         public void a(dna $$0, double $$1) {
            aso.this.a(new ada($$0));
         }

         @Override
         public void a(dna $$0, double $$1, double $$2, long $$3) {
            aso.this.a(new acz($$0));
         }

         @Override
         public void a(dna $$0, double $$1, double $$2) {
            aso.this.a(new acy($$0));
         }

         @Override
         public void a(dna $$0, int $$1) {
            aso.this.a(new adb($$0));
         }

         @Override
         public void b(dna $$0, int $$1) {
            aso.this.a(new adc($$0));
         }

         @Override
         public void b(dna $$0, double $$1) {
         }

         @Override
         public void c(dna $$0, double $$1) {
         }
      });
   }

   public Optional<sw> a(aox $$0) {
      sw $$1 = this.k.ba().w();
      Optional<sw> $$2;
      if (this.k.a($$0.fS()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aox $$0) {
      this.t.a($$0);
      atr $$1 = this.r.get($$0.cw());
      if ($$1 != null) {
         $$1.a();
      }

      ajg $$2 = this.s.get($$0.cw());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aox $$0) {
      aow $$1 = $$0.z();
      $$0.a(atv.j);
      this.b($$0);
      if ($$0.bO()) {
         bnq $$2 = $$0.cW();
         if ($$2.cV()) {
            a.debug("Removing player mount");
            $$0.ac();
            $$2.cS().forEach($$0x -> $$0x.b(bnq.c.d));
         }
      }

      $$0.ag();
      $$1.a($$0, bnq.c.d);
      $$0.Q().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cw();
      aox $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new ack(List.of($$0.cw())));
   }

   @Nullable
   public vq a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         asv $$2 = this.n.b($$1);
         we $$3 = vq.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.b(vq.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return vq.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         asm $$4 = this.o.b($$0);
         we $$5 = vq.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.b(vq.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? vq.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aox a(GameProfile $$0, aol $$1) {
      return new aox(this.k, this.k.H(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aox> $$2 = Sets.newIdentityHashSet();

      for (aox $$3 : this.l) {
         if ($$3.cw().equals($$1)) {
            $$2.add($$3);
         }
      }

      aox $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aox $$5 : $$2) {
         $$5.d.b(g);
      }

      return !$$2.isEmpty();
   }

   public aox a(aox $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.z().a($$0, bnq.c.b);
      hz $$2 = $$0.R();
      float $$3 = $$0.S();
      boolean $$4 = $$0.U();
      aow $$5 = this.k.a($$0.T());
      Optional<enz> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = chl.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aow $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.H();
      aox $$9 = new aox(this.k, $$8, $$0.fS(), $$0.B());
      $$9.d = $$0.d;
      $$9.a($$0, $$1);
      $$9.e($$0.aj());
      $$9.a($$0.fm());

      for (String $$10 : $$0.ak()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dlj $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(cyu.pl);
         enz $$14 = $$6.get();
         float $$17;
         if (!$$12.a(aua.R) && !$$13) {
            $$17 = $$3;
         } else {
            enz $$15 = enz.c($$2).d($$14).d();
            $$17 = (float)awi.d(awi.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.ad(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.d.b(new abm(abm.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dt() < (double)$$8.ak()) {
         $$9.a_($$9.dr(), $$9.dt() + 1.0, $$9.dx());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aow $$19 = $$9.z();
      eio $$20 = $$19.B_();
      $$9.d.b(new acs($$9.d($$19), $$18));
      $$9.d.a($$9.dr(), $$9.dt(), $$9.dx(), $$9.dC(), $$9.dE());
      $$9.d.b(new adh($$8.T(), $$8.U()));
      $$9.d.b(new aat($$20.q(), $$20.r()));
      $$9.d.b(new adn($$9.cl, $$9.ck, $$9.cj));
      this.a($$9, $$8);
      this.d($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cw(), $$9);
      $$9.h();
      $$9.t($$9.ew());
      if ($$11) {
         $$9.d.b(new adz(atl.uR, atm.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.F_().g()));
      }

      return $$9;
   }

   public void d(aox $$0) {
      GameProfile $$1 = $$0.fS();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new acl(EnumSet.of(acl.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(xx<?> $$0) {
      for (aox $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(xx<?> $$0, aix<cvr> $$1) {
      for (aox $$2 : this.l) {
         if ($$2.dM().ad() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(chl $$0, vq $$1) {
      epf $$2 = $$0.cg();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aox $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(chl $$0, vq $$1) {
      epf $$2 = $$0.cg();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aox $$4 = this.l.get($$3);
            if ($$4.cg() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).fS().getName();
      }

      return $$0;
   }

   public asu f() {
      return this.n;
   }

   public asl g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new asq($$0, this.k.i(), this.p.a($$0)));
      aox $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aox $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.d($$1);
      }
   }

   private void a(aox $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new abj($$0, $$2));
      }

      this.k.aG().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.ba().m() || this.y;
   }

   @Nullable
   public aox a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aox $$3 = this.l.get($$2);
         if ($$3.fS().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable chl $$0, double $$1, double $$2, double $$3, double $$4, aix<cvr> $$5, xx<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aox $$8 = this.l.get($$7);
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

   public asw i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public asp k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aox $$0, aow $$1) {
      dna $$2 = this.k.H().D_();
      $$0.d.b(new abp($$2));
      $$0.d.b(new adv($$1.X(), $$1.Y(), $$1.Z().b(cvn.l)));
      $$0.d.b(new adh($$1.T(), $$1.U()));
      if ($$1.ab()) {
         $$0.d.b(new abm(abm.c, 0.0F));
         $$0.d.b(new abm(abm.i, $$1.d(1.0F)));
         $$0.d.b(new abm(abm.j, $$1.b(1.0F)));
      }

      $$0.d.b(new abm(abm.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void e(aox $$0) {
      $$0.bV.b();
      $$0.w();
      $$0.d.b(new ade($$0.fT().l));
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

   public List<aox> b(String $$0) {
      List<aox> $$1 = Lists.newArrayList();

      for (aox $$2 : this.l) {
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
   public sw r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).d.b(vq.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(vq $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(vq $$0, Function<aox, vq> $$1, boolean $$2) {
      this.k.a($$0);

      for (aox $$3 : this.l) {
         vq $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(wg $$0, du $$1, vm.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(wg $$0, aox $$1, vm.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(wg $$0, Predicate<aox> $$1, @Nullable aox $$2, vm.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      wf $$5 = wf.a($$0);
      boolean $$6 = false;

      for (aox $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(wg $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public atr a(chl $$0) {
      UUID $$1 = $$0.cw();
      atr $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(eiq.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.ad().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new atr(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public ajg f(aox $$0) {
      UUID $$1 = $$0.cw();
      ajg $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(eiq.a).resolve($$1 + ".json");
         $$2 = new ajg(this.k.aC(), this, this.k.aD(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new adg($$0));

      for (aow $$1 : this.k.J()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new adt($$0));

      for (aow $$1 : this.k.J()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aox> t() {
      return this.l;
   }

   @Nullable
   public aox a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (ajg $$0 : this.s.values()) {
         $$0.a(this.k.aD());
      }

      this.a(new ym(aus.a(this.v)));
      aem $$1 = new aem(this.k.aI().b());

      for (aox $$2 : this.l) {
         $$2.d.b($$1);
         $$2.I().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
