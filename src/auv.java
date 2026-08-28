import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record auv(xv c, int d, Optional<azw<Integer>> e) {
   public static final Codec<auv> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xx.a.fieldOf("description").forGetter(auv::a),
               Codec.INT.fieldOf("pack_format").forGetter(auv::b),
               azw.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(auv::c)
            )
            .apply($$0, auv::new)
   );
   public static final auu<auv> b = auu.a("pack", a);

   public xv a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azw<Integer>> c() {
      return this.e;
   }
}
