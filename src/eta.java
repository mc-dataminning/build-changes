import java.util.OptionalInt;

public class eta extends esd {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final asc<eta.a, esz> c;
   private boolean d = false;

   public eta(tf $$0, ert $$1) {
      this(0, 0, $$0, $$1);
   }

   public eta(int $$0, int $$1, tf $$2, ert $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? esz.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : esz.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public eta i(int $$0) {
      super.a($$0);
      return this;
   }

   public eta j(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public eta k(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public eta b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int l() {
      return this.c.a(this.e()).b();
   }

   @Override
   public int i() {
      return this.c.a(this.e()).a() * 9;
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      esz $$4 = this.c.a(this.e());
      int $$5 = this.r();
      int $$6 = this.t();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.l() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private eta.a e() {
      return new eta.a(this.m(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(tf a, int b, OptionalInt c) {
   }
}
