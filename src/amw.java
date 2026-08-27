import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record amw(tm c, int d, Optional<arq<Integer>> e) {
   public static final Codec<amw> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               arg.b.fieldOf("description").forGetter(amw::a),
               Codec.INT.fieldOf("pack_format").forGetter(amw::b),
               arq.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(amw::c)
            )
            .apply($$0, amw::new)
   );
   public static final amv<amw> b = amv.a("pack", a);

   public tm a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<arq<Integer>> c() {
      return this.e;
   }
}
