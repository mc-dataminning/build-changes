import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record ejc(ie<cvz> b, Optional<cz> c) implements ejd {
   public static final Codec<ejc> a = atg.a(
      RecordCodecBuilder.create($$0 -> $$0.group(kb.e.r().fieldOf("block").forGetter(ejc::c), atg.a(cz.a, "properties").forGetter(ejc::d)).apply($$0, ejc::new)),
      ejc::a
   );

   private static DataResult<ejc> a(ejc $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().n()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eje b() {
      return ejf.j;
   }

   @Override
   public Set<eim<?>> a() {
      return Set.of(eip.g);
   }

   public boolean a(ege $$0) {
      dip $$1 = $$0.c(eip.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static ejc.a a(cvz $$0) {
      return new ejc.a($$0);
   }

   public ie<cvz> c() {
      return this.b;
   }

   public Optional<cz> d() {
      return this.c;
   }

   public static class a implements ejd.a {
      private final ie<cvz> a;
      private Optional<cz> b = Optional.empty();

      public a(cvz $$0) {
         this.a = $$0.r();
      }

      public ejc.a a(cz.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public ejd build() {
         return new ejc(this.a, this.b);
      }
   }
}
