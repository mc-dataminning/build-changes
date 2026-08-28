import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atu(xd c, int d, Optional<ayv<Integer>> e) {
   public static final Codec<atu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xf.a.fieldOf("description").forGetter(atu::a),
               Codec.INT.fieldOf("pack_format").forGetter(atu::b),
               ayv.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atu::c)
            )
            .apply($$0, atu::new)
   );
   public static final att<atu> b = att.a("pack", a);

   public xd a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayv<Integer>> c() {
      return this.e;
   }
}
