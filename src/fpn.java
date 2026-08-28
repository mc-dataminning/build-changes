import java.util.OptionalInt;

public class fpn extends foo {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final azp<fpn.a, fpm> c;
   private boolean d = false;

   public fpn(wp $$0, foc $$1) {
      this(0, 0, $$0, $$1);
   }

   public fpn(int $$0, int $$1, wp $$2, foc $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = af.a($$1x -> $$1x.c.isPresent() ? fpm.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fpm.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fpn c(int $$0) {
      super.a($$0);
      return this;
   }

   public fpn d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fpn e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fpn b(boolean $$0) {
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
   public void b(foe $$0, int $$1, int $$2, float $$3) {
      fpm $$4 = this.c.a(this.c());
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

   private fpn.a c() {
      return new fpn.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wp a, int b, OptionalInt c) {
   }
}
