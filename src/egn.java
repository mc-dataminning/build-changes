import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class egn implements efy {
   public static final Codec<egn> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dus.a.fieldOf("target").forGetter($$0x -> $$0x.b),
               dus.a.fieldOf("state").forGetter($$0x -> $$0x.c),
               bqx.b(0, 12).fieldOf("radius").forGetter($$0x -> $$0x.d)
            )
            .apply($$0, egn::new)
   );
   public final dus b;
   public final dus c;
   private final bqx d;

   public egn(dus $$0, dus $$1, bqx $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   public bqx a() {
      return this.d;
   }
}
