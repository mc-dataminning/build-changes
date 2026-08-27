import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dso implements drz {
   public static final Codec<dso> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dhi.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dhi.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bic.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dso::new)
   );
   public final dhi b;
   public final dhi c;
   private final bic d;

   public dso(dhi $$0, dhi $$1, bic $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bic a() {
      return this.d;
   }
}
