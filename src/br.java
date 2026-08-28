import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class br extends dv<br.a> {
   @Override
   public Codec<br.a> a() {
      return br.a.a;
   }

   public void a(ari $$0, duo $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bg> b, Optional<jn<dhj>> c, Optional<eb> d) implements dv.a {
      public static final Codec<br.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bv.b.optionalFieldOf("player").forGetter(br.a::a),
                     lu.e.r().optionalFieldOf("block").forGetter(br.a::b),
                     eb.a.optionalFieldOf("state").forGetter(br.a::c)
                  )
                  .apply($$0, br.a::new)
         )
         .validate(br.a::a);

      private static DataResult<br.a> a(br.a $$0) {
         return $$0.c
            .<DataResult<br.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dhj)$$1.a()).n())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ao<br.a> a(dhj $$0) {
         return an.e.a(new br.a(Optional.empty(), Optional.of($$0.s()), Optional.empty()));
      }

      public boolean a(duo $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bg> a() {
         return this.b;
      }

      public Optional<jn<dhj>> b() {
         return this.c;
      }

      public Optional<eb> c() {
         return this.d;
      }
   }
}
