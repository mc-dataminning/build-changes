import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record efj(hg<csq> b, Optional<da> c) implements efk {
   public static final Codec<efj> a = arb.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jd.f.r().fieldOf("block").forGetter(efj::c), arb.a(da.a, "properties").forGetter(efj::d)).apply($$0, efj::new)),
      efj::a
   );

   private static DataResult<efj> a(efj $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public efl b() {
      return efm.j;
   }

   @Override
   public Set<eet<?>> a() {
      return Set.of(eew.g);
   }

   public boolean a(ecl $$0) {
      dfe $$1 = $$0.c(eew.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static efj.a a(csq $$0) {
      return new efj.a($$0);
   }

   public hg<csq> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements efk.a {
      private final hg<csq> a;
      private Optional<da> b = Optional.empty();

      public a(csq $$0) {
         this.a = $$0.q();
      }

      public efj.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public efk build() {
         return new efj(this.a, this.b);
      }
   }
}
