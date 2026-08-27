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

public abstract class auq {
   public static final File b = new File("banned-players.json");
   public static final File c = new File("banned-ips.json");
   public static final File d = new File("ops.json");
   public static final File e = new File("whitelist.json");
   public static final xe f = xe.c("chat.filtered_full");
   public static final xe g = xe.c("multiplayer.disconnect.duplicate_login");
   private static final Logger a = LogUtils.getLogger();
   private static final int i = 600;
   private static final SimpleDateFormat j = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
   private final MinecraftServer k;
   private final List<aqu> l = Lists.newArrayList();
   private final Map<UUID, aqu> m = Maps.newHashMap();
   private final auw n = new auw(b);
   private final aun o = new aun(c);
   private final aur p = new aur(d);
   private final auz q = new auz(e);
   private final Map<UUID, avv> r = Maps.newHashMap();
   private final Map<UUID, alb> s = Maps.newHashMap();
   private final eri t;
   private boolean u;
   private final jh<alc> v;
   protected final int h;
   private int w;
   private int x;
   private boolean y;
   private static final boolean z = false;
   private int A;

   public auq(MinecraftServer $$0, jh<alc> $$1, eri $$2, int $$3) {
      this.k = $$0;
      this.v = $$1;
      this.h = $$3;
      this.t = $$2;
   }

   public void a(wc $$0, aqu $$1, ari $$2) {
      GameProfile $$3 = $$1.gk();
      aum $$4 = this.k.au();
      String $$6;
      if ($$4 != null) {
         Optional<GameProfile> $$5 = $$4.a($$3.getId());
         $$6 = $$5.<String>map(GameProfile::getName).orElse($$3.getName());
         $$4.a($$3);
      } else {
         $$6 = $$3.getName();
      }

      Optional<uk> $$8 = this.a($$1);
      aks<dca> $$9 = $$8.<aks<dca>>flatMap($$0x -> dwu.a(new Dynamic(uy.a, $$0x.c("Dimension"))).resultOrPartial(a::error)).orElse(dca.h);
      aqt $$10 = this.k.a($$9);
      aqt $$11;
      if ($$10 == null) {
         a.warn("Unknown respawn dimension {}, defaulting to overworld", $$9);
         $$11 = this.k.I();
      } else {
         $$11 = $$10;
      }

      $$1.a($$11);
      String $$13 = $$0.a(this.k.bn());
      a.info("{}[{}] logged in with entity id {} at ({}, {}, {})", new Object[]{$$1.af().getString(), $$13, $$1.al(), $$1.dz(), $$1.dB(), $$1.dF()});
      erb $$14 = $$11.B_();
      $$1.c($$8.orElse(null));
      art $$15 = new art(this.k, $$0, $$1, $$2);
      $$0.a(agk.a.bind(wp.a(this.k.bc())), $$15);
      dbw $$16 = $$11.ab();
      boolean $$17 = $$16.b(dbw.E);
      boolean $$18 = $$16.b(dbw.q);
      boolean $$19 = $$16.b(dbw.w);
      $$15.b(new ado($$1.al(), $$14.l(), this.k.J(), this.n(), this.w, this.x, $$18, !$$17, $$19, $$1.b($$11), this.k.aB()));
      $$15.b(new ack($$14.q(), $$14.r()));
      $$15.b(new adx($$1.gm()));
      $$15.b(new aew($$1.gl().k));
      $$15.b(new agf(this.k.aJ().b()));
      this.e($$1);
      $$1.J().c();
      $$1.K().a($$1);
      this.a($$11.f(), $$1);
      this.k.aw();
      xs $$20;
      if ($$1.gk().getName().equalsIgnoreCase($$6)) {
         $$20 = xe.a("multiplayer.player.joined", $$1.P_());
      } else {
         $$20 = xe.a("multiplayer.player.joined.renamed", $$1.P_(), $$6);
      }

      this.a($$20.a(n.o), false);
      $$15.a($$1.dz(), $$1.dB(), $$1.dF(), $$1.dK(), $$1.dM());
      ajs $$22 = this.k.av();
      if ($$22 != null && !$$2.d()) {
         $$1.a($$22);
      }

      $$1.d.b(aed.a(this.l));
      this.l.add($$1);
      this.m.put($$1.cE(), $$1);
      this.a(aed.a(List.of($$1)));
      this.a($$1, $$11);
      $$11.c($$1);
      this.k.aN().a($$1);

      for (brh $$23 : $$1.eF()) {
         $$15.b(new age($$1.al(), $$23, false));
      }

      if ($$8.isPresent() && $$8.get().b("RootVehicle", 10)) {
         uk $$24 = $$8.get().p("RootVehicle");
         brv $$25 = bsb.a($$24.p("Entity"), $$11, $$1x -> !$$11.c($$1x) ? null : $$1x);
         if ($$25 != null) {
            UUID $$26;
            if ($$24.b("Attach")) {
               $$26 = $$24.a("Attach");
            } else {
               $$26 = null;
            }

            if ($$25.cE().equals($$26)) {
               $$1.a($$25, true);
            } else {
               for (brv $$28 : $$25.db()) {
                  if ($$28.cE().equals($$26)) {
                     $$1.a($$28, true);
                     break;
                  }
               }
            }

            if (!$$1.bW()) {
               a.warn("Couldn't reattach entity to player");
               $$25.ao();

               for (brv $$29 : $$25.db()) {
                  $$29.ao();
               }
            }
         }
      }

      $$1.h();
   }

