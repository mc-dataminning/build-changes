import com.mojang.serialization.Codec;

public class eby implements ecd {
   public static final Codec<eby> a = bpb.b(0, 256).fieldOf("count").xmap(eby::new, eby::a).codec();
   private final bpb b;

   public eby(int $$0) {
      this.b = boy.a($$0);
   }

   public eby(bpb $$0) {
      this.b = $$0;
   }

   public bpb a() {
      return this.b;
   }
}
