import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emg extends emt {
   public static final MapCodec<emg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(eea.b.fieldOf("predicate").forGetter($$0x -> $$0x.c)).apply($$0, emg::new)
   );
   private final eea c;

   private emg(eea $$0) {
      this.c = $$0;
   }

   public static emg a(eea $$0) {
      return new emg($$0);
   }

   @Override
   protected boolean a(ems $$0, azh $$1, ji $$2) {
      return this.c.test($$0.d(), $$2);
   }

   @Override
   public emv<?> b() {
      return emv.a;
   }
}
