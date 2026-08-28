import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dge(dfx d, dfx e, je<buw> f) implements dgh {
   public static final MapCodec<dge> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dfx.b.fieldOf("min_damage").forGetter(dge::b), dfx.b.fieldOf("max_damage").forGetter(dge::c), buw.b.fieldOf("damage_type").forGetter(dge::d)
            )
            .apply($$0, dge::new)
   );

   @Override
   public void a(arq $$0, int $$1, dfp $$2, bwf $$3, feq $$4) {
      float $$5 = azm.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new buu(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   public dfx b() {
      return this.d;
   }

   public dfx c() {
      return this.e;
   }

   public je<buw> d() {
      return this.f;
   }
}
