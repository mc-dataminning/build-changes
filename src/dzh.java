import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dzh extends dzl {
   private final jm<ent> e;
   public static final MapCodec<dzh> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jx.a(lq.z).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dzh::new)
   );

   public dzh(kd $$0, jm<ent> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dsb $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dzb<?> a() {
      return dzb.c;
   }
}
