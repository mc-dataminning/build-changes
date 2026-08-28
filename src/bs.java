import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bs extends dy<bs.a> {
   @Override
   public Codec<bs.a> a() {
      return bs.a.a;
   }

   public void a(arr $$0, dvo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<jq<dij>> c, Optional<ee> d) implements dy.a {
      public static final Codec<bs.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bw.b.optionalFieldOf("player").forGetter(bs.a::a),
                     lz.e.r().optionalFieldOf("block").forGetter(bs.a::b),
                     ee.a.optionalFieldOf("state").forGetter(bs.a::c)
                  )
                  .apply($$0, bs.a::new)
         )
         .validate(bs.a::a);

      private static DataResult<bs.a> a(bs.a $$0) {
         return $$0.c
            .<DataResult<bs.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dij)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ap<bs.a> a(dij $$0) {
         return ao.e.a(new bs.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(dvo $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<jq<dij>> b() {
         return this.c;
      }

      public Optional<ee> c() {
         return this.d;
      }
   }
}
