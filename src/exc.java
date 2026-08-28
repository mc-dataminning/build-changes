import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record exc(float b, dbu c, jo<dbn> g) implements eww {
   public static final MapCodec<exc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(exc::c),
               dbu.b.fieldOf("enchanted_chance").forGetter(exc::d),
               dbn.c.fieldOf("enchantment").forGetter(exc::e)
            )
            .apply($$0, exc::new)
   );

   @Override
   public ewx b() {
      return ewy.e;
   }

   @Override
   public Set<ewe<?>> a() {
      return ImmutableSet.of(ewh.d);
   }

   public boolean a(etl $$0) {
      btr $$1 = $$0.c(ewh.d);
      int $$3 = $$1 instanceof bun $$2 ? dbp.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static eww.a a(jq.a $$0, float $$1, float $$2) {
      jq.b<dbn> $$3 = $$0.d(lw.aN);
      return () -> new exc($$1, new dbu.e($$1 + $$2, $$2), $$3.b(dbs.s));
   }

   public float c() {
      return this.b;
   }

   public dbu d() {
      return this.c;
   }

   public jo<dbn> e() {
      return this.g;
   }
}
