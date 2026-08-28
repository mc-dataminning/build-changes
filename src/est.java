import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class est extends etc {
   public static final MapCodec<est> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evx.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kb.a(lu.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, est::new)
   );
   private final evw b;
   private final Optional<jq<dac>> c;

   est(List<eva> $$0, evw $$1, Optional<jq<dac>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ete<est> b() {
      return etf.g;
   }

   @Override
   public Set<eui<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, erp $$1) {
      ayw $$2 = $$1.b();
      ka $$3 = $$1.d().H_();
      return dae.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static est.a a(jo.a $$0, evw $$1) {
      return new est.a($$1).a($$0.b(lu.aL).b(awh.n));
   }

   public static class a extends etc.a<est.a> {
      private final evw a;
      private Optional<jq<dac>> b = Optional.empty();

      public a(evw $$0) {
         this.a = $$0;
      }

      protected est.a a() {
         return this;
      }

      public est.a a(jq<dac> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public etd b() {
         return new est(this.g(), this.a, this.b);
      }
   }
}
