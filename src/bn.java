import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends df<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(aqn $$0, drb $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ix<ddy>> c, Optional<dl> d) implements df.a {
      public static final Codec<bn.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     br.b.optionalFieldOf("player").forGetter(bn.a::a),
                     le.e.r().optionalFieldOf("block").forGetter(bn.a::b),
                     dl.a.optionalFieldOf("state").forGetter(bn.a::c)
                  )
                  .apply($$0, bn.a::new)
         )
         .validate(bn.a::a);

      private static DataResult<bn.a> a(bn.a $$0) {
         return $$0.c
            .<DataResult<bn.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((ddy)$$1.a()).m())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<bn.a> a(ddy $$0) {
         return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(drb $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ix<ddy>> b() {
         return this.c;
      }

      public Optional<dl> c() {
         return this.d;
      }
   }
}
