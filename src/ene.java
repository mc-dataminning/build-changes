import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ene implements emp {
   public static final Codec<ene> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ebe.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               ebe.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               btw.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, ene::new)
   );
   public final ebe b;
   public final ebe c;
   private final btw d;

   public ene(ebe $$0, ebe $$1, btw $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public btw a() {
      return this.d;
   }
}