   protected void a(all $$0, aqu $$1) {
      Set<exq> $$2 = Sets.newHashSet();

      for (ext $$3 : $$0.g()) {
         $$1.d.b(afj.a($$3, true));
      }

      for (exp $$4 : exp.values()) {
         exq $$5 = $$0.a($$4);
         if ($$5 != null && !$$2.contains($$5)) {
            for (zl<?> $$7 : $$0.d($$5)) {
               $$1.d.b($$7);
            }

            $$2.add($$5);
         }
      }
   }

   public void a(aqt $$0) {
      $$0.D_().a(new dur() {
         @Override
         public void a(dut $$0, double $$1) {
            auq.this.a(new aes($$0));
         }

         @Override
         public void a(dut $$0, double $$1, double $$2, long $$3) {
            auq.this.a(new aer($$0));
         }

         @Override
         public void a(dut $$0, double $$1, double $$2) {
            auq.this.a(new aeq($$0));
         }

         @Override
         public void a(dut $$0, int $$1) {
            auq.this.a(new aet($$0));
         }

         @Override
         public void b(dut $$0, int $$1) {
            auq.this.a(new aeu($$0));
         }

         @Override
         public void b(dut $$0, double $$1) {
         }

         @Override
         public void c(dut $$0, double $$1) {
         }
      });
   }

   public Optional<uk> a(aqu $$0) {
      uk $$1 = this.k.bb().w();
      Optional<uk> $$2;
      if (this.k.a($$0.gk()) && $$1 != null) {
         $$2 = Optional.of($$1);
         $$0.g($$1);
         a.debug("loading single player");
      } else {
         $$2 = this.t.b($$0);
      }

      return $$2;
   }

   protected void b(aqu $$0) {
      this.t.a($$0);
      avv $$1 = this.r.get($$0.cE());
      if ($$1 != null) {
         $$1.a();
      }

      alb $$2 = this.s.get($$0.cE());
      if ($$2 != null) {
         $$2.b();
      }
   }

   public void c(aqu $$0) {
      aqt $$1 = $$0.B();
      $$0.a(avz.j);
      this.b($$0);
      if ($$0.bW()) {
         brv $$2 = $$0.de();
         if ($$2.dd()) {
            a.debug("Removing player mount");
            $$0.ae();
            $$2.da().forEach($$0x -> $$0x.b(brv.d.d));
         }
      }

      $$0.ai();
      $$1.a($$0, brv.d.d);
      $$0.S().a();
      this.l.remove($$0);
      this.k.aN().b($$0);
      UUID $$3 = $$0.cE();
      aqu $$4 = this.m.get($$3);
      if ($$4 == $$0) {
         this.m.remove($$3);
         this.r.remove($$3);
         this.s.remove($$3);
      }

      this.a(new aec(List.of($$0.cE())));
   }

   @Nullable
   public xe a(SocketAddress $$0, GameProfile $$1) {
      if (this.n.a($$1)) {
         auy $$2 = this.n.b($$1);
         xs $$3 = xe.a("multiplayer.disconnect.banned.reason", $$2.d());
         if ($$2.c() != null) {
            $$3.a(xe.a("multiplayer.disconnect.banned.expiration", j.format($$2.c())));
         }

         return $$3;
      } else if (!this.c($$1)) {
         return xe.c("multiplayer.disconnect.not_whitelisted");
      } else if (this.o.a($$0)) {
         auo $$4 = this.o.b($$0);
         xs $$5 = xe.a("multiplayer.disconnect.banned_ip.reason", $$4.d());
         if ($$4.c() != null) {
            $$5.a(xe.a("multiplayer.disconnect.banned_ip.expiration", j.format($$4.c())));
         }

         return $$5;
      } else {
         return this.l.size() >= this.h && !this.d($$1) ? xe.c("multiplayer.disconnect.server_full") : null;
      }
   }

