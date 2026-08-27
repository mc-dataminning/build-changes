import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dh extends df<dh.a> {
   @Override
   public Codec<dh.a> a() {
      return dh.a.a;
   }

   public void a(aqn $$0, drb $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ix<ddy>> c, Optional<dl> d) implements df.a {
      public static final Codec<dh.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     br.b.optionalFieldOf("player").forGetter(dh.a::a),
                     le.e.r().optionalFieldOf("block").forGetter(dh.a::b),
                     dl.a.optionalFieldOf("state").forGetter(dh.a::c)
                  )
                  .apply($$0, dh.a::new)
         )
         .validate(dh.a::a);

      private static DataResult<dh.a> a(dh.a $$0) {
         return $$0.c
            .<DataResult<dh.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((ddy)$$1.a()).m())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<dh.a> a(ddy $$0) {
         return am.K.a(new dh.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
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
