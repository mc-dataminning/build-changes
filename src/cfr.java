import javax.annotation.Nullable;

public class cfr<T extends bwz> extends cfo<T> {
   private final bxv i;

   public cfr(bxv $$0, Class<T> $$1, boolean $$2, @Nullable cho.a $$3) {
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
