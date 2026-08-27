import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efq(hg<csx> b, Optional<da> c) implements efr {
   public static final Codec<efq> a = arh.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jd.f.r().fieldOf("block").forGetter(efq::c), arh.a(da.a, "properties").forGetter(efq::d)).apply($$0, efq::new)),
      efq::a
   );

   private static DataResult<efq> a(efq $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public efs b() {
      return eft.j;
   }

   @Override
   public Set<efa<?>> a() {
      return Set.of(efd.g);
   }

   public boolean a(ecs $$0) {
      dfl $$1 = $$0.c(efd.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static efq.a a(csx $$0) {
      return new efq.a($$0);
   }

   public hg<csx> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements efr.a {
      private final hg<csx> a;
      private Optional<da> b = Optional.empty();

      public a(csx $$0) {
         this.a = $$0.q();
      }

      public efq.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public efr build() {
         return new efq(this.a, this.b);
      }
   }
}
