import java.util.OptionalInt;

public class exs extends ewv {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final auz<exs.a, exr> c;
   private boolean d = false;

   public exs(vd $$0, ewk $$1) {
      this(0, 0, $$0, $$1);
   }

   public exs(int $$0, int $$1, vd $$2, ewk $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? exr.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : exr.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public exs b(int $$0) {
      super.a($$0);
      return this;
   }

   public exs c(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public exs d(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public exs b(boolean $$0) {
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
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      exr $$4 = this.c.a(this.d());
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

   private exs.a d() {
      return new exs.a(this.x(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(vd a, int b, OptionalInt c) {
   }
}
