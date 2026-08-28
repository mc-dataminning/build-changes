import java.util.OptionalInt;

public class fqk extends fpm {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final azp<fqk.a, fqj> c;
   private boolean d = false;

   public fqk(wp $$0, fpa $$1) {
      this(0, 0, $$0, $$1);
   }

   public fqk(int $$0, int $$1, wp $$2, fpa $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = af.a($$1x -> $$1x.c.isPresent() ? fqj.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fqj.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fqk c(int $$0) {
      super.a($$0);
      return this;
   }

   public fqk d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fqk e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fqk b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int A() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int y() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      fqj $$4 = this.c.a(this.c());
      int $$5 = this.F();
      int $$6 = this.G();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.A() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fqk.a c() {
      return new fqk.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wp a, int b, OptionalInt c) {
   }
}
