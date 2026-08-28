import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record czv(czq d, czq e, jj<bqy> f) implements czz {
   public static final MapCodec<czv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               czq.b.fieldOf("min_damage").forGetter(czv::b), czq.b.fieldOf("max_damage").forGetter(czv::c), bqy.b.fieldOf("damage_type").forGetter(czv::d)
            )
            .apply($$0, czv::new)
   );

   @Override
   public void a(aqk $$0, int $$1, czi $$2, bsd $$3, evz $$4) {
      float $$5 = aye.b($$3.dS(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bqw(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<czv> a() {
      return a;
   }

   public czq b() {
      return this.d;
   }

   public czq c() {
      return this.e;
   }

   public jj<bqy> d() {
      return this.f;
   }
}
