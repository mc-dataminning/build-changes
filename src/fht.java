import java.util.OptionalInt;

public class fht extends fgw {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final azk<fht.a, fhs> c;
   private boolean d = false;

   public fht(xl $$0, fgk $$1) {
      this(0, 0, $$0, $$1);
   }

   public fht(int $$0, int $$1, xl $$2, fgk $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fhs.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fhs.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fht c(int $$0) {
      super.a($$0);
      return this;
   }

   public fht d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fht e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fht b(boolean $$0) {
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
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      fhs $$4 = this.c.a(this.d());
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

   private fht.a d() {
      return new fht.a(this.y(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(xl a, int b, OptionalInt c) {
   }
}
