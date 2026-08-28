import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public record cr(Optional<be<czv, cq.a>> c, dj.d d) implements dz<czw> {
   public static final Codec<cr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(be.a(cq.a.a).optionalFieldOf("explosions").forGetter(cr::b), dj.d.d.optionalFieldOf("flight_duration", dj.d.c).forGetter(cr::c))
            .apply($$0, cr::new)
   );

   @Override
   public kt<czw> a() {
      return ku.af;
   }

   public boolean a(cxg $$0, czw $$1) {
      return this.c.isPresent() && !this.c.get().a($$1.b()) ? false : this.d.d($$1.a());
   }

   public Optional<be<czv, cq.a>> b() {
      return this.c;
   }

   public dj.d c() {
      return this.d;
   }
}
