import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dnt extends dnx {
   private final ig<ecf> e;
   public static final Codec<dnt> a = RecordCodecBuilder.create($$0 -> a($$0).and(iq.a(jz.x).fieldOf("fluids").forGetter($$0x -> $$0x.e)).apply($$0, dnt::new));

   public dnt(iw $$0, ig<ecf> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dgw $$0) {
      return $$0.u().a(this.e);
   }

   @Override
   public dnn<?> a() {
      return dnn.c;
   }
}
