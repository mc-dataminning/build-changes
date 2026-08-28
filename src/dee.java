import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dee(ddx d, ddx e, jq<btt> f) implements deh {
   public static final MapCodec<dee> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddx.b.fieldOf("min_damage").forGetter(dee::b), ddx.b.fieldOf("max_damage").forGetter(dee::c), btt.b.fieldOf("damage_type").forGetter(dee::d)
            )
            .apply($$0, dee::new)
   );

   @Override
   public void a(arx $$0, int $$1, ddp $$2, bvb $$3, fbr $$4) {
      float $$5 = azu.b($$3.dZ(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new btr(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dee> a() {
      return a;
   }

   public ddx b() {
      return this.d;
   }

   public ddx c() {
      return this.e;
   }

   public jq<btt> d() {
      return this.f;
   }
}
