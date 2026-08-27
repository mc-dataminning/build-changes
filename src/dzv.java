import com.mojang.serialization.Codec;

public class dzv extends dzn {
   public static final Codec<dzv> a = arh.a(jz.e).fieldOf("tag").xmap(dzv::new, $$0 -> $$0.b).codec();
   private final arh<cua> b;

   public dzv(arh<cua> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dgb $$0, ate $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected dzo<?> a() {
      return dzo.d;
   }
}
