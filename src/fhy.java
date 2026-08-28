import java.util.OptionalInt;

public class fhy extends fhb {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final azp<fhy.a, fhx> c;
   private boolean d = false;

   public fhy(xp $$0, fgp $$1) {
      this(0, 0, $$0, $$1);
   }

   public fhy(int $$0, int $$1, xp $$2, fgp $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? fhx.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fhx.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fhy c(int $$0) {
      super.a($$0);
      return this;
   }

   public fhy d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fhy e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fhy b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int x() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int v() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      fhx $$4 = this.c.a(this.c());
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

   private fhy.a c() {
      return new fhy.a(this.y(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(xp a, int b, OptionalInt c) {
   }
}
