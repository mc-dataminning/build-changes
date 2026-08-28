import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fdd(float b, dge c, jf<dfx> g) implements fcx {
   public static final MapCodec<fdd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fdd::c),
               dge.b.fieldOf("enchanted_chance").forGetter(fdd::d),
               dfx.c.fieldOf("enchantment").forGetter(fdd::e)
            )
            .apply($$0, fdd::new)
   );

   @Override
   public fcy b() {
      return fcz.e;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.d);
   }

   public boolean a(ezo $$0) {
      bwi $$1 = $$0.c(fci.d);
      int $$3 = $$1 instanceof bxj $$2 ? dfz.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fcx.a a(jh.a $$0, float $$1, float $$2) {
      jh.b<dfx> $$3 = $$0.e(mh.aR);
      return () -> new fdd($$1, new dge.e($$1 + $$2, $$2), $$3.b(dgc.s));
   }

   public float c() {
      return this.b;
   }

   public dge d() {
      return this.c;
   }

   public jf<dfx> e() {
      return this.g;
   }
}
