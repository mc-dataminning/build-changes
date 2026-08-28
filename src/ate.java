import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ate(wy c, int d, Optional<ayf<Integer>> e) {
   public static final Codec<ate> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xa.a.fieldOf("description").forGetter(ate::a),
               Codec.INT.fieldOf("pack_format").forGetter(ate::b),
               ayf.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(ate::c)
            )
            .apply($$0, ate::new)
   );
   public static final atd<ate> b = atd.a("pack", a);

   public wy a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayf<Integer>> c() {
      return this.e;
   }
}
