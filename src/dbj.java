import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dbj(dbd d, dbd e, jn<bsd> f) implements dbn {
   public static final MapCodec<dbj> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               dbd.b.fieldOf("min_damage").forGetter(dbj::b), dbd.b.fieldOf("max_damage").forGetter(dbj::c), bsd.b.fieldOf("damage_type").forGetter(dbj::d)
            )
            .apply($$0, dbj::new)
   );

   @Override
   public void a(arg $$0, int $$1, dav $$2, btj $$3, eye $$4) {
      float $$5 = azc.b($$3.dV(), this.d.a($$1), this.e.a($$1));
      $$3.a(new bsb(this.f, $$2.c()), $$5);
   }

   @Override
   public MapCodec<dbj> a() {
      return a;
   }

   public dbd b() {
      return this.d;
   }

   public dbd c() {
      return this.e;
   }

   public jn<bsd> d() {
      return this.f;
   }
}
