import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwa(dym b, dsc c, blb d, int e) implements dwd {
   public static final Codec<dwa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dym.a.fieldOf("state_provider").forGetter(dwa::a),
               dsc.b.fieldOf("target").forGetter(dwa::b),
               blb.b(0, 8).fieldOf("radius").forGetter(dwa::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dwa::d)
            )
            .apply($$0, dwa::new)
   );

   public dym a() {
      return this.b;
   }

   public dsc b() {
      return this.c;
   }

   public blb c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
