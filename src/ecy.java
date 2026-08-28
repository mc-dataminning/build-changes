import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ecy(efk b, dza c, bpy d, int e) implements edb {
   public static final Codec<ecy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               efk.a.fieldOf("state_provider").forGetter(ecy::a),
               dza.b.fieldOf("target").forGetter(ecy::b),
               bpy.b(0, 8).fieldOf("radius").forGetter(ecy::c),
               Codec.intRange(0, 4).fieldOf("half_height").forGetter(ecy::d)
            )
            .apply($$0, ecy::new)
   );

   public efk a() {
      return this.b;
   }

   public dza b() {
      return this.c;
   }

   public bpy c() {
      return this.d;
   }

   public int d() {
      return this.e;
   }
}
