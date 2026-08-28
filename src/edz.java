import com.mojang.serialization.Codec;

public class edz implements eee {
   public static final Codec<edz> a = bpv.b(0, 256).fieldOf("count").xmap(edz::new, edz::a).codec();
   private final bpv b;

   public edz(int $$0) {
      this.b = bps.a($$0);
   }

   public edz(bpv $$0) {
      this.b = $$0;
   }

   public bpv a() {
      return this.b;
   }
}
