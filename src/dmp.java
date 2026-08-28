import com.mojang.serialization.MapCodec;

public class dmp extends dff {
   public static final MapCodec<dmp> b = b(dmp::new);
   public static final dsy c = dsx.z;

   @Override
   protected MapCodec<? extends dmp> a() {
      return b;
   }

   protected dmp(dsg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      return $$1 == jf.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsh a(cxk $$0) {
      dsh $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsh $$0) {
      return $$0.a(avu.bz);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(c);
   }
}
