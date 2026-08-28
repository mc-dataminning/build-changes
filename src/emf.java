import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class emf implements elq {
   public static final Codec<emf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eah.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               eah.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bti.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, emf::new)
   );
   public final eah b;
   public final eah c;
   private final bti d;

   public emf(eah $$0, eah $$1, bti $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bti a() {
      return this.d;
   }
}
