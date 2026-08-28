import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class du extends ds<du.a> {
   @Override
   public Codec<du.a> a() {
      return du.a.a;
   }

   public void a(aqn $$0, dsk $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<jj<dfh>> c, Optional<dy> d) implements ds.a {
      public static final Codec<du.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bu.b.optionalFieldOf("player").forGetter(du.a::a),
                     lq.e.s().optionalFieldOf("block").forGetter(du.a::b),
                     dy.a.optionalFieldOf("state").forGetter(du.a::c)
                  )
                  .apply($$0, du.a::new)
         )
         .validate(du.a::a);

      private static DataResult<du.a> a(du.a $$0) {
         return $$0.c
            .<DataResult<du.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dfh)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<du.a> a(dfh $$0) {
         return am.K.a(new du.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
      }

      public boolean a(dsk $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<jj<dfh>> b() {
         return this.c;
      }

      public Optional<dy> c() {
         return this.d;
      }
   }
}
