import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egy implements egj {
   public static final Codec<egy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dvd.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dvd.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               brd.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egy::new)
   );
   public final dvd b;
   public final dvd c;
   private final brd d;

   public egy(dvd $$0, dvd $$1, brd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public brd a() {
      return this.d;
   }
}
