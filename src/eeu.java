import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeu extends een {
   public static final Codec<eeu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.INT.fieldOf("max_water_depth").forGetter($$0x -> $$0x.c)).apply($$0, eeu::new)
   );
   private final int c;

   private eeu(int $$0) {
      this.c = $$0;
   }

   public static eeu a(int $$0) {
      return new eeu($$0);
   }

   @Override
   protected boolean a(eem $$0, axr $$1, ib $$2) {
      int $$3 = $$0.a(dur.a.d, $$2.u(), $$2.w());
      int $$4 = $$0.a(dur.a.b, $$2.u(), $$2.w());
      return $$4 - $$3 <= this.c;
   }

   @Override
   public eep<?> b() {
      return eep.d;
   }
}
