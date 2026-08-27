import java.util.OptionalInt;

public class etb extends ese {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final asc<etb.a, eta> c;
   private boolean d = false;

   public etb(tf $$0, eru $$1) {
      this(0, 0, $$0, $$1);
   }

   public etb(int $$0, int $$1, tf $$2, eru $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? eta.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : eta.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public etb h(int $$0) {
      super.a($$0);
      return this;
   }

   public etb i(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public etb j(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public etb b(boolean $$0) {
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
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      eta $$4 = this.c.a(this.e());
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

   private etb.a e() {
      return new etb.a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(tf a, int b, OptionalInt c) {
   }
}
