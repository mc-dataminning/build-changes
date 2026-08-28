import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record exg(jp<dhy> b, Optional<ed> c) implements exh {
   public static final MapCodec<exg> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(lx.e.r().fieldOf("block").forGetter(exg::c), ed.a.optionalFieldOf("properties").forGetter(exg::d)).apply($$0, exg::new)
      )
      .validate(exg::a);

   private static DataResult<exg> a(exg $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public exi b() {
      return exj.i;
   }

   @Override
   public Set<ewp<?>> a() {
      return Set.of(ews.g);
   }

   public boolean a(etw $$0) {
      dvd $$1 = $$0.c(ews.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static exg.a a(dhy $$0) {
      return new exg.a($$0);
   }

   public jp<dhy> c() {
      return this.b;
   }

   public Optional<ed> d() {
      return this.c;
   }

   public static class a implements exh.a {
      private final jp<dhy> a;
      private Optional<ed> b = Optional.empty();

      public a(dhy $$0) {
         this.a = $$0.p();
      }

      public exg.a a(ed.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public exh build() {
         return new exg(this.a, this.b);
      }
   }
}
