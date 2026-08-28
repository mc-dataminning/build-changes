import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ejs(eme b, efs c, bsv d, int e) implements ejv {
   public static final Codec<ejs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eme.a.fieldOf("state_provider").forGetter(ejs::a),
               efs.b.fieldOf("target").forGetter(ejs::b),
               bsv.b(0, 8).fieldOf("radius").forGetter(ejs::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ejs::d)
            )
            .apply($$0, ejs::new)
   );

   public eme a() {
      return this.b;
   }

   public efs b() {
      return this.c;
   }

   public bsv c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
