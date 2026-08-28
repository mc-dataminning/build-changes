import com.mojang.serialization.MapCodec;

public class diq extends djd {
   public static final MapCodec<diq> a = b(diq::new);

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(aE);
   }

   @Override
   public dsk a(cxm $$0) {
      return this.o().a(aE, $$0.g().g());
   }
}
