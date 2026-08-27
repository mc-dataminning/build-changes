import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record enu(il<dac> b, Optional<db> c) implements env {
   public static final Codec<enu> a = awe.b(
      RecordCodecBuilder.create($$0 -> $$0.group(ki.e.r().fieldOf("block").forGetter(enu::c), awe.a(db.a, "properties").forGetter(enu::d)).apply($$0, enu::new)),
      enu::a
   );

   private static DataResult<enu> a(enu $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public enw b() {
      return enx.j;
   }

   @Override
   public Set<ene<?>> a() {
      return Set.of(enh.g);
   }

   public boolean a(ekw $$0) {
      dnb $$1 = $$0.c(enh.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static enu.a a(dac $$0) {
      return new enu.a($$0);
   }

   public il<dac> c() {
      return this.b;
   }

   public Optional<db> d() {
      return this.c;
   }

   public static class a implements env.a {
      private final il<dac> a;
      private Optional<db> b = Optional.empty();

      public a(dac $$0) {
         this.a = $$0.r();
      }

      public enu.a a(db.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public env build() {
         return new enu(this.a, this.b);
      }
   }
}
