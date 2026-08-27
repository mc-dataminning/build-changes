import javax.annotation.Nullable;

public class caf extends byx {
   public caf(bja<? extends caf> $$0, cqb $$1) {
      super($$0, $$1);
      this.a(ear.i, 8.0F);
   }

   @Override
   protected void z() {
      this.bP.a(3, new bsa<>(this, cap.class, true));
      super.z();
   }

   @Override
   protected apf w() {
      return apg.Ao;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.Aq;
   }

   @Override
   protected apf l_() {
      return apg.Ap;
   }

   @Override
   apf t() {
      return apg.Ar;
   }

   @Override
   protected void a(bhu $$0, int $$1, boolean $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.d() instanceof bza $$4 && $$4.gf()) {
         $$4.gg();
         this.a((cqa)cjo.ts);
      }
   }

   @Override
   protected void a(ash $$0, bhc $$1) {
      this.a(bjb.a, new cjl(cjo.oc));
   }

   @Override
   protected void b(ash $$0, bhc $$1) {
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      bkf $$5 = super.a($$0, $$1, $$2, $$3, $$4);
      this.a(bks.c).a(4.0);
      this.y();
      return $$5;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 2.1F;
   }

   @Override
   protected float l(biw $$0) {
      return -0.875F;
   }

   @Override
   public boolean C(biw $$0) {
      if (!super.C($$0)) {
         return false;
      } else {
         if ($$0 instanceof bjm) {
            ((bjm)$$0).b(new bij(bil.t, 200), this);
         }

         return true;
      }
   }

   @Override
   protected ccg b(cjl $$0, float $$1) {
      ccg $$2 = super.b($$0, $$1);
      $$2.g(100);
      return $$2;
   }

   @Override
   public boolean c(bij $$0) {
      return $$0.c() == bil.t ? false : super.c($$0);
   }
}
