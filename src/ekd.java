import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ekd(ih<cwy> b, Optional<cz> c) implements eke {
   public static final Codec<ekd> a = atx.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kd.e.r().fieldOf("block").forGetter(ekd::c), atx.a(cz.a, "properties").forGetter(ekd::d)).apply($$0, ekd::new)),
      ekd::a
   );

   private static DataResult<ekd> a(ekd $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ekf b() {
      return ekg.j;
   }

   @Override
   public Set<ejn<?>> a() {
      return Set.of(ejq.g);
   }

   public boolean a(ehf $$0) {
      djp $$1 = $$0.c(ejq.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ekd.a a(cwy $$0) {
      return new ekd.a($$0);
   }

   public ih<cwy> c() {
      return this.b;
   }

   public Optional<cz> d() {
      return this.c;
   }

   public static class a implements eke.a {
      private final ih<cwy> a;
      private Optional<cz> b = Optional.empty();

      public a(cwy $$0) {
         this.a = $$0.r();
      }

      public ekd.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eke build() {
         return new ekd(this.a, this.b);
      }
   }
}
