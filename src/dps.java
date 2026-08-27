import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dps(dse b, dlu c, bfy d, int e) implements dpv {
   public static final Codec<dps> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dse.a.fieldOf("state_provider").forGetter(dps::a),
               dlu.b.fieldOf("target").forGetter(dps::b),
               bfy.b(0, 8).fieldOf("radius").forGetter(dps::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dps::d)
            )
            .apply($$0, dps::new)
   );

   public dse a() {
      return this.b;
   }

   public dlu b() {
      return this.c;
   }

   public bfy c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
