import com.mojang.serialization.MapCodec;

public class eog extends eoy {
   public static final MapCodec<eog> a = lu.e.q().fieldOf("block").xmap(eog::new, $$0 -> $$0.b);
   private final dhj b;

   public eog(dhj $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(duo $$0, azl $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected eoz<?> a() {
      return eoz.b;
   }
}
