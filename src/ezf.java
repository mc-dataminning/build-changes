import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezf(float b, ddf c, jr<dcy> g) implements eyz {
   public static final MapCodec<ezf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ezf::c),
               ddf.b.fieldOf("enchanted_chance").forGetter(ezf::d),
               dcy.c.fieldOf("enchantment").forGetter(ezf::e)
            )
            .apply($$0, ezf::new)
   );

   @Override
   public eza b() {
      return ezb.e;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eyk.d);
   }

   public boolean a(evq $$0) {
      buk $$1 = $$0.c(eyk.d);
      int $$3 = $$1 instanceof bvg $$2 ? dda.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static eyz.a a(jt.a $$0, float $$1, float $$2) {
      jt.b<dcy> $$3 = $$0.d(mc.aO);
      return () -> new ezf($$1, new ddf.e($$1 + $$2, $$2), $$3.b(ddd.s));
   }

   public float c() {
      return this.b;
   }

   public ddf d() {
      return this.c;
   }

   public jr<dcy> e() {
      return this.g;
   }
}
