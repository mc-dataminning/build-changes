import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class eb extends dz<eb.a> {
   @Override
   public Codec<eb.a> a() {
      return eb.a.a;
   }

   public void a(aro $$0, dym $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<js<dku>> c, Optional<ef> d) implements dz.a {
      public static final Codec<eb.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bx.b.optionalFieldOf("player").forGetter(eb.a::a),
                     md.e.r().optionalFieldOf("block").forGetter(eb.a::b),
                     ef.a.optionalFieldOf("state").forGetter(eb.a::c)
                  )
                  .apply($$0, eb.a::new)
         )
         .validate(eb.a::a);

      private static DataResult<eb.a> a(eb.a $$0) {
         return $$0.c
            .<DataResult<eb.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dku)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static aq<eb.a> a(dku $$0) {
         return ap.K.a(new eb.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(dym $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<js<dku>> b() {
         return this.c;
      }

      public Optional<ef> c() {
         return this.d;
      }
   }
}
