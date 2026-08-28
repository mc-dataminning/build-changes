import com.mojang.serialization.MapCodec;

public class elm extends emd {
   public static final MapCodec<elm> a = lp.e.q().fieldOf("block").xmap(elm::new, $$0 -> $$0.b);
   private final dey b;

   public elm(dey $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dsb $$0, azg $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eme<?> a() {
      return eme.b;
   }
}
