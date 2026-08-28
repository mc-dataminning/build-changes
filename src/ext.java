import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ext(float b, dbz c, jq<dbs> g) implements exn {
   public static final MapCodec<ext> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ext::c),
               dbz.b.fieldOf("enchanted_chance").forGetter(ext::d),
               dbs.c.fieldOf("enchantment").forGetter(ext::e)
            )
            .apply($$0, ext::new)
   );

   @Override
   public exo b() {
      return exp.e;
   }

   @Override
   public Set<ewv<?>> a() {
      return ImmutableSet.of(ewy.d);
   }

   public boolean a(euc $$0) {
      bue $$1 = $$0.c(ewy.d);
      int $$3 = $$1 instanceof bva $$2 ? dbu.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static exn.a a(js.a $$0, float $$1, float $$2) {
      js.b<dbs> $$3 = $$0.d(lz.aM);
      return () -> new ext($$1, new dbz.e($$1 + $$2, $$2), $$3.b(dbx.s));
   }

   public float c() {
      return this.b;
   }

   public dbz d() {
      return this.c;
   }

   public jq<dbs> e() {
      return this.g;
   }
}
