import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bq extends dr<bq.a> {
   @Override
   public Codec<bq.a> a() {
      return bq.a.a;
   }

   public void a(arg $$0, dsd $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<ji<dfa>> c, Optional<dx> d) implements dr.a {
      public static final Codec<bq.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bu.b.optionalFieldOf("player").forGetter(bq.a::a),
                     lp.e.r().optionalFieldOf("block").forGetter(bq.a::b),
                     dx.a.optionalFieldOf("state").forGetter(bq.a::c)
                  )
                  .apply($$0, bq.a::new)
         )
         .validate(bq.a::a);

      private static DataResult<bq.a> a(bq.a $$0) {
         return $$0.c
            .<DataResult<bq.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dfa)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<bq.a> a(dfa $$0) {
         return am.e.a(new bq.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
      }

      public boolean a(dsd $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<ji<dfa>> b() {
         return this.c;
      }

      public Optional<dx> c() {
         return this.d;
      }
   }
}
