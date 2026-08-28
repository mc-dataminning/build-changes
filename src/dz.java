import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dz extends dx<dz.a> {
   @Override
   public Codec<dz.a> a() {
      return dz.a.a;
   }

   public void a(arn $$0, dvd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<jp<dhy>> c, Optional<ed> d) implements dx.a {
      public static final Codec<dz.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bv.b.optionalFieldOf("player").forGetter(dz.a::a),
                     lx.e.r().optionalFieldOf("block").forGetter(dz.a::b),
                     ed.a.optionalFieldOf("state").forGetter(dz.a::c)
                  )
                  .apply($$0, dz.a::new)
         )
         .validate(dz.a::a);

      private static DataResult<dz.a> a(dz.a $$0) {
         return $$0.c
            .<DataResult<dz.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dhy)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ao<dz.a> a(dhy $$0) {
         return an.K.a(new dz.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(dvd $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<jp<dhy>> b() {
         return this.c;
      }

      public Optional<ed> c() {
         return this.d;
      }
   }
}
