import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqg implements dpr {
   public static final Codec<dqg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfa.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dfa.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bfv.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqg::new)
   );
   public final dfa b;
   public final dfa c;
   private final bfv d;

   public dqg(dfa $$0, dfa $$1, bfv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bfv a() {
      return this.d;
   }
}
