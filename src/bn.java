import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends de<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(aqi $$0, dqh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<iw<dde>> c, Optional<dk> d) implements de.a {
      public static final Codec<bn.a> a = axh.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(axh.a(br.b, "player").forGetter(bn.a::a), axh.a(ld.e.r(), "block").forGetter(bn.a::b), axh.a(dk.a, "state").forGetter(bn.a::c))
                  .apply($$0, bn.a::new)
         ),
         bn.a::a
      );

      private static DataResult<bn.a> a(bn.a $$0) {
         return $$0.c
            .<DataResult<bn.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dde)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<bn.a> a(dde $$0) {
         return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dqh $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<iw<dde>> b() {
         return this.c;
      }

      public Optional<dk> c() {
         return this.d;
      }
   }
}
