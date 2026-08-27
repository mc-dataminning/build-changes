import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejt(ih<cwp> b, Optional<cz> c) implements eju {
   public static final Codec<ejt> a = atv.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kd.e.r().fieldOf("block").forGetter(ejt::c), atv.a(cz.a, "properties").forGetter(ejt::d)).apply($$0, ejt::new)),
      ejt::a
   );

   private static DataResult<ejt> a(ejt $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ejv b() {
      return ejw.j;
   }

   @Override
   public Set<ejd<?>> a() {
      return Set.of(ejg.g);
   }

   public boolean a(egv $$0) {
      djg $$1 = $$0.c(ejg.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ejt.a a(cwp $$0) {
      return new ejt.a($$0);
   }

   public ih<cwp> c() {
      return this.b;
   }

   public Optional<cz> d() {
      return this.c;
   }

   public static class a implements eju.a {
      private final ih<cwp> a;
      private Optional<cz> b = Optional.empty();

      public a(cwp $$0) {
         this.a = $$0.r();
      }

      public ejt.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public eju build() {
         return new ejt(this.a, this.b);
      }
   }
}
