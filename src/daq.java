public class daq extends cwv implements cso {
   private final chv i;

   public daq(chv $$0, dfk.d $$1) {
      super($$1);
      this.i = $$0;
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public chv a() {
      return this.i;
   }
}
