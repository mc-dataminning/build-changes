import com.mojang.serialization.Codec;

public class dpl implements dpq {
   public static final Codec<dpl> a = bfv.b(0, 256).fieldOf("count").xmap(dpl::new, dpl::a).codec();
   private final bfv b;

   public dpl(int $$0) {
      this.b = bfs.a($$0);
   }

   public dpl(bfv $$0) {
      this.b = $$0;
   }

   public bfv a() {
      return this.b;
   }
}
