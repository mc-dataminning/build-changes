import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ehj(ib<cut> b, Optional<da> c) implements ehk {
   public static final Codec<ehj> a = asq.a(
      RecordCodecBuilder.create($$0 -> $$0.group(jy.f.r().fieldOf("block").forGetter(ehj::c), asq.a(da.a, "properties").forGetter(ehj::d)).apply($$0, ehj::new)),
      ehj::a
   );

   private static DataResult<ehj> a(ehj $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public ehl b() {
      return ehm.j;
   }

   @Override
   public Set<egt<?>> a() {
      return Set.of(egw.g);
   }

   public boolean a(eel $$0) {
      dgw $$1 = $$0.c(egw.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ehj.a a(cut $$0) {
      return new ehj.a($$0);
   }

   public ib<cut> c() {
      return this.b;
   }

   public Optional<da> d() {
      return this.c;
   }

   public static class a implements ehk.a {
      private final ib<cut> a;
      private Optional<da> b = Optional.empty();

      public a(cut $$0) {
         this.a = $$0.r();
      }

      public ehj.a a(da.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ehk build() {
         return new ehj(this.a, this.b);
      }
   }
}
