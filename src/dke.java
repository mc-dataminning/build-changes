import com.mojang.serialization.MapCodec;

public class dke extends dkr {
   public static final MapCodec<dke> a = b(dke::new);

   @Override
   public MapCodec<dke> a() {
      return a;
   }

   public dke(dtz.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(aE);
   }

   @Override
   public dua a(cyw $$0) {
      return this.o().b(aE, $$0.g().g());
   }
}
