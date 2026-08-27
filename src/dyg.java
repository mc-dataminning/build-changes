import com.mojang.serialization.Codec;

public class dyg extends dxx {
   public static final Codec<dyg> b = dlf.b.fieldOf("state").xmap(dyg::new, $$0 -> $$0.c).codec();
   private final dlf c;

   protected dyg(dlf $$0) {
      this.c = $$0;
   }

   @Override
   protected dxy<?> a() {
      return dxy.a;
   }

   @Override
   public dlf a(awo $$0, hz $$1) {
      return this.c;
   }
}
