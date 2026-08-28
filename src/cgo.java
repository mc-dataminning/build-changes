import javax.annotation.Nullable;

public class cgo<T extends bxw> extends cgl<T> {
   private final bys i;

   public cgo(bys $$0, Class<T> $$1, boolean $$2, @Nullable cil.a $$3) {
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
