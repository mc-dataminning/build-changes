import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dug implements dtr {
   public static final Codec<dug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dja.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dja.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bja.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dug::new)
   );
   public final dja b;
   public final dja c;
   private final bja d;

   public dug(dja $$0, dja $$1, bja $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bja a() {
      return this.d;
   }
}
