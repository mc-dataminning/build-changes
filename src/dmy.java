import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dmy extends dnc {
   private final ig<ebd> e;
   public static final Codec<dmy> a = RecordCodecBuilder.create($$0 -> a($$0).and(iq.a(jz.x).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dmy::new));

   public dmy(iw $$0, ig<ebd> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dgb $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dms<?> a() {
      return dms.c;
   }
}
