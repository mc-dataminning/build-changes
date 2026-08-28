import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dm extends dk<dm.a> {
   @Override
   public Codec<dm.a> a() {
      return dm.a.a;
   }

   public void a(arr $$0, eao $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<jf<dmm>> c, Optional<dr> d) implements dk.a {
      public static final Codec<dm.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     by.b.optionalFieldOf("player").forGetter(dm.a::a),
                     mg.e.r().optionalFieldOf("block").forGetter(dm.a::b),
                     dr.a.optionalFieldOf("state").forGetter(dm.a::c)
                  )
                  .apply($$0, dm.a::new)
         )
         .validate(dm.a::a);

      private static DataResult<dm.a> a(dm.a $$0) {
         return $$0.c
            .<DataResult<dm.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dmm)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ar<dm.a> a(dmm $$0) {
         return aq.K.a(new dm.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(eao $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<jf<dmm>> b() {
         return this.c;
      }

      public Optional<dr> c() {
         return this.d;
      }
   }
}
