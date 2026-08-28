import com.mojang.serialization.Codec;

public class eed implements eei {
   public static final Codec<eed> a = bpw.b(0, 256).fieldOf("count").xmap(eed::new, eed::a).codec();
   private final bpw b;

   public eed(int $$0) {
      this.b = bpt.a($$0);
   }

   public eed(bpw $$0) {
      this.b = $$0;
   }

   public bpw a() {
      return this.b;
   }
}
