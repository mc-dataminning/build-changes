import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dy extends dw<dy.a> {
   @Override
   public Codec<dy.a> a() {
      return dy.a.a;
   }

   public void a(ark $$0, dus $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<jo<dhm>> c, Optional<ec> d) implements dw.a {
      public static final Codec<dy.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bv.b.optionalFieldOf("player").forGetter(dy.a::a),
                     lv.e.r().optionalFieldOf("block").forGetter(dy.a::b),
                     ec.a.optionalFieldOf("state").forGetter(dy.a::c)
                  )
                  .apply($$0, dy.a::new)
         )
         .validate(dy.a::a);

      private static DataResult<dy.a> a(dy.a $$0) {
         return $$0.c
            .<DataResult<dy.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dhm)$$1.a()).k())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ao<dy.a> a(dhm $$0) {
         return an.K.a(new dy.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dus $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<jo<dhm>> b() {
         return this.c;
      }

      public Optional<ec> c() {
         return this.d;
      }
   }
}
