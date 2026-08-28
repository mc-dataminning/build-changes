import javax.annotation.Nullable;

public class cfw<T extends bxe> extends cft<T> {
   private final bya i;

   public cfw(bya $$0, Class<T> $$1, boolean $$2, @Nullable cht.a $$3) {
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
