import javax.annotation.Nullable;

public class cec<T extends bvi> extends cdz<T> {
   private final bwf i;

   public cec(bwf $$0, Class<T> $$1, boolean $$2, @Nullable cfz.a $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean b() {
      return !this.i.p() && super.b();
   }

   @Override
   public boolean c() {
      return this.d != null ? this.d.a(a(this.e), this.e, this.c) : super.c();
   }
}
