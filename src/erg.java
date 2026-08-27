import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record erg(iv<dcv> b, Optional<dj> c) implements erh {
   public static final Codec<erg> a = axe.b(
      RecordCodecBuilder.create($$0 -> $$0.group(lc.e.r().fieldOf("block").forGetter(erg::c), axe.a(dj.a, "properties").forGetter(erg::d)).apply($$0, erg::new)),
      erg::a
   );

   private static DataResult<erg> a(erg $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public eri b() {
      return erj.j;
   }

   @Override
   public Set<eqq<?>> a() {
      return Set.of(eqt.g);
   }

   public boolean a(eoa $$0) {
      dpy $$1 = $$0.c(eqt.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static erg.a a(dcv $$0) {
      return new erg.a($$0);
   }

   public iv<dcv> c() {
      return this.b;
   }

   public Optional<dj> d() {
      return this.c;
   }

   public static class a implements erh.a {
      private final iv<dcv> a;
      private Optional<dj> b = Optional.empty();

      public a(dcv $$0) {
         this.a = $$0.r();
      }

      public erg.a a(dj.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public erh build() {
         return new erg(this.a, this.b);
      }
   }
}
