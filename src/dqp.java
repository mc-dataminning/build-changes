import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class dqp implements dqa {
   public static final Codec<dqp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dfj.b.fieldOf("target").forGetter($$0x -> $$0x.b),
               dfj.b.fieldOf("state").forGetter($$0x -> $$0x.c),
               bgd.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, dqp::new)
   );
   public final dfj b;
   public final dfj c;
   private final bgd d;

   public dqp(dfj $$0, dfj $$1, bgd $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bgd a() {
      return this.d;
   }
}
