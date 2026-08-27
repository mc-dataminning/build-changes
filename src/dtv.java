import com.mojang.serialization.Codec;

public class dtv extends duj {
   public static final Codec<dtv> a = bfv.b(0, 256).fieldOf("count").xmap(dtv::new, $$0 -> $$0.c).codec();
   private final bfv c;

   private dtv(bfv $$0) {
      this.c = $$0;
   }

   public static dtv a(bfv $$0) {
      return new dtv($$0);
   }

   public static dtv a(int $$0) {
      return a(bfs.a($$0));
   }

   @Override
   protected int a(aru $$0, gu $$1) {
      return this.c.a($$0);
   }

   @Override
   public dug<?> b() {
      return dug.f;
   }
}
