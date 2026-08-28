import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bu extends dk<bu.a> {
   @Override
   public Codec<bu.a> a() {
      return bu.a.a;
   }

   public void a(arr $$0, eat $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<jf<dmr>> c, Optional<dr> d) implements dk.a {
      public static final Codec<bu.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     by.b.optionalFieldOf("player").forGetter(bu.a::a),
                     mg.e.r().optionalFieldOf("block").forGetter(bu.a::b),
                     dr.a.optionalFieldOf("state").forGetter(bu.a::c)
                  )
                  .apply($$0, bu.a::new)
         )
         .validate(bu.a::a);

      private static DataResult<bu.a> a(bu.a $$0) {
         return $$0.c
            .<DataResult<bu.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dmr)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ar<bu.a> a(dmr $$0) {
         return aq.e.a(new bu.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(eat $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<jf<dmr>> b() {
         return this.c;
      }

      public Optional<dr> c() {
         return this.d;
      }
   }
}
