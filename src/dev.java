import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dev(deo d, deo e, js<buj> f) implements dey {
   public static final MapCodec<dev> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               deo.b.fieldOf("min_damage").forGetter(dev::b), deo.b.fieldOf("max_damage").forGetter(dev::c), buj.b.fieldOf("damage_type").forGetter(dev::d)
            )
            .apply($$0, dev::new)
   );

   @Override
   public void a(arn $$0, int $$1, deg $$2, bvs $$3, fcu $$4) {
      float $$5 = azk.b($$3.dY(), this.d.a($$1), this.e.a($$1));
      $$3.a($$0, new buh(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   public deo b() {
      return this.d;
   }

   public deo c() {
      return this.e;
   }

   public js<buj> d() {
      return this.f;
   }
}
