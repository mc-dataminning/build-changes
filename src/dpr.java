import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpr(dsd b, dlt c, bgj d, int e) implements dpu {
   public static final Codec<dpr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dsd.a.fieldOf("state_provider").forGetter(dpr::a),
               dlt.b.fieldOf("target").forGetter(dpr::b),
               bgj.b(0, 8).fieldOf("radius").forGetter(dpr::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dpr::d)
            )
            .apply($$0, dpr::new)
   );

   public dsd a() {
      return this.b;
   }

   public dlt b() {
      return this.c;
   }

   public bgj c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
