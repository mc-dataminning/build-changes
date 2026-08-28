import com.mojang.serialization.MapCodec;

public class eut extends evj {
   public static final MapCodec<eut> a = eat.a.fieldOf("block_state").xmap(eut::new, $$0 -> $$0.b);
   private final eat b;

   public eut(eat $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(eat $$0, azv $$1) {
      return $$0 == this.b;
   }

   @Override
   protected evk<?> a() {
      return evk.c;
   }
}
