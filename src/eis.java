import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class eis extends eix {
   private final jk<dne> e;
   public static final MapCodec<eis> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(jv.a(mi.i).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, eis::new)
   );

   public eis(kb $$0, jk<dne> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(ebg $$0) {
      return $$0.a(this.e);
   }

   @Override
   public ein<?> a() {
      return ein.a;
   }
}
