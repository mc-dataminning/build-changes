import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dhb(dgu d, dgu e, jg<bvm> f) implements dhe {
   public static final MapCodec<dhb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dgu.b.fieldOf("min_damage").forGetter(dhb::b), dgu.b.fieldOf("max_damage").forGetter(dhb::c), bvm.b.fieldOf("damage_type").forGetter(dhb::d)
            )
            .apply($$0, dhb::new)
   );

   @Override
   public void a(aru $$0, int $$1, dgm $$2, bwv $$3, ffs $$4) {
      float $$5 = azq.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new bvk(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dhb> a() {
      return a;
   }

   public dgu b() {
      return this.d;
   }

   public dgu c() {
      return this.e;
   }

   public jg<bvm> d() {
      return this.f;
   }
}
