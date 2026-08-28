import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record aua(wv c, int d, Optional<azc<Integer>> e) {
   public static final Codec<aua> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               wx.a.fieldOf("description").forGetter(aua::a),
               Codec.INT.fieldOf("pack_format").forGetter(aua::b),
               azc.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(aua::c)
            )
            .apply($$0, aua::new)
   );
   public static final atz<aua> b = new atz<>("pack", a);

   public wv a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<azc<Integer>> c() {
      return this.e;
   }
}
