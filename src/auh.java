import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record auh(xc c, int d, Optional<azi<Integer>> e) {
   public static final Codec<auh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xe.a.fieldOf("description").forGetter(auh::a),
               Codec.INT.fieldOf("pack_format").forGetter(auh::b),
               azi.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(auh::c)
            )
            .apply($$0, auh::new)
   );
   public static final aug<auh> b = new aug<>("pack", a);

   public xc a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azi<Integer>> c() {
      return this.e;
   }
}
