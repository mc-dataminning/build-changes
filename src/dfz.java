import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dfz(dfs d, dfs e, je<buu> f) implements dgc {
   public static final MapCodec<dfz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfs.b.fieldOf("min_damage").forGetter(dfz::b), dfs.b.fieldOf("max_damage").forGetter(dfz::c), buu.b.fieldOf("damage_type").forGetter(dfz::d)
            )
            .apply($$0, dfz::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfk $$2, bwd $$3, fei $$4) {
      float $$5 = azm.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bus(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   public dfs b() {
      return this.d;
   }

   public dfs c() {
      return this.e;
   }

   public je<buu> d() {
      return this.f;
   }
}
