import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class ea extends dy<ea.a> {
   @Override
   public Codec<ea.a> a() {
      return ea.a.a;
   }

   public void a(ary $$0, dxo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bh> b, Optional<jq<dkd>> c, Optional<ee> d) implements dy.a {
      public static final Codec<ea.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bw.b.optionalFieldOf("player").forGetter(ea.a::a),
                     ma.e.r().optionalFieldOf("block").forGetter(ea.a::b),
                     ee.a.optionalFieldOf("state").forGetter(ea.a::c)
                  )
                  .apply($$0, ea.a::new)
         )
         .validate(ea.a::a);

      private static DataResult<ea.a> a(ea.a $$0) {
         return $$0.c
            .<DataResult<ea.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dkd)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ap<ea.a> a(dkd $$0) {
         return ao.K.a(new ea.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(dxo $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bh> a() {
         return this.b;
      }

      public Optional<jq<dkd>> b() {
         return this.c;
      }

      public Optional<ee> c() {
         return this.d;
      }
   }
}
