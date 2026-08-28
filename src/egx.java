import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record egx(ejj b, ecx c, brp d, int e) implements eha {
   public static final Codec<egx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ejj.a.fieldOf("state_provider").forGetter(egx::a),
               ecx.b.fieldOf("target").forGetter(egx::b),
               brp.b(0, 8).fieldOf("radius").forGetter(egx::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(egx::d)
            )
            .apply($$0, egx::new)
   );

   public ejj a() {
      return this.b;
   }

   public ecx b() {
      return this.c;
   }

   public brp c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
