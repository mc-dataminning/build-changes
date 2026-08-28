import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record eiw(eli b, eew c, bsn d, int e) implements eiz {
   public static final Codec<eiw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               eli.a.fieldOf("state_provider").forGetter(eiw::a),
               eew.b.fieldOf("target").forGetter(eiw::b),
               bsn.b(0, 8).fieldOf("radius").forGetter(eiw::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(eiw::d)
            )
            .apply($$0, eiw::new)
   );

   public eli a() {
      return this.b;
   }

   public eew b() {
      return this.c;
   }

   public bsn c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
