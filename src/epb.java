import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class epb extends eoo {
   public static final Codec<epb> a = RecordCodecBuilder.create(
      $$0 -> a($$0).and(avr.b(ks.D).fieldOf("options").forGetter($$0x -> $$0x.b)).apply($$0, epb::new)
   );
   private final avr<crb> b;

   private epb(List<eqc> $$0, avr<crb> $$1) {
      super($$0);
      this.b = $$1;
   }

   @Override
   public eoq b() {
      return eor.B;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      crc.a($$0, this.b, $$1.b());
      return $$0;
   }

   public static eoo.a<?> a(avr<crb> $$0) {
      return a($$1 -> new epb($$1, $$0));
   }
}
