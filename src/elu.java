import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record elu(eog b, ehu c, btl d, int e) implements elx {
   public static final Codec<elu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eog.a.fieldOf("state_provider").forGetter(elu::a),
               ehu.b.fieldOf("target").forGetter(elu::b),
               btl.b(0, 8).fieldOf("radius").forGetter(elu::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(elu::d)
            )
            .apply($$0, elu::new)
   );

   public eog a() {
      return this.b;
   }

   public ehu b() {
      return this.c;
   }

   public btl c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
