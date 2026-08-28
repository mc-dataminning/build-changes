import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dl extends dj<dl.a> {
   @Override
   public Codec<dl.a> a() {
      return dl.a.a;
   }

   public void a(arr $$0, dzz $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bi> b, Optional<je<dma>> c, Optional<dq> d) implements dj.a {
      public static final Codec<dl.a> a = RecordCodecBuilder.create(
            $$0 -> $$0.group(
                     bx.b.optionalFieldOf("player").forGetter(dl.a::a),
                     mf.e.r().optionalFieldOf("block").forGetter(dl.a::b),
                     dq.a.optionalFieldOf("state").forGetter(dl.a::c)
                  )
                  .apply($$0, dl.a::new)
         )
         .validate(dl.a::a);

      private static DataResult<dl.a> a(dl.a $$0) {
         return $$0.c
            .<DataResult<dl.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dma)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static aq<dl.a> a(dma $$0) {
         return ap.K.a(new dl.a(Optional.empty(), Optional.of($$0.p()), Optional.empty()));
      }

      public boolean a(dzz $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bi> a() {
         return this.b;
      }

      public Optional<je<dma>> b() {
         return this.c;
      }

      public Optional<dq> c() {
         return this.d;
      }
   }
}
