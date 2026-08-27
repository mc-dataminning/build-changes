import com.mojang.serialization.MapCodec;

public class cyo extends cza {
   public static final MapCodec<cyo> a = b(cyo::new);

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   public cyo(dhm.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(aE);
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
