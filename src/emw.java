import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record emw(il<czf> b, Optional<db> c) implements emx {
   public static final Codec<emw> a = avu.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kh.e.r().fieldOf("block").forGetter(emw::c), avu.a(db.a, "properties").forGetter(emw::d)).apply($$0, emw::new)),
      emw::a
   );

   private static DataResult<emw> a(emw $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public emy b() {
      return emz.j;
   }

   @Override
   public Set<emg<?>> a() {
      return Set.of(emj.g);
   }

   public boolean a(ejy $$0) {
      dme $$1 = $$0.c(emj.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static emw.a a(czf $$0) {
      return new emw.a($$0);
   }

   public il<czf> c() {
      return this.b;
   }

   public Optional<db> d() {
      return this.c;
   }

   public static class a implements emx.a {
      private final il<czf> a;
      private Optional<db> b = Optional.empty();

      public a(czf $$0) {
         this.a = $$0.r();
      }

      public emw.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public emx build() {
         return new emw(this.a, this.b);
      }
   }
}
