import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egg(eis b, ecg c, brd d, int e) implements egj {
   public static final Codec<egg> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eis.a.fieldOf("state_provider").forGetter(egg::a),
               ecg.b.fieldOf("target").forGetter(egg::b),
               brd.b(0, 8).fieldOf("radius").forGetter(egg::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(egg::d)
            )
            .apply($$0, egg::new)
   );

   public eis a() {
      return this.b;
   }

   public ecg b() {
      return this.c;
   }

   public brd c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
