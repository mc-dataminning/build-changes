import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class cw extends cv<cw.a> {
   @Override
   public Codec<cw.a> a() {
      return cw.a.a;
   }

   public void a(amq $$0, dip $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bb> b, Optional<ie<cvz>> c, Optional<cz> d) implements cv.a {
      public static final Codec<cw.a> a = atg.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(atg.a(bp.b, "player").forGetter(cw.a::a), atg.a(kb.e.r(), "block").forGetter(cw.a::b), atg.a(cz.a, "state").forGetter(cw.a::c))
                  .apply($$0, cw.a::new)
         ),
         cw.a::a
      );

      private static DataResult<cw.a> a(cw.a $$0) {
         return $$0.c
            .<DataResult<cw.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((cvz)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<cw.a> a(cvz $$0) {
         return am.K.a(new cw.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dip $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bb> a() {
         return this.b;
      }

      public Optional<ie<cvz>> b() {
         return this.c;
      }

      public Optional<cz> c() {
         return this.d;
      }
   }
}
