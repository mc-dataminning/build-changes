import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bl extends cv<bl.a> {
   @Override
   public Codec<bl.a> a() {
      return bl.a.a;
   }

   public void a(ane $$0, djh $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ih<cwq>> c, Optional<cz> d) implements cv.a {
      public static final Codec<bl.a> a = atw.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(atw.a(bp.b, "player").forGetter(bl.a::a), atw.a(kd.e.r(), "block").forGetter(bl.a::b), atw.a(cz.a, "state").forGetter(bl.a::c))
                  .apply($$0, bl.a::new)
         ),
         bl.a::a
      );

      private static DataResult<bl.a> a(bl.a $$0) {
         return $$0.c
            .<DataResult<bl.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((cwq)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<bl.a> a(cwq $$0) {
         return am.e.a(new bl.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(djh $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ih<cwq>> b() {
         return this.c;
      }

      public Optional<cz> c() {
         return this.d;
      }
   }
}
