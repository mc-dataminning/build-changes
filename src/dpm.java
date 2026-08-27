import com.mojang.serialization.Codec;

public class dpm implements dpr {
   public static final Codec<dpm> a = bfv.b(0, 256).fieldOf("count").xmap(dpm::new, dpm::a).codec();
   private final bfv b;

   public dpm(int $$0) {
      this.b = bfs.a($$0);
   }

   public dpm(bfv $$0) {
      this.b = $$0;
   }

   public bfv a() {
      return this.b;
   }
}
