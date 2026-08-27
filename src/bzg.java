import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bzg extends byl implements byq, cba {
   private static final aec<Boolean> b = aef.a(bzg.class, aee.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bha bV = new bha(5);

   public bzg(bip<? extends bzg> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpq(this));
      this.bO.a(2, new ccx.a(this, 10.0F));
      this.bO.a(3, new bqx<>(this, 1.0, 8.0F));
      this.bO.a(8, new bqt(this, 0.6));
      this.bO.a(9, new bqe(this, cbp.class, 15.0F, 1.0F));
      this.bO.a(10, new bqe(this, bjd.class, 15.0F));
      this.bP.a(1, new bro(this, ccx.class).a());
      this.bP.a(2, new brp<>(this, cbp.class, true));
      this.bP.a(3, new brp<>(this, cax.class, false));
      this.bP.a(3, new brp<>(this, buy.class, true));
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.d, 0.35F).a(bkh.a, 24.0).a(bkh.f, 5.0).a(bkh.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cjq $$0) {
      return $$0 == cjd.uZ;
   }

   public boolean ga() {
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
   public void b(qu $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public byl.a p() {
      if (this.ga()) {
         return byl.a.f;
      } else if (this.b(cjd.uZ)) {
         return byl.a.e;
      } else {
         return this.fS() ? byl.a.b : byl.a.h;
      }
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gw $$0, cpt $$1) {
      return 0.0F;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(arx $$0, bgr $$1) {
      this.a(biq.a, new cja(cjd.uZ));
   }

   @Override
   protected void a(arx $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cja $$2 = this.eR();
         if ($$2.a(cjd.uZ)) {
            Map<cnj, Integer> $$3 = cnl.a($$2);
            $$3.putIfAbsent(cnn.K, 1);
            cnl.a($$3, $$2);
            this.a(biq.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bil $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bjb && ((bjb)$$0).eQ() == bjg.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aoy r() {
      return aoz.sj;
   }

   @Override
   protected aoy h_() {
      return aoz.sl;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.sm;
   }

   @Override
   public void a(bjb $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bjb $$0, cja $$1, cch $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bha t() {
      return this.bV;
   }

   @Override
   protected void b(byi $$0) {
      cja $$1 = $$0.j();
      if ($$1.d() instanceof cgq) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cja $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cja $$0) {
      return this.gp() && $$0.a(cjd.tV);
   }

   @Override
   public bjt a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bjt.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ccw $$2 = this.go();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cja $$4 = new cja(cjd.uZ);
         Map<cnj, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bgq.c)) {
            $$5.put(cnn.J, 2);
         } else if ($$0 > $$2.a(bgq.b)) {
            $$5.put(cnn.J, 1);
         }

         $$5.put(cnn.I, 1);
         cnl.a($$5, $$4);
         this.a(biq.a, $$4);
      }
   }

   @Override
   public aoy X_() {
      return aoz.sk;
   }
}
