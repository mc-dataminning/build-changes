import com.mojang.serialization.Codec;

public class edd implements edi {
   public static final Codec<edd> a = bpi.b(0, 256).fieldOf("count").xmap(edd::new, edd::a).codec();
   private final bpi b;

   public edd(int $$0) {
      this.b = bpf.a($$0);
   }

   public edd(bpi $$0) {
      this.b = $$0;
   }

   public bpi a() {
      return this.b;
   }
}
