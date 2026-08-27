import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record ate(xe c, int d, Optional<aye<Integer>> e) {
   public static final Codec<ate> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xg.a.fieldOf("description").forGetter(ate::a),
               Codec.INT.fieldOf("pack_format").forGetter(ate::b),
               aye.a(Codec.INT).optionalFieldOf("supported_formats").forGetter(ate::c)
            )
            .apply($$0, ate::new)
   );
   public static final atd<ate> b = atd.a("pack", a);

   public xe a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<aye<Integer>> c() {
      return this.e;
   }
}
