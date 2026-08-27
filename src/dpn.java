import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dpn(drz b, dlp c, bfv d, int e) implements dpq {
   public static final Codec<dpn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               drz.a.fieldOf("state_provider").forGetter(dpn::a),
               dlp.b.fieldOf("target").forGetter(dpn::b),
               bfv.b(0, 8).fieldOf("radius").forGetter(dpn::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dpn::d)
            )
            .apply($$0, dpn::new)
   );

   public drz a() {
      return this.b;
   }

   public dlp b() {
      return this.c;
   }

   public bfv c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
