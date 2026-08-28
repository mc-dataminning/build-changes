import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fco(float b, dfs c, je<dfl> g) implements fci {
   public static final MapCodec<fco> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fco::c),
               dfs.b.fieldOf("enchanted_chance").forGetter(fco::d),
               dfl.c.fieldOf("enchantment").forGetter(fco::e)
            )
            .apply($$0, fco::new)
   );

   @Override
   public fcj b() {
      return fck.e;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fbt.d);
   }

   public boolean a(eyz $$0) {
      bwd $$1 = $$0.c(fbt.d);
      int $$3 = $$1 instanceof bxc $$2 ? dfn.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fci.a a(jg.a $$0, float $$1, float $$2) {
      jg.b<dfl> $$3 = $$0.e(mg.aQ);
      return () -> new fco($$1, new dfs.e($$1 + $$2, $$2), $$3.b(dfq.s));
   }

   public float c() {
      return this.b;
   }

   public dfs d() {
      return this.c;
   }

   public je<dfl> e() {
      return this.g;
   }
}
