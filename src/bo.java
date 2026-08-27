import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public class bo extends dh<bo.a> {
   @Override
   public Codec<bo.a> a() {
      return bo.a.a;
   }

   public void a(aqu $$0, dtc $$1) {
      this.a($$0, $$1x -> $$1x.a($$1));
   }

   public static record a(Optional<bd> b, Optional<ja<dfc>> c, Optional<dn> d) implements dh.a {
      public static final Codec<bo.a> a = axu.b(
         RecordCodecBuilder.create(
            $$0 -> $$0.group(axu.a(bs.b, "player").forGetter(bo.a::a), axu.a(lh.e.r(), "block").forGetter(bo.a::b), axu.a(dn.a, "state").forGetter(bo.a::c))
                  .apply($$0, bo.a::new)
         ),
         bo.a::a
      );

      private static DataResult<bo.a> a(bo.a $$0) {
         return $$0.c
            .<DataResult<bo.a>>flatMap(
               $$1 -> $$0.d.<String>flatMap($$1x -> $$1x.a(((dfc)$$1.a()).l())).map($$1x -> DataResult.error(() -> "Block" + $$1 + " has no property " + $$1x))
            )
            .orElseGet(() -> DataResult.success($$0));
      }

      public static ao<bo.a> a(dfc $$0) {
         return an.e.a(new bo.a(Optional.empty(), Optional.of($$0.r()), Optional.empty()));
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
