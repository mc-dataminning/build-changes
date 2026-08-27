import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dsb(dun b, dod c, big d, int e) implements dse {
   public static final Codec<dsb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dun.a.fieldOf("state_provider").forGetter(dsb::a),
               dod.b.fieldOf("target").forGetter(dsb::b),
               big.b(0, 8).fieldOf("radius").forGetter(dsb::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dsb::d)
            )
            .apply($$0, dsb::new)
   );

   public dun a() {
      return this.b;
   }

   public dod b() {
      return this.c;
   }

   public big c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
