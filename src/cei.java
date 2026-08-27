import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class cei extends cci {
   public static final bqd bX = bqd.b(0.9F, 1.3F).a(0.7F);
   private static final int ce = 2;
   private static final int cf = 1;
   protected static final ImmutableList<cbd<? extends cbc<? super cei>>> bY = ImmutableList.of(cbd.c, cbd.d, cbd.b, cbd.o, cbd.f, cbd.r);
   protected static final ImmutableList<bzw<?>> ca = ImmutableList.of(
      bzw.n, bzw.h, bzw.m, bzw.E, bzw.t, bzw.av, bzw.r, bzw.S, bzw.T, bzw.O, bzw.K, bzw.P, new bzw[]{bzw.R, bzw.V, bzw.W, bzw.Z}
   );
   public static final int cb = 10;
   public static final double cc = 0.02;
   public static final double cd = 0.1F;
   private static final aja<Boolean> cg = aje.a(cei.class, ajc.k);
   private static final aja<Boolean> ch = aje.a(cei.class, ajc.k);
   private static final aja<Boolean> ci = aje.a(cei.class, ajc.k);
   private boolean cj;
   private int ck;

   public cei(bqg<? extends cei> $$0, czg $$1) {
      super($$0, $$1);
      this.K().a(true);
      this.a(els.f, -1.0F);
      this.a(els.g, -1.0F);
   }

   public crs r() {
      axt $$0 = axt.a((long)this.cw().hashCode());
      avt<crk> $$1 = this.gx() ? avl.b : avl.a;
      ir<crk> $$2 = kt.am.a($$1);
      return crl.a(crv.wa, $$2.a($$0).get());
   }

   @Override
   protected bru.b<cei> dQ() {
      return bru.a(ca, bY);
   }

   @Override
   protected bru<?> a(Dynamic<?> $$0) {
      return cej.a(this.dQ().a($$0));
   }

   public static brz.a u() {
      return bqv.A().a(bsa.q, 10.0).a(bsa.r, 0.2F).a(bsa.c, 2.0);
   }

   @Override
   protected void k() {
      if (this.p_()) {
         this.f(bsa.c).a(1.0);
         this.gw();
      } else {
         this.f(bsa.c).a(2.0);
         this.gv();
      }
   }

   @Override
   protected int d(float $$0, float $$1) {
      return super.d($$0, $$1) - 10;
   }

   @Override
   protected aun v() {
      return this.gx() ? auo.kP : auo.kF;
   }

   @Override
   protected aun d(boy $$0) {
      return this.gx() ? auo.kS : auo.kI;
   }

   @Override
   protected aun o_() {
      return this.gx() ? auo.kQ : auo.kG;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(auo.kY, 0.15F, 1.0F);
   }

   protected aun y() {
      return this.gx() ? auo.kU : auo.kK;
   }

   @Nullable
   public cei b(apu $$0, bpu $$1) {
      cei $$2 = bqg.X.a((czg)$$0);
      if ($$2 != null) {
         cej.a($$2, $$0.E_());
         bpu $$3 = (bpu)($$0.E_().h() ? this : $$1);
         boolean $$5 = $$3 instanceof cei $$4 && $$4.gx() || $$0.E_().j() < 0.02;
         $$2.w($$5);
      }

      return $$2;
   }

   @Override
   public bru<cei> dP() {
      return (bru<cei>)super.dP();
   }

   @Override
   protected void Y() {
      this.dM().af().a("goatBrain");
      this.dP().a((apu)this.dM(), this);
      this.dM().af().c();
      this.dM().af().a("goatActivityUpdate");
      cej.a(this);
      this.dM().af().c();
      super.Y();
   }

   @Override
   public int aa() {
      return 15;
   }

   @Override
   public void n(float $$0) {
      int $$1 = this.aa();
      float $$2 = axm.c(this.aX, $$0);
      float $$3 = axm.a($$2, (float)(-$$1), (float)$$1);
      super.n(this.aX + $$3);
   }

   @Override
   public aun d(crs $$0) {
      return this.gx() ? auo.kR : auo.kH;
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.qx) && !this.p_()) {
         $$0.a(this.y(), 1.0F, 1.0F);
         crs $$3 = cru.a($$2, $$0, crv.qD.x());
         $$0.a($$1, $$3);
         return bof.a(this.dM().B);
      } else {
         bof $$4 = super.b($$0, $$1);
         if ($$4.a() && this.o($$2)) {
            this.dM().a(null, this, this.d($$2), aup.g, 1.0F, axm.b(this.dM().z, 0.8F, 1.2F));
         }

         return $$4;
      }
   }

   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      cej.a(this, $$4);
      this.w($$4.j() < 0.02);
      this.k();
      if (!this.p_() && (double)$$4.i() < 0.1F) {
         aja<Boolean> $$5 = $$4.h() ? ch : ci;
         this.an.a($$5, false);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void X() {
      super.X();
      afk.a(this);
   }

   @Override
   public bqd e(bre $$0) {
      return $$0 == bre.g ? bX.a(this.ea()) : super.e($$0);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("IsScreamingGoat", this.gx());
      $$0.a("HasLeftHorn", this.gn());
      $$0.a("HasRightHorn", this.gt());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.w($$0.q("IsScreamingGoat"));
      this.an.a(ch, $$0.q("HasLeftHorn"));
      this.an.a(ci, $$0.q("HasRightHorn"));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 58) {
         this.cj = true;
      } else if ($$0 == 59) {
         this.cj = false;
      } else {
         super.b($$0);
      }
   }

   @Override
   public void n_() {
      if (this.cj) {
         this.ck++;
      } else {
         this.ck -= 2;
      }

      this.ck = axm.a(this.ck, 0, 20);
      super.n_();
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(cg, false);
      $$0.a(ch, true);
      $$0.a(ci, true);
   }

   public boolean gn() {
      return this.an.a(ch);
   }

   public boolean gt() {
      return this.an.a(ci);
   }

   public boolean gu() {
      boolean $$0 = this.gn();
      boolean $$1 = this.gt();
      if (!$$0 && !$$1) {
         return false;
      } else {
         aja<Boolean> $$2;
         if (!$$0) {
            $$2 = ci;
         } else if (!$$1) {
            $$2 = ch;
         } else {
            $$2 = this.ag.h() ? ch : ci;
         }

         this.an.a($$2, false);
         esj $$5 = this.dk();
         crs $$6 = this.r();
         double $$7 = (double)axm.b(this.ag, -0.2F, 0.2F);
         double $$8 = (double)axm.b(this.ag, 0.3F, 0.7F);
         double $$9 = (double)axm.b(this.ag, -0.2F, 0.2F);
         cgk $$10 = new cgk(this.dM(), $$5.a(), $$5.b(), $$5.c(), $$6, $$7, $$8, $$9);
         this.dM().b($$10);
         return true;
      }
   }

   public void gv() {
      this.an.a(ch, true);
      this.an.a(ci, true);
   }

   public void gw() {
      this.an.a(ch, false);
      this.an.a(ci, false);
   }

   public boolean gx() {
      return this.an.a(cg);
   }

   public void w(boolean $$0) {
      this.an.a(cg, $$0);
   }

   public float gy() {
      return (float)this.ck / 20.0F * 30.0F * (float) (Math.PI / 180.0);
   }

   public static boolean c(bqg<? extends cci> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      return $$1.a_($$3.d()).a(ave.bT) && a($$1, $$3);
   }
}
