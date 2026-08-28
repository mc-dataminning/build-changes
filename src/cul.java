public class cul extends cwj {
   private final cul.a a;

   public cul(den $$0, cul.a $$1, cwj.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cul(den $$0, cul.a $$1, jr<avy> $$2, boolean $$3, cwj.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public avy a() {
      return this.a.c;
   }

   public static enum a {
      a(avz.nZ, buq.al),
      b(avz.Dw, buq.bL);

      final avy c;
      final jv<buq<?>> d;

      private a(final avy $$0, final buq<?>... $$1) {
         this.c = $$0;
         this.d = jv.a(buq::r, $$1);
      }
   }
}
