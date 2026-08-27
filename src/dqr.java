import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqr implements dqc {
   public static final Codec<dqr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfl.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dfl.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bgf.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqr::new)
   );
   public final dfl b;
   public final dfl c;
   private final bgf d;

   public dqr(dfl $$0, dfl $$1, bgf $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bgf a() {
      return this.d;
   }
}
