import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class evr extends ewa {
   public static final MapCodec<evr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyv.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(ma.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, evr::new)
   );
   private final eyu b;
   private final Optional<ju<dcd>> c;

   evr(List<exy> $$0, eyu $$1, Optional<ju<dcd>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public ewc<evr> b() {
      return ewd.g;
   }

   @Override
   public Set<exg<?>> a() {
      return this.b.a();
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      azu $$2 = $$1.b();
      ke $$3 = $$1.d().J_();
      return dcf.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static evr.a a(js.a $$0, eyu $$1) {
      return new evr.a($$1).a($$0.d(ma.aM).b(axf.n));
   }

   public static class a extends ewa.a<evr.a> {
      private final eyu a;
      private Optional<ju<dcd>> b = Optional.empty();

      public a(eyu $$0) {
         this.a = $$0;
      }

      protected evr.a a() {
         return this;
      }

      public evr.a a(ju<dcd> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public ewb b() {
         return new evr(this.g(), this.a, this.b);
      }
   }
}
