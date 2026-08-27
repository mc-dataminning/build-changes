import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dws implements dwd {
   public static final Codec<dws> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dlj.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dlj.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               blb.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dws::new)
   );
   public final dlj b;
   public final dlj c;
   private final blb d;

   public dws(dlj $$0, dlj $$1, blb $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public blb a() {
      return this.d;
   }
}
