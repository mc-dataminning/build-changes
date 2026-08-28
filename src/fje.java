import java.util.OptionalInt;

public class fje extends fih {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final aze<fje.a, fjd> c;
   private boolean d = false;

   public fje(wz $$0, fhv $$1) {
      this(0, 0, $$0, $$1);
   }

   public fje(int $$0, int $$1, wz $$2, fhv $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ad.a($$1x -> $$1x.c.isPresent() ? fjd.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : fjd.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fje c(int $$0) {
      super.a($$0);
      return this;
   }

   public fje d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fje e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fje b(boolean $$0) {
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
   public void b(fhx $$0, int $$1, int $$2, float $$3) {
      fjd $$4 = this.c.a(this.c());
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

   private fje.a c() {
      return new fje.a(this.z(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(wz a, int b, OptionalInt c) {
   }
}
