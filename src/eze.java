import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record eze(float b, dde c, jr<dcx> g) implements eyy {
   public static final MapCodec<eze> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(eze::c),
               dde.b.fieldOf("enchanted_chance").forGetter(eze::d),
               dcx.c.fieldOf("enchantment").forGetter(eze::e)
            )
            .apply($$0, eze::new)
   );

   @Override
   public eyz b() {
      return eza.e;
   }

   @Override
   public Set<bah<?>> a() {
      return Set.of(eyj.d);
   }

   public boolean a(evp $$0) {
      buj $$1 = $$0.c(eyj.d);
      int $$3 = $$1 instanceof bvf $$2 ? dcz.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static eyy.a a(jt.a $$0, float $$1, float $$2) {
      jt.b<dcx> $$3 = $$0.d(mc.aO);
      return () -> new eze($$1, new dde.e($$1 + $$2, $$2), $$3.b(ddc.s));
   }

   public float c() {
      return this.b;
   }

   public dde d() {
      return this.c;
   }

   public jr<dcx> e() {
      return this.g;
   }
}
