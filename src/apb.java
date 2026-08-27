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
import java.util.UUID;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class apb extends cia {
   private static final Logger b = LogUtils.getLogger();
   private static final int cr = 32;
   private static final int cs = 10;
   private static final int ct = 25;
   public static final double c = 1.0;
   private static final bqc cu = new bqc(UUID.fromString("736565d2-e1a7-403d-a3f8-1aeb3e302542"), "Creative block interaction range modifier", 0.5, bqc.a.a);
   private static final bqc cv = new bqc(UUID.fromString("98491ef6-97b1-4584-ae82-71a8cc85cf73"), "Creative entity interaction range modifier", 2.0, bqc.a.a);
   public apz d;
   public final MinecraftServer e;
   public final apc f;
   private final ajk cx;
   private final atv cy;
   private float cz = Float.MIN_VALUE;
   private int cA = Integer.MIN_VALUE;
   private int cB = Integer.MIN_VALUE;
   private int cC = Integer.MIN_VALUE;
   private int cD = Integer.MIN_VALUE;
   private int cE = Integer.MIN_VALUE;
   private float cF = -1.0E8F;
   private int cG = -99999999;
   private boolean cH = true;
   private int cI = -99999999;
   private int cJ = 60;
   private chy cK = chy.a;
   private boolean cL = true;
   private long cM = ac.b();
   @Nullable
   private bof cN;
   private boolean cO;
   private boolean cP;
   private final atu cQ = new atu();
   @Nullable
   private eov cR;
   private int cS;
   private boolean cT;
   private int cU = 2;
   private String cV = "en_us";
   @Nullable
   private eov cW;
   @Nullable
   private eov cX;
   @Nullable
   private eov cY;
   private jd cZ = jd.a(0, 0, 0);
   private aoo da = aoo.a;
   private ajb<cwe> db = cwe.h;
   @Nullable
   private ib dc;
   private boolean dd;
   private float de;
   private final aqe df;
   private boolean dg;
   private boolean dh;
   private chg di = new chg(0, 0, 0);
   private final clh dj = new clh() {
      @Override
      public void a(cku $$0, iu<cpq> $$1, cpq $$2, int[] $$3) {
         apb.this.d.b(new abd($$0.j, $$0.k(), $$1, $$2));

         for (int $$4 = 0; $$4 < $$3.length; $$4++) {
            this.b($$0, $$4, $$3[$$4]);
         }
      }

      @Override
      public void a(cku $$0, int $$1, cpq $$2) {
         apb.this.d.b(new abf($$0.j, $$0.k(), $$1, $$2));
      }

      @Override
      public void a(cku $$0, cpq $$1) {
         apb.this.d.b(new abf(-1, $$0.k(), -1, $$1));
      }

      @Override
      public void a(cku $$0, int $$1, int $$2) {
         this.b($$0, $$1, $$2);
      }

      private void b(cku $$0, int $$1, int $$2) {
         apb.this.d.b(new abe($$0.j, $$1, $$2));
      }
   };
   private final clg dk = new clg() {
      @Override
      public void a(cku $$0, int $$1, cpq $$2) {
         cmp $$3 = $$0.b($$1);
         if (!($$3 instanceof cml)) {
            if ($$3.d == apb.this.fV()) {
               am.f.a(apb.this, apb.this.fV(), $$2);
            }
         }
      }

      @Override
      public void a(cku $$0, int $$1, int $$2) {
      }
   };
   @Nullable
   private wj dl;
   private int dm;
   public boolean g;

   public apb(MinecraftServer $$0, apa $$1, GameProfile $$2, aop $$3) {
      super($$1, $$1.T(), $$1.U(), $$2);
      this.df = $$0.a(this);
      this.f = $$0.b(this);
      this.e = $$0;
      this.cy = $$0.ah().a((cia)this);
      this.cx = $$0.ah().f(this);
      this.e($$1);
      this.a($$3);
   }

   private void e(apa $$0) {
      ib $$1 = $$0.T();
      if ($$0.E_().g() && $$0.o().bc().k() != cwb.c) {
         int $$2 = Math.max(0, this.e.a($$0));
         int $$3 = awm.a($$0.D_().b((double)$$1.u(), (double)$$1.w()));
         if ($$3 < $$2) {
            $$2 = $$3;
         }

         if ($$3 <= 1) {
            $$2 = 1;
         }

         long $$4 = (long)($$2 * 2 + 1);
         long $$5 = $$4 * $$4;
         int $$6 = $$5 > 2147483647L ? Integer.MAX_VALUE : (int)$$5;
         int $$7 = this.v($$6);
         int $$8 = awt.a().a($$6);

         for (int $$9 = 0; $$9 < $$6; $$9++) {
            int $$10 = ($$8 + $$7 * $$9) % $$6;
            int $$11 = $$10 % ($$2 * 2 + 1);
            int $$12 = $$10 / ($$2 * 2 + 1);
            ib $$13 = aov.a($$0, $$1.u() + $$11 - $$2, $$1.w() + $$12 - $$2);
            if ($$13 != null) {
               this.a($$13, 0.0F, 0.0F);
               if ($$0.g(this)) {
                  break;
               }
            }
         }
      } else {
         this.a($$1, 0.0F, 0.0F);

         while (!$$0.g(this) && this.dq() < (double)($$0.ak() - 1)) {
            this.a_(this.do(), this.dq() + 1.0, this.du());
         }
      }
   }

   private int v(int $$0) {
      return $$0 <= 16 ? $$0 - 1 : 17;
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("warden_spawn_tracker", 10)) {
         chg.a.parse(new Dynamic(tm.a, $$0.c("warden_spawn_tracker"))).resultOrPartial(b::error).ifPresent($$0x -> this.di = $$0x);
      }

      if ($$0.b("enteredNetherPosition", 10)) {
         sy $$1 = $$0.p("enteredNetherPosition");
         this.cX = new eov($$1.k("x"), $$1.k("y"), $$1.k("z"));
      }

      this.cP = $$0.q("seenCredits");
      if ($$0.b("recipeBook", 10)) {
         this.cQ.a($$0.p("recipeBook"), this.e.aJ());
      }

      if (this.fF()) {
         this.fG();
      }

      if ($$0.b("SpawnX", 99) && $$0.b("SpawnY", 99) && $$0.b("SpawnZ", 99)) {
         this.dc = new ib($$0.h("SpawnX"), $$0.h("SpawnY"), $$0.h("SpawnZ"));
         this.dd = $$0.q("SpawnForced");
         this.de = $$0.j("SpawnAngle");
         if ($$0.e("SpawnDimension")) {
            this.db = cwe.g.parse(tm.a, $$0.c("SpawnDimension")).resultOrPartial(b::error).orElse(cwe.h);
         }
      }
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      chg.a.encodeStart(tm.a, this.di).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("warden_spawn_tracker", $$1));
      this.k($$0);
      $$0.a("seenCredits", this.cP);
      if (this.cX != null) {
         sy $$1 = new sy();
         $$1.a("x", this.cX.c);
         $$1.a("y", this.cX.d);
         $$1.a("z", this.cX.e);
         $$0.a("enteredNetherPosition", $$1);
      }

      bof $$2 = this.cT();
      bof $$3 = this.cW();
      if ($$3 != null && $$2 != this && $$2.cS()) {
         sy $$4 = new sy();
         sy $$5 = new sy();
         $$2.e($$5);
         $$4.a("Attach", $$3.ct());
         $$4.a("Entity", $$5);
         $$0.a("RootVehicle", $$4);
      }

      $$0.a("recipeBook", this.cQ.b());
      $$0.a("Dimension", this.dJ().ad().a().toString());
      if (this.dc != null) {
         $$0.a("SpawnX", this.dc.u());
         $$0.a("SpawnY", this.dc.v());
         $$0.a("SpawnZ", this.dc.w());
         $$0.a("SpawnForced", this.dd);
         $$0.a("SpawnAngle", this.de);
         ajc.a.encodeStart(tm.a, this.db.a()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("SpawnDimension", $$1));
      }
   }

   public void a(int $$0) {
      float $$1 = (float)this.ge();
      float $$2 = ($$1 - 1.0F) / $$1;
      this.cm = awm.a((float)$$0 / $$1, 0.0F, $$2);
      this.cI = -1;
   }

   public void b(int $$0) {
      this.ck = $$0;
      this.cI = -1;
   }

   @Override
   public void c(int $$0) {
      super.c($$0);
      this.cI = -1;
   }

   @Override
   public void a(cpq $$0, int $$1) {
      super.a($$0, $$1);
      this.cI = -1;
   }

   private void a(cku $$0) {
      $$0.a(this.dk);
      $$0.a(this.dj);
   }

   public void h() {
      this.a(this.bW);
   }

   @Override
   public void g_() {
      super.g_();
      this.d.b(acl.a);
   }

   @Override
   public void h_() {
      super.h_();
      this.d.b(new ack(this.eJ()));
   }

   @Override
   protected void a(dme $$0) {
      am.e.a(this, $$0);
   }

   @Override
   protected cpm k() {
      return new cql(this);
   }

   @Override
   public void l() {
      this.f.a();
      this.di.a();
      this.cJ--;
      if (this.ak > 0) {
         this.ak--;
      }

      this.bX.d();
      if (!this.dJ().B && !this.bX.a(this)) {
         this.r();
         this.bX = this.bW;
      }

      bof $$0 = this.K();
      if ($$0 != this) {
         if ($$0.bx()) {
            this.a($$0.do(), $$0.dq(), $$0.du(), $$0.dz(), $$0.dB());
            this.z().l().a(this);
            if (this.fL()) {
               this.c(this);
            }
         } else {
            this.c(this);
         }
      }

      am.x.a(this);
      if (this.cR != null) {
         am.v.a(this, this.cR, this.ag - this.cS);
      }

      this.o();
      this.p();
      this.gx();
      this.cx.b(this);
   }

   private void gx() {
      bqa $$0 = this.f(bqe.f);
      if ($$0 != null) {
         if (this.f()) {
            $$0.b(cu);
         } else {
            $$0.e(cu);
         }
      }

      bqa $$1 = this.f(bqe.g);
      if ($$1 != null) {
         if (this.f()) {
            $$1.b(cv);
         } else {
            $$1.e(cv);
         }
      }
   }

   public void m() {
      try {
         if (!this.P_() || !this.db()) {
            super.l();
         }

         for (int $$0 = 0; $$0 < this.fV().b(); $$0++) {
            cpq $$1 = this.fV().a($$0);
            if ($$1.d().am_()) {
               xz<?> $$2 = ((cnx)$$1.d()).a($$1, this.dJ(), this);
               if ($$2 != null) {
                  this.d.b($$2);
               }
            }
         }

         if (this.eu() != this.cF || this.cG != this.bY.a() || this.bY.e() == 0.0F != this.cH) {
            this.d.b(new adr(this.eu(), this.bY.a(), this.bY.e()));
            this.cF = this.eu();
            this.cG = this.bY.a();
            this.cH = this.bY.e() == 0.0F;
         }

         if (this.eu() + this.fm() != this.cz) {
            this.cz = this.eu() + this.fm();
            this.a(eqc.g, awm.f(this.cz));
         }

         if (this.bY.a() != this.cA) {
            this.cA = this.bY.a();
            this.a(eqc.h, awm.f((float)this.cA));
         }

         if (this.cf() != this.cB) {
            this.cB = this.cf();
            this.a(eqc.i, awm.f((float)this.cB));
         }

         if (this.eI() != this.cC) {
            this.cC = this.eI();
            this.a(eqc.j, awm.f((float)this.cC));
         }

         if (this.cl != this.cE) {
            this.cE = this.cl;
            this.a(eqc.k, awm.f((float)this.cE));
         }

         if (this.ck != this.cD) {
            this.cD = this.ck;
            this.a(eqc.l, awm.f((float)this.cD));
         }

         if (this.cl != this.cI) {
            this.cI = this.cl;
            this.d.b(new adq(this.cm, this.cl, this.ck));
         }

         if (this.ag % 20 == 0) {
            am.q.a(this);
         }
      } catch (Throwable var4) {
         o $$4 = o.a(var4, "Ticking player");
         p $$5 = $$4.a("Player being ticked");
         this.a($$5);
         throw new y($$4);
      }
   }

   @Override
   public void n() {
      if (this.eu() > 0.0F && this.cW != null) {
         am.X.a(this, this.cW);
      }

      this.cW = null;
      super.n();
   }

   public void o() {
      if (this.aa > 0.0F && this.cW == null) {
         this.cW = this.dh();
      }
   }

   public void p() {
      if (this.cW() != null && this.cW().bn()) {
         if (this.cY == null) {
            this.cY = this.dh();
         } else {
            am.Y.a(this, this.cY);
         }
      }

      if (this.cY != null && (this.cW() == null || !this.cW().bn())) {
         this.cY = null;
      }
   }

   private void a(eqc $$0, int $$1) {
      this.gk().a($$0, this, $$1x -> $$1x.a($$1));
   }

   @Override
   public void a(bne $$0) {
      this.b(dqr.p);
      boolean $$1 = this.dJ().Z().b(cwa.n);
      if ($$1) {
         vs $$2 = this.eJ().a();
         this.d.a(new acm(this.aj(), $$2), uz.a(() -> {
            int $$1x = 256;
            String $$2x = $$2.a(256);
            vs $$3x = vs.a("death.attack.message_too_long", vs.b($$2x).a(n.o));
            vs $$4x = vs.a("death.attack.even_more_magic", this.Q_()).a($$1xx -> $$1xx.a(new vy(vy.a.a, $$3x)));
            return new acm(this.aj(), $$4x);
         }));
         eqb $$3 = this.cd();
         if ($$3 == null || $$3.k() == eqb.b.a) {
            this.e.ah().a($$2, false);
         } else if ($$3.k() == eqb.b.c) {
            this.e.ah().a(this, $$2);
         } else if ($$3.k() == eqb.b.d) {
            this.e.ah().b(this, $$2);
         }
      } else {
         this.d.b(new acm(this.aj(), vr.a));
      }

      this.gj();
      if (this.dJ().Z().b(cwa.N)) {
         this.gy();
      }

      if (!this.P_()) {
         this.g($$0);
      }

      this.gk().a(eqc.d, this, epx::b);
      box $$4 = this.eK();
      if ($$4 != null) {
         this.b(atz.h.b($$4.ai()));
         $$4.a(this, this.bi, $$0);
         this.f($$4);
      }

      this.dJ().a(this, (byte)3);
      this.a(atz.N);
      this.a(atz.i.b(atz.m));
      this.a(atz.i.b(atz.n));
      this.aA();
      this.l(0);
      this.a_(false);
      this.eJ().c();
      this.a(Optional.of(ik.a(this.dJ().ad(), this.dj())));
   }

   private void gy() {
      eoq $$0 = new eoq(this.dj()).c(32.0, 10.0, 32.0);
      this.dJ().a(boz.class, $$0, bok.f).stream().filter($$0x -> $$0x instanceof bpd).forEach($$0x -> ((bpd)$$0x).a_((cia)this));
   }

   @Override
   public void a(bof $$0, int $$1, bne $$2) {
      if ($$0 != this) {
         super.a($$0, $$1, $$2);
         this.t($$1);
         this.gk().a(eqc.f, this, epx::b);
         if ($$0 instanceof cia) {
            this.a(atz.Q);
            this.gk().a(eqc.e, this, epx::b);
         } else {
            this.a(atz.O);
         }

         this.a(this, $$0, eqc.m);
         this.a($$0, this, eqc.n);
         am.c.a(this, $$0, $$2);
      }
   }

   private void a(epy $$0, epy $$1, eqc[] $$2) {
      epu $$3 = this.gk().e($$1.cv());
      if ($$3 != null) {
         int $$4 = $$3.n().b();
         if ($$4 >= 0 && $$4 < $$2.length) {
            this.gk().a($$2[$$4], $$0, epx::b);
         }
      }
   }

   @Override
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         boolean $$2 = this.e.n() && this.gz() && $$0.a(aug.n);
         if (!$$2 && this.cJ > 0 && !$$0.a(aug.e)) {
            return false;
         } else {
            bof $$3 = $$0.d();
            if ($$3 instanceof cia $$4 && !this.a($$4)) {
               return false;
            }

            if ($$3 instanceof cig $$5 && $$5.w() instanceof cia $$7 && !this.a($$7)) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }
   }

   @Override
   public boolean a(cia $$0) {
      return !this.gz() ? false : super.a($$0);
   }

   private boolean gz() {
      return this.e.ad();
   }

   @Nullable
   @Override
   protected eio a(apa $$0) {
      eio $$1 = super.a($$0);
      if ($$1 != null && this.dJ().ad() == cwe.h && $$0.ad() == cwe.j) {
         eov $$2 = $$1.a.b(0.0, -1.0, 0.0);
         return new eio($$2, eov.b, 90.0F, 0.0F);
      } else {
         return $$1;
      }
   }

   @Nullable
   @Override
   public bof b(apa $$0) {
      this.cO = true;
      apa $$1 = this.z();
      ajb<cwe> $$2 = $$1.ad();
      if ($$2 == cwe.j && $$0.ad() == cwe.h) {
         this.ag();
         this.z().a(this, bof.c.e);
         if (!this.g) {
            this.g = true;
            this.d.b(new abp(abp.f, this.cP ? 0.0F : 1.0F));
            this.cP = true;
         }

         return this;
      } else {
         ejk $$3 = $$0.B_();
         this.d.b(new acv(this.d($$0), (byte)3));
         this.d.b(new aav($$3.q(), $$3.r()));
         ass $$4 = this.e.ah();
         $$4.d(this);
         $$1.a(this, bof.c.e);
         this.dG();
         eio $$5 = this.a($$0);
         if ($$5 != null) {
            $$1.ae().a("moving");
            if ($$2 == cwe.h && $$0.ad() == cwe.i) {
               this.cX = this.dh();
            } else if ($$0.ad() == cwe.j) {
               this.a($$0, ib.a($$5.a));
            }

            $$1.ae().c();
            $$1.ae().a("placing");
            this.c($$0);
            this.d.a($$5.a.c, $$5.a.d, $$5.a.e, $$5.c, $$5.d);
            this.d.m();
            $$0.b(this);
            $$1.ae().c();
            this.f($$1);
            this.d.b(new aci(this.fW()));
            $$4.a(this, $$0);
            $$4.e(this);

            for (bns $$6 : this.er()) {
               this.d.b(new aeo(this.aj(), $$6, false));
            }

            this.d.b(new abv(1032, ib.c, 0, false));
            this.cI = -1;
            this.cF = -1.0F;
            this.cG = -1;
         }

         return this;
      }
   }

   private void a(apa $$0, ib $$1) {
      ib.a $$2 = $$1.j();

      for (int $$3 = -2; $$3 <= 2; $$3++) {
         for (int $$4 = -2; $$4 <= 2; $$4++) {
            for (int $$5 = -1; $$5 < 3; $$5++) {
               dme $$6 = $$5 == -1 ? czh.co.o() : czh.a.o();
               $$0.b($$2.g($$1).e($$4, $$5, $$3), $$6);
            }
         }
      }
   }

   @Override
   protected Optional<l.a> a(apa $$0, ib $$1, boolean $$2, dnv $$3) {
      Optional<l.a> $$4 = super.a($$0, $$1, $$2, $$3);
      if ($$4.isPresent()) {
         return $$4;
      } else {
         ih.a $$5 = this.dJ().a_(this.aw).d(dei.b).orElse(ih.a.a);
         Optional<l.a> $$6 = $$0.p().a($$1, $$5);
         if ($$6.isEmpty()) {
            b.error("Unable to create a portal, likely target out of worldborder");
         }

         return $$6;
      }
   }

   private void f(apa $$0) {
      ajb<cwe> $$1 = $$0.ad();
      ajb<cwe> $$2 = this.dJ().ad();
      am.w.a(this, $$1, $$2);
      if ($$1 == cwe.i && $$2 == cwe.h && this.cX != null) {
         am.D.a(this, this.cX);
      }

      if ($$2 != cwe.i) {
         this.cX = null;
      }
   }

   @Override
   public boolean a(apb $$0) {
      if ($$0.P_()) {
         return this.K() == this;
      } else {
         return this.P_() ? false : super.a($$0);
      }
   }

   @Override
   public void a(bof $$0, int $$1) {
      super.a($$0, $$1);
      this.bX.d();
   }

   @Override
   public Either<cia.a, axo> a(ib $$0) {
      ih $$1 = this.dJ().a_($$0).c(dda.aE);
      if (this.fF() || !this.bx()) {
         return Either.left(cia.a.e);
      } else if (!this.dJ().E_().j()) {
         return Either.left(cia.a.a);
      } else if (!this.a($$0, $$1)) {
         return Either.left(cia.a.c);
      } else if (this.b($$0, $$1)) {
         return Either.left(cia.a.d);
      } else {
         this.a(this.dJ().ad(), $$0, this.dz(), false, true);
         if (this.dJ().P()) {
            return Either.left(cia.a.b);
         } else {
            if (!this.f()) {
               double $$2 = 8.0;
               double $$3 = 5.0;
               eov $$4 = eov.c($$0);
               List<cfg> $$5 = this.dJ()
                  .a(cfg.class, new eoq($$4.a() - 8.0, $$4.b() - 5.0, $$4.c() - 8.0, $$4.a() + 8.0, $$4.b() + 5.0, $$4.c() + 8.0), $$0x -> $$0x.f(this));
               if (!$$5.isEmpty()) {
                  return Either.left(cia.a.f);
               }
            }

            Either<cia.a, axo> $$6 = super.a($$0).ifRight($$0x -> {
               this.a(atz.ap);
               am.r.a(this);
            });
            if (!this.z().d()) {
               this.a(vs.c("sleep.not_possible"), true);
            }

            ((apa)this.dJ()).e();
            return $$6;
         }
      }
   }

   @Override
   public void b(ib $$0) {
      this.a(atz.i.b(atz.n));
      super.b($$0);
   }

   private boolean a(ib $$0, ih $$1) {
      return this.i($$0) || this.i($$0.a($$1.g()));
   }

   private boolean i(ib $$0) {
      eov $$1 = eov.c($$0);
      return Math.abs(this.do() - $$1.a()) <= 3.0 && Math.abs(this.dq() - $$1.b()) <= 2.0 && Math.abs(this.du() - $$1.c()) <= 3.0;
   }

   private boolean b(ib $$0, ih $$1) {
      ib $$2 = $$0.c();
      return !this.h($$2) || !this.h($$2.a($$1.g()));
   }

   @Override
   public void a(boolean $$0, boolean $$1) {
      if (this.fF()) {
         this.z().l().a(this, new aal(this, 2));
      }

      super.a($$0, $$1);
      if (this.d != null) {
         this.d.a(this.do(), this.dq(), this.du(), this.dz(), this.dB());
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2) {
      this.bC();
      this.a_($$0, $$1, $$2);
   }

   @Override
   public boolean b(bne $$0) {
      return super.b($$0) || this.O();
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
   }

   @Override
   protected void c(ib $$0) {
      if (!this.P_()) {
         super.c($$0);
      }
   }

   public void a(double $$0, double $$1, double $$2, boolean $$3) {
      if (!this.db()) {
         this.b($$3, new eov($$0, $$1, $$2));
         ib $$4 = this.aH();
         super.a($$1, $$3, this.dJ().a_($$4), $$4);
      }
   }

   @Override
   protected void M_() {
      if (this.dJ().s().i()) {
         super.M_();
      }
   }

   @Override
   public void a(dku $$0, boolean $$1) {
      this.d.b(new aar(this.dJ(), $$0.aD_()));
      this.d.b(new acg($$0.aD_(), $$1));
   }

   private void gA() {
      this.dm = this.dm % 100 + 1;
   }

   @Override
   public OptionalInt a(@Nullable bmp $$0) {
      if ($$0 == null) {
         return OptionalInt.empty();
      } else {
         if (this.bX != this.bW) {
            this.r();
         }

         this.gA();
         cku $$1 = $$0.createMenu(this.dm, this.fV(), this);
         if ($$1 == null) {
            if (this.P_()) {
               this.a(vs.c("container.spectatorCantOpen").a(n.m), true);
            }

            return OptionalInt.empty();
         } else {
            this.d.b(new acf($$1.j, $$1.a(), $$0.Q_()));
            this.a($$1);
            this.bX = $$1;
            return OptionalInt.of(this.dm);
         }
      }
   }

   @Override
   public void a(int $$0, cvd $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.d.b(new acb($$0, $$1, $$2, $$3, $$4, $$5));
   }

   @Override
   public void a(cco $$0, bme $$1) {
      if (this.bX != this.bW) {
         this.r();
      }

      this.gA();
      this.d.b(new abq(this.dm, $$1.b(), $$0.aj()));
      this.bX = new clu(this.dm, this.fV(), $$1, $$0);
      this.a(this.bX);
   }

   @Override
   public void a(cpq $$0, bmk $$1) {
      if ($$0.a(cpt.tX)) {
         if (crl.a($$0, this.da(), this)) {
            this.bX.d();
         }

         this.d.b(new ace($$1));
      }
   }

   @Override
   public void a(djv $$0) {
      this.d.b(aap.a($$0, djl::d));
   }

   @Override
   public void r() {
      this.d.b(new abc(this.bX.j));
      this.s();
   }

   @Override
   public void s() {
      this.bX.b(this);
      this.bW.a(this.bX);
      this.bX = this.bW;
   }

   public void a(float $$0, float $$1, boolean $$2, boolean $$3) {
      if (this.bL()) {
         if ($$0 >= -1.0F && $$0 <= 1.0F) {
            this.bl = $$0;
         }

         if ($$1 >= -1.0F && $$1 <= 1.0F) {
            this.bn = $$1;
         }

         this.bk = $$2;
         this.f($$3);
      }
   }

   @Override
   public void a(eov $$0) {
      double $$1 = this.do();
      double $$2 = this.dq();
      double $$3 = this.du();
      super.a($$0);
      this.b(this.do() - $$1, this.dq() - $$2, this.du() - $$3);
   }

   @Override
   public void t() {
      double $$0 = this.do();
      double $$1 = this.dq();
      double $$2 = this.du();
      super.t();
      this.r(this.do() - $$0, this.dq() - $$1, this.du() - $$2);
   }

   public void b(double $$0, double $$1, double $$2) {
      if (!this.bL() && !s($$0, $$1, $$2)) {
         if (this.bW()) {
            int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$3 > 0) {
               this.a(atz.C, $$3);
               this.A(0.01F * (float)$$3 * 0.01F);
            }
         } else if (this.a(auj.a)) {
            int $$4 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            if ($$4 > 0) {
               this.a(atz.w, $$4);
               this.A(0.01F * (float)$$4 * 0.01F);
            }
         } else if (this.aZ()) {
            int $$5 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$5 > 0) {
               this.a(atz.s, $$5);
               this.A(0.01F * (float)$$5 * 0.01F);
            }
         } else if (this.e_()) {
            if ($$1 > 0.0) {
               this.a(atz.u, (int)Math.round($$1 * 100.0));
            }
         } else if (this.aC()) {
            int $$6 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$6 > 0) {
               if (this.bV()) {
                  this.a(atz.r, $$6);
                  this.A(0.1F * (float)$$6 * 0.01F);
               } else if (this.bU()) {
                  this.a(atz.q, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               } else {
                  this.a(atz.p, $$6);
                  this.A(0.0F * (float)$$6 * 0.01F);
               }
            }
         } else if (this.fy()) {
            int $$7 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
            this.a(atz.B, $$7);
         } else {
            int $$8 = Math.round((float)Math.sqrt($$0 * $$0 + $$2 * $$2) * 100.0F);
            if ($$8 > 25) {
               this.a(atz.v, $$8);
            }
         }
      }
   }

   private void r(double $$0, double $$1, double $$2) {
      if (this.bL() && !s($$0, $$1, $$2)) {
         int $$3 = Math.round((float)Math.sqrt($$0 * $$0 + $$1 * $$1 + $$2 * $$2) * 100.0F);
         bof $$4 = this.cW();
         if ($$4 instanceof cjt) {
            this.a(atz.x, $$3);
         } else if ($$4 instanceof cjv) {
            this.a(atz.y, $$3);
         } else if ($$4 instanceof cbd) {
            this.a(atz.z, $$3);
         } else if ($$4 instanceof cco) {
            this.a(atz.A, $$3);
         } else if ($$4 instanceof cft) {
            this.a(atz.D, $$3);
         }
      }
   }

   private static boolean s(double $$0, double $$1, double $$2) {
      return $$0 == 0.0 && $$1 == 0.0 && $$2 == 0.0;
   }

   @Override
   public void a(atw<?> $$0, int $$1) {
      this.cy.b(this, $$0, $$1);
      this.gk().a($$0, this, $$1x -> $$1x.b($$1));
   }

   @Override
   public void a(atw<?> $$0) {
      this.cy.a(this, $$0, 0);
      this.gk().a($$0, this, epx::c);
   }

   @Override
   public int a(Collection<csu<?>> $$0) {
      return this.cQ.a($$0, this);
   }

   @Override
   public void a(csu<?> $$0, List<cpq> $$1) {
      am.ac.a(this, $$0.a(), $$1);
   }

   @Override
   public void a(List<ajc> $$0) {
      List<csu<?>> $$1 = $$0.stream().flatMap($$0x -> this.e.aJ().a($$0x).stream()).collect(Collectors.toList());
      this.a($$1);
   }

   @Override
   public int b(Collection<csu<?>> $$0) {
      return this.cQ.b($$0, this);
   }

   @Override
   public void d(int $$0) {
      super.d($$0);
      this.cI = -1;
   }

   @Override
   public void u() {
      this.cT = true;
      this.bB();
      if (this.fF()) {
         this.a(true, false);
      }
   }

   public boolean v() {
      return this.cT;
   }

   @Override
   public void w() {
      this.cF = -1.0E8F;
   }

   @Override
   public void a(vs $$0, boolean $$1) {
      this.b($$0, $$1);
   }

   @Override
   protected void x() {
      if (!this.bw.b() && this.fp()) {
         this.d.b(new abm(this, (byte)9));
         super.x();
      }
   }

   @Override
   public void a(eg.a $$0, eov $$1) {
      super.a($$0, $$1);
      this.d.b(new acp($$0, $$1.c, $$1.d, $$1.e));
   }

   public void a(eg.a $$0, bof $$1, eg.a $$2) {
      eov $$3 = $$2.a($$1);
      super.a($$0, $$3);
      this.d.b(new acp($$0, $$1, $$2));
   }

   public void a(apb $$0, boolean $$1) {
      this.di = $$0.di;
      this.dl = $$0.dl;
      this.f.a($$0.f.b(), $$0.f.c());
      this.y();
      if ($$1) {
         this.fV().a($$0.fV());
         this.t($$0.eu());
         this.bY = $$0.bY;
         this.ck = $$0.ck;
         this.cl = $$0.cl;
         this.cm = $$0.cm;
         this.s($$0.fP());
         this.aw = $$0.aw;
      } else if (this.dJ().Z().b(cwa.d) || $$0.P_()) {
         this.fV().a($$0.fV());
         this.ck = $$0.ck;
         this.cl = $$0.cl;
         this.cm = $$0.cm;
         this.s($$0.fP());
      }

      this.cn = $$0.cn;
      this.bV = $$0.bV;
      this.an().b(bR, $$0.an().b(bR));
      this.cI = -1;
      this.cF = -1.0F;
      this.cG = -1;
      this.cQ.a($$0.cQ);
      this.cP = $$0.cP;
      this.cX = $$0.cX;
      this.da = $$0.da;
      this.i($$0.gm());
      this.j($$0.gn());
      this.a($$0.gu());
   }

   @Override
   protected void a(bns $$0, @Nullable bof $$1) {
      super.a($$0, $$1);
      this.d.b(new aeo(this.aj(), $$0, true));
      if ($$0.a(bnu.y)) {
         this.cS = this.ag;
         this.cR = this.dh();
      }

      am.B.a(this, $$1);
   }

   @Override
   protected void a(bns $$0, boolean $$1, @Nullable bof $$2) {
      super.a($$0, $$1, $$2);
      this.d.b(new aeo(this.aj(), $$0, false));
      am.B.a(this, $$2);
   }

   @Override
   protected void a(bns $$0) {
      super.a($$0);
      this.d.b(new act(this.aj(), $$0.b()));
      if ($$0.a(bnu.y)) {
         this.cR = null;
      }

      am.B.a(this, null);
   }

   @Override
   public void c(double $$0, double $$1, double $$2) {
      this.d.a($$0, $$1, $$2, this.dz(), this.dB(), bpk.g);
   }

   @Override
   public void d(double $$0, double $$1, double $$2) {
      this.d.a(this.do() + $$0, this.dq() + $$1, this.du() + $$2, this.dz(), this.dB(), bpk.f);
   }

   @Override
   public boolean a(apa $$0, double $$1, double $$2, double $$3, Set<bpk> $$4, float $$5, float $$6) {
      cvl $$7 = new cvl(ib.a($$1, $$2, $$3));
      $$0.l().a(apf.g, $$7, 1, this.aj());
      this.ac();
      if (this.fF()) {
         this.a(true, true);
      }

      if ($$0 == this.dJ()) {
         this.d.a($$1, $$2, $$3, $$5, $$6, $$4);
      } else {
         this.a($$0, $$1, $$2, $$3, $$5, $$6);
      }

      this.n($$5);
      return true;
   }

   @Override
   public void e(double $$0, double $$1, double $$2) {
      super.e($$0, $$1, $$2);
      this.d.m();
   }

   @Override
   public void a(bof $$0) {
      this.z().l().a(this, new aal($$0, 4));
   }

   @Override
   public void b(bof $$0) {
      this.z().l().a(this, new aal($$0, 5));
   }

   @Override
   public void y() {
      if (this.d != null) {
         this.d.b(new aci(this.fW()));
         this.J();
      }
   }

   public apa z() {
      return (apa)this.dJ();
   }

   public boolean a(cwb $$0) {
      if (!this.f.a($$0)) {
         return false;
      } else {
         this.d.b(new abp(abp.e, (float)$$0.a()));
         if ($$0 == cwb.d) {
            this.gj();
            this.ac();
         } else {
            this.c(this);
         }

         this.y();
         this.fn();
         return true;
      }
   }

   @Override
   public boolean P_() {
      return this.f.b() == cwb.d;
   }

   @Override
   public boolean f() {
      return this.f.b() == cwb.b;
   }

   @Override
   public void a(vs $$0) {
      this.b($$0, false);
   }

   public void b(vs $$0, boolean $$1) {
      if (this.u($$1)) {
         this.d.a(new aef($$0, $$1), uz.a(() -> {
            if (this.u(false)) {
               int $$1x = 256;
               String $$2 = $$0.a(256);
               vs $$3 = vs.b($$2).a(n.o);
               return new aef(vs.a("multiplayer.message_not_delivered", $$3).a(n.m), false);
            } else {
               return null;
            }
         }));
      }
   }

   public void a(wh $$0, boolean $$1, vo.a $$2) {
      if (this.gB()) {
         $$0.a(this, $$1, $$2);
      }
   }

   public String A() {
      return this.d.n() instanceof InetSocketAddress $$1 ? InetAddresses.toAddrString($$1.getAddress()) : "<unknown>";
   }

   public void a(aop $$0) {
      this.cV = $$0.b();
      this.cU = $$0.c();
      this.cK = $$0.d();
      this.cL = $$0.e();
      this.dg = $$0.h();
      this.dh = $$0.i();
      this.an().b(bR, (byte)$$0.f());
      this.an().b(bS, (byte)$$0.g().a());
   }

   public aop B() {
      int $$0 = this.an().b(bR);
      bor $$1 = bor.d.apply(this.an().b(bS));
      return new aop(this.cV, this.cU, this.cK, this.cL, $$0, $$1, this.dg, this.dh);
   }

   public boolean C() {
      return this.cL;
   }

   public chy D() {
      return this.cK;
   }

   private boolean u(boolean $$0) {
      return this.cK == chy.c ? $$0 : true;
   }

   private boolean gB() {
      return this.cK == chy.a;
   }

   public int E() {
      return this.cU;
   }

   public void a(aic $$0) {
      this.d.b(new acz($$0.a(), $$0.d().map(aic.a::a)));
   }

   @Override
   protected int F() {
      return this.e.c(this.fU());
   }

   public void G() {
      this.cM = ac.b();
   }

   public atv H() {
      return this.cy;
   }

   public atu I() {
      return this.cQ;
   }

   @Override
   protected void J() {
      if (this.P_()) {
         this.ep();
         this.j(true);
      } else {
         super.J();
      }
   }

   public bof K() {
      return (bof)(this.cN == null ? this : this.cN);
   }

   @Override
   public void c(@Nullable bof $$0) {
      bof $$1 = this.K();
      this.cN = (bof)($$0 == null ? this : $$0);
      if ($$1 != this.cN) {
         if (this.cN.dJ() instanceof apa $$2) {
            this.a($$2, this.cN.do(), this.cN.dq(), this.cN.du(), Set.of(), this.dz(), this.dB());
         }

         if ($$0 != null) {
            this.z().l().a(this);
         }

         this.d.b(new adg(this.cN));
         this.d.m();
      }
   }

   @Override
   protected void L() {
      if (!this.cO) {
         super.L();
      }
   }

   @Override
   public void d(bof $$0) {
      if (this.f.b() == cwb.d) {
         this.c($$0);
      } else {
         super.d($$0);
      }
   }

   public long M() {
      return this.cM;
   }

   @Nullable
   public vs N() {
      return null;
   }

   @Override
   public void a(bmk $$0) {
      super.a($$0);
      this.gp();
   }

   public boolean O() {
      return this.cO;
   }

   public void P() {
      this.cO = false;
   }

   public ajk Q() {
      return this.cx;
   }

   public void a(apa $$0, double $$1, double $$2, double $$3, float $$4, float $$5) {
      this.c(this);
      this.ac();
      if ($$0 == this.dJ()) {
         this.d.a($$1, $$2, $$3, $$4, $$5);
      } else {
         apa $$6 = this.z();
         ejk $$7 = $$0.B_();
         this.d.b(new acv(this.d($$0), (byte)3));
         this.d.b(new aav($$7.q(), $$7.r()));
         this.e.ah().d(this);
         $$6.a(this, bof.c.e);
         this.dG();
         this.b($$1, $$2, $$3, $$4, $$5);
         this.c($$0);
         $$0.a(this);
         this.f($$6);
         this.d.a($$1, $$2, $$3, $$4, $$5);
         this.e.ah().a(this, $$0);
         this.e.ah().e(this);
      }
   }

   @Nullable
   public ib R() {
      return this.dc;
   }

   public float S() {
      return this.de;
   }

   public ajb<cwe> T() {
      return this.db;
   }

   public boolean U() {
      return this.dd;
   }

   public void a(ajb<cwe> $$0, @Nullable ib $$1, float $$2, boolean $$3, boolean $$4) {
      if ($$1 != null) {
         boolean $$5 = $$1.equals(this.dc) && $$0.equals(this.db);
         if ($$4 && !$$5) {
            this.a(vs.c("block.minecraft.set_spawn"));
         }

         this.dc = $$1;
         this.db = $$0;
         this.de = $$2;
         this.dd = $$3;
      } else {
         this.dc = null;
         this.db = cwe.h;
         this.de = 0.0F;
         this.dd = false;
      }
   }

   public jd V() {
      return this.cZ;
   }

   public void a(jd $$0) {
      this.cZ = $$0;
   }

   public aoo W() {
      return this.da;
   }

   public void a(aoo $$0) {
      this.da = $$0;
   }

   @Override
   public void a(ato $$0, atq $$1, float $$2, float $$3) {
      this.d.b(new aec(kh.b.e($$0), $$1, this.do(), this.dq(), this.du(), $$2, $$3, this.af.g()));
   }

   @Override
   public cel a(cpq $$0, boolean $$1, boolean $$2) {
      cel $$3 = super.a($$0, $$1, $$2);
      if ($$3 == null) {
         return null;
      } else {
         this.dJ().b($$3);
         cpq $$4 = $$3.q();
         if ($$2) {
            if (!$$4.b()) {
               this.a(atz.f.b($$4.d()), $$0.M());
            }

            this.a(atz.F);
         }

         return $$3;
      }
   }

   public aqe X() {
      return this.df;
   }

   public void c(apa $$0) {
      this.a((cwe)$$0);
      this.f.a($$0);
   }

   @Nullable
   private static cwb a(@Nullable sy $$0, String $$1) {
      return $$0 != null && $$0.b($$1, 99) ? cwb.a($$0.h($$1)) : null;
   }

   private cwb b(@Nullable cwb $$0) {
      cwb $$1 = this.e.bf();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0 != null ? $$0 : this.e.v_();
      }
   }

   @Override
   public void c(@Nullable sy $$0) {
      this.f.a(this.b(a($$0, "playerGameType")), a($$0, "previousPlayerGameType"));
   }

   private void k(sy $$0) {
      $$0.a("playerGameType", this.f.b().a());
      cwb $$1 = this.f.c();
      if ($$1 != null) {
         $$0.a("previousPlayerGameType", $$1.a());
      }
   }

   @Override
   public boolean Y() {
      return this.dg;
   }

   public boolean b(apb $$0) {
      return $$0 == this ? false : this.dg || $$0.dg;
   }

   @Override
   public boolean a(cwe $$0, ib $$1) {
      return super.a($$0, $$1) && $$0.a(this, $$1);
   }

   @Override
   protected void a(cpq $$0) {
      am.W.a(this, $$0);
      super.a($$0);
   }

   public boolean a(boolean $$0) {
      chz $$1 = this.fV();
      cpq $$2 = $$1.a($$0);
      this.bX.b($$1, $$1.l).ifPresent($$1x -> this.bX.a($$1x, $$1.f()));
      return this.a($$2, false, true) != null;
   }

   public boolean Z() {
      return this.dh;
   }

   @Override
   public Optional<chg> aa() {
      return Optional.of(this.di);
   }

   @Override
   public void a(cel $$0) {
      super.a($$0);
      bof $$1 = $$0.w();
      if ($$1 != null) {
         am.S.a(this, $$0.q(), $$1);
      }
   }

   public void a(wj $$0) {
      this.dl = $$0;
   }

   @Nullable
   public wj ab() {
      return this.dl != null && this.dl.b() ? null : this.dl;
   }

   @Override
   public void a(double $$0, double $$1) {
      this.cq = (float)(awm.d($$1, $$0) * 180.0F / (float)Math.PI - (double)this.dz());
      this.d.b(new abr(this));
   }

   @Override
   public boolean a(bof $$0, boolean $$1) {
      if (!super.a($$0, $$1)) {
         return false;
      } else {
         $$0.i(this);
         this.d.a(this.do(), this.dq(), this.du(), this.dz(), this.dB());
         if ($$0 instanceof box $$2) {
            for (bns $$3 : $$2.er()) {
               this.d.b(new aeo($$0.aj(), $$3, false));
            }
         }

         return true;
      }
   }

   @Override
   public void ac() {
      bof $$0 = this.cW();
      super.ac();
      if ($$0 instanceof box $$1) {
         for (bns $$2 : $$1.er()) {
            this.d.b(new act($$0.aj(), $$2.b()));
         }
      }
   }

   public aeq d(apa $$0) {
      return new aeq($$0.ac(), $$0.ad(), cxf.a($$0.C()), this.f.b(), this.f.c(), $$0.ag(), $$0.B(), this.gu(), this.av());
   }
}
