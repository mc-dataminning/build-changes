import java.util.OptionalInt;

public class fej extends fdm {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final axz<fej.a, fei> c;
   private boolean d = false;

   public fej(wg $$0, fda $$1) {
      this(0, 0, $$0, $$1);
   }

   public fej(int $$0, int $$1, wg $$2, fda $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fei.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fei.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fej c(int $$0) {
      super.a($$0);
      return this;
   }

   public fej d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fej e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fej b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int x() {
      return this.c.a(this.d()).b();
   }

   @Override
   public int v() {
      return this.c.a(this.d()).a() * 9;
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
      fei $$4 = this.c.a(this.d());
      int $$5 = this.C();
      int $$6 = this.D();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.x() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fej.a d() {
      return new fej.a(this.y(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wg a, int b, OptionalInt c) {
   }
}
