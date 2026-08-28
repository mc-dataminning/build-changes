public class cuo extends cwm {
   private final cuo.a a;

   public cuo(deq $$0, cuo.a $$1, cwm.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cuo(deq $$0, cuo.a $$1, jr<avz> $$2, boolean $$3, cwm.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public avz a() {
      return this.a.c;
   }

   public static enum a {
      a(awa.nZ, but.al),
      b(awa.Dw, but.bL);

      final avz c;
      final jv<but<?>> d;

      private a(final avz $$0, final but<?>... $$1) {
         this.c = $$0;
         this.d = jv.a(but::r, $$1);
      }
   }
}
