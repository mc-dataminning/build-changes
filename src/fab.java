import java.util.OptionalInt;

public class fab extends eze {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final awx<fab.a, faa> c;
   private boolean d = false;

   public fab(vq $$0, eys $$1) {
      this(0, 0, $$0, $$1);
   }

   public fab(int $$0, int $$1, vq $$2, eys $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? faa.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : faa.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fab b(int $$0) {
      super.a($$0);
      return this;
   }

   public fab c(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fab d(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fab b(boolean $$0) {
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
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
      faa $$4 = this.c.a(this.d());
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

   private fab.a d() {
      return new fab.a(this.x(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(vq a, int b, OptionalInt c) {
   }
}
