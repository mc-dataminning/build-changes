import java.util.OptionalInt;

public class exb extends ewe {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final auo<exb.a, exa> c;
   private boolean d = false;

   public exb(vb $$0, evu $$1) {
      this(0, 0, $$0, $$1);
   }

   public exb(int $$0, int $$1, vb $$2, evu $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? exa.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : exa.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public exb i(int $$0) {
      super.a($$0);
      return this;
   }

   public exb j(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public exb k(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public exb b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int k() {
      return this.c.a(this.e()).b();
   }

   @Override
   public int i() {
      return this.c.a(this.e()).a() * 9;
   }

   @Override
   public void b(evw $$0, int $$1, int $$2, float $$3) {
      exa $$4 = this.c.a(this.e());
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

   private exb.a e() {
      return new exb.a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(vb a, int b, OptionalInt c) {
   }
}
