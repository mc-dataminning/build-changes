import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record apj(vf c, int d, Optional<auf<Integer>> e) {
   public static final Codec<apj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vh.a.fieldOf("description").forGetter(apj::a),
               Codec.INT.fieldOf("pack_format").forGetter(apj::b),
               auf.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(apj::c)
            )
            .apply($$0, apj::new)
   );
   public static final api<apj> b = api.a("pack", a);

   public vf a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<auf<Integer>> c() {
      return this.e;
   }
}
