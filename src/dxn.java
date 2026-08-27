import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dxn implements dwy {
   public static final Codec<dxn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dme.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dme.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               blq.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dxn::new)
   );
   public final dme b;
   public final dme c;
   private final blq d;

   public dxn(dme $$0, dme $$1, blq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public blq a() {
      return this.d;
   }
}
