import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmx extends dnc {
   private final ig<cua> e;
   public static final Codec<dmx> a = RecordCodecBuilder.create($$0 -> a($$0).and(iq.a(jz.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dmx::new));

   public dmx(iw $$0, ig<cua> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dgb $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dms<?> a() {
      return dms.a;
   }
}
