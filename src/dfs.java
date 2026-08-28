import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfs(jw<deh> d, int e, int f) implements dfp {
   public static final int b = 10000;
   public static final MapCodec<dfs> c = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kh.a(me.aS).fieldOf("enchantments").forGetter(dfs::b),
               ays.a(1, 10000).fieldOf("min_cost").forGetter(dfs::c),
               ays.a(0, 10000).fieldOf("max_cost_span").forGetter(dfs::d)
            )
            .apply($$0, dfs::new)
   );

   @Override
   public void a(cxy $$0, den.a $$1, azs $$2, bto $$3) {
      float $$4 = $$3.d();
      int $$5 = azk.b($$2, this.e, this.e + (int)($$4 * (float)this.f));

      for (dek $$7 : dej.b($$2, $$0, $$5, this.d.a())) {
         $$1.b($$7.b(), $$7.c());
      }
   }

   @Override
   public MapCodec<dfs> a() {
      return c;
   }

   public jw<deh> b() {
      return this.d;
   }

   public int c() {
      return this.e;
   }

   public int d() {
      return this.f;
   }
}
