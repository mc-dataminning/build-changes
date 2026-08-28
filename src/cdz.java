import javax.annotation.Nullable;

public class cdz<T extends bvf> extends cdw<T> {
   private final bwc i;

   public cdz(bwc $$0, Class<T> $$1, boolean $$2, @Nullable cfw.a $$3) {
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
