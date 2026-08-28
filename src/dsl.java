import javax.annotation.Nullable;

public class dsl extends dtp {
   public dsl(jg $$0, dvd $$1) {
      super(dsi.J, $$0, $$1);
   }

   @Override
   public eaj.d b() {
      return new dsl.a(this.aC_());
   }

   protected class a extends dtp.a {
      public a(final jg $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(arm $$0, jg $$1, jp<eaa> $$2, @Nullable eaa.a $$3) {
         int $$4 = this.a($$0, this.c, dsl.this.m());
         return $$4 != 0 && eaj.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dev $$0, jg $$1, dvd $$2) {
         jl $$3 = $$2.c(dil.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
