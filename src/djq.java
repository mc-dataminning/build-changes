import com.mojang.serialization.MapCodec;

public class djq extends dch {
   public static final MapCodec<djq> b = b(djq::new);
   public static final dpz c = dpy.z;

   @Override
   protected MapCodec<? extends djq> a() {
      return b;
   }

   protected djq(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return $$1 == ij.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dpi a(cux $$0) {
      dpi $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dpi $$0) {
      return $$0.a(ave.bz);
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c);
   }
}
