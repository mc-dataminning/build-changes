import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bzr extends byw implements bzb, cbl {
   private static final aef<Boolean> b = aei.a(bzr.class, aeh.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bhl bV = new bhl(5);

   public bzr(bja<? extends bzr> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(2, new cdi.a(this, 10.0F));
      this.bO.a(3, new bri<>(this, 1.0, 8.0F));
      this.bO.a(8, new bre(this, 0.6));
      this.bO.a(9, new bqp(this, cca.class, 15.0F, 1.0F));
      this.bO.a(10, new bqp(this, bjo.class, 15.0F));
      this.bP.a(1, new brz(this, cdi.class).a());
      this.bP.a(2, new bsa<>(this, cca.class, true));
      this.bP.a(3, new bsa<>(this, cbi.class, false));
      this.bP.a(3, new bsa<>(this, bvj.class, true));
   }

   public static bkr.a t() {
      return bzo.gk().a(bks.m, 0.35F).a(bks.l, 24.0).a(bks.c, 5.0).a(bks.g, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(ckb $$0) {
      return $$0 == cjo.uZ;
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
   public void b(qw $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public byw.a s() {
      if (this.ge()) {
         return byw.a.f;
      } else if (this.b(cjo.uZ)) {
         return byw.a.e;
      } else {
         return this.fW() ? byw.a.b : byw.a.h;
      }
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gw $$0, cqe $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      this.a(bjb.a, new cjl(cjo.uZ));
   }

   @Override
   protected void a(ash $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cjl $$2 = this.eS();
         if ($$2.a(cjo.uZ)) {
            Map<cnu, Integer> $$3 = cnw.a($$2);
            $$3.putIfAbsent(cny.K, 1);
            cnw.a($$3, $$2);
            this.a(bjb.a, $$2);
         }
      }
   }

   @Override
   public boolean s(biw $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjm && ((bjm)$$0).eR() == bjr.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected apf w() {
      return apg.sj;
   }

   @Override
   protected apf l_() {
      return apg.sl;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.sm;
   }

   @Override
   public void a(bjm $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bjm $$0, cjl $$1, ccs $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bhl y() {
      return this.bV;
   }

   @Override
   protected void b(byt $$0) {
      cjl $$1 = $$0.q();
      if ($$1.d() instanceof chb) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cjl $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cjl $$0) {
      return this.gt() && $$0.a(cjo.tV);
   }

   @Override
   public bke a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bke.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cdh $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cjl $$4 = new cjl(cjo.uZ);
         Map<cnu, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bhb.c)) {
            $$5.put(cny.J, 2);
         } else if ($$0 > $$2.a(bhb.b)) {
            $$5.put(cny.J, 1);
         }

         $$5.put(cny.I, 1);
         cnw.a($$5, $$4);
         this.a(bjb.a, $$4);
      }
   }

   @Override
   public apf ac_() {
      return apg.sk;
   }
}
