import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cw extends cv<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(ana $$0, dja $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ih<cwj>> c, Optional<cz> d) implements cv.a {
      public static final Codec<cw.a> a = atq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(atq.a(bp.b, "player").forGetter(cw.a::a), atq.a(kd.e.r(), "block").forGetter(cw.a::b), atq.a(cz.a, "state").forGetter(cw.a::c))
                  .apply($$0, cw.a::new)
         ),
         cw.a::a
      );

      private static DataResult<cw.a> a(cw.a $$0) {
         return $$0.c
            .<DataResult<cw.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((cwj)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<cw.a> a(cwj $$0) {
         return am.K.a(new cw.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dja $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ih<cwj>> b() {
         return this.c;
      }

      public Optional<cz> c() {
         return this.d;
      }
   }
}