   public aqu a(GameProfile $$0, aqi $$1) {
      return new aqu(this.k, this.k.I(), $$0, $$1);
   }

   public boolean e(GameProfile $$0) {
      UUID $$1 = $$0.getId();
      Set<aqu> $$2 = Sets.newIdentityHashSet();

      for (aqu $$3 : this.l) {
         if ($$3.cE().equals($$1)) {
            $$2.add($$3);
         }
      }

      aqu $$4 = this.m.get($$0.getId());
      if ($$4 != null) {
         $$2.add($$4);
      }

      for (aqu $$5 : $$2) {
         $$5.d.b(g);
      }

      return !$$2.isEmpty();
   }

   public aqu d(aqu $$0) {
      aqu $$1 = this.a($$0, true);
      ayt $$2 = ayt.a();
      double $$3 = $$2.k() * 0.3;
      double $$4 = $$2.k() * 0.3;
      double $$5 = $$1.ds().a();
      double $$6 = $$1.ds().b() + 1.0;
      double $$7 = $$1.ds().c();
      le $$8 = lb.ac;
      le $$9 = lb.aI;
      ja<avn> $$10 = avo.ii;
      cuh $$11 = $$1.gl().i.get(bsc.c.b());
      if ($$11 != cuh.i) {
         $$1.a($$11, 2.0F);
      }

      $$1.a(bsc.c, cuk.rp.v());
      dbs $$12 = $$1.dU().a(null, null, null, $$5, $$6, $$7, 2.0F, false, dca.a.a, false, $$8, $$9, $$10);
      $$1.d.b(new adc($$1.ds().c, $$1.ds().d, $$1.ds().e, 5.0F, $$12.i(), new ewu($$3, 5.0, $$4), dbs.a.a, $$8, $$9, $$10));
      $$1.dU().a(null, $$1.du(), avo.if, avq.h);
      return $$1;
   }

   public aqu a(aqu $$0, boolean $$1) {
      this.l.remove($$0);
      $$0.B().a($$0, brv.d.b);
      ir $$2 = $$0.T();
      float $$3 = $$0.U();
      boolean $$4 = $$0.W();
      aqt $$5 = this.k.a($$0.V());
      Optional<ewu> $$6;
      if ($$5 != null && $$2 != null) {
         $$6 = cly.a($$5, $$2, $$3, $$4, $$1);
      } else {
         $$6 = Optional.empty();
      }

      aqt $$8 = $$5 != null && $$6.isPresent() ? $$5 : this.k.I();
      aqu $$9 = new aqu(this.k, $$8, $$0.gk(), $$0.D());
      $$9.d = $$0.d;
      $$9.a($$0, $$1);
      $$9.e($$0.al());
      $$9.a($$0.fD());

      for (String $$10 : $$0.am()) {
         $$9.a($$10);
      }

      boolean $$11 = false;
      if ($$6.isPresent()) {
         dtc $$12 = $$8.a_($$2);
         boolean $$13 = $$12.a(dfe.qw);
         ewu $$14 = $$6.get();
         float $$17;
         if (!$$12.a(awe.R) && !$$13) {
            $$17 = $$3;
         } else {
            ewu $$15 = ewu.c($$2).d($$14).d();
            $$17 = (float)aym.d(aym.d($$15.e, $$15.c) * 180.0F / (float)Math.PI - 90.0);
         }

         $$9.b($$14.c, $$14.d, $$14.e, $$17, 0.0F);
         $$9.a($$8.af(), $$2, $$3, $$4, false);
         $$11 = !$$1 && $$13;
      } else if ($$2 != null) {
         $$9.d.b(new ade(ade.b, 0.0F));
      }

      while (!$$8.g($$9) && $$9.dB() < (double)$$8.am()) {
         $$9.a_($$9.dz(), $$9.dB() + 1.0, $$9.dF());
      }

      byte $$18 = (byte)($$1 ? 1 : 0);
      aqt $$19 = $$9.B();
      erb $$20 = $$19.B_();
      $$9.d.b(new aek($$9.b($$19), $$18));
      $$9.d.a($$9.dz(), $$9.dB(), $$9.dF(), $$9.dK(), $$9.dM());
      $$9.d.b(new aez($$8.V(), $$8.W()));
      $$9.d.b(new ack($$20.q(), $$20.r()));
      $$9.d.b(new aff($$9.cG, $$9.cF, $$9.cE));
      this.a($$9, $$8);
      this.e($$9);
      $$8.d($$9);
      this.l.add($$9);
      this.m.put($$9.cE(), $$9);
      $$9.h();
      $$9.t($$9.eI());
      if ($$11) {
         $$9.d.b(new afr(avo.vT, avq.e, (double)$$2.u(), (double)$$2.v(), (double)$$2.w(), 1.0F, 1.0F, $$8.F_().g()));
      }

      return $$9;
   }

