import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eeg extends eei {
   public static final Codec<eeg> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eeg::new));

   protected eeg(Either<ajh, ehc> $$0, il<eha> $$1, eel.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected egy a(dgm $$0, ecu $$1, boolean $$2) {
      egy $$3 = super.a($$0, $$1, $$2);
      $$3.b(ege.b);
      $$3.a(ege.d);
      return $$3;
   }

   @Override
   public eek<?> a() {
      return eek.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
