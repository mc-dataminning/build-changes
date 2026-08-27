import com.mojang.serialization.Codec;

public class dzi extends dyz {
   public static final Codec<dzi> b = dme.b.fieldOf("state").xmap(dzi::new, $$0 -> $$0.c).codec();
   private final dme c;

   protected dzi(dme $$0) {
      this.c = $$0;
   }

   @Override
   protected dza<?> a() {
      return dza.a;
   }

   @Override
   public dme a(awt $$0, ib $$1) {
      return this.c;
   }
}
