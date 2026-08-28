import javax.annotation.Nullable;

public class dbq extends cys implements czg {
   private final awx a;

   public dbq(dno $$0, awx $$1, dag.a $$2) {
      super($$0, $$2);
      this.a = $$1;
   }

   @Override
   public bvc a(def $$0) {
      bvc $$1 = super.a($$0);
      csi $$2 = $$0.o();
      if ($$1.a() && $$2 != null) {
         $$2.a($$0.p(), cyy.b($$0.n(), $$2));
      }

      return $$1;
   }

   @Override
   protected awx a(ebq $$0) {
      return this.a;
   }

   @Override
   public boolean a(@Nullable byf $$0, dkj $$1, iw $$2, @Nullable ffy $$3) {
      if ($$1.k($$2) && $$1.v($$2)) {
         if (!$$1.C) {
            $$1.a($$2, this.c().m(), 3);
         }

         $$1.a($$0, egq.z, $$2);
         $$1.a($$0, $$2, this.a, awz.e, 1.0F, 1.0F);
         return true;
      } else {
         return false;
      }
   }
}