   public void e(aqu $$0) {
      GameProfile $$1 = $$0.gk();
      int $$2 = this.k.c($$1);
      this.a($$0, $$2);
   }

   public void d() {
      if (++this.A > 600) {
         this.a(new aed(EnumSet.of(aed.a.e), this.l));
         this.A = 0;
      }
   }

   public void a(zl<?> $$0) {
      for (aqu $$1 : this.l) {
         $$1.d.b($$0);
      }
   }

   public void a(zl<?> $$0, aks<dca> $$1) {
      for (aqu $$2 : this.l) {
         if ($$2.dU().af() == $$1) {
            $$2.d.b($$0);
         }
      }
   }

   public void a(cly $$0, xe $$1) {
      eya $$2 = $$0.co();
      if ($$2 != null) {
         for (String $$4 : $$2.g()) {
            aqu $$5 = this.a($$4);
            if ($$5 != null && $$5 != $$0) {
               $$5.a($$1);
            }
         }
      }
   }

   public void b(cly $$0, xe $$1) {
      eya $$2 = $$0.co();
      if ($$2 == null) {
         this.a($$1, false);
      } else {
         for (int $$3 = 0; $$3 < this.l.size(); $$3++) {
            aqu $$4 = this.l.get($$3);
            if ($$4.co() != $$2) {
               $$4.a($$1);
            }
         }
      }
   }

   public String[] e() {
      String[] $$0 = new String[this.l.size()];

      for (int $$1 = 0; $$1 < this.l.size(); $$1++) {
         $$0[$$1] = this.l.get($$1).gk().getName();
      }

      return $$0;
   }

   public auw f() {
      return this.n;
   }

   public aun g() {
      return this.o;
   }

