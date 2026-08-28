import javax.annotation.Nullable;

public class cxx extends cuv implements cvk {
   private final avz b;

   public cxx(djm $$0, avz $$1, cwl.a $$2) {
      super($$0, $$2);
      this.b = $$1;
   }

   @Override
   public bsj a(dai $$0) {
      bsj $$1 = super.a($$0);
      cox $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cvb.a($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected avz a(dwx $$0) {
      return this.b;
   }

   @Override
   public boolean a(@Nullable cox $$0, dgi $$1, ji $$2, @Nullable faw $$3) {
      if ($$1.k($$2) && $$1.u($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.d().m(), 3);
         }

         $$1.a($$0, ebt.z, $$2);
         $$1.a($$0, $$2, this.b, awb.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
