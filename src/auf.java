import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record auf(xa c, int d, Optional<azg<Integer>> e) {
   public static final Codec<auf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xc.a.fieldOf("description").forGetter(auf::a),
               Codec.INT.fieldOf("pack_format").forGetter(auf::b),
               azg.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(auf::c)
            )
            .apply($$0, auf::new)
   );
   public static final aue<auf> b = new aue<>("pack", a);

   public xa a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azg<Integer>> c() {
      return this.e;
   }
}
