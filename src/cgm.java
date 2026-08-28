import javax.annotation.Nullable;

public class cgm<T extends bxu> extends cgj<T> {
   private final byq i;

   public cgm(byq $$0, Class<T> $$1, boolean $$2, @Nullable cij.a $$3) {
      super($$0, $$1, 10, $$2, false, $$3);
      this.i = $$0;
   }

   @Override
   public boolean b() {
      return !this.i.q() && super.b();
   }

   @Override
   public boolean c() {
      return this.d != null ? this.d.a(a(this.e), this.e, this.c) : super.c();
   }
}
