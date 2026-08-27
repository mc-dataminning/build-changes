public class cym extends csf {
   public static final dfv d = dfu.w;
   private final cym.a e;

   protected cym(cym.a $$0, dfd.d $$1, dft $$2) {
      super($$1, $$2);
      this.k(this.C.b().a(d, Boolean.valueOf(false)));
      this.e = $$0;
   }

   @Override
   protected int g(dfe $$0) {
      return $$0.c(d) ? 15 : 0;
   }

   @Override
   protected dfe a(dfe $$0, int $$1) {
      return $$0.a(d, Boolean.valueOf($$1 > 0));
   }

   @Override
   protected int b(cpq $$0, gw $$1) {
      Class $$2 = switch (this.e) {
         case a -> bil.class;
         case b -> bjb.class;
      };
      return a($$0, c.a($$1), $$2) > 0 ? 15 : 0;
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(d);
   }

   public static enum a {
      a,
      b;
   }
}
