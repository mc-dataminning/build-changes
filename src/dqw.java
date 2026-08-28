import com.mojang.serialization.MapCodec;

public class dqw extends dnc {
   public static final MapCodec<dqw> d = b(dqw::new);

   @Override
   protected MapCodec<? extends dqw> a() {
      return d;
   }

   protected dqw(ebd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean b(ebe $$0, ebe $$1, jb $$2) {
      return $$1.a(this) ? true : super.b($$0, $$1, $$2);
   }
}
