import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ccs extends cbx implements ccc, cet {
   private static final agm<Boolean> b = agp.a(ccs.class, ago.k);
   private static final int e = 5;
   private static final int bT = 300;
   private static final float bU = 1.6F;
   private final bkj bV = new bkj(5);

   public ccs(blz<? extends ccs> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btb(this));
      this.bO.a(2, new cgr.a(this, 10.0F));
      this.bO.a(3, new bui<>(this, 1.0, 8.0F));
      this.bO.a(8, new bue(this, 0.6));
      this.bO.a(9, new btp(this, cfi.class, 15.0F, 1.0F));
      this.bO.a(10, new btp(this, bmn.class, 15.0F));
      this.bP.a(1, new buz(this, cgr.class).a());
      this.bP.a(2, new bva<>(this, cfi.class, true));
      this.bP.a(3, new bva<>(this, ceq.class, false));
      this.bP.a(3, new bva<>(this, byk.class, true));
   }

   public static bnq.a w() {
      return ccp.gk().a(bnr.m, 0.35F).a(bnr.l, 24.0).a(bnr.c, 5.0).a(bnr.g, 32.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, false);
   }

   @Override
   public boolean a(cno $$0) {
      return $$0 == cnb.vM;
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
   public void b(sn $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cbx.a u() {
      if (this.ge()) {
         return cbx.a.f;
      } else if (this.b(cnb.vM)) {
         return cbx.a.e;
      } else {
         return this.fW() ? cbx.a.b : cbx.a.h;
      }
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(hx $$0, cts $$1) {
      return 0.0F;
   }

   @Override
   public int fI() {
      return 1;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      auv $$5 = $$0.F_();
      this.a($$5, $$1);
      this.b($$5, $$1);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(auv $$0, bjz $$1) {
      this.a(bma.a, new cmy(cnb.vM));
   }

   @Override
   protected void a(auv $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cmy $$2 = this.eT();
         if ($$2.a(cnb.vM)) {
            Map<crj, Integer> $$3 = crl.a($$2);
            $$3.putIfAbsent(crn.K, 1);
            crl.a($$3, $$2);
            this.a(bma.a, $$2);
         }
      }
   }

   @Override
   public boolean s(blv $$0) {
      if (super.s($$0)) {
         return true;
      } else {
         return $$0 instanceof bml && ((bml)$$0).eS() == bmq.d ? this.cg() == null && $$0.cg() == null : false;
      }
   }

   @Override
   protected arr y() {
      return ars.sY;
   }

   @Override
   protected arr n_() {
      return ars.ta;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.tb;
   }

   @Override
   public void a(bml $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bml $$0, cmy $$1, cga $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bkj A() {
      return this.bV;
   }

   @Override
   protected void b(cbu $$0) {
      cmy $$1 = $$0.q();
      if ($$1.d() instanceof cko) {
         super.b($$0);
      } else if (this.l($$1)) {
         this.a($$0);
         cmy $$2 = this.bV.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.L());
         }
      }
   }

   private boolean l(cmy $$0) {
      return this.gt() && $$0.a(cnb.uI);
   }

   @Override
   public bnd a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bV.b() ? bnd.a(this.bV, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cgq $$2 = this.gs();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cmy $$4 = new cmy(cnb.vM);
         Map<crj, Integer> $$5 = Maps.newHashMap();
         if ($$0 > $$2.a(bjy.c)) {
            $$5.put(crn.J, 2);
         } else if ($$0 > $$2.a(bjy.b)) {
            $$5.put(crn.J, 1);
         }

         $$5.put(crn.I, 1);
         crl.a($$5, $$4);
         this.a(bma.a, $$4);
      }
   }

   @Override
   public arr af_() {
      return ars.sZ;
   }
}
