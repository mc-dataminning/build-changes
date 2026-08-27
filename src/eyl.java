import java.util.OptionalInt;

public class eyl extends exo {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final avg<eyl.a, eyk> c;
   private boolean d = false;

   public eyl(vg $$0, exc $$1) {
      this(0, 0, $$0, $$1);
   }

   public eyl(int $$0, int $$1, vg $$2, exc $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? eyk.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : eyk.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public eyl b(int $$0) {
      super.a($$0);
      return this;
   }

   public eyl c(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public eyl d(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public eyl b(boolean $$0) {
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
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      eyk $$4 = this.c.a(this.d());
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

   private eyl.a d() {
      return new eyl.a(this.x(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(vg a, int b, OptionalInt c) {
   }
}
