import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dt extends dr<dt.a> {
   @Override
   public Codec<dt.a> a() {
      return dt.a.a;
   }

   public void a(arg $$0, dsc $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bf> b, Optional<ji<dez>> c, Optional<dx> d) implements dr.a {
      public static final Codec<dt.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bu.b.optionalFieldOf("player").forGetter(dt.a::a),
                     lp.e.r().optionalFieldOf("block").forGetter(dt.a::b),
                     dx.a.optionalFieldOf("state").forGetter(dt.a::c)
                  )
                  .apply($$0, dt.a::new)
         )
         .validate(dt.a::a);

      private static DataResult<dt.a> a(dt.a $$0) {
         return $$0.c
            .<DataResult<dt.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dez)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<dt.a> a(dez $$0) {
         return am.K.a(new dt.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
      }

      public boolean a(dsc $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bf> a() {
         return this.b;
      }

      public Optional<ji<dez>> b() {
         return this.c;
      }

      public Optional<dx> c() {
         return this.d;
      }
   }
}
