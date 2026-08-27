import java.util.OptionalInt;

public class eud extends etg {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final atm<eud.a, euc> c;
   private boolean d = false;

   public eud(ui $$0, esw $$1) {
      this(0, 0, $$0, $$1);
   }

   public eud(int $$0, int $$1, ui $$2, esw $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? euc.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : euc.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public eud i(int $$0) {
      super.a($$0);
      return this;
   }

   public eud j(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public eud k(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public eud b(boolean $$0) {
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
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      euc $$4 = this.c.a(this.e());
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

   private eud.a e() {
      return new eud.a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(ui a, int b, OptionalInt c) {
   }
}
