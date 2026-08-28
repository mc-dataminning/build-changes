import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aul(xk c, int d, Optional<azm<Integer>> e) {
   public static final Codec<aul> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xm.a.fieldOf("description").forGetter(aul::a),
               Codec.INT.fieldOf("pack_format").forGetter(aul::b),
               azm.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aul::c)
            )
            .apply($$0, aul::new)
   );
   public static final auk<aul> b = auk.a("pack", a);

   public xk a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azm<Integer>> c() {
      return this.e;
   }
}
