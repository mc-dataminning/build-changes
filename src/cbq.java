import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cbq extends cav implements cba, cdk {
   private static final afs<Boolean> b = afv.a(cbq.class, afu.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bjj bV = new bjj(5);

   public cbq(bkz<? extends cbq> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsa(this));
      this.bO.a(2, new cfh.a(this, 10.0F));
      this.bO.a(3, new bth<>(this, 1.0, 8.0F));
      this.bO.a(8, new btd(this, 0.6));
      this.bO.a(9, new bso(this, cdz.class, 15.0F, 1.0F));
      this.bO.a(10, new bso(this, bln.class, 15.0F));
      this.bP.a(1, new bty(this, cfh.class).a());
      this.bP.a(2, new btz<>(this, cdz.class, true));
      this.bP.a(3, new btz<>(this, cdh.class, false));
      this.bP.a(3, new btz<>(this, bxi.class, true));
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.m, 0.35F).a(bmr.l, 24.0).a(bmr.c, 5.0).a(bmr.g, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cme $$0) {
      return $$0 == clr.vL;
   }

   public boolean gf() {
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
   public void b(sd $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cav.a u() {
      if (this.gf()) {
         return cav.a.f;
      } else if (this.b(clr.vL)) {
         return cav.a.e;
      } else {
         return this.fX() ? cav.a.b : cav.a.h;
      }
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hx $$0, csi $$1) {
      return 0.0F;
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(atw $$0, biz $$1) {
      this.a(bla.a, new clo(clr.vL));
   }

   @Override
   protected void a(atw $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         clo $$2 = this.eU();
         if ($$2.a(clr.vL)) {
            Map<cpz, Integer> $$3 = cqb.a($$2);
            $$3.putIfAbsent(cqd.K, 1);
            cqb.a($$3, $$2);
            this.a(bla.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bkv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bll && ((bll)$$0).eT() == blq.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected aqu y() {
      return aqv.sD;
   }

   @Override
   protected aqu n_() {
      return aqv.sF;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.sG;
   }

   @Override
   public void a(bll $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bll $$0, clo $$1, cer $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bjj A() {
      return this.bV;
   }

   @Override
   protected void b(cas $$0) {
      clo $$1 = $$0.q();
      if ($$1.d() instanceof cje) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         clo $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(clo $$0) {
      return this.gu() && $$0.a(clr.uH);
   }

   @Override
   public bmd a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bmd.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cfg $$2 = this.gt();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         clo $$4 = new clo(clr.vL);
         Map<cpz, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(biy.c)) {
            $$5.put(cqd.J, 2);
         } else if ($$0 > $$2.a(biy.b)) {
            $$5.put(cqd.J, 1);
         }

         $$5.put(cqd.I, 1);
         cqb.a($$5, $$4);
         this.a(bla.a, $$4);
      }
   }

   @Override
   public aqu af_() {
      return aqv.sE;
   }
}
