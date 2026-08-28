import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class efv implements efg {
   public static final Codec<efv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dua.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dua.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bqp.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, efv::new)
   );
   public final dua b;
   public final dua c;
   private final bqp d;

   public efv(dua $$0, dua $$1, bqp $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bqp a() {
      return this.d;
   }
}
