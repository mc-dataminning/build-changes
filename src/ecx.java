import com.mojang.serialization.Codec;

public class ecx implements edc {
   public static final Codec<ecx> a = bpz.b(0, 256).fieldOf("count").xmap(ecx::new, ecx::a).codec();
   private final bpz b;

   public ecx(int $$0) {
      this.b = bpw.a($$0);
   }

   public ecx(bpz $$0) {
      this.b = $$0;
   }

   public bpz a() {
      return this.b;
   }
}
