import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dtv implements dtg {
   public static final Codec<dtv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dip.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dip.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               biq.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dtv::new)
   );
   public final dip b;
   public final dip c;
   private final biq d;

   public dtv(dip $$0, dip $$1, biq $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public biq a() {
      return this.d;
   }
}
