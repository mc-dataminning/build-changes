import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecx(efj b, dyz c, bpx d, int e) implements eda {
   public static final Codec<ecx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efj.a.fieldOf("state_provider").forGetter(ecx::a),
               dyz.b.fieldOf("target").forGetter(ecx::b),
               bpx.b(0, 8).fieldOf("radius").forGetter(ecx::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ecx::d)
            )
            .apply($$0, ecx::new)
   );

   public efj a() {
      return this.b;
   }

   public dyz b() {
      return this.c;
   }

   public bpx c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
