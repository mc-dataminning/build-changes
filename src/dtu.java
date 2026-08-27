import com.mojang.serialization.Codec;

public class dtu extends dui {
   public static final Codec<dtu> a = bft.b(0, 256).fieldOf("count").xmap(dtu::new, $$0 -> $$0.c).codec();
   private final bft c;

   private dtu(bft $$0) {
      this.c = $$0;
   }

   public static dtu a(bft $$0) {
      return new dtu($$0);
   }

   public static dtu a(int $$0) {
      return a(bfq.a($$0));
   }

   @Override
   protected int a(art $$0, gv $$1) {
      return this.c.a($$0);
   }

   @Override
   public duf<?> b() {
      return duf.f;
   }
}
