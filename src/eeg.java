import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eeg implements eeh {
   public static final Codec<eeg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(jd.a.optionalFieldOf("exit").forGetter($$0x -> $$0x.b), Codec.BOOL.fieldOf("exact").forGetter($$0x -> $$0x.c)).apply($$0, eeg::new)
   );
   private final Optional<jd> b;
   private final boolean c;

   private eeg(Optional<jd> $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public static eeg a(jd $$0, boolean $$1) {
      return new eeg(Optional.of($$0), $$1);
   }

   public static eeg a() {
      return new eeg(Optional.empty(), false);
   }

   public Optional<jd> b() {
      return this.b;
   }

   public boolean c() {
      return this.c;
   }
}
