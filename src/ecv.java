import com.mojang.serialization.Codec;

public class ecv implements eda {
   public static final Codec<ecv> a = bpx.b(0, 256).fieldOf("count").xmap(ecv::new, ecv::a).codec();
   private final bpx b;

   public ecv(int $$0) {
      this.b = bpu.a($$0);
   }

   public ecv(bpx $$0) {
      this.b = $$0;
   }

   public bpx a() {
      return this.b;
   }
}
