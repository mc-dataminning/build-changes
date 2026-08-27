import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eht extends ehv {
   public static final Codec<eht> a = RecordCodecBuilder.create($$0 -> $$0.group(c(), b(), d()).apply($$0, eht::new));

   protected eht(Either<akh, ekp> $$0, iw<ekn> $$1, ehy.a $$2) {
      super($$0, $$1, $$2);
   }

   @Override
   protected ekl a(djr $$0, egh $$1, boolean $$2) {
      ekl $$3 = super.a($$0, $$1, $$2);
      $$3.b(ejr.b);
      $$3.a(ejr.d);
      return $$3;
   }

   @Override
   public ehx<?> a() {
      return ehx.e;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.c + "]";
   }
}
