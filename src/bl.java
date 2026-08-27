import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends cv<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(anf $$0, djp $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ih<cwy>> c, Optional<cz> d) implements cv.a {
      public static final Codec<bl.a> a = atx.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(atx.a(bp.b, "player").forGetter(bl.a::a), atx.a(kd.e.r(), "block").forGetter(bl.a::b), atx.a(cz.a, "state").forGetter(bl.a::c))
                  .apply($$0, bl.a::new)
         ),
         bl.a::a
      );

      private static DataResult<bl.a> a(bl.a $$0) {
         return $$0.c
            .<DataResult<bl.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((cwy)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<bl.a> a(cwy $$0) {
         return am.e.a(new bl.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(djp $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ih<cwy>> b() {
         return this.c;
      }

      public Optional<cz> c() {
         return this.d;
      }
   }
}
