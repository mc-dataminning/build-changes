import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class cbl extends caq implements cav, cdf {
   private static final afo<Boolean> b = afr.a(cbl.class, afq.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bje bV = new bje(5);

   public cbl(bku<? extends cbl> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(2, new cfc.a(this, 10.0F));
      this.bO.a(3, new btc<>(this, 1.0, 8.0F));
      this.bO.a(8, new bsy(this, 0.6));
      this.bO.a(9, new bsj(this, cdu.class, 15.0F, 1.0F));
      this.bO.a(10, new bsj(this, bli.class, 15.0F));
      this.bP.a(1, new btt(this, cfc.class).a());
      this.bP.a(2, new btu<>(this, cdu.class, true));
      this.bP.a(3, new btu<>(this, cdc.class, false));
      this.bP.a(3, new btu<>(this, bxd.class, true));
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.m, 0.35F).a(bmm.l, 24.0).a(bmm.c, 5.0).a(bmm.g, 32.0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(clz $$0) {
      return $$0 == clm.vL;
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
   public void b(rz $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public caq.a u() {
      if (this.gf()) {
         return caq.a.f;
      } else if (this.b(clm.vL)) {
         return caq.a.e;
      } else {
         return this.fX() ? caq.a.b : caq.a.h;
      }
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(ht $$0, csd $$1) {
      return 0.0F;
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      ats $$5 = $$0.E_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(ats $$0, biv $$1) {
      this.a(bkv.a, new clj(clm.vL));
   }

   @Override
   protected void a(ats $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         clj $$2 = this.eU();
         if ($$2.a(clm.vL)) {
            Map<cpu, Integer> $$3 = cpw.a($$2);
            $$3.putIfAbsent(cpy.K, 1);
            cpw.a($$3, $$2);
            this.a(bkv.a, $$2);
         }
      }
   }

   @Override
   public boolean s(bkq $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof blg && ((blg)$$0).eT() == bll.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected aqq y() {
      return aqr.sD;
   }

   @Override
   protected aqq m_() {
      return aqr.sF;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.sG;
   }

   @Override
   public void a(blg $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(blg $$0, clj $$1, cem $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bje A() {
      return this.bV;
   }

   @Override
   protected void b(can $$0) {
      clj $$1 = $$0.q();
      if ($$1.d() instanceof ciz) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         clj $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(clj $$0) {
      return this.gu() && $$0.a(clm.uH);
   }

   @Override
   public bly a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bly.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cfb $$2 = this.gt();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         clj $$4 = new clj(clm.vL);
         Map<cpu, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(biu.c)) {
            $$5.put(cpy.J, 2);
         } else if ($$0 > $$2.a(biu.b)) {
            $$5.put(cpy.J, 1);
         }

         $$5.put(cpy.I, 1);
         cpw.a($$5, $$4);
         this.a(bkv.a, $$4);
      }
   }

   @Override
   public aqq ae_() {
      return aqr.sE;
   }
}
