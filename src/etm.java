import java.util.OptionalInt;

public class etm extends esp {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final asm<etm.a, etl> c;
   private boolean d = false;

   public etm(tn $$0, esf $$1) {
      this(0, 0, $$0, $$1);
   }

   public etm(int $$0, int $$1, tn $$2, esf $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? etl.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : etl.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public etm i(int $$0) {
      super.a($$0);
      return this;
   }

   public etm j(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public etm k(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public etm b(boolean $$0) {
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
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      etl $$4 = this.c.a(this.e());
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

   private etm.a e() {
      return new etm.a(this.m(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(tn a, int b, OptionalInt c) {
   }
}
