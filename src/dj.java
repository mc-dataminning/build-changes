import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class dj extends dh<dj.a> {
   @Override
   public Codec<dj.a> a() {
      return dj.a.a;
   }

   public void a(aqu $$0, dtc $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ja<dfc>> c, Optional<dn> d) implements dh.a {
      public static final Codec<dj.a> a = axu.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(dj.a::a), axu.a(lh.e.r(), "block").forGetter(dj.a::b), axu.a(dn.a, "state").forGetter(dj.a::c))
                  .apply($$0, dj.a::new)
         ),
         dj.a::a
      );

      private static DataResult<dj.a> a(dj.a $$0) {
         return $$0.c
            .<DataResult<dj.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dfc)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ao<dj.a> a(dfc $$0) {
         return an.K.a(new dj.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
      }

      public boolean a(dtc $$0) {
         return this.c.isPresent() && !$$0.a(this.c.get()) ? false : !this.d.isPresent() || this.d.get().a($$0);
      }

      @Override
      public Optional<bd> a() {
         return this.b;
      }

      public Optional<ja<dfc>> b() {
         return this.c;
      }

      public Optional<dn> c() {
         return this.d;
      }
   }
}
