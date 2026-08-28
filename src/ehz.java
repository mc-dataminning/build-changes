import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehz(ekl b, edz c, brp d, int e) implements eic {
   public static final Codec<ehz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekl.a.fieldOf("state_provider").forGetter(ehz::a),
               edz.b.fieldOf("target").forGetter(ehz::b),
               brp.b(0, 8).fieldOf("radius").forGetter(ehz::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ehz::d)
            )
            .apply($$0, ehz::new)
   );

   public ekl a() {
      return this.b;
   }

   public edz b() {
      return this.c;
   }

   public brp c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
