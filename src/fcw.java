import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.Set;

public record fcw(jf<dmm> b, Optional<dr> c) implements fcx {
   public static final MapCodec<fcw> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(mg.e.r().fieldOf("block").forGetter(fcw::c), dr.a.optionalFieldOf("properties").forGetter(fcw::d)).apply($$0, fcw::new)
      )
      .validate(fcw::a);

   private static DataResult<fcw> a(fcw $$0) {
      return $$0.d()
         .flatMap($$1 -> $$1.a($$0.c().a().l()))
         .map($$1 -> DataResult.error(() -> "Block " + $$0.c() + " has no property" + $$1))
         .orElse(DataResult.success($$0));
   }

   @Override
   public fcy b() {
      return fcz.i;
   }

   @Override
   public Set<bax<?>> a() {
      return Set.of(fci.g);
   }

   public boolean a(ezo $$0) {
      eao $$1 = $$0.c(fci.g);
      return $$1 != null && $$1.a(this.b) && (this.c.isEmpty() || this.c.get().a($$1));
   }

   public static fcw.a a(dmm $$0) {
      return new fcw.a($$0);
   }

   public jf<dmm> c() {
      return this.b;
   }

   public Optional<dr> d() {
      return this.c;
   }

   public static class a implements fcx.a {
      private final jf<dmm> a;
      private Optional<dr> b = Optional.empty();

      public a(dmm $$0) {
         this.a = $$0.p();
      }

      public fcw.a a(dr.a $$0) {
         this.b = $$0.b();
         return this;
      }

      @Override
      public fcx build() {
         return new fcw(this.a, this.b);
      }
   }
}
