import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record ezh(float b, ddh c, jr<dda> g) implements ezb {
   public static final MapCodec<ezh> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(ezh::c),
               ddh.b.fieldOf("enchanted_chance").forGetter(ezh::d),
               dda.c.fieldOf("enchantment").forGetter(ezh::e)
            )
            .apply($$0, ezh::new)
   );

   @Override
   public ezc b() {
      return ezd.e;
   }

   @Override
   public Set<bai<?>> a() {
      return Set.of(eym.d);
   }

   public boolean a(evs $$0) {
      bum $$1 = $$0.c(eym.d);
      int $$3 = $$1 instanceof bvi $$2 ? ddc.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static ezb.a a(jt.a $$0, float $$1, float $$2) {
      jt.b<dda> $$3 = $$0.d(mc.aO);
      return () -> new ezh($$1, new ddh.e($$1 + $$2, $$2), $$3.b(ddf.s));
   }

   public float c() {
      return this.b;
   }

   public ddh d() {
      return this.c;
   }

   public jr<dda> e() {
      return this.g;
   }
}