   public void a(GameProfile $$0) {
      this.p.a(new aus($$0, this.k.k(), this.p.a($$0)));
      aqu $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   public void b(GameProfile $$0) {
      this.p.c($$0);
      aqu $$1 = this.a($$0.getId());
      if ($$1 != null) {
         this.e($$1);
      }
   }

   private void a(aqu $$0, int $$1) {
      if ($$0.d != null) {
         byte $$2;
         if ($$1 <= 0) {
            $$2 = 24;
         } else if ($$1 >= 4) {
            $$2 = 28;
         } else {
            $$2 = (byte)(24 + $$1);
         }

         $$0.d.b(new adb($$0, $$2));
      }

      this.k.aH().a($$0);
   }

   public boolean c(GameProfile $$0) {
      return !this.u || this.p.d($$0) || this.q.d($$0);
   }

   public boolean f(GameProfile $$0) {
      return this.p.d($$0) || this.k.a($$0) && this.k.bb().m() || this.y;
   }

   @Nullable
   public aqu a(String $$0) {
      int $$1 = this.l.size();

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         aqu $$3 = this.l.get($$2);
         if ($$3.gk().getName().equalsIgnoreCase($$0)) {
            return $$3;
         }
      }

      return null;
   }

   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, double $$4, aks<dca> $$5, zl<?> $$6) {
      for (int $$7 = 0; $$7 < this.l.size(); $$7++) {
         aqu $$8 = this.l.get($$7);
         if ($$8 != $$0 && $$8.dU().af() == $$5) {
            double $$9 = $$1 - $$8.dz();
            double $$10 = $$2 - $$8.dB();
            double $$11 = $$3 - $$8.dF();
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

   public auz i() {
      return this.q;
   }

   public String[] j() {
      return this.q.a();
   }

   public aur k() {
      return this.p;
   }

   public String[] l() {
      return this.p.a();
   }

   public void a() {
   }

   public void a(aqu $$0, aqt $$1) {
      dut $$2 = this.k.I().D_();
      $$0.d.b(new adh($$2));
      $$0.d.b(new afn($$1.Z(), $$1.aa(), $$1.ab().b(dbw.l)));
      $$0.d.b(new aez($$1.V(), $$1.W()));
      if ($$1.ad()) {
         $$0.d.b(new ade(ade.c, 0.0F));
         $$0.d.b(new ade(ade.i, $$1.d(1.0F)));
         $$0.d.b(new ade(ade.j, $$1.b(1.0F)));
      }

      $$0.d.b(new ade(ade.o, 0.0F));
      this.k.aQ().a($$0);
   }

   public void f(aqu $$0) {
      $$0.cp.b();
      $$0.y();
      $$0.d.b(new aew($$0.gl().k));
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

   public List<aqu> b(String $$0) {
      List<aqu> $$1 = Lists.newArrayList();

      for (aqu $$2 : this.l) {
         if ($$2.C().equals($$0)) {
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
   public uk r() {
      return null;
   }

   public void b(boolean $$0) {
      this.y = $$0;
   }

   public void s() {
      for (int $$0 = 0; $$0 < this.l.size(); $$0++) {
         this.l.get($$0).d.b(xe.c("multiplayer.disconnect.server_shutdown"));
      }
   }

   public void a(xe $$0, boolean $$1) {
      this.a($$0, $$1x -> $$0, $$1);
   }

   public void a(xe $$0, Function<aqu, xe> $$1, boolean $$2) {
      this.k.a($$0);

      for (aqu $$3 : this.l) {
         xe $$4 = $$1.apply($$3);
         if ($$4 != null) {
            $$3.b($$4, $$2);
         }
      }
   }

   public void a(xu $$0, eh $$1, xa.a $$2) {
      this.a($$0, $$1::a, $$1.i(), $$2);
   }

   public void a(xu $$0, aqu $$1, xa.a $$2) {
      this.a($$0, $$1::b, $$1, $$2);
   }

   private void a(xu $$0, Predicate<aqu> $$1, @Nullable aqu $$2, xa.a $$3) {
      boolean $$4 = this.a($$0);
      this.k.a($$0.d(), $$3, $$4 ? null : "Not Secure");
      xt $$5 = xt.a($$0);
      boolean $$6 = false;

      for (aqu $$7 : this.l) {
         boolean $$8 = $$1.test($$7);
         $$7.a($$5, $$8, $$3);
         $$6 |= $$8 && $$0.j();
      }

      if ($$6 && $$2 != null) {
         $$2.a(f);
      }
   }

   private boolean a(xu $$0) {
      return $$0.i() && !$$0.a(Instant.now());
   }

   public avv a(cly $$0) {
      UUID $$1 = $$0.cE();
      avv $$2 = this.r.get($$1);
      if ($$2 == null) {
         File $$3 = this.k.a(erd.b).toFile();
         File $$4 = new File($$3, $$1 + ".json");
         if (!$$4.exists()) {
            File $$5 = new File($$3, $$0.af().getString() + ".json");
            Path $$6 = $$5.toPath();
            if (v.a($$6) && v.b($$6) && $$6.startsWith($$3.getPath()) && $$5.isFile()) {
               $$5.renameTo($$4);
            }
         }

         $$2 = new avv(this.k, $$4);
         this.r.put($$1, $$2);
      }

      return $$2;
   }

   public alb g(aqu $$0) {
      UUID $$1 = $$0.cE();
      alb $$2 = this.s.get($$1);
      if ($$2 == null) {
         Path $$3 = this.k.a(erd.a).resolve($$1 + ".json");
         $$2 = new alb(this.k.aD(), this, this.k.aE(), $$3, $$0);
         this.s.put($$1, $$2);
      }

      $$2.a($$0);
      return $$2;
   }

   public void a(int $$0) {
      this.w = $$0;
      this.a(new aey($$0));

      for (aqt $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().a($$0);
         }
      }
   }

   public void b(int $$0) {
      this.x = $$0;
      this.a(new afl($$0));

      for (aqt $$1 : this.k.K()) {
         if ($$1 != null) {
            $$1.l().b($$0);
         }
      }
   }

   public List<aqu> t() {
      return this.l;
   }

   @Nullable
   public aqu a(UUID $$0) {
      return this.m.get($$0);
   }

   public boolean d(GameProfile $$0) {
      return false;
   }

   public void u() {
      for (alb $$0 : this.s.values()) {
         $$0.a(this.k.aE());
      }

      this.a(new aaa(aww.a(this.v)));
      agf $$1 = new agf(this.k.aJ().b());

      for (aqu $$2 : this.l) {
         $$2.d.b($$1);
         $$2.K().a($$2);
      }
   }

   public boolean v() {
      return this.y;
   }
}
