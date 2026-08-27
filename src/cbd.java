import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cbd extends cai implements can, ccx {
   private static final afm<Boolean> b = afp.a(cbd.class, afo.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bix bV = new bix(5);

   public cbd(bkm<? extends cbd> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brn(this));
      this.bO.a(2, new ceu.a(this, 10.0F));
      this.bO.a(3, new bsu<>(this, 1.0, 8.0F));
      this.bO.a(8, new bsq(this, 0.6));
      this.bO.a(9, new bsb(this, cdm.class, 15.0F, 1.0F));
      this.bO.a(10, new bsb(this, bla.class, 15.0F));
      this.bP.a(1, new btl(this, ceu.class).a());
      this.bP.a(2, new btm<>(this, cdm.class, true));
      this.bP.a(3, new btm<>(this, ccu.class, false));
      this.bP.a(3, new btm<>(this, bwv.class, true));
   }

   public static bmd.a t() {
      return cba.gk().a(bme.m, 0.35F).a(bme.l, 24.0).a(bme.c, 5.0).a(bme.g, 32.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(clr $$0) {
      return $$0 == cle.va;
   }

   public boolean ge() {
      return this.an.b(b);
   }

   @Override
   public void b(boolean $$0) {
      this.an.b(b, $$0);
   }

   @Override
   public void a() {
      this.bb = 0;
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cai.a s() {
      if (this.ge()) {
         return cai.a.f;
      } else if (this.b(cle.va)) {
         return cai.a.e;
      } else {
         return this.fW() ? cai.a.b : cai.a.h;
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(ht $$0, crv $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      ato $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ato $$0, bio $$1) {
      this.a(bkn.a, new clb(cle.va));
   }

   @Override
   protected void a(ato $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         clb $$2 = this.eS();
         if ($$2.a(cle.va)) {
            Map<cpm, Integer> $$3 = cpo.a($$2);
            $$3.putIfAbsent(cpq.K, 1);
            cpo.a($$3, $$2);
            this.a(bkn.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bki $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bky && ((bky)$$0).eR() == bld.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aqm w() {
      return aqn.sn;
   }

   @Override
   protected aqm m_() {
      return aqn.sp;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.sq;
   }

   @Override
   public void a(bky $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bky $$0, clb $$1, cee $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bix y() {
      return this.bV;
   }

   @Override
   protected void b(caf $$0) {
      clb $$1 = $$0.q();
      if ($$1.d() instanceof cir) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         clb $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(clb $$0) {
      return this.gt() && $$0.a(cle.tW);
   }

   @Override
   public blq a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? blq.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cet $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         clb $$4 = new clb(cle.va);
         Map<cpm, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bin.c)) {
            $$5.put(cpq.J, 2);
         } else if ($$0 > $$2.a(bin.b)) {
            $$5.put(cpq.J, 1);
         }

         $$5.put(cpq.I, 1);
         cpo.a($$5, $$4);
         this.a(bkn.a, $$4);
      }
   }

   @Override
   public aqm ad_() {
      return aqn.so;
   }
}
