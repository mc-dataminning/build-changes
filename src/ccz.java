import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ccz extends cce implements ccj, cfb {
   private static final agn<Boolean> b = agq.a(ccz.class, agp.k);
   private static final int e = 5;
   private static final int bU = 300;
   private static final float bV = 1.6F;
   private final bkl bW = new bkl(5);

   public ccz(bmc<? extends ccz> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(2, new cgz.a(this, 10.0F));
      this.bP.a(3, new bul<>(this, 1.0, 8.0F));
      this.bP.a(8, new buh(this, 0.6));
      this.bP.a(9, new bts(this, cfq.class, 15.0F, 1.0F));
      this.bP.a(10, new bts(this, bmq.class, 15.0F));
      this.bQ.a(1, new bvc(this, cgz.class).a());
      this.bQ.a(2, new bvd<>(this, cfq.class, true));
      this.bQ.a(3, new bvd<>(this, cey.class, false));
      this.bQ.a(3, new bvd<>(this, byo.class, true));
   }

   public static bnt.a w() {
      return ccw.gl().a(bnu.o, 0.35F).a(bnu.n, 24.0).a(bnu.c, 5.0).a(bnu.i, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cnw $$0) {
      return $$0 == cnj.vP;
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
   public void b(so $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cce.a u() {
      if (this.gf()) {
         return cce.a.f;
      } else if (this.b(cnj.vP)) {
         return cce.a.e;
      } else {
         return this.fX() ? cce.a.b : cce.a.h;
      }
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hx $$0, cua $$1) {
      return 0.0F;
   }

   @Override
   public int fJ() {
      return 1;
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      auw $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auw $$0, bka $$1) {
      this.a(bmd.a, new cng(cnj.vP));
   }

   @Override
   protected void a(auw $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cng $$2 = this.eT();
         if ($$2.a(cnj.vP)) {
            Map<crr, Integer> $$3 = crt.a($$2);
            $$3.putIfAbsent(crv.K, 1);
            crt.a($$3, $$2);
            this.a(bmd.a, $$2);
         }
      }
   }

   @Override
   public boolean r(blw $$0) {
      if (super.r($$0)) {
         return true;
      } else {
         return $$0 instanceof bmo && ((bmo)$$0).eS() == bmt.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected ars y() {
      return art.tn;
   }

   @Override
   protected ars n_() {
      return art.tp;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.tq;
   }

   @Override
   public void a(bmo $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bmo $$0, cng $$1, cgi $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bkl A() {
      return this.bW;
   }

   @Override
   protected void b(ccb $$0) {
      cng $$1 = $$0.q();
      if ($$1.d() instanceof ckx) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cng $$2 = this.bW.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cng $$0) {
      return this.gu() && $$0.a(cnj.uL);
   }

   @Override
   public bng a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bW.b() ? bng.a(this.bW, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cgy $$2 = this.gt();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cng $$4 = new cng(cnj.vP);
         Map<crr, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bjz.c)) {
            $$5.put(crv.J, 2);
         } else if ($$0 > $$2.a(bjz.b)) {
            $$5.put(crv.J, 1);
         }

         $$5.put(crv.I, 1);
         crt.a($$5, $$4);
         this.a(bmd.a, $$4);
      }
   }

   @Override
   public ars ag_() {
      return art.to;
   }
}
