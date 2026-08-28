import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ddo(ddh d, ddh e, jr<bte> f) implements ddr {
   public static final MapCodec<ddo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ddh.b.fieldOf("min_damage").forGetter(ddo::b), ddh.b.fieldOf("max_damage").forGetter(ddo::c), bte.b.fieldOf("damage_type").forGetter(ddo::d)
            )
            .apply($$0, ddo::new)
   );

   @Override
   public void a(ard $$0, int $$1, dcz $$2, bum $$3, fbb $$4) {
      float $$5 = ayz.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new btc(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<ddo> a() {
      return a;
   }

   public ddh b() {
      return this.d;
   }

   public ddh c() {
      return this.e;
   }

   public jr<bte> d() {
      return this.f;
   }
}
