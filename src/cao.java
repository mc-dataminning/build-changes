import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cao extends bzt implements bzy, cci {
   private static final afc<Boolean> b = aff.a(cao.class, afe.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bii bV = new bii(5);

   public cao(bjx<? extends cao> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqy(this));
      this.bO.a(2, new cef.a(this, 10.0F));
      this.bO.a(3, new bsf<>(this, 1.0, 8.0F));
      this.bO.a(8, new bsb(this, 0.6));
      this.bO.a(9, new brm(this, ccx.class, 15.0F, 1.0F));
      this.bO.a(10, new brm(this, bkl.class, 15.0F));
      this.bP.a(1, new bsw(this, cef.class).a());
      this.bP.a(2, new bsx<>(this, ccx.class, true));
      this.bP.a(3, new bsx<>(this, ccf.class, false));
      this.bP.a(3, new bsx<>(this, bwg.class, true));
   }

   public static blo.a t() {
      return cal.gk().a(blp.m, 0.35F).a(blp.l, 24.0).a(blp.c, 5.0).a(blp.g, 32.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(ckz $$0) {
      return $$0 == ckm.uZ;
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
   public void b(rt $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public bzt.a s() {
      if (this.ge()) {
         return bzt.a.f;
      } else if (this.b(ckm.uZ)) {
         return bzt.a.e;
      } else {
         return this.fW() ? bzt.a.b : bzt.a.h;
      }
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(ht $$0, crc $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      ate $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ate $$0, bhz $$1) {
      this.a(bjy.a, new ckj(ckm.uZ));
   }

   @Override
   protected void a(ate $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         ckj $$2 = this.eS();
         if ($$2.a(ckm.uZ)) {
            Map<cot, Integer> $$3 = cov.a($$2);
            $$3.putIfAbsent(cox.K, 1);
            cov.a($$3, $$2);
            this.a(bjy.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bjt $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bkj && ((bkj)$$0).eR() == bko.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aqc w() {
      return aqd.sl;
   }

   @Override
   protected aqc m_() {
      return aqd.sn;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.so;
   }

   @Override
   public void a(bkj $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bkj $$0, ckj $$1, cdp $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bii y() {
      return this.bV;
   }

   @Override
   protected void b(bzq $$0) {
      ckj $$1 = $$0.q();
      if ($$1.d() instanceof chz) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         ckj $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(ckj $$0) {
      return this.gt() && $$0.a(ckm.tV);
   }

   @Override
   public blb a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? blb.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cee $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         ckj $$4 = new ckj(ckm.uZ);
         Map<cot, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bhy.c)) {
            $$5.put(cox.J, 2);
         } else if ($$0 > $$2.a(bhy.b)) {
            $$5.put(cox.J, 1);
         }

         $$5.put(cox.I, 1);
         cov.a($$5, $$4);
         this.a(bjy.a, $$4);
      }
   }

   @Override
   public aqc ad_() {
      return aqd.sm;
   }
}
