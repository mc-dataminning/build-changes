import com.google.common.net.InetAddresses;
import com.mojang.authlib.GameProfile;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arh extends cnp {
   private static final Logger cw = LogUtils.getLogger();
   private static final int cx = 32;
   private static final int cy = 10;
   private static final int cz = 25;
   public static final double b = 1.0;
   private static final bvk cB = new bvk(alb.b("creative_mode_block_range"), 0.5, bvk.a.a);
   private static final bvk cC = new bvk(alb.b("creative_mode_entity_range"), 2.0, bvk.a.a);
   public asi c;
   public final MinecraftServer d;
   public final ari e;
   private final alj cD;
   private final awj cE;
   private float cF = Float.MIN_VALUE;
   private int cG = Integer.MIN_VALUE;
   private int cH = Integer.MIN_VALUE;
   private int cI = Integer.MIN_VALUE;
   private int cJ = Integer.MIN_VALUE;
   private int cK = Integer.MIN_VALUE;
   private float cL = -1.0E8F;
   private int cM = -99999999;
   private boolean cN = true;
   private int cO = -99999999;
   private int cP = 60;
   private cnn cQ = cnn.a;
   private aqz cR = aqz.a;
   private boolean cS = true;
   private long cT = ad.c();
   @Nullable
   private btj cU;
   private boolean cV;
   public boolean f;
   private final awi cW = new awi();
   @Nullable
   private eye cX;
   private int cY;
   private boolean cZ;
   private int da = 2;
   private String db = "en_us";
   @Nullable
   private eye dc;
   @Nullable
   private eye dd;
   @Nullable
   private eye de;
   private kg df = kg.a(0, 0, 0);
   private aqr dg = aqr.a;
   private ala<dds> dh = dds.h;
   @Nullable
   private je di;
   private boolean dj;
   private float dk;
   private final aso dl;
   private boolean dm;
   private boolean dn;
   private boolean do;
   private cmv dp = new cmv(0, 0, 0);
   @Nullable
   private je dq;
   private eye dr = eye.c;
   private final crf ds = new crf() {
      @Override
      public void a(cqq $$0, jw<cvl> $$1, cvl $$2, int[] $$3) {
         arh.this.c.b(new acu($$0.l, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cqq $$0, int $$1, cvl $$2) {
         arh.this.c.b(new acw($$0.l, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cqq $$0, cvl $$1) {
         arh.this.c.b(new afc($$1.u()));
      }

      @Override
      public void a(cqq $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cqq $$0, int $$1, int $$2) {
         arh.this.c.b(new acv($$0.l, $$1, $$2));
      }
   };
   private final cre dt = new cre() {
      @Override
      public void a(cqq $$0, int $$1, cvl $$2) {
         csn $$3 = $$0.b($$1);
         if (!($$3 instanceof csj)) {
            if ($$3.c == arh.this.gc()) {
               an.f.a(arh.this, arh.this.gc(), $$2);
            }
         }
      }

      @Override
      public void a(cqq $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private xu du;
   @Nullable
   public final Object g;
   private int dv;
   public boolean h;

   public arh(MinecraftServer $$0, arg $$1, GameProfile $$2, aqs $$3) {
      super($$1, $$1.W(), $$1.X(), $$2);
      this.dl = $$0.a(this);
      this.e = $$0.b(this);
      this.d = $$0;
      this.cE = $$0.ag().a((cnp)this);
      this.cD = $$0.ag().g(this);
      this.b(this.a($$1, $$1.W()).c(), 0.0F, 0.0F);
      this.a($$3);
      this.g = null;
   }

   @Override
   public je a(arg $$0, je $$1) {
      exz $$2 = this.a(bur.a).a(eye.c);
      je $$3 = $$1;
      if ($$0.B_().g() && $$0.o().ba().k() != ddp.c) {
         int $$4 = Math.max(0, this.d.a($$0));
         int $$5 = azc.a($$0.A_().b((double)$$1.u(), (double)$$1.w()));
         if ($$5 < $$4) {
            $$4 = $$5;
         }

         if ($$5 <= 1) {
            $$4 = 1;
         }

         long $$6 = (long)($$4 * 2 + 1);
         long $$7 = $$6 * $$6;
         int $$8 = $$7 > 2147483647L ? Integer.MAX_VALUE : (int)$$7;
         int $$9 = this.t($$8);
         int $$10 = azk.a().a($$8);

         for (int $$11 = 0; $$11 < $$8; $$11++) {
            int $$12 = ($$10 + $$9 * $$11) % $$8;
            int $$13 = $$12 % ($$4 * 2 + 1);
            int $$14 = $$12 / ($$4 * 2 + 1);
            int $$15 = $$1.u() + $$13 - $$4;
            int $$16 = $$1.w() + $$14 - $$4;

            try {
               $$3 = arb.a($$0, $$15, $$16);
               if ($$3 != null && this.a($$0, $$2.c($$3.c()))) {
                  return $$3;
               }
            } catch (Exception var25) {
               int $$18 = $$11;
               int $$19 = $$4;
               o $$20 = o.a(var25, "Searching for spawn");
               p $$21 = $$20.a("Spawn Lookup");
               $$21.a("Origin", $$1::toString);
               $$21.a("Radius", () -> Integer.toString($$19));
               $$21.a("Candidate", () -> "[" + $$15 + "," + $$16 + "]");
               $$21.a("Progress", () -> $$18 + " out of " + $$8);
               throw new z($$20);
            }
         }

         $$3 = $$1;
      }

      while (!this.a($$0, $$2.c($$3.c())) && $$3.v() < $$0.an() - 1) {
         $$3 = $$3.d();
      }

      while (this.a($$0, $$2.c($$3.e().c())) && $$3.v() > $$0.G_() + 1) {
         $$3 = $$3.e();
      }

      return $$3;
   }

   private boolean a(arg $$0, exz $$1) {
      return $$0.a(this, $$1, true);
   }

   private int t(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         cmv.a.parse(new Dynamic(ut.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(cw::error).ifPresent($$0x -> this.dp = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         uf $$1 = $$0.p("enteredNetherPosition");
         this.dd = new eye($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.f = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cW.a($$0.p("recipeBook"), this.d.aI());
      }

      if (this.fL()) {
         this.fM();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.di = new je($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dj = $$0.q("SpawnForced");
         this.dk = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.dh = dds.g.parse(ut.a, $$0.c("SpawnDimension")).resultOrPartial(cw::error).orElse(dds.h);
         }
      }

      this.do = $$0.q("spawn_extra_particles_on_fall");
      vc $$2 = $$0.c("raid_omen_position");
      if ($$2 != null) {
         je.a.parse(ut.a, $$2).resultOrPartial(cw::error).ifPresent($$0x -> this.dq = $$0x);
      }
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      cmv.a.encodeStart(ut.a, this.dp).resultOrPartial(cw::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.f);
      if (this.dd != null) {
         uf $$1 = new uf();
         $$1.a("x", this.dd.d);
         $$1.a("y", this.dd.e);
         $$1.a("z", this.dd.f);
         $$0.a("enteredNetherPosition", $$1);
      }

      btj $$2 = this.dd();
      btj $$3 = this.dg();
      if ($$3 != null && $$2 != this && $$2.dc()) {
         uf $$4 = new uf();
         uf $$5 = new uf();
         $$2.e($$5);
         $$4.a("Attach", $$3.cD());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cW.b());
      $$0.a("Dimension", this.dS().ag().a().toString());
      if (this.di != null) {
         $$0.a("SpawnX", this.di.u());
         $$0.a("SpawnY", this.di.v());
         $$0.a("SpawnZ", this.di.w());
         $$0.a("SpawnForced", this.dj);
         $$0.a("SpawnAngle", this.dk);
         alb.a.encodeStart(ut.a, this.dh.a()).resultOrPartial(cw::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }

      $$0.a("spawn_extra_particles_on_fall", this.do);
      if (this.dq != null) {
         je.a.encodeStart(ut.a, this.dq).resultOrPartial(cw::error).ifPresent($$1 -> $$0.a("raid_omen_position", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.gl();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cp = azc.a((float)$$0 / $$1, 0.0F, $$2);
      this.cO = -1;
   }

   public void b(int $$0) {
      this.cn = $$0;
      this.cO = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cO = -1;
   }

   @Override
   public void a(cvl $$0, int $$1) {
      super.a($$0, $$1);
      this.cO = -1;
   }

   private void a(cqq $$0) {
      $$0.a(this.dt);
      $$0.a(this.ds);
   }

   public void h() {
      this.a(this.bZ);
   }

   @Override
   public void f_() {
      super.f_();
      this.c.b(aed.a);
   }

   @Override
   public void g_() {
      super.g_();
      this.c.b(new aec(this.eO()));
   }

   @Override
   public void a(dua $$0) {
      an.e.a(this, $$0);
   }

   @Override
   protected cvh k() {
      return new cwm(this);
   }

   @Override
   public void l() {
      this.e.a();
      this.dp.a();
      this.cP--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.ca.d();
      if (!this.dS().B && !this.ca.b(this)) {
         this.s();
         this.ca = this.bZ;
      }

      btj $$0 = this.M();
      if ($$0 != this) {
         if ($$0.bI()) {
            this.a($$0.dx(), $$0.dz(), $$0.dD(), $$0.dI(), $$0.dK());
            this.B().l().a(this);
            if (this.fS()) {
               this.d(this);
            }
         } else {
            this.d(this);
         }
      }

      an.x.a(this);
      if (this.cX != null) {
         an.v.a(this, this.cX, this.ag - this.cY);
      }

      this.o();
      this.p();
      this.gI();
      this.cD.b(this);
   }

   private void gI() {
      bvi $$0 = this.g(bvm.g);
      if ($$0 != null) {
         if (this.f()) {
            $$0.a(cB);
         } else {
            $$0.e(cB);
         }
      }

      bvi $$1 = this.g(bvm.j);
      if ($$1 != null) {
         if (this.f()) {
            $$1.a(cC);
         } else {
            $$1.e(cC);
         }
      }
   }

   public void m() {
      try {
         if (!this.P_() || !this.dl()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.gc().b(); $$0++) {
            cvl $$1 = this.gc().a($$0);
            if ($$1.h().an_()) {
               zk<?> $$2 = ((ctv)$$1.h()).a($$1, this.dS(), this);
               if ($$2 != null) {
                  this.c.b($$2);
               }
            }
         }

         if (this.eA() != this.cL || this.cM != this.cb.a() || this.cb.e() == 0.0F != this.cN) {
            this.c.b(new afk(this.eA(), this.cb.a(), this.cb.e()));
            this.cL = this.eA();
            this.cM = this.cb.a();
            this.cN = this.cb.e() == 0.0F;
         }

         if (this.eA() + this.fs() != this.cF) {
            this.cF = this.eA() + this.fs();
            this.a(ezl.g, azc.f(this.cF));
         }

         if (this.cb.a() != this.cG) {
            this.cG = this.cb.a();
            this.a(ezl.h, azc.f((float)this.cG));
         }

         if (this.cq() != this.cH) {
            this.cH = this.cq();
            this.a(ezl.i, azc.f((float)this.cH));
         }

         if (this.eN() != this.cI) {
            this.cI = this.eN();
            this.a(ezl.j, azc.f((float)this.cI));
         }

         if (this.co != this.cK) {
            this.cK = this.co;
            this.a(ezl.k, azc.f((float)this.cK));
         }

         if (this.cn != this.cJ) {
            this.cJ = this.cn;
            this.a(ezl.l, azc.f((float)this.cJ));
         }

         if (this.co != this.cO) {
            this.cO = this.co;
            this.c.b(new afj(this.cp, this.co, this.cn));
         }

         if (this.ag % 20 == 0) {
            an.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new z($$4);
      }
   }

   @Override
   public void n() {
      if (this.eA() > 0.0F && this.dc != null) {
         an.X.a(this, this.dc);
      }

      this.dc = null;
      super.n();
   }

   @Override
   public void o() {
      if (this.aa > 0.0F && this.dc == null) {
         this.dc = this.dq();
         if (this.cu != null && this.cu.e <= this.dc.e) {
            an.ae.a(this, this.cu, this.cv);
         }
      }
   }

   public void p() {
      if (this.dg() != null && this.dg().bw()) {
         if (this.de == null) {
            this.de = this.dq();
         } else {
            an.Y.a(this, this.de);
         }
      }

      if (this.de != null && (this.dg() == null || !this.dg().bw())) {
         this.de = null;
      }
   }

   private void a(ezl $$0, int $$1) {
      this.gr().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bsb $$0) {
      this.a(dyx.p);
      boolean $$1 = this.dS().ac().b(ddo.n);
      if ($$1) {
         xd $$2 = this.eO().a();
         this.c.a(new aee(this.ap(), $$2), wk.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            xd $$3x = xd.a("death.attack.message_too_long", xd.b($$2x).a(n.o));
            xd $$4x = xd.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new xj(xj.a.a, $$3x)));
            return new aee(this.ap(), $$4x);
         }));
         ezk $$3 = this.co();
         if ($$3 == null || $$3.k() == ezk.b.a) {
            this.d.ag().a($$2, false);
         } else if ($$3.k() == ezk.b.c) {
            this.d.ag().a(this, $$2);
         } else if ($$3.k() == ezk.b.d) {
            this.d.ag().b(this, $$2);
         }
      } else {
         this.c.b(new aee(this.ap(), xc.a));
      }

      this.gq();
      if (this.dS().ac().b(ddo.N)) {
         this.gJ();
      }

      if (!this.P_()) {
         this.a(this.B(), $$0);
      }

      this.gr().a(ezl.d, this, ezg::b);
      buf $$4 = this.eP();
      if ($$4 != null) {
         this.b(awn.h.b($$4.ao()));
         $$4.a(this, this.bi, $$0);
         this.f($$4);
      }

      this.dS().a(this, (byte)3);
      this.a(awn.N);
      this.a(awn.i.b(awn.m));
      this.a(awn.i.b(awn.n));
      this.aF();
      this.k(0);
      this.c(false);
      this.eO().c();
      this.a(Optional.of(jm.a(this.dS().ag(), this.ds())));
   }

   private void gJ() {
      exz $$0 = new exz(this.ds()).c(32.0, 10.0, 32.0);
      this.dS().a(buh.class, $$0, bto.f).stream().filter($$0x -> $$0x instanceof buk).forEach($$0x -> ((buk)$$0x).a_((cnp)this));
   }

   @Override
   public void a(btj $$0, int $$1, bsb $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.s($$1);
         this.gr().a(ezl.f, this, ezg::b);
         if ($$0 instanceof cnp) {
            this.a(awn.Q);
            this.gr().a(ezl.e, this, ezg::b);
         } else {
            this.a(awn.O);
         }

         this.a(this, $$0, ezl.m);
         this.a($$0, this, ezl.n);
         an.c.a(this, $$0, $$2);
      }
   }

   private void a(ezh $$0, ezh $$1, ezl[] $$2) {
      ezd $$3 = this.gr().e($$1.cF());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gr().a($$2[$$4], $$0, ezg::b);
         }
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.d.n() && this.gK() && $$0.a(awu.m);
         if (!$$2 && this.cP > 0 && !$$0.a(awu.d)) {
            return false;
         } else {
            btj $$3 = $$0.d();
            if ($$3 instanceof cnp $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cnw $$5 && $$5.s() instanceof cnp $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cnp $$0) {
      return !this.gK() ? false : super.a($$0);
   }

   private boolean gK() {
      return this.d.ac();
   }

   public eqz a(boolean $$0, eqz.a $$1) {
      je $$2 = this.U();
      float $$3 = this.V();
      boolean $$4 = this.X();
      arg $$5 = this.d.a(this.W());
      if ($$5 != null && $$2 != null) {
         Optional<arh.a> $$6 = a($$5, $$2, $$3, $$4, $$0);
         if ($$6.isPresent()) {
            arh.a $$7 = $$6.get();
            return new eqz($$5, $$7.a(), eye.c, $$7.b(), 0.0F, $$1);
         } else {
            return eqz.a(this.d.J(), this, $$1);
         }
      } else {
         return new eqz(this.d.J(), this, $$1);
      }
   }

   private static Optional<arh.a> a(arg $$0, je $$1, float $$2, boolean $$3, boolean $$4) {
      dua $$5 = $$0.a_($$1);
      dgv $$6 = $$5.b();
      if ($$6 instanceof dne && ($$3 || $$5.c(dne.d) > 0) && dne.a($$0)) {
         Optional<eye> $$7 = dne.a(btq.by, $$0, $$1);
         if (!$$3 && $$4 && $$7.isPresent()) {
            $$0.a($$1, $$5.b(dne.d, Integer.valueOf($$5.c(dne.d) - 1)), 3);
         }

         return $$7.map($$1x -> arh.a.a($$1x, $$1));
      } else if ($$6 instanceof dgo && dgo.a($$0)) {
         return dgo.a(btq.by, $$0, $$1, $$5.c(dgo.aE), $$2).map($$1x -> arh.a.a($$1x, $$1));
      } else if (!$$3) {
         return Optional.empty();
      } else {
         boolean $$8 = $$6.a($$5);
         dua $$9 = $$0.a_($$1.d());
         boolean $$10 = $$9.b().a($$9);
         return $$8 && $$10 ? Optional.of(new arh.a(new eye((double)$$1.u() + 0.5, (double)$$1.v() + 0.1, (double)$$1.w() + 0.5), $$2)) : Optional.empty();
      }
   }

   @Override
   public void q() {
      this.am();
      this.B().a(this, btj.c.e);
      if (!this.h) {
         this.h = true;
         this.c.b(new adg(adg.f, 0.0F));
         this.f = true;
      }
   }

   @Nullable
   public cnp a(eqz $$0) {
      if (this.dN()) {
         return null;
      } else {
         if ($$0.f()) {
            this.c.b(new adg(adg.b, 0.0F));
         }

         arg $$1 = $$0.a();
         arg $$2 = this.B();
         ala<dds> $$3 = $$2.ag();
         this.c($$0);
         if ($$1.ag() == $$3) {
            this.c.a($$0.b().d, $$0.b().e, $$0.b().f, $$0.d(), $$0.e());
            this.c.l();
            $$0.g().onTransition(this);
            return this;
         } else {
            this.cV = true;
            esd $$4 = $$1.y_();
            this.c.b(new aeo(this.b($$1), (byte)3));
            this.c.b(new acm($$4.q(), $$4.r()));
            avg $$5 = this.d.ag();
            $$5.e(this);
            $$2.a(this, btj.c.e);
            this.dP();
            $$2.ah().a("moving");
            if ($$3 == dds.h && $$1.ag() == dds.i) {
               this.dd = this.dq();
            }

            $$2.ah().c();
            $$2.ah().a("placing");
            this.a($$1);
            this.c.a($$0.b().d, $$0.b().e, $$0.b().f, $$0.d(), $$0.e());
            this.c.l();
            $$1.d(this);
            $$2.ah().c();
            this.c($$2);
            this.fB();
            this.c.b(new aea(this.gd()));
            $$5.a(this, $$1);
            $$5.f(this);
            $$5.d(this);
            $$0.g().onTransition(this);
            this.cO = -1;
            this.cL = -1.0F;
            this.cM = -1;
            return this;
         }
      }
   }

   private void c(arg $$0) {
      ala<dds> $$1 = $$0.ag();
      ala<dds> $$2 = this.dS().ag();
      an.w.a(this, $$1, $$2);
      if ($$1 == dds.i && $$2 == dds.h && this.dd != null) {
         an.D.a(this, this.dd);
      }

      if ($$2 != dds.i) {
         this.dd = null;
      }
   }

   @Override
   public boolean a(arh $$0) {
      if ($$0.P_()) {
         return this.M() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(btj $$0, int $$1) {
      super.a($$0, $$1);
      this.ca.d();
   }

   @Override
   public Either<cnp.a, bah> a(je $$0) {
      jj $$1 = this.dS().a_($$0).c(dkr.aE);
      if (this.fL() || !this.bI()) {
         return Either.left(cnp.a.e);
      } else if (!this.dS().B_().j()) {
         return Either.left(cnp.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cnp.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cnp.a.d);
      } else {
         this.a(this.dS().ag(), $$0, this.dI(), false, true);
         if (this.dS().S()) {
            return Either.left(cnp.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eye $$4 = eye.c($$0);
               List<ckv> $$5 = this.dS()
                  .a(ckv.class, new exz($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.a(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cnp.a.f);
               }
            }

            Either<cnp.a, bah> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(awn.ap);
               an.r.a(this);
            });
            if (!this.B().d()) {
               this.a(xd.c("sleep.not_possible"), true);
            }

            ((arg)this.dS()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(je $$0) {
      this.a(awn.i.b(awn.n));
      super.b($$0);
   }

   private boolean a(je $$0, jj $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(je $$0) {
      eye $$1 = eye.c($$0);
      return Math.abs(this.dx() - $$1.a()) <= 3.0 && Math.abs(this.dz() - $$1.b()) <= 2.0 && Math.abs(this.dD() - $$1.c()) <= 3.0;
   }

   private boolean b(je $$0, jj $$1) {
      je $$2 = $$0.d();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fL()) {
         this.B().l().a(this, new acc(this, 2));
      }

      super.a($$0, $$1);
      if (this.c != null) {
         this.c.a(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bN();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bsb $$0) {
      return super.b($$0) || this.R() && !$$0.a(bse.m);
   }

   @Override
   protected void a(double $$0, boolean $$1, dua $$2, je $$3) {
   }

   @Override
   protected void b(arg $$0, je $$1) {
      if (!this.P_()) {
         super.b($$0, $$1);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.dl()) {
         this.a($$3, new eye($$0, $$1, $$2));
         je $$4 = this.aN();
         dua $$5 = this.dS().a_($$4);
         if (this.do && $$3 && this.aa > 0.0F) {
            eye $$6 = $$4.b().b(0.0, 0.5, 0.0);
            int $$7 = (int)azc.a(50.0F * this.aa, 0.0F, 200.0F);
            this.B().a(new lf(ln.b, $$5), $$6.d, $$6.e, $$6.f, $$7, 0.3F, 0.3F, 0.3F, 0.15F);
            this.do = false;
         }

         super.a($$1, $$3, $$5, $$4);
      }
   }

   @Override
   public void a(@Nullable btj $$0) {
      super.a($$0);
      this.cu = this.dq();
      this.cv = $$0;
      this.w($$0 != null && $$0.ao() == btq.bn);
   }

   @Override
   protected void r() {
      if (this.dS().s().i()) {
         super.r();
      }
   }

   @Override
   public void a(dsq $$0, boolean $$1) {
      this.c.b(new aci(this.dS(), $$0.aD_()));
      this.c.b(new ady($$0.aD_(), $$1));
   }

   private void gL() {
      this.dv = this.dv % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable brm $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.ca != this.bZ) {
            this.s();
         }

         this.gL();
         cqq $$1 = $$0.createMenu(this.dv, this.gc(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(xd.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.c.b(new adx($$1.l, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.ca = $$1;
            return OptionalInt.of(this.dv);
         }
      }
   }

   @Override
   public void a(int $$0, dcq $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.c.b(new ads($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(chz $$0, brd $$1) {
      if (this.ca != this.bZ) {
         this.s();
      }

      this.gL();
      int $$2 = $$0.ae_();
      this.c.b(new adh(this.dv, $$2, $$0.ap()));
      this.ca = new crs(this.dv, this.gc(), $$1, $$0, $$2);
      this.a(this.ca);
   }

   @Override
   public void a(cvl $$0, brj $$1) {
      if ($$0.a(cvo.ub)) {
         if (cxk.a($$0, this.dk(), this)) {
            this.ca.d();
         }

         this.c.b(new adw($$1));
      }
   }

   @Override
   public void a(dro $$0) {
      this.c.b(acg.a($$0, dre::e));
   }

   @Override
   public void s() {
      this.c.b(new act(this.ca.l));
      this.t();
   }

   @Override
   public void t() {
      this.ca.a(this);
      this.bZ.a(this.ca);
      this.ca = this.bZ;
   }

   @Override
   public void u() {
      double $$0 = this.dx();
      double $$1 = this.dz();
      double $$2 = this.dD();
      super.u();
      this.q(this.dx() - $$0, this.dz() - $$1, this.dD() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bW() && !r($$0, $$1, $$2)) {
         if (this.ch()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(awn.C, $$3);
               this.G(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(awy.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(awn.w, $$4);
               this.G(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.bi()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(awn.s, $$5);
               this.G(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.p_()) {
            if ($$1 > 0.0) {
               this.a(awn.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aH()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.cg()) {
                  this.a(awn.r, $$6);
                  this.G(0.1F * (float)$$6 * 0.01F);
               } else if (this.cf()) {
                  this.a(awn.q, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(awn.p, $$6);
                  this.G(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fE()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(awn.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(awn.v, $$8);
            }
         }
      }
   }

   private void q(double $$0, double $$1, double $$2) {
      if (this.bW() && !r($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         btj $$4 = this.dg();
         if ($$4 instanceof cpm) {
            this.a(awn.x, $$3);
         } else if ($$4 instanceof cpo) {
            this.a(awn.y, $$3);
         } else if ($$4 instanceof cgm) {
            this.a(awn.z, $$3);
         } else if ($$4 instanceof chz) {
            this.a(awn.A, $$3);
         } else if ($$4 instanceof cli) {
            this.a(awn.D, $$3);
         }
      }
   }

   private static boolean r(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(awk<?> $$0, int $$1) {
      this.cE.b(this, $$0, $$1);
      this.gr().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(awk<?> $$0) {
      this.cE.a(this, $$0, 0);
      this.gr().a($$0, this, ezg::c);
   }

   @Override
   public int a(Collection<czv<?>> $$0) {
      return this.cW.a($$0, this);
   }

   @Override
   public void a(czv<?> $$0, List<cvl> $$1) {
      an.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void b(List<alb> $$0) {
      List<czv<?>> $$1 = $$0.stream().flatMap($$0x -> this.d.aI().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<czv<?>> $$0) {
      return this.cW.b($$0, this);
   }

   @Override
   public void v() {
      super.v();
      this.a(awn.E);
      if (this.cg()) {
         this.G(0.2F);
      } else {
         this.G(0.05F);
      }
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cO = -1;
   }

   @Override
   public void w() {
      this.cZ = true;
      this.bM();
      if (this.fL()) {
         this.a(true, false);
      }
   }

   public boolean x() {
      return this.cZ;
   }

   public void y() {
      this.cL = -1.0E8F;
   }

   @Override
   public void a(xd $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void z() {
      if (!this.bw.f() && this.fv()) {
         this.c.b(new add(this, (byte)9));
         super.z();
      }
   }

   @Override
   public void a(ff.a $$0, eye $$1) {
      super.a($$0, $$1);
      this.c.b(new aeh($$0, $$1.d, $$1.e, $$1.f));
   }

   public void a(ff.a $$0, btj $$1, ff.a $$2) {
      eye $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.c.b(new aeh($$0, $$1, $$2));
   }

   public void a(arh $$0, boolean $$1) {
      this.dp = $$0.dp;
      this.du = $$0.du;
      this.e.a($$0.e.b(), $$0.e.c());
      this.A();
      if ($$1) {
         this.eV().b($$0.eV());
         this.eV().c($$0.eV());
         this.x($$0.eA());
         this.cb = $$0.cb;

         for (bsq $$2 : $$0.ex()) {
            this.b(new bsq($$2));
         }

         this.gc().a($$0.gc());
         this.cn = $$0.cn;
         this.co = $$0.co;
         this.cp = $$0.cp;
         this.r($$0.fW());
         this.at = $$0.at;
      } else {
         this.eV().b($$0.eV());
         this.x(this.eQ());
         if (this.dS().ac().b(ddo.d) || $$0.P_()) {
            this.gc().a($$0.gc());
            this.cn = $$0.cn;
            this.co = $$0.co;
            this.cp = $$0.cp;
            this.r($$0.fW());
         }
      }

      this.cq = $$0.cq;
      this.bY = $$0.bY;
      this.at().a(bU, $$0.at().a(bU));
      this.cO = -1;
      this.cL = -1.0F;
      this.cM = -1;
      this.cW.a($$0.cW);
      this.f = $$0.f;
      this.dd = $$0.dd;
      this.dg = $$0.dg;
      this.i($$0.gt());
      this.j($$0.gu());
      this.a($$0.gB());
   }

   @Override
   protected void a(bsq $$0, @Nullable btj $$1) {
      super.a($$0, $$1);
      this.c.b(new agj(this.ap(), $$0, true));
      if ($$0.a(bss.y)) {
         this.cY = this.ag;
         this.cX = this.dq();
      }

      an.B.a(this, $$1);
   }

   @Override
   protected void a(bsq $$0, boolean $$1, @Nullable btj $$2) {
      super.a($$0, $$1, $$2);
      this.c.b(new agj(this.ap(), $$0, false));
      an.B.a(this, $$2);
   }

   @Override
   protected void a(bsq $$0) {
      super.a($$0);
      this.c.b(new aem(this.ap(), $$0.c()));
      if ($$0.a(bss.y)) {
         this.cX = null;
      }

      an.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.c.a($$0, $$1, $$2, this.dI(), this.dK(), bus.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.c.a(this.dx() + $$0, this.dz() + $$1, this.dD() + $$2, this.dI(), this.dK(), bus.f);
   }

   @Override
   public boolean a(arg $$0, double $$1, double $$2, double $$3, Set<bus> $$4, float $$5, float $$6, boolean $$7) {
      dcy $$8 = new dcy(je.a($$1, $$2, $$3));
      $$0.l().a(arl.f, $$8, 1, this.ap());
      if (this.fL()) {
         this.a(true, true);
      }

      this.a($$0, $$1, $$2, $$3, $$5, $$6, $$7);
      this.q($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.c.l();
   }

   @Override
   public void b(btj $$0) {
      this.B().l().a(this, new acc($$0, 4));
   }

   @Override
   public void c(btj $$0) {
      this.B().l().a(this, new acc($$0, 5));
   }

   @Override
   public void A() {
      if (this.c != null) {
         this.c.b(new aea(this.gd()));
         this.L();
      }
   }

   public arg B() {
      return (arg)this.dS();
   }

   public boolean a(ddp $$0) {
      boolean $$1 = this.P_();
      if (!this.e.a($$0)) {
         return false;
      } else {
         this.c.b(new adg(adg.e, (float)$$0.a()));
         if ($$0 == ddp.d) {
            this.gq();
            this.af();
            day.a(this);
         } else {
            this.d(this);
            if ($$1) {
               day.a(this.B(), this);
            }
         }

         this.A();
         this.ft();
         return true;
      }
   }

   @Override
   public boolean P_() {
      return this.e.b() == ddp.d;
   }

   @Override
   public boolean f() {
      return this.e.b() == ddp.b;
   }

   @Override
   public void a(xd $$0) {
      this.b($$0, false);
   }

   public void b(xd $$0, boolean $$1) {
      if (this.x($$1)) {
         this.c.a(new aga($$0, $$1), wk.a(() -> {
            if (this.x(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               xd $$3 = xd.b($$2).a(n.o);
               return new aga(xd.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(xs $$0, boolean $$1, wz.a $$2) {
      if (this.gM()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String C() {
      return this.c.m() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aqs $$0) {
      this.db = $$0.b();
      this.da = $$0.c();
      this.cQ = $$0.d();
      this.cS = $$0.e();
      this.dm = $$0.h();
      this.dn = $$0.i();
      this.cR = $$0.j();
      this.at().a(bU, (byte)$$0.f());
      this.at().a(bV, (byte)$$0.g().b());
   }

   public aqs D() {
      int $$0 = this.at().a(bU);
      btz $$1 = btz.d.apply(this.at().a(bV));
      return new aqs(this.db, this.da, this.cQ, this.cS, $$0, $$1, this.dm, this.dn, this.cR);
   }

   public boolean E() {
      return this.cS;
   }

   public cnn F() {
      return this.cQ;
   }

   private boolean x(boolean $$0) {
      return this.cQ == cnn.c ? $$0 : true;
   }

   private boolean gM() {
      return this.cQ == cnn.a;
   }

   public int G() {
      return this.da;
   }

   public void a(aka $$0) {
      this.c.b(new aes($$0.a(), $$0.d().map(aka.a::a)));
   }

   @Override
   protected int H() {
      return this.d.c(this.gb());
   }

   @Override
   public void I() {
      this.cT = ad.c();
   }

   public awj J() {
      return this.cE;
   }

   public awi K() {
      return this.cW;
   }

   @Override
   protected void L() {
      if (this.P_()) {
         this.ev();
         this.k(true);
      } else {
         super.L();
      }
   }

   public btj M() {
      return (btj)(this.cU == null ? this : this.cU);
   }

   @Override
   public void d(@Nullable btj $$0) {
      btj $$1 = this.M();
      this.cU = (btj)($$0 == null ? this : $$0);
      if ($$1 != this.cU) {
         if (this.cU.dS() instanceof arg $$2) {
            this.a($$2, this.cU.dx(), this.cU.dz(), this.cU.dD(), Set.of(), this.dI(), this.dK(), false);
         }

         if ($$0 != null) {
            this.B().l().a(this);
         }

         this.c.b(new aez(this.cU));
         this.c.l();
      }
   }

   @Override
   protected void N() {
      if (!this.cV) {
         super.N();
      }
   }

   @Override
   public void e(btj $$0) {
      if (this.e.b() == ddp.d) {
         this.d($$0);
      } else {
         super.e($$0);
      }
   }

   public long O() {
      return this.cT;
   }

   @Nullable
   public xd P() {
      return null;
   }

   public int Q() {
      return 0;
   }

   @Override
   public void a(brj $$0) {
      super.a($$0);
      this.gw();
   }

   public boolean R() {
      return this.cV;
   }

   public void S() {
      this.cV = false;
   }

   public alj T() {
      return this.cD;
   }

   public void a(arg $$0, double $$1, double $$2, double $$3, float $$4, float $$5, boolean $$6) {
      if ($$6) {
         this.d(this);
      }

      this.af();
      this.a(new eqz($$0, new eye($$1, $$2, $$3), eye.c, $$4, $$5, eqz.a));
   }

   @Nullable
   public je U() {
      return this.di;
   }

   public float V() {
      return this.dk;
   }

   public ala<dds> W() {
      return this.dh;
   }

   public boolean X() {
      return this.dj;
   }

   public void b(arh $$0) {
      this.a($$0.W(), $$0.U(), $$0.V(), $$0.X(), false);
   }

   public void a(ala<dds> $$0, @Nullable je $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.di) && $$0.equals(this.dh);
         if ($$4 && !$$5) {
            this.a(xd.c("block.minecraft.set_spawn"));
         }

         this.di = $$1;
         this.dh = $$0;
         this.dk = $$2;
         this.dj = $$3;
      } else {
         this.di = null;
         this.dh = dds.h;
         this.dk = 0.0F;
         this.dj = false;
      }
   }

   public kg Y() {
      return this.df;
   }

   public void a(kg $$0) {
      this.df = $$0;
   }

   public aqr Z() {
      return this.dg;
   }

   public void a(aqr $$0) {
      this.dg = $$0;
   }

   @Override
   public void a(awc $$0, awe $$1, float $$2, float $$3) {
      this.c.b(new afx(lu.b.e($$0), $$1, this.dx(), this.dz(), this.dD(), $$2, $$3, this.af.g()));
   }

   @Override
   public cjz a(cvl $$0, boolean $$1, boolean $$2) {
      cjz $$3 = this.b($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dS().b($$3);
         cvl $$4 = $$3.m();
         if ($$2) {
            if (!$$4.f()) {
               this.a(awn.f.b($$4.h()), $$0.J());
            }

            this.a(awn.F);
         }

         return $$3;
      }
   }

   @Nullable
   private cjz b(cvl $$0, boolean $$1, boolean $$2) {
      if ($$0.f()) {
         return null;
      } else {
         double $$3 = this.dB() - 0.3F;
         cjz $$4 = new cjz(this.dS(), this.dx(), $$3, this.dD(), $$0);
         $$4.b(40);
         if ($$2) {
            $$4.b(this);
         }

         if ($$1) {
            float $$5 = this.af.i() * 0.5F;
            float $$6 = this.af.i() * (float) (Math.PI * 2);
            $$4.n((double)(-azc.a($$6) * $$5), 0.2F, (double)(azc.b($$6) * $$5));
         } else {
            float $$7 = 0.3F;
            float $$8 = azc.a(this.dK() * (float) (Math.PI / 180.0));
            float $$9 = azc.b(this.dK() * (float) (Math.PI / 180.0));
            float $$10 = azc.a(this.dI() * (float) (Math.PI / 180.0));
            float $$11 = azc.b(this.dI() * (float) (Math.PI / 180.0));
            float $$12 = this.af.i() * (float) (Math.PI * 2);
            float $$13 = 0.02F * this.af.i();
            $$4.n(
               (double)(-$$10 * $$9 * 0.3F) + Math.cos((double)$$12) * (double)$$13,
               (double)(-$$8 * 0.3F + 0.1F + (this.af.i() - this.af.i()) * 0.1F),
               (double)($$11 * $$9 * 0.3F) + Math.sin((double)$$12) * (double)$$13
            );
         }

         return $$4;
      }
   }

   public aso aa() {
      return this.dl;
   }

   public void a(arg $$0) {
      this.a((dds)$$0);
      this.e.a($$0);
   }

   @Nullable
   private static ddp a(@Nullable uf $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? ddp.a($$0.h($$1)) : null;
   }

   private ddp b(@Nullable ddp $$0) {
      ddp $$1 = this.d.be();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.d.t_();
      }
   }

   @Override
   public void c(@Nullable uf $$0) {
      this.e.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(uf $$0) {
      $$0.a("playerGameType", this.e.b().a());
      ddp $$1 = this.e.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean ab() {
      return this.dm;
   }

   public boolean c(arh $$0) {
      return $$0 == this ? false : this.dm || $$0.dm;
   }

   @Override
   public boolean a(dds $$0, je $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cvl $$0) {
      an.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      cno $$1 = this.gc();
      cvl $$2 = $$1.a($$0);
      this.ca.b($$1, $$1.j).ifPresent($$1x -> this.ca.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean ac() {
      return this.dn;
   }

   @Override
   public Optional<cmv> ad() {
      return Optional.of(this.dp);
   }

   public void b(boolean $$0) {
      this.do = $$0;
   }

   @Override
   public void a(cjz $$0) {
      super.a($$0);
      btj $$1 = $$0.s();
      if ($$1 != null) {
         an.S.a(this, $$0.m(), $$1);
      }
   }

   public void a(xu $$0) {
      this.du = $$0;
   }

   @Nullable
   public xu ae() {
      return this.du != null && this.du.b() ? null : this.du;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.ct = (float)(azc.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dI());
      this.c.b(new adi(this));
   }

   @Override
   public boolean a(btj $$0, boolean $$1) {
      if (super.a($$0, $$1)) {
         $$0.j(this);
         this.c.a(this.dx(), this.dz(), this.dD(), this.dI(), this.dK());
         if ($$0 instanceof buf $$2) {
            this.d.ag().a($$2, this.c);
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public void af() {
      btj $$0 = this.dg();
      super.af();
      if ($$0 instanceof buf $$1) {
         for (bsq $$2 : $$1.ex()) {
            this.c.b(new aem($$0.ap(), $$2.c()));
         }
      }
   }

   public agl b(arg $$0) {
      return new agl($$0.af(), $$0.ag(), dev.a($$0.C()), this.e.b(), this.e.c(), $$0.aj(), $$0.B(), this.gB(), this.aB(), $$0.N());
   }

   @Override
   public void c(je $$0) {
      this.dq = $$0;
   }

   public void ag() {
      this.dq = null;
   }

   @Nullable
   public je ah() {
      return this.dq;
   }

   @Override
   public eye ai() {
      btj $$0 = this.dg();
      return $$0 != null && $$0.cU() != this ? $$0.ai() : this.dr;
   }

   public void a(eye $$0) {
      this.dr = $$0;
   }

   @Override
   protected float a(btj $$0, float $$1, bsb $$2) {
      return day.a(this.B(), this.dW(), $$0, $$2, $$1);
   }

   @Override
   public void a(cvg $$0, btr $$1) {
      super.a($$0, $$1);
      this.b(awn.d.b($$0));
   }

   static record a(eye a, float b) {
      public static arh.a a(eye $$0, je $$1) {
         return new arh.a($$0, b($$0, $$1));
      }

      private static float b(eye $$0, je $$1) {
         eye $$2 = eye.c($$1).d($$0).d();
         return (float)azc.d(azc.d($$2.f, $$2.d) * 180.0F / (float)Math.PI - 90.0);
      }
   }
}
