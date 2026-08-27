import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bn extends cx<bn.a> {
   @Override
   public Codec<bn.a> a() {
      return bn.a.a;
   }

   public void a(aox $$0, dlj $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bc> b, Optional<ij<cys>> c, Optional<db> d) implements cx.a {
      public static final Codec<bn.a> a = avq.a(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(avq.a(br.b, "player").forGetter(bn.a::a), avq.a(kf.e.r(), "block").forGetter(bn.a::b), avq.a(db.a, "state").forGetter(bn.a::c))
                  .apply($$0, bn.a::new)
         ),
         bn.a::a
      );

      private static DataResult<bn.a> a(bn.a $$0) {
         return $$0.c
            .<DataResult<bn.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((cys)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static an<bn.a> a(cys $$0) {
         return am.e.a(new bn.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dlj $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bc> a() {
         return this.b;
      }

      public Optional<ij<cys>> b() {
         return this.c;
      }

      public Optional<db> c() {
         return this.d;
      }
   }
}
