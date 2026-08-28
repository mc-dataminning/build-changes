import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bv extends dl<bv.a> {
   @Override
   public Codec<bv.a> a() {
      return bv.a.a;
   }

   public void a(asc $$0, ebq $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bj> b, Optional<jg<dno>> c, Optional<ds> d) implements dl.a {
      public static final Codec<bv.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bz.b.optionalFieldOf("player").forGetter(bv.a::a),
                     mh.e.r().optionalFieldOf("block").forGetter(bv.a::b),
                     ds.a.optionalFieldOf("state").forGetter(bv.a::c)
                  )
                  .apply($$0, bv.a::new)
         )
         .validate(bv.a::a);

      private static DataResult<bv.a> a(bv.a $$0) {
         return $$0.c
            .<DataResult<bv.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dno)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ar<bv.a> a(dno $$0) {
         return aq.e.a(new bv.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(ebq $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bj> a() {
         return this.b;
      }

      public Optional<jg<dno>> b() {
         return this.c;
      }

      public Optional<ds> c() {
         return this.d;
      }
   }
}
