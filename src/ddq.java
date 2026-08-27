import com.mojang.serialization.MapCodec;

public class ddq extends daa {
   public static final MapCodec<ddq> d = b(ddq::new);

   @Override
   protected MapCodec<? extends ddq> a() {
      return d;
   }

   protected ddq(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a(dmz $$0, dmz $$1, ih $$2) {
      return $$1.a(this) ? true : super.a($$0, $$1, $$2);
   }
}
