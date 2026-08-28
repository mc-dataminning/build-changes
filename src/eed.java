import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eed implements edo {
   public static final Codec<eed> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsk.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsk.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpl.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eed::new)
   );
   public final dsk b;
   public final dsk c;
   private final bpl d;

   public eed(dsk $$0, dsk $$1, bpl $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpl a() {
      return this.d;
   }
}
