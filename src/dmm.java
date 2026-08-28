import com.mojang.serialization.MapCodec;

public class dmm extends dlu {
   public static final MapCodec<dmm> a = b(dmm::new);
   private static final feq b = dlu.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dmm> a() {
      return a;
   }

   public dmm(dzn.d $$0) {
      super($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return b;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      return !$$0.a($$1, $$3) ? dlw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return !$$1.v($$2.e());
   }
}
