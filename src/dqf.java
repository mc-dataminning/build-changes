import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqf implements dpq {
   public static final Codec<dqf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dez.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dez.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bfv.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqf::new)
   );
   public final dez b;
   public final dez c;
   private final bfv d;

   public dqf(dez $$0, dez $$1, bfv $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bfv a() {
      return this.d;
   }
}
