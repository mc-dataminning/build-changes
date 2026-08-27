import java.util.OptionalInt;

public class ffy extends ffb {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final ayo<ffy.a, ffx> c;
   private boolean d = false;

   public ffy(wu $$0, fep $$1) {
      this(0, 0, $$0, $$1);
   }

   public ffy(int $$0, int $$1, wu $$2, fep $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? ffx.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : ffx.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public ffy c(int $$0) {
      super.a($$0);
      return this;
   }

   public ffy d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public ffy e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public ffy b(boolean $$0) {
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
   public void b(fer $$0, int $$1, int $$2, float $$3) {
      ffx $$4 = this.c.a(this.d());
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

   private ffy.a d() {
      return new ffy.a(this.y(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wu a, int b, OptionalInt c) {
   }
}
