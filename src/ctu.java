public class ctu extends cvt {
   private final ctu.a a;

   public ctu(ddc $$0, ctu.a $$1, cvt.a $$2) {
      super($$0.a($$2, $$1.d));
      this.a = $$1;
   }

   @Override
   public awj a() {
      return this.a.c;
   }

   public static enum a {
      a(awk.nA, bug.ab),
      b(awk.CM, bug.bs);

      final awj c;
      final jt<bug<?>> d;

      private a(final awj $$0, final bug<?>... $$1) {
         this.c = $$0;
         this.d = jt.a(bug::r, $$1);
      }
   }
}
