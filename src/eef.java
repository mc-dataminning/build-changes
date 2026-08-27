import com.mojang.serialization.Codec;

public class eef implements eek {
   public static final Codec<eef> a = bpf.b(0, 256).fieldOf("count").xmap(eef::new, eef::a).codec();
   private final bpf b;

   public eef(int $$0) {
      this.b = bpc.a($$0);
   }

   public eef(bpf $$0) {
      this.b = $$0;
   }

   public bpf a() {
      return this.b;
   }
}
