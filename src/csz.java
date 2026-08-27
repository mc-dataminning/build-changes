public class csz<T extends brw & bsn> extends ctl {
   private final bsc<T> a;
   private final int b;

   public csz(ctl.a $$0, bsc<T> $$1, int $$2) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
   }

   @Override
   public bpx<ctq> a(daz $$0, cly $$1, bpv $$2) {
      ctq $$3 = $$1.b($$2);
      if ($$0.B) {
         return bpx.c($$3);
      } else {
         brw $$4 = $$1.dd();
         if ($$1.bR() && $$4 instanceof bsn $$5 && $$4.ak() == this.a && $$5.a()) {
            $$3.a(this.b, $$1, bsq.d($$2));
            if ($$3.e()) {
               ctq $$6 = $$3.b(ctt.qV, 1);
               return bpx.a($$6);
            }

            return bpx.a($$3);
         }

         $$1.b(avs.c.b(this));
         return bpx.c($$3);
      }
   }
}
