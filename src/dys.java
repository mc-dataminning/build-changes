import com.mojang.serialization.Codec;

public class dys extends dyk {
   public static final Codec<dys> a = apy.a(jd.e).fieldOf("tag").xmap(dys::new, $$0 -> $$0.b).codec();
   private final apy<csk> b;

   public dys(apy<csk> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dey $$0, art $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dyl<?> a() {
      return dyl.d;
   }
}
