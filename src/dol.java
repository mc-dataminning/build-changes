import javax.annotation.Nullable;

public class dol extends dpn {
   public dol(io $$0, drb $$1) {
      super(doi.J, $$0, $$1);
   }

   @Override
   public dwd.d b() {
      return new dol.a(this.az_());
   }

   protected class a extends dpn.a {
      public a(io $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqm $$0, io $$1, ix<dvu> $$2, @Nullable dvu.a $$3) {
         int $$4 = this.a($$0, this.c, dol.this.n());
         return $$4 != 0 && dwd.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(dax $$0, io $$1, drb $$2) {
         it $$3 = $$2.c(del.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
