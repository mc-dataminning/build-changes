import javax.annotation.Nullable;

public class cwu extends ctl implements cuc {
   private final awc a;

   public cwu(dgv $$0, awc $$1, cvg.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public brk a(cyy $$0) {
      brk $$1 = super.a($$0);
      cnp $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), ctr.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   public String a() {
      return this.t();
   }

   @Override
   protected awc a(dua $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable cnp $$0, dds $$1, je $$2, @Nullable eya $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.B) {
            $$1.a($$2, this.d().o(), 3);
         }

         $$1.a($$0, dyx.z, $$2);
         $$1.a($$0, $$2, this.a, awe.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
