import java.util.OptionalInt;

public class evg extends euj {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final atw<evg.a, evf> c;
   private boolean d = false;

   public evg(ur $$0, etz $$1) {
      this(0, 0, $$0, $$1);
   }

   public evg(int $$0, int $$1, ur $$2, etz $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? evf.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : evf.a($$3, $$1x.a, $$1x.b));
      this.i = false;
   }

   public evg i(int $$0) {
      super.a($$0);
      return this;
   }

   public evg j(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public evg k(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public evg b(boolean $$0) {
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
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      evf $$4 = this.c.a(this.e());
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

   private evg.a e() {
      return new evg.a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(ur a, int b, OptionalInt c) {
   }
}
