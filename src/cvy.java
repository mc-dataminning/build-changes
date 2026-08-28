public class cvy extends cxu {
   private final cvy.a a;

   public cvy(dfx $$0, cvy.a $$1, cxu.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   public cvy(dfx $$0, cvy.a $$1, js<awj> $$2, boolean $$3, cxu.a $$4) {
      super($$0.a($$4, $$2, $$3, $$1.d));
      this.a = $$1;
   }

   @Override
   public awj a() {
      return this.a.c;
   }

   public static enum a {
      a(awk.oe, bwb.al),
      b(awk.DG, bwb.bL);

      final awj c;
      final jw<bwb<?>> d;

      private a(final awj $$0, final bwb<?>... $$1) {
         this.c = $$0;
         this.d = jw.a(bwb::r, $$1);
      }
   }
}
