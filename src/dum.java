import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dum implements dtx {
   public static final Codec<dum> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               djg.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               djg.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bjf.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dum::new)
   );
   public final djg b;
   public final djg c;
   private final bjf d;

   public dum(djg $$0, djg $$1, bjf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bjf a() {
      return this.d;
   }
}
