import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class eee implements edp {
   public static final Codec<eee> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsl.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dsl.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bpm.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, eee::new)
   );
   public final dsl b;
   public final dsl c;
   private final bpm d;

   public eee(dsl $$0, dsl $$1, bpm $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bpm a() {
      return this.d;
   }
}
