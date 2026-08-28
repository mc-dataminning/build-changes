import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public abstract class bxl extends bxj implements bwv, bxh, byg {
   private static final akj<Byte> a = akn.a(bxl.class, akl.a);
   private static final int b = 1;
   private static final int c = 2;
   private static final int d = 4;
   protected static final int h = 1;
   private static final ka bF = new ka(1, 0, 1);
   private static final List<bws> bG = List.of(bws.f, bws.e, bws.d, bws.c);
   public static final float i = 0.15F;
   public static final float j = 0.55F;
   public static final float k = 0.5F;
   public static final float bu = 0.25F;
   public static final int bv = 2;
   private static final double bH = Math.sqrt(2.04F) - 0.6F;
   protected static final alg bw = alg.b("random_spawn_bonus");
   public int bx;
   protected int by;
   protected cdh bz;
   protected cdi bA;
   protected cdg bB;
   private final cdd bI;
   protected cgt bC;
   protected final ceg bD;
   protected final ceg bE;
   @Nullable
   private bxj bJ;
   private final chq bK;
   private bwg bL = bwg.d;
   private boolean bM;
   private boolean bN;
   private final Map<exr, Float> bO = Maps.newEnumMap(exr.class);
   private Optional<alf<ezy>> bP = Optional.empty();
   private long bQ;
   @Nullable
   private bxh.a bR;
   private iv bS = iv.c;
   private float bT = -1.0F;

   protected bxl(bwr<? extends bxl> $$0, djm $$1) {
      super($$0, $$1);
      this.bD = new ceg();
      this.bE = new ceg();
      this.bz = new cdh(this);
      this.bA = new cdi(this);
      this.bB = new cdg(this);
      this.bI = this.I();
      this.bC = this.b($$1);
      this.bK = new chq(this);
      if ($$1 instanceof arq) {
         this.D();
      }
   }

   protected void D() {
   }

   public static byo.a E() {
      return bxj.ed().a(byp.m, 16.0);
   }

   protected cgt b(djm $$0) {
      return new cgs(this, $$0);
   }

   protected boolean F() {
      return false;
   }

   public float a(exr $$0) {
      bxl $$2;
      label17: {
         if (this.dk() instanceof bxl $$1 && $$1.F()) {
            $$2 = $$1;
            break label17;
         }

         $$2 = this;
      }

      Float $$4 = $$2.bO.get($$0);
      return $$4 == null ? $$0.a() : $$4;
   }

   public void a(exr $$0, float $$1) {
      this.bO.put($$0, $$1);
   }

   @Override
   public void G() {
   }

   public void H() {
   }

   protected cdd I() {
      return new cdd(this);
   }

   public cdh J() {
      return this.bz;
   }

   public cdi L() {
      return this.dk() instanceof bxl $$0 ? $$0.L() : this.bA;
   }

   public cdg N() {
      return this.bB;
   }

   public cgt O() {
      return this.dk() instanceof bxl $$0 ? $$0.O() : this.bC;
   }

   @Nullable
   @Override
   public bxj cV() {
      bwi $$0 = this.cY();
      if (!this.gi() && $$0 instanceof bxl $$1 && $$0.ca()) {
         return $$1;
      }

      return null;
   }

   public chq P() {
      return this.bK;
   }

   @Nullable
   @Override
   public bxj f() {
      return this.bJ;
   }

   @Nullable
   protected final bxj Q() {
      return this.eb().c(cgl.p).orElse(null);
   }

   public void g(@Nullable bxj $$0) {
      this.bJ = $$0;
   }

   @Override
   public boolean a(bwr<?> $$0) {
      return $$0 != bwr.ad;
   }

   public boolean a(dai $$0) {
      return false;
   }

   public void R() {
      this.a(eft.m);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   public int S() {
      return 80;
   }

   public void T() {
      this.b(this.u());
   }

   @Override
   public void aw() {
      super.aw();
      bqq $$0 = bqp.a();
      $$0.a("mobBaseTick");
      if (this.bI() && this.ae.a(1000) < this.bx++) {
         this.j();
         this.T();
      }

      $$0.c();
   }

   @Override
   protected void h(bux $$0) {
      this.j();
      super.h($$0);
   }

   private void j() {
      this.bx = -this.S();
   }

   @Override
   protected int e(arq $$0) {
      if (this.by > 0) {
         int $$1 = this.by;

         for (bws $$2 : bws.j) {
            if ($$2.g()) {
               czn $$3 = this.a($$2);
               if (!$$3.f() && this.bL.b($$2) <= 1.0F) {
                  $$1 += 1 + this.ae.a(3);
               }
            }
         }

         return $$1;
      } else {
         return this.by;
      }
   }

   public void U() {
      if (this.dU().C) {
         this.eX();
      } else {
         this.dU().a(this, (byte)20);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 20) {
         this.U();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().C && this.af % 5 == 0) {
         this.V();
      }
   }

   protected void V() {
      boolean $$0 = !(this.cV() instanceof bxl);
      boolean $$1 = !(this.dj() instanceof ctx);
      this.bD.a(cef.a.a, $$0);
      this.bD.a(cef.a.c, $$0 && $$1);
      this.bD.a(cef.a.b, $$0);
   }

   @Override
   protected void C(float $$0) {
      this.bI.a();
   }

   @Nullable
   protected awm u() {
      return null;
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("CanPickUpLoot", this.fM());
      $$0.a("PersistenceRequired", this.bN);
      ale<uw> $$1 = this.dW().a(un.a);
      if (!this.bL.equals(bwg.d)) {
         $$0.a("drop_chances", bwg.e, $$1, this.bL);
      }

      this.a($$0, this.bR);
      $$0.a("LeftHanded", this.gj());
      this.bP.ifPresent($$1x -> $$0.a("DeathLootTable", ezy.a, $$1x));
      if (this.bQ != 0L) {
         $$0.a("DeathLootTableSeed", this.bQ);
      }

      if (this.gi()) {
         $$0.a("NoAI", this.gi());
      }
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a_($$0.o("CanPickUpLoot"));
      this.bN = $$0.o("PersistenceRequired");
      ale<uw> $$1 = this.dW().a(un.a);
      this.bL = $$0.<bwg>a("drop_chances", bwg.e, $$1).orElse(bwg.d);
      this.c($$0);
      this.u($$0.o("LeftHanded"));
      this.bP = $$0.a("DeathLootTable", ezy.a);
      this.bQ = $$0.b("DeathLootTableSeed", 0L);
      this.t($$0.o("NoAI"));
   }

   @Override
   protected void b(arq $$0, bux $$1, boolean $$2) {
      super.b($$0, $$1, $$2);
      this.bP = Optional.empty();
   }

   @Override
   public final Optional<alf<ezy>> dZ() {
      return this.bP.isPresent() ? this.bP : super.dZ();
   }

   @Override
   public long eI() {
      return this.bQ;
   }

   public void G(float $$0) {
      this.bi = $$0;
   }

   public void H(float $$0) {
      this.bh = $$0;
   }

   public void I(float $$0) {
      this.bg = $$0;
   }

   @Override
   public void B(float $$0) {
      super.B($$0);
      this.G($$0);
   }

   public void W() {
      this.O().m();
      this.I(0.0F);
      this.H(0.0F);
      this.B(0.0F);
   }

   @Override
   public void k_() {
      super.k_();
      bqq $$0 = bqp.a();
      $$0.a("looting");
      if (this.dU() instanceof arq $$1 && this.fM() && this.bI() && !this.bc && $$1.O().c(dji.d)) {
         ka $$2 = this.X();

         for (cnr $$4 : this.dU().a(cnr.class, this.cQ().c((double)$$2.u(), (double)$$2.v(), (double)$$2.w()))) {
            if (!$$4.dP() && !$$4.f().f() && !$$4.o() && this.c($$1, $$4.f())) {
               this.a($$1, $$4);
            }
         }
      }

      $$0.c();
   }

   protected ka X() {
      return bF;
   }

   protected void a(arq $$0, cnr $$1) {
      czn $$2 = $$1.f();
      czn $$3 = this.b($$0, $$2.v());
      if (!$$3.f()) {
         this.a($$1);
         this.a($$1, $$3.M());
         $$2.h($$3.M());
         if ($$2.f()) {
            $$1.aq();
         }
      }
   }

   public czn b(arq $$0, czn $$1) {
      bws $$2 = this.f($$1);
      if (!this.a($$1, $$2)) {
         return czn.k;
      } else {
         czn $$3 = this.a($$2);
         boolean $$4 = this.a($$1, $$3, $$2);
         if ($$2.f() && !$$4) {
            $$2 = bws.a;
            $$3 = this.a($$2);
            $$4 = $$3.f();
         }

         if ($$4 && this.g($$1)) {
            double $$5 = (double)this.bL.b($$2);
            if (!$$3.f() && (double)Math.max(this.ae.i() - 0.1F, 0.0F) < $$5) {
               this.a($$0, $$3);
            }

            czn $$6 = $$2.a($$1);
            this.b($$2, $$6);
            return $$6;
         } else {
            return czn.k;
         }
      }
   }

   protected void b(bws $$0, czn $$1) {
      this.a($$0, $$1);
      this.g($$0);
      this.bN = true;
   }

   public void g(bws $$0) {
      this.bL = this.bL.a($$0);
   }

   protected boolean a(czn $$0, czn $$1, bws $$2) {
      if ($$1.f()) {
         return true;
      } else if ($$2.f()) {
         return this.b($$0, $$1, $$2);
      } else {
         return $$2 == bws.a ? this.c($$0, $$1, $$2) : false;
      }
   }

   private boolean b(czn $$0, czn $$1, bws $$2) {
      if (dgc.a($$1, dgb.E)) {
         return false;
      } else {
         double $$3 = this.a($$0, byp.a, $$2);
         double $$4 = this.a($$1, byp.a, $$2);
         double $$5 = this.a($$0, byp.b, $$2);
         double $$6 = this.a($$1, byp.b, $$2);
         if ($$3 != $$4) {
            return $$3 > $$4;
         } else {
            return $$5 != $$6 ? $$5 > $$6 : this.b($$0, $$1);
         }
      }
   }

   private boolean c(czn $$0, czn $$1, bws $$2) {
      axr<czj> $$3 = this.Y();
      if ($$3 != null) {
         if ($$1.a($$3) && !$$0.a($$3)) {
            return false;
         }

         if (!$$1.a($$3) && $$0.a($$3)) {
            return true;
         }
      }

      double $$4 = this.a($$0, byp.c, $$2);
      double $$5 = this.a($$1, byp.c, $$2);
      return $$4 != $$5 ? $$4 > $$5 : this.b($$0, $$1);
   }

   private double a(czn $$0, jf<byk> $$1, bws $$2) {
      double $$3 = this.eZ().b($$1) ? this.i($$1) : 0.0;
      dce $$4 = $$0.a(kk.o, dce.a);
      return $$4.a($$3, $$2);
   }

   public boolean b(czn $$0, czn $$1) {
      Set<Entry<jf<dga>>> $$2 = $$1.a(kk.l, dgg.a).b();
      Set<Entry<jf<dga>>> $$3 = $$0.a(kk.l, dgg.a).b();
      if ($$3.size() != $$2.size()) {
         return $$3.size() > $$2.size();
      } else {
         int $$4 = $$0.o();
         int $$5 = $$1.o();
         return $$4 != $$5 ? $$4 < $$5 : $$0.c(kk.g) && !$$1.c(kk.g);
      }
   }

   public boolean g(czn $$0) {
      return true;
   }

   public boolean c(arq $$0, czn $$1) {
      return this.g($$1);
   }

   @Nullable
   public axr<czj> Y() {
      return null;
   }

   public boolean h(double $$0) {
      return true;
   }

   public boolean Z() {
      return this.bX();
   }

   protected boolean aa() {
      return false;
   }

   @Override
   public void dG() {
      if (this.dU().an() == bud.a && this.aa()) {
         this.aq();
      } else if (!this.gc() && !this.Z()) {
         bwi $$0 = this.dU().a(this, -1.0);
         if ($$0 != null) {
            double $$1 = $$0.g(this);
            int $$2 = this.an().f().f();
            int $$3 = $$2 * $$2;
            if ($$1 > (double)$$3 && this.h($$1)) {
               this.aq();
            }

            int $$4 = this.an().f().g();
            int $$5 = $$4 * $$4;
            if (this.bd > 600 && this.ae.a(800) == 0 && $$1 > (double)$$5 && this.h($$1)) {
               this.aq();
            } else if ($$1 < (double)$$5) {
               this.bd = 0;
            }
         }
      } else {
         this.bd = 0;
      }
   }

   @Override
   protected final void ft() {
      this.bd++;
      bqq $$0 = bqp.a();
      $$0.a("sensing");
      this.bK.a();
      $$0.c();
      int $$1 = this.af + this.ao();
      if ($$1 % 2 != 0 && this.af > 1) {
         $$0.a("targetSelector");
         this.bE.a(false);
         $$0.c();
         $$0.a("goalSelector");
         this.bD.a(false);
         $$0.c();
      } else {
         $$0.a("targetSelector");
         this.bE.a();
         $$0.c();
         $$0.a("goalSelector");
         this.bD.a();
         $$0.c();
      }

      $$0.a("navigation");
      this.bC.c();
      $$0.c();
      $$0.a("mob tick");
      this.a((arq)this.dU());
      $$0.c();
      $$0.a("controls");
      $$0.a("move");
      this.bA.a();
      $$0.b("look");
      this.bz.a();
      $$0.b("jump");
      this.bB.b();
      $$0.c();
      $$0.c();
      this.ac();
   }

   protected void ac() {
      agm.a(this.dU(), this, this.bD);
   }

   protected void a(arq $$0) {
   }

   public int ad() {
      return 40;
   }

   public int af() {
      return 75;
   }

   protected void ag() {
      float $$0 = (float)this.af();
      float $$1 = this.cz();
      float $$2 = azm.h(this.aV - $$1);
      float $$3 = azm.a(azm.h(this.aV - $$1), -$$0, $$0);
      float $$4 = $$1 + $$2 - $$3;
      this.r($$4);
   }

   public int ah() {
      return 10;
   }

   public void a(bwi $$0, float $$1, float $$2) {
      double $$3 = $$0.dz() - this.dz();
      double $$4 = $$0.dF() - this.dF();
      double $$6;
      if ($$0 instanceof bxj $$5) {
         $$6 = $$5.dD() - this.dD();
      } else {
         $$6 = ($$0.cQ().b + $$0.cQ().e) / 2.0 - this.dD();
      }

      double $$8 = Math.sqrt($$3 * $$3 + $$4 * $$4);
      float $$9 = (float)(azm.d($$4, $$3) * 180.0F / (float)Math.PI) - 90.0F;
      float $$10 = (float)(-(azm.d($$6, $$8) * 180.0F / (float)Math.PI));
      this.x(this.a(this.dM(), $$10, $$2));
      this.w(this.a(this.dK(), $$9, $$1));
   }

   private float a(float $$0, float $$1, float $$2) {
      float $$3 = azm.h($$1 - $$0);
      if ($$3 > $$2) {
         $$3 = $$2;
      }

      if ($$3 < -$$2) {
         $$3 = -$$2;
      }

      return $$0 + $$3;
   }

   public static boolean a(bwr<? extends bxl> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      iv $$5 = $$3.e();
      return bwq.a($$2) || $$1.a_($$5).a($$1, $$5, $$0);
   }

   public boolean a(djn $$0, bwq $$1) {
      return true;
   }

   public boolean a(djp $$0) {
      return !$$0.d(this.cQ()) && $$0.f(this);
   }

   public int fW() {
      return 4;
   }

   public boolean q(int $$0) {
      return false;
   }

   @Override
   public int cD() {
      if (this.f() == null) {
         return this.y(0.0F);
      } else {
         int $$0 = (int)(this.eF() - this.eT() * 0.33F);
         $$0 -= (3 - this.dU().an().a()) * 4;
         if ($$0 < 0) {
            $$0 = 0;
         }

         return this.y((float)$$0);
      }
   }

   public czn fX() {
      return this.a(bws.g);
   }

   public boolean fY() {
      return this.d(bws.h);
   }

   public boolean fZ() {
      return this.d(bws.g);
   }

   public void h(czn $$0) {
      this.b(bws.g, $$0);
   }

   public btz h(final bws $$0) {
      return new fgo() {
         @Override
         public czn f() {
            return bxl.this.a($$0);
         }

         @Override
         public void b(czn $$0x) {
            bxl.this.a($$0, $$0);
            if (!$$0.f()) {
               bxl.this.g($$0);
               bxl.this.gb();
            }
         }

         @Override
         public void e() {
         }

         @Override
         public boolean a(crm $$0x) {
            return $$0.dj() == bxl.this || $$0.b(bxl.this, 4.0);
         }
      };
   }

   @Override
   protected void a(arq $$0, bux $$1, boolean $$2) {
      super.a($$0, $$1, $$2);

      for (bws $$3 : bws.j) {
         czn $$4 = this.a($$3);
         float $$5 = this.bL.b($$3);
         if ($$5 != 0.0F) {
            boolean $$6 = this.bL.c($$3);
            bwi var11 = $$1.d();
            if (var11 instanceof bxj) {
               bxj $$7 = (bxj)var11;
               if (this.dU() instanceof arq $$8) {
                  $$5 = dgc.a($$8, $$7, $$1, $$5);
               }
            }

            if (!$$4.f() && !dgc.a($$4, dgb.D) && ($$2 || $$6) && this.ae.i() < $$5) {
               if (!$$6 && $$4.m()) {
                  $$4.b($$4.p() - this.ae.a(1 + this.ae.a(Math.max($$4.p() - 3, 1))));
               }

               this.a($$0, $$4);
               this.a($$3, czn.k);
            }
         }
      }
   }

   public bwg ga() {
      return this.bL;
   }

   public void b(arq $$0) {
      this.a($$0, $$0x -> true);
   }

   public Set<bws> a(arq $$0, Predicate<czn> $$1) {
      Set<bws> $$2 = new HashSet<>();

      for (bws $$3 : bws.j) {
         czn $$4 = this.a($$3);
         if (!$$4.f()) {
            if (!$$1.test($$4)) {
               $$2.add($$3);
            } else if (this.bL.c($$3)) {
               this.a($$3, czn.k);
               this.a($$0, $$4);
            }
         }
      }

      return $$2;
   }

   private ezw g(arq $$0) {
      return new ezw.a($$0).a(fcn.f, this.ds()).a(fcn.a, this).a(fcm.h);
   }

   public void a(bwu $$0) {
      this.a($$0.a(), $$0.b());
   }

   public void a(alf<ezy> $$0, Map<bws, Float> $$1) {
      if (this.dU() instanceof arq $$2) {
         this.a($$0, this.g($$2), $$1);
      }
   }

   protected void a(azv $$0, bue $$1) {
      if ($$0.i() < 0.15F * $$1.d()) {
         int $$2 = $$0.a(2);
         float $$3 = this.dU().an() == bud.d ? 0.1F : 0.25F;
         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         if ($$0.i() < 0.095F) {
            $$2++;
         }

         boolean $$4 = true;

         for (bws $$5 : bG) {
            czn $$6 = this.a($$5);
            if (!$$4 && $$0.i() < $$3) {
               break;
            }

            $$4 = false;
            if ($$6.f()) {
               czj $$7 = a($$5, $$2);
               if ($$7 != null) {
                  this.a($$5, new czn($$7));
               }
            }
         }
      }
   }

   @Nullable
   public static czj a(bws $$0, int $$1) {
      switch ($$0) {
         case f:
            if ($$1 == 0) {
               return czr.qm;
            } else if ($$1 == 1) {
               return czr.qC;
            } else if ($$1 == 2) {
               return czr.qq;
            } else if ($$1 == 3) {
               return czr.qu;
            } else if ($$1 == 4) {
               return czr.qy;
            }
         case e:
            if ($$1 == 0) {
               return czr.qn;
            } else if ($$1 == 1) {
               return czr.qD;
            } else if ($$1 == 2) {
               return czr.qr;
            } else if ($$1 == 3) {
               return czr.qv;
            } else if ($$1 == 4) {
               return czr.qz;
            }
         case d:
            if ($$1 == 0) {
               return czr.qo;
            } else if ($$1 == 1) {
               return czr.qE;
            } else if ($$1 == 2) {
               return czr.qs;
            } else if ($$1 == 3) {
               return czr.qw;
            } else if ($$1 == 4) {
               return czr.qA;
            }
         case c:
            if ($$1 == 0) {
               return czr.qp;
            } else if ($$1 == 1) {
               return czr.qF;
            } else if ($$1 == 2) {
               return czr.qt;
            } else if ($$1 == 3) {
               return czr.qx;
            } else if ($$1 == 4) {
               return czr.qB;
            }
         default:
            return null;
      }
   }

   protected void a(dkd $$0, azv $$1, bue $$2) {
      this.b($$0, $$1, $$2);

      for (bws $$3 : bws.j) {
         if ($$3.a() == bws.a.b) {
            this.a($$0, $$1, $$3, $$2);
         }
      }
   }

   protected void b(dkd $$0, azv $$1, bue $$2) {
      this.a($$0, bws.a, $$1, 0.25F, $$2);
   }

   protected void a(dkd $$0, azv $$1, bws $$2, bue $$3) {
      this.a($$0, $$2, $$1, 0.5F, $$3);
   }

   private void a(dkd $$0, bws $$1, azv $$2, float $$3, bue $$4) {
      czn $$5 = this.a($$1);
      if (!$$5.f() && $$2.i() < $$3 * $$4.d()) {
         dgc.a($$5, $$0.F_(), dho.a, $$4, $$2);
         this.a($$1, $$5);
      }
   }

   @Nullable
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      azv $$4 = $$0.C_();
      byl $$5 = Objects.requireNonNull(this.g(byp.m));
      if (!$$5.b(bw)) {
         $$5.d(new byn(bw, $$4.a(0.0, 0.11485000000000001), byn.a.b));
      }

      this.u($$4.i() < 0.05F);
      return $$3;
   }

   public void gb() {
      this.bN = true;
   }

   @Override
   public void a(bws $$0, float $$1) {
      this.bL = this.bL.a($$0, $$1);
   }

   @Override
   public boolean fM() {
      return this.bM;
   }

   public void a_(boolean $$0) {
      this.bM = $$0;
   }

   @Override
   protected boolean f(bws $$0) {
      return this.fM();
   }

   public boolean gc() {
      return this.bN;
   }

   @Override
   public final bug a(crm $$0, buf $$1) {
      if (!this.bI()) {
         return bug.e;
      } else {
         bug $$2 = this.c($$0, $$1);
         if ($$2.a()) {
            this.a(eft.r, $$0);
            return $$2;
         } else {
            bug $$3 = super.a($$0, $$1);
            if ($$3 != bug.e) {
               return $$3;
            } else {
               $$2 = this.b($$0, $$1);
               if ($$2.a()) {
                  this.a(eft.r, $$0);
                  return $$2;
               } else {
                  return bug.e;
               }
            }
         }
      }
   }

   private bug c(crm $$0, buf $$1) {
      czn $$2 = $$0.b($$1);
      if ($$2.a(czr.vW)) {
         bug $$3 = $$2.a($$0, this, $$1);
         if ($$3.a()) {
            return $$3;
         }
      }

      if ($$2.h() instanceof dau) {
         if (this.dU() instanceof arq) {
            dau $$4 = (dau)$$2.h();
            Optional<bxl> $$5 = $$4.a($$0, this, (bwr<? extends bxl>)this.an(), (arq)this.dU(), this.ds(), $$2);
            $$5.ifPresent($$1x -> this.a($$0, $$1x));
            if ($$5.isEmpty()) {
               return bug.e;
            }
         }

         return bug.b;
      } else {
         return bug.e;
      }
   }

   protected void a(crm $$0, bxl $$1) {
   }

   protected bug b(crm $$0, buf $$1) {
      return bug.e;
   }

   public boolean gd() {
      return this.a(this.du());
   }

   public boolean a(iv $$0) {
      return this.bT == -1.0F ? true : this.bS.j($$0) < (double)(this.bT * this.bT);
   }

   public void a(iv $$0, int $$1) {
      this.bS = $$0;
      this.bT = (float)$$1;
   }

   public iv ge() {
      return this.bS;
   }

   public float gf() {
      return this.bT;
   }

   public void gg() {
      this.bT = -1.0F;
   }

   public boolean gh() {
      return this.bT != -1.0F;
   }

   @Nullable
   public <T extends bxl> T a(bwr<T> $$0, bwc $$1, bwq $$2, bwc.a<T> $$3) {
      if (this.dP()) {
         return null;
      } else {
         T $$4 = (T)$$0.a(this.dU(), $$2);
         if ($$4 == null) {
            return null;
         } else {
            $$1.a().a(this, $$4, $$1);
            $$3.finalizeConversion($$4);
            if (this.dU() instanceof arq $$5) {
               $$5.b($$4);
            }

            if ($$1.a().a()) {
               this.aq();
            }

            return $$4;
         }
      }
   }

   @Nullable
   public <T extends bxl> T a(bwr<T> $$0, bwc $$1, bwc.a<T> $$2) {
      return this.a($$0, $$1, bwq.i, $$2);
   }

   @Nullable
   @Override
   public bxh.a U_() {
      return this.bR;
   }

   @Override
   public void a(@Nullable bxh.a $$0) {
      this.bR = $$0;
   }

   @Override
   public void A() {
      if (this.U_() == null) {
         this.gg();
      }
   }

   @Override
   public void B() {
      bxh.super.B();
      this.bD.a(cef.a.a);
   }

   @Override
   public boolean w() {
      return !(this instanceof cof);
   }

   @Override
   public boolean a(bwi $$0, boolean $$1) {
      boolean $$2 = super.a($$0, $$1);
      if ($$2 && this.O_()) {
         this.y();
      }

      return $$2;
   }

   @Override
   public boolean dh() {
      return super.dh() && !this.gi();
   }

   @Override
   public boolean di() {
      return super.di() && !this.gi();
   }

   public void t(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 1) : (byte)($$1 & -2));
   }

   public void u(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 2) : (byte)($$1 & -3));
   }

   public void v(boolean $$0) {
      byte $$1 = this.al.a(a);
      this.al.a(a, $$0 ? (byte)($$1 | 4) : (byte)($$1 & -5));
   }

   public boolean gi() {
      return (this.al.a(a) & 1) != 0;
   }

   public boolean gj() {
      return (this.al.a(a) & 2) != 0;
   }

   public boolean gk() {
      return (this.al.a(a) & 4) != 0;
   }

   public void a(boolean $$0) {
   }

   @Override
   public bxa fx() {
      return this.gj() ? bxa.a : bxa.b;
   }

   public boolean h(bxj $$0) {
      return this.gl().c($$0.eM());
   }

   protected fex gl() {
      bwi $$0 = this.dj();
      fex $$3;
      if ($$0 != null) {
         fex $$1 = $$0.cQ();
         fex $$2 = this.cQ();
         $$3 = new fex(Math.min($$2.a, $$1.a), $$2.b, Math.min($$2.c, $$1.c), Math.max($$2.d, $$1.d), $$2.e, Math.max($$2.f, $$1.f));
      } else {
         $$3 = this.cQ();
      }

      return $$3.c(bH, 0.0, bH);
   }

   @Override
   public boolean c(arq $$0, bwi $$1) {
      float $$2 = (float)this.h(byp.c);
      czn $$3 = this.dY();
      bux $$4 = Optional.ofNullable($$3.h().a(this)).orElse(this.dV().b((bxj)this));
      $$2 = dgc.a($$0, $$3, $$1, $$4, $$2);
      $$2 += $$3.h().a($$1, $$2, $$4);
      boolean $$5 = $$1.a($$0, $$4, $$2);
      if ($$5) {
         float $$6 = this.b($$1, $$4);
         if ($$6 > 0.0F && $$1 instanceof bxj $$7) {
            $$7.p((double)($$6 * 0.5F), (double)azm.a(this.dK() * (float) (Math.PI / 180.0)), (double)(-azm.b(this.dK() * (float) (Math.PI / 180.0))));
            this.i(this.dx().d(0.6, 1.0, 0.6));
         }

         if ($$1 instanceof bxj $$8) {
            $$3.a($$8, this);
         }

         dgc.a($$0, $$1, $$4);
         this.B($$1);
         this.gm();
      }

      return $$5;
   }

   protected void gm() {
   }

   protected boolean gn() {
      if (this.dU().V() && !this.dU().C) {
         float $$0 = this.bv();
         iv $$1 = iv.a(this.dz(), this.dD(), this.dF());
         boolean $$2 = this.bj() || this.av || this.aw;
         if ($$0 > 0.5F && this.ae.i() * 30.0F < ($$0 - 0.4F) * 2.0F && !$$2 && this.dU().h($$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void c(axr<ewz> $$0) {
      if (this.O().o()) {
         super.c($$0);
      } else {
         this.i(this.dx().b(0.0, 0.3, 0.0));
      }
   }

   @VisibleForTesting
   public void go() {
      this.c($$0 -> true);
      this.eb().h();
   }

   public void c(Predicate<cef> $$0) {
      this.bD.a($$0);
   }

   @Override
   protected void cC() {
      super.cC();

      for (bws $$0 : bws.j) {
         czn $$1 = this.a($$0);
         if (!$$1.f()) {
            $$1.e(0);
         }
      }
   }

   @Nullable
   @Override
   public czn dH() {
      dau $$0 = dau.a(this.an());
      return $$0 == null ? null : new czn($$0);
   }

   @Override
   protected void f(jf<byk> $$0) {
      super.f($$0);
      if ($$0.a(byp.m) || $$0.a(byp.E)) {
         this.O().e();
      }
   }
}
