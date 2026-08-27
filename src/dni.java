import javax.annotation.Nullable;

public class dni extends dok {
   public dni(im $$0, dpy $$1) {
      super(dnf.J, $$0, $$1);
   }

   @Override
   public dva.d b() {
      return new dni.a(this.az_());
   }

   protected class a extends dok.a {
      public a(im $$1) {
         super($$1);
      }

      @Override
      public int a() {
         return 16;
      }

      @Override
      public boolean a(aqe $$0, im $$1, iv<dur> $$2, @Nullable dur.a $$3) {
         int $$4 = this.a($$0, this.c, dni.this.n());
         return $$4 != 0 && dva.a_($$2) != $$4 ? false : super.a($$0, $$1, $$2, $$3);
      }

      private int a(czu $$0, im $$1, dpy $$2) {
         ir $$3 = $$2.c(ddi.b).g();
         return $$0.c($$1.a($$3), $$3);
      }
   }
}
