import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erp(iw<dde> b, Optional<dk> c) implements erq {
   public static final Codec<erp> a = axh.b(
      RecordCodecBuilder.create($$0 -> $$0.group(ld.e.r().fieldOf("block").forGetter(erp::c), axh.a(dk.a, "properties").forGetter(erp::d)).apply($$0, erp::new)),
      erp::a
   );

   private static DataResult<erp> a(erp $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public err b() {
      return ers.k;
   }

   @Override
   public Set<eqz<?>> a() {
      return Set.of(erc.g);
   }

   public boolean a(eol $$0) {
      dqh $$1 = $$0.c(erc.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static erp.a a(dde $$0) {
      return new erp.a($$0);
   }

   public iw<dde> c() {
      return this.b;
   }

   public Optional<dk> d() {
      return this.c;
   }

   public static class a implements erq.a {
      private final iw<dde> a;
      private Optional<dk> b = Optional.empty();

      public a(dde $$0) {
         this.a = $$0.r();
      }

      public erp.a a(dk.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public erq build() {
         return new erp(this.a, this.b);
      }
   }
}
