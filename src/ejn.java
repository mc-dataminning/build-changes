import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejn(ih<cwj> b, Optional<cz> c) implements ejo {
   public static final Codec<ejn> a = atq.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kd.e.r().fieldOf("block").forGetter(ejn::c), atq.a(cz.a, "properties").forGetter(ejn::d)).apply($$0, ejn::new)),
      ejn::a
   );

   private static DataResult<ejn> a(ejn $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ejp b() {
      return ejq.j;
   }

   @Override
   public Set<eix<?>> a() {
      return Set.of(eja.g);
   }

   public boolean a(egp $$0) {
      dja $$1 = $$0.c(eja.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ejn.a a(cwj $$0) {
      return new ejn.a($$0);
   }

   public ih<cwj> c() {
      return this.b;
   }

   public Optional<cz> d() {
      return this.c;
   }

   public static class a implements ejo.a {
      private final ih<cwj> a;
      private Optional<cz> b = Optional.empty();

      public a(cwj $$0) {
         this.a = $$0.r();
      }

      public ejn.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ejo build() {
         return new ejn(this.a, this.b);
      }
   }
}
