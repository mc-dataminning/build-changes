import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record emx(epk b, eiw c, buh d, int e) implements enb {
   public static final Codec<emx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               epk.a.fieldOf("state_provider").forGetter(emx::a),
               eiw.b.fieldOf("target").forGetter(emx::b),
               buh.b(0, 8).fieldOf("radius").forGetter(emx::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(emx::d)
            )
            .apply($$0, emx::new)
   );

   public epk a() {
      return this.b;
   }

   public eiw b() {
      return this.c;
   }

   public buh c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
