import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dx extends dv<dx.a> {
   @Override
   public Codec<dx.a> a() {
      return dx.a.a;
   }

   public void a(aqu $$0, dta $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<jm<dfw>> c, Optional<eb> d) implements dv.a {
      public static final Codec<dx.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bv.b.optionalFieldOf("player").forGetter(dx.a::a),
                     lt.e.s().optionalFieldOf("block").forGetter(dx.a::b),
                     eb.a.optionalFieldOf("state").forGetter(dx.a::c)
                  )
                  .apply($$0, dx.a::new)
         )
         .validate(dx.a::a);

      private static DataResult<dx.a> a(dx.a $$0) {
         return $$0.c
            .<DataResult<dx.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dfw)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ao<dx.a> a(dfw $$0) {
         return an.K.a(new dx.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
      }

      public boolean a(dta $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<jm<dfw>> b() {
         return this.c;
      }

      public Optional<eb> c() {
         return this.d;
      }
   }
}
