import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aou(vb c, int d, Optional<atq<Integer>> e) {
   public static final Codec<aou> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vd.a.fieldOf("description").forGetter(aou::a),
               Codec.INT.fieldOf("pack_format").forGetter(aou::b),
               atq.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(aou::c)
            )
            .apply($$0, aou::new)
   );
   public static final aot<aou> b = aot.a("pack", a);

   public vb a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<atq<Integer>> c() {
      return this.e;
   }
}
