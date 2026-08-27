import java.util.OptionalInt;

public class etc extends esf {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final asa<etc.a, etb> c;
   private boolean d = false;

   public etc(te $$0, erv $$1) {
      this(0, 0, $$0, $$1);
   }

   public etc(int $$0, int $$1, te $$2, erv $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? etb.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : etb.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public etc h(int $$0) {
      super.a($$0);
      return this;
   }

   public etc i(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public etc j(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public etc b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int k() {
      return this.c.a(this.e()).b();
   }

   @Override
   public int h() {
      return this.c.a(this.e()).a() * 9;
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      etb $$4 = this.c.a(this.e());
      int $$5 = this.p();
      int $$6 = this.r();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.k() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private etc.a e() {
      return new etc.a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(te a, int b, OptionalInt c) {
   }
}
