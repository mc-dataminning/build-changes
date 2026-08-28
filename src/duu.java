import javax.annotation.Nullable;

public class duu extends dvz {
   public duu(jh $$0, dxn $$1) {
      super(dur.K, $$0, $$1);
   }

   @Override
   public ecs.d b() {
      return new duu.a(this.aB_());
   }

   protected class a extends dvz.a {
      public a(final jh $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(ash $$0, jh $$1, jq<ecj> $$2, @Nullable ecj.a $$3) {
         int $$4 = this.a($$0, this.c, duu.this.m());
         return $$4 != 0 && ecs.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dha $$0, jh $$1, dxn $$2) {
         jm $$3 = $$2.c(dks.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
