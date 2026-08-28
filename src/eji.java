import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eji implements eit {
   public static final Codec<eji> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dxo.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dxo.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bsf.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eji::new)
   );
   public final dxo b;
   public final dxo c;
   private final bsf d;

   public eji(dxo $$0, dxo $$1, bsf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bsf a() {
      return this.d;
   }
}
