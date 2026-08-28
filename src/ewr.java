import com.mojang.serialization.MapCodec;

public class ewr extends ewj {
   public static final MapCodec<ewr> a = ayc.a(mi.i).fieldOf("tag").xmap(ewr::new, $$0 -> $$0.b);
   private final ayc<dno> b;

   public ewr(ayc<dno> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(ebq $$0, bai $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ewk<?> a() {
      return ewk.d;
   }
}
