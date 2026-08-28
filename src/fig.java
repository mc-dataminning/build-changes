import java.util.OptionalInt;

public class fig extends fhj {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final ayu<fig.a, fif> c;
   private boolean d = false;

   public fig(wu $$0, fgx $$1) {
      this(0, 0, $$0, $$1);
   }

   public fig(int $$0, int $$1, wu $$2, fgx $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fif.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fif.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fig c(int $$0) {
      super.a($$0);
      return this;
   }

   public fig d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fig e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fig b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int y() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int w() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      fif $$4 = this.c.a(this.c());
      int $$5 = this.D();
      int $$6 = this.E();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.y() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fig.a c() {
      return new fig.a(this.z(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wu a, int b, OptionalInt c) {
   }
}
