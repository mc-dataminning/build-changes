import com.mojang.serialization.Codec;

public class ejs extends ejk {
   public static final Codec<ejs> a = avt.a(ku.f).fieldOf("tag").xmap(ejs::new, $$0 -> $$0.b).codec();
   private final avt<dch> b;

   public ejs(avt<dch> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dpi $$0, axt $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected ejl<?> a() {
      return ejl.d;
   }
}
