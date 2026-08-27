import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aoj(ur c, int d, Optional<ate<Integer>> e) {
   public static final Codec<aoj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ut.a.fieldOf("description").forGetter(aoj::a),
               Codec.INT.fieldOf("pack_format").forGetter(aoj::b),
               ate.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(aoj::c)
            )
            .apply($$0, aoj::new)
   );
   public static final aoi<aoj> b = aoi.a("pack", a);

   public ur a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ate<Integer>> c() {
      return this.e;
   }
}
