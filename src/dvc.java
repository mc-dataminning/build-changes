import javax.annotation.Nullable;

public class dvc extends dwh {
   public dvc(jh $$0, dxv $$1) {
      super(duz.K, $$0, $$1);
   }

   @Override
   public eda.d b() {
      return new dvc.a(this.aB_());
   }

   protected class a extends dwh.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecr> $$2, @Nullable ecr.a $$3) {
         int $$4 = this.a($$0, this.c, dvc.this.m());
         return $$4 != 0 && eda.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dhi $$0, jh $$1, dxv $$2) {
         jm $$3 = $$2.c(dla.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
