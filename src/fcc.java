import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Set;

public record fcc(float b, dfm c, je<dff> g) implements fbw {
   public static final MapCodec<fcc> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(fcc::c),
               dfm.b.fieldOf("enchanted_chance").forGetter(fcc::d),
               dff.c.fieldOf("enchantment").forGetter(fcc::e)
            )
            .apply($$0, fcc::new)
   );

   @Override
   public fbx b() {
      return fby.e;
   }

   @Override
   public Set<bav<?>> a() {
      return Set.of(fbh.d);
   }

   public boolean a(eyn $$0) {
      bwa $$1 = $$0.c(fbh.d);
      int $$3 = $$1 instanceof bwz $$2 ? dfh.a(this.g, $$2) : 0;
      float $$4 = $$3 > 0 ? this.c.a($$3) : this.b;
      return $$0.b().i() < $$4;
   }

   public static fbw.a a(jg.a $$0, float $$1, float $$2) {
      jg.b<dff> $$3 = $$0.e(mg.aP);
      return () -> new fcc($$1, new dfm.e($$1 + $$2, $$2), $$3.b(dfk.s));
   }

   public float c() {
      return this.b;
   }

   public dfm d() {
      return this.c;
   }

   public je<dff> e() {
      return this.g;
   }
}
