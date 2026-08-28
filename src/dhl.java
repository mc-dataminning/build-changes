import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhl(dhe d, dhe e, jg<bvv> f) implements dho {
   public static final MapCodec<dhl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dhe.b.fieldOf("min_damage").forGetter(dhl::b), dhe.b.fieldOf("max_damage").forGetter(dhl::c), bvv.b.fieldOf("damage_type").forGetter(dhl::d)
            )
            .apply($$0, dhl::new)
   );

   @Override
   public void a(asb $$0, int $$1, dgw $$2, bxe $$3, fgc $$4) {
      float $$5 = azz.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bvt(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dhl> a() {
      return a;
   }

   public dhe b() {
      return this.d;
   }

   public dhe c() {
      return this.e;
   }

   public jg<bvv> d() {
      return this.f;
   }
}
