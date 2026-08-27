import java.util.OptionalInt;

public class eqa extends epe {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final apm<eqa.a, epz> c;
   private boolean d = false;

   public eqa(sw $$0, eov $$1) {
      this(0, 0, $$0, $$1);
   }

   public eqa(int $$0, int $$1, sw $$2, eov $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ac.a($$1x -> $$1x.c.isPresent() ? epz.a($$3, $$1x.a, $$1x.b, $$1x.c.getAsInt()) : epz.a($$3, $$1x.a, $$1x.b));
      this.r = false;
   }

   public eqa h(int $$0) {
      super.a($$0);
      return this;
   }

   public eqa i(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public eqa j(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public eqa b(boolean $$0) {
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
   public void b(eox $$0, int $$1, int $$2, float $$3) {
      epz $$4 = this.c.a(this.e());
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

   private eqa.a e() {
      return new eqa.a(this.l(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(sw a, int b, OptionalInt c) {
   }
}
