import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class bzc extends byh implements bym, caw {
   private static final adx<Boolean> b = aea.a(bzc.class, adz.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bgv bV = new bgv(5);

   public bzc(bik<? extends bzc> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(2, new cct.a(this, 10.0F));
      this.bO.a(3, new bqt<>(this, 1.0, 8.0F));
      this.bO.a(8, new bqp(this, 0.6));
      this.bO.a(9, new bqa(this, cbl.class, 15.0F, 1.0F));
      this.bO.a(10, new bqa(this, biy.class, 15.0F));
      this.bP.a(1, new brk(this, cct.class).a());
      this.bP.a(2, new brl<>(this, cbl.class, true));
      this.bP.a(3, new brl<>(this, cat.class, false));
      this.bP.a(3, new brl<>(this, buu.class, true));
   }

   public static bkc.a q() {
      return byz.gf().a(bkd.d, 0.35F).a(bkd.a, 24.0).a(bkd.f, 5.0).a(bkd.b, 32.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cjm $$0) {
      return $$0 == ciz.uZ;
   }

   public boolean fZ() {
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
   public void b(qs $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public byh.a p() {
      if (this.fZ()) {
         return byh.a.f;
      } else if (this.b(ciz.uZ)) {
         return byh.a.e;
      } else {
         return this.fS() ? byh.a.b : byh.a.h;
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return 0.0F;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      art $$5 = $$0.y_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(art $$0, bgm $$1) {
      this.a(bil.a, new ciw(ciz.uZ));
   }

   @Override
   protected void a(art $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         ciw $$2 = this.eR();
         if ($$2.a(ciz.uZ)) {
            Map<cnd, Integer> $$3 = cnf.a($$2);
            $$3.putIfAbsent(cnh.K, 1);
            cnf.a($$3, $$2);
            this.a(bil.a, $$2);
         }
      }
   }

   @Override
   public boolean s(big $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof biw && ((biw)$$0).eQ() == bjb.d ? this.cf() == null && $$0.cf() == null : false;
      }
   }

   @Override
   protected aot r() {
      return aou.sj;
   }

   @Override
   protected aot h_() {
      return aou.sl;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.sm;
   }

   @Override
   public void a(biw $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(biw $$0, ciw $$1, ccd $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bgv t() {
      return this.bV;
   }

   @Override
   protected void b(bye $$0) {
      ciw $$1 = $$0.j();
      if ($$1.d() instanceof cgm) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         ciw $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.ak();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(ciw $$0) {
      return this.go() && $$0.a(ciz.tV);
   }

   @Override
   public bjp a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bjp.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ccs $$2 = this.gn();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         ciw $$4 = new ciw(ciz.uZ);
         Map<cnd, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bgl.c)) {
            $$5.put(cnh.J, 2);
         } else if ($$0 > $$2.a(bgl.b)) {
            $$5.put(cnh.J, 1);
         }

         $$5.put(cnh.I, 1);
         cnf.a($$5, $$4);
         this.a(bil.a, $$4);
      }
   }

   @Override
   public aot Y_() {
      return aou.sk;
   }
}
