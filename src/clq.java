import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Dynamic;
import javax.annotation.Nullable;

public class clq extends clm {
   private static final int cd = 50;
   private static final float ce = 0.35F;
   private static final int cf = 7;
   protected static final ImmutableList<cdz<? extends cdy<? super clq>>> e = ImmutableList.of(cdz.c, cdz.d, cdz.b, cdz.f, cdz.m);
   protected static final ImmutableList<ccs<?>> cc = ImmutableList.of(
      ccs.n, ccs.v, ccs.g, ccs.h, ccs.k, ccs.l, ccs.ao, ccs.an, ccs.x, ccs.y, ccs.m, ccs.E, new ccs[]{ccs.o, ccs.p, ccs.q, ccs.t, ccs.ab, ccs.M, ccs.b}
   );

   public clq(bsx<? extends clq> $$0, dcw $$1) {
      super($$0, $$1);
      this.bR = 20;
   }

   public static buv.a x() {
      return ckd.gq().a(buw.s, 50.0).a(buw.v, 0.35F).a(buw.c, 7.0);
   }

   @Nullable
   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      clr.a(this);
      this.a($$0.E_(), $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayw $$0, bqp $$1) {
      this.a(bsy.a, new cuq(cut.oZ));
   }

   @Override
   protected buq.b<clq> dU() {
      return buq.a(cc, e);
   }

   @Override
   protected buq<?> a(Dynamic<?> $$0) {
      return clr.a(this, this.dU().a($$0));
   }

   @Override
   public buq<clq> dT() {
      return (buq<clq>)super.dT();
   }

   @Override
   public boolean s() {
      return false;
   }

   @Override
   public boolean k(cuq $$0) {
      return $$0.a(cut.oZ) ? super.k($$0) : false;
   }

   @Override
   protected void ab() {
      this.dO().ag().a("piglinBruteBrain");
      this.dT().a((aqu)this.dO(), this);
      this.dO().ag().c();
      clr.b(this);
      clr.c(this);
      super.ab();
   }

   @Override
   public clp gm() {
      return this.gb() && this.gn() ? clp.a : clp.f;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      boolean $$2 = super.a($$0, $$1);
      if (this.dO().B) {
         return false;
      } else {
         if ($$2 && $$0.d() instanceof btn) {
            clr.a(this, (btn)$$0.d());
         }

         return $$2;
      }
   }

   @Override
   protected avo v() {
      return avp.tP;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.tS;
   }

   @Override
   protected avo n_() {
      return avp.tR;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.tT, 0.15F, 1.0F);
   }

   protected void gr() {
      this.b(avp.tQ);
   }

   @Override
   protected void go() {
      this.b(avp.tU);
   }
}
