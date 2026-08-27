import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eie extends ehz {
   public static final Codec<eie> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(bok.b(ehz.c).fieldOf("distribution").forGetter($$0x -> $$0x.b)).apply($$0, eie::new)
   );
   private final bok<ehz> b;

   public eie(bok<ehz> $$0) {
      this.b = $$0;
   }

   @Override
   public int a(ayt $$0, dzr $$1) {
      return this.b.a($$0).orElseThrow(IllegalStateException::new).a($$0, $$1);
   }

   @Override
   public eia<?> a() {
      return eia.f;
   }
}
