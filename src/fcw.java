import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcw(float b, dfx c, je<dfq> g) implements fcq {
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fcw::c),
               dfx.b.fieldOf("enchanted_chance").forGetter(fcw::d),
               dfq.c.fieldOf("enchantment").forGetter(fcw::e)
            )
            .apply($$0, fcw::new)
   );

   @Override
   public fcr b() {
      return fcs.e;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fcb.d);
   }

   public boolean a(ezh $$0) {
      bwf $$1 = $$0.c(fcb.d);
      int $$3 = $$1 instanceof bxe $$2 ? dfs.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fcq.a a(jg.a $$0, float $$1, float $$2) {
      jg.b<dfq> $$3 = $$0.e(mg.aR);
      return () -> new fcw($$1, new dfx.e($$1 + $$2, $$2), $$3.b(dfv.s));
   }

   public float c() {
      return this.b;
   }

   public dfx d() {
      return this.c;
   }

   public je<dfq> e() {
      return this.g;
   }
}
