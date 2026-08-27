import com.mojang.serialization.Codec;

public class dyt extends dyl {
   public static final Codec<dyt> a = aqa.a(jc.e).fieldOf("tag").xmap(dyt::new, $$0 -> $$0.b).codec();
   private final aqa<csl> b;

   public dyt(aqa<csl> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dez $$0, aru $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dym<?> a() {
      return dym.d;
   }
}
