import java.util.OptionalInt;

public class fpa extends foc {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final bau<fpa.a, foz> c;
   private boolean d = false;

   public fpa(xv $$0, fnq $$1) {
      this(0, 0, $$0, $$1);
   }

   public fpa(int $$0, int $$1, xv $$2, fnq $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ae.a($$1x -> $$1x.c.isPresent() ? foz.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : foz.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fpa c(int $$0) {
      super.a($$0);
      return this;
   }

   public fpa d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fpa e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fpa b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int y() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int w() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(fns $$0, int $$1, int $$2, float $$3) {
      foz $$4 = this.c.a(this.c());
      int $$5 = this.D();
      int $$6 = this.E();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.y() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fpa.a c() {
      return new fpa.a(this.z(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(xv a, int b, OptionalInt c) {
   }
}
