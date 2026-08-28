import com.mojang.serialization.MapCodec;

public class dmu extends dni {
   public static final MapCodec<dmu> a = b(dmu::new);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(aF);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(aF, $$0.g().g());
   }
}
