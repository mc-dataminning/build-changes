import java.util.OptionalInt;

public class fgt extends ffw {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final ays<fgt.a, fgs> c;
   private boolean d = false;

   public fgt(wx $$0, ffk $$1) {
      this(0, 0, $$0, $$1);
   }

   public fgt(int $$0, int $$1, wx $$2, ffk $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fgs.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fgs.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fgt c(int $$0) {
      super.a($$0);
      return this;
   }

   public fgt d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fgt e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fgt b(boolean $$0) {
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
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      fgs $$4 = this.c.a(this.d());
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

   private fgt.a d() {
      return new fgt.a(this.y(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wx a, int b, OptionalInt c) {
   }
}
