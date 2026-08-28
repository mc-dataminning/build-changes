import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dza(jp<dyz> e, dxa f) {
   public static final Codec<dza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(dyz.k.fieldOf("type").forGetter(dza::a), dxa.a.fieldOf("generator").forGetter(dza::b)).apply($$0, $$0.stable(dza::new))
   );
   public static final alg<dza> b = alg.a(ly.bc, alh.b("overworld"));
   public static final alg<dza> c = alg.a(ly.bc, alh.b("the_nether"));
   public static final alg<dza> d = alg.a(ly.bc, alh.b("the_end"));

   public jp<dyz> a() {
      return this.e;
   }

   public dxa b() {
      return this.f;
   }
}
