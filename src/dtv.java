import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dtv(dwh b, dpx c, bjg d, int e) implements dty {
   public static final Codec<dtv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dwh.a.fieldOf("state_provider").forGetter(dtv::a),
               dpx.b.fieldOf("target").forGetter(dtv::b),
               bjg.b(0, 8).fieldOf("radius").forGetter(dtv::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dtv::d)
            )
            .apply($$0, dtv::new)
   );

   public dwh a() {
      return this.b;
   }

   public dpx b() {
      return this.c;
   }

   public bjg c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
