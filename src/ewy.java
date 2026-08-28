import com.google.common.collect.ImmutableSet;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ewy(float b, dbr c, jn<dbk> g) implements ews {
   public static final MapCodec<ewy> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ewy::c),
               dbr.b.fieldOf("enchanted_chance").forGetter(ewy::d),
               dbk.c.fieldOf("enchantment").forGetter(ewy::e)
            )
            .apply($$0, ewy::new)
   );

   @Override
   public ewt b() {
      return ewu.e;
   }

   @Override
   public Set<ewa<?>> a() {
      return ImmutableSet.of(ewd.d);
   }

   public boolean a(eth $$0) {
      bto $$1 = $$0.c(ewd.d);
      int $$3 = $$1 instanceof buk $$2 ? dbm.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ews.a a(jp.a $$0, float $$1, float $$2) {
      jp.b<dbk> $$3 = $$0.b(lv.aM);
      return () -> new ewy($$1, new dbr.e($$1 + $$2, $$2), $$3.b(dbp.s));
   }

   public float c() {
      return this.b;
   }

   public dbr d() {
      return this.c;
   }

   public jn<dbk> e() {
      return this.g;
   }
}
