import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record dwv(dzh b, dsx c, blq d, int e) implements dwy {
   public static final Codec<dwv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               dzh.a.fieldOf("state_provider").forGetter(dwv::a),
               dsx.b.fieldOf("target").forGetter(dwv::b),
               blq.b(0, 8).fieldOf("radius").forGetter(dwv::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(dwv::d)
            )
            .apply($$0, dwv::new)
   );

   public dzh a() {
      return this.b;
   }

   public dsx b() {
      return this.c;
   }

   public blq c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
