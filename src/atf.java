import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record atf(wz c, int d, Optional<ayg<Integer>> e) {
   public static final Codec<atf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               xb.a.fieldOf("description").forGetter(atf::a),
               Codec.INT.fieldOf("pack_format").forGetter(atf::b),
               ayg.a(Codec.INT).lenientOptionalFieldOf("supported_formats").forGetter(atf::c)
            )
            .apply($$0, atf::new)
   );
   public static final ate<atf> b = ate.a("pack", a);

   public wz a() {
      return this.c;
   }

   public int b() {
      return this.d;
   }

   public Optional<ayg<Integer>> c() {
      return this.e;
   }
}
