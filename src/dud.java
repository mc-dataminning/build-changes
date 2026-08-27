import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dud(dwp b, dqf c, bjh d, int e) implements dug {
   public static final Codec<dud> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwp.a.fieldOf("state_provider").forGetter(dud::a),
               dqf.b.fieldOf("target").forGetter(dud::b),
               bjh.b(0, 8).fieldOf("radius").forGetter(dud::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dud::d)
            )
            .apply($$0, dud::new)
   );

   public dwp a() {
      return this.b;
   }

   public dqf b() {
      return this.c;
   }

   public bjh c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
