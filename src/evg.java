import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class evg extends evp {
   public static final MapCodec<evg> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and($$0.group(eyk.a.fieldOf("levels").forGetter($$0x -> $$0x.b), kf.a(lz.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c)))
            .apply($$0, evg::new)
   );
   private final eyj b;
   private final Optional<ju<dbs>> c;

   evg(List<exn> $$0, eyj $$1, Optional<ju<dbs>> $$2) {
      super($$0);
      this.b = $$1;
      this.c = $$2;
   }

   @Override
   public evr<evg> b() {
      return evs.g;
   }

   @Override
   public Set<ewv<?>> a() {
      return this.b.a();
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      azs $$2 = $$1.b();
      ke $$3 = $$1.d().H_();
      return dbu.a($$2, $$0, this.b.a($$1), $$3, this.c);
   }

   public static evg.a a(js.a $$0, eyj $$1) {
      return new evg.a($$1).a($$0.d(lz.aM).b(axd.n));
   }

   public static class a extends evp.a<evg.a> {
      private final eyj a;
      private Optional<ju<dbs>> b = Optional.empty();

      public a(eyj $$0) {
         this.a = $$0;
      }

      protected evg.a a() {
         return this;
      }

      public evg.a a(ju<dbs> $$0) {
         this.b = Optional.of($$0);
         return this;
      }

      @Override
      public evq b() {
         return new evg(this.g(), this.a, this.b);
      }
   }
}
