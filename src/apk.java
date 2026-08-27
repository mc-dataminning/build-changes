import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record apk(vf c, int d, Optional<aug<Integer>> e) {
   public static final Codec<apk> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               vh.a.fieldOf("description").forGetter(apk::a),
               Codec.INT.fieldOf("pack_format").forGetter(apk::b),
               aug.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(apk::c)
            )
            .apply($$0, apk::new)
   );
   public static final apj<apk> b = apj.a("pack", a);

   public vf a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<aug<Integer>> c() {
      return this.e;
   }
}
