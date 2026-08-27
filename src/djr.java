import com.mojang.serialization.MapCodec;

public class djr extends dbu {
   public static final MapCodec<djr> c = b(djr::new);

   @Override
   public MapCodec<djr> a() {
      return c;
   }

   public djr(dph.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dcj.a.n();
   }

   @Override
   protected boolean a(dpi $$0, czj $$1, id $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dpi $$0) {
      return $$0.a(ave.aT);
   }

   @Override
   protected boolean f(dpi $$0) {
      return true;
   }
}
