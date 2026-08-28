import com.mojang.serialization.Codec;

public class eft implements efy {
   public static final Codec<eft> a = bqx.b(0, 256).fieldOf("count").xmap(eft::new, eft::a).codec();
   private final bqx b;

   public eft(int $$0) {
      this.b = bqu.a($$0);
   }

   public eft(bqx $$0) {
      this.b = $$0;
   }

   public bqx a() {
      return this.b;
   }
}
