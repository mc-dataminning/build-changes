import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ehy(ekk b, edy c, bro d, int e) implements eib {
   public static final Codec<ehy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ekk.a.fieldOf("state_provider").forGetter(ehy::a),
               edy.b.fieldOf("target").forGetter(ehy::b),
               bro.b(0, 8).fieldOf("radius").forGetter(ehy::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ehy::d)
            )
            .apply($$0, ehy::new)
   );

   public ekk a() {
      return this.b;
   }

   public edy b() {
      return this.c;
   }

   public bro c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
