import java.util.OptionalInt;

public class fca extends fbd {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final axl<fca.a, fbz> c;
   private boolean d = false;

   public fca(vu $$0, far $$1) {
      this(0, 0, $$0, $$1);
   }

   public fca(int $$0, int $$1, vu $$2, far $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fbz.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fbz.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fca b(int $$0) {
      super.a($$0);
      return this;
   }

   public fca c(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fca d(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fca b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int w() {
      return this.c.a(this.d()).b();
   }

   @Override
   public int u() {
      return this.c.a(this.d()).a() * 9;
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      fbz $$4 = this.c.a(this.d());
      int $$5 = this.B();
      int $$6 = this.C();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.w() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fca.a d() {
      return new fca.a(this.x(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(vu a, int b, OptionalInt c) {
   }
}
