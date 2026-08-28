import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class esv extends ete {
   public static final MapCodec<esv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(evz.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kb.a(lu.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, esv::new)
   );
   private final evy b;
   private final Optional<jq<dac>> c;

   esv(List<evc> $$0, evy $$1, Optional<jq<dac>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public etg<esv> b() {
      return eth.g;
   }

   @Override
   public Set<euk<?>> a() {
      return this.b.a();
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      ayw $$2 = $$1.b();
      ka $$3 = $$1.d().H_();
      return dae.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static esv.a a(jo.a $$0, evy $$1) {
      return new esv.a($$1).a($$0.b(lu.aL).b(awh.n));
   }

   public static class a extends ete.a<esv.a> {
      private final evy a;
      private Optional<jq<dac>> b = Optional.empty();

      public a(evy $$0) {
         this.a = $$0;
      }

      protected esv.a a() {
         return this;
      }

      public esv.a a(jq<dac> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public etf b() {
         return new esv(this.g(), this.a, this.b);
      }
   }
}
