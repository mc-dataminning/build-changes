import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bt extends dz<bt.a> {
   @Override
   public Codec<bt.a> a() {
      return bt.a.a;
   }

   public void a(are $$0, dxq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<jr<dke>> c, Optional<ef> d) implements dz.a {
      public static final Codec<bt.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bx.b.optionalFieldOf("player").forGetter(bt.a::a),
                     mb.e.r().optionalFieldOf("block").forGetter(bt.a::b),
                     ef.a.optionalFieldOf("state").forGetter(bt.a::c)
                  )
                  .apply($$0, bt.a::new)
         )
         .validate(bt.a::a);

      private static DataResult<bt.a> a(bt.a $$0) {
         return $$0.c
            .<DataResult<bt.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dke)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static aq<bt.a> a(dke $$0) {
         return ap.e.a(new bt.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(dxq $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<jr<dke>> b() {
         return this.c;
      }

      public Optional<ef> c() {
         return this.d;
      }
   }
}
