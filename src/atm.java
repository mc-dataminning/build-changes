import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atm(xl c, int d, Optional<aym<Integer>> e) {
   public static final Codec<atm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xn.a.fieldOf("description").forGetter(atm::a),
               Codec.INT.fieldOf("pack_format").forGetter(atm::b),
               aym.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atm::c)
            )
            .apply($$0, atm::new)
   );
   public static final atl<atm> b = atl.a("pack", a);

   public xl a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<aym<Integer>> c() {
      return this.e;
   }
}
