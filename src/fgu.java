import java.util.OptionalInt;

public class fgu extends ffx {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final ayu<fgu.a, fgt> c;
   private boolean d = false;

   public fgu(wx $$0, ffl $$1) {
      this(0, 0, $$0, $$1);
   }

   public fgu(int $$0, int $$1, wx $$2, ffl $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fgt.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fgt.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fgu c(int $$0) {
      super.a($$0);
      return this;
   }

   public fgu d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fgu e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fgu b(boolean $$0) {
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
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      fgt $$4 = this.c.a(this.d());
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

   private fgu.a d() {
      return new fgu.a(this.y(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wx a, int b, OptionalInt c) {
   }
}
