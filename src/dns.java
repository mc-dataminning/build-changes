import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

class dns extends dnx {
   private final ig<cut> e;
   public static final Codec<dns> a = RecordCodecBuilder.create($$0 -> a($$0).and(iq.a(jz.e).fieldOf("blocks").forGetter($$0x -> $$0x.e)).apply($$0, dns::new));

   public dns(iw $$0, ig<cut> $$1) {
      super($$0);
      this.e = $$1;
   }

   @Override
   protected boolean a(dgw $$0) {
      return $$0.a(this.e);
   }

   @Override
   public dnn<?> a() {
      return dnn.a;
   }
}
