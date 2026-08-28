import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class evf extends evp {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evf> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.a(lz.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evf::new)
   );
   private final Optional<ju<dbs>> c;
   private final boolean d;

   evf(List<exn> $$0, Optional<ju<dbs>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public evr<evf> b() {
      return evs.h;
   }

   @Override
   public cwb a(cwb $$0, euc $$1) {
      azs $$2 = $$1.b();
      boolean $$3 = $$0.a(cwf.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jq<dbs>> $$5 = this.c
         .<Stream<jq<dbs>>>map(ju::a)
         .orElseGet(() -> $$1.d().H_().e(lz.aM).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dbs)$$2x.a()).c($$0));
      List<jq<dbs>> $$6 = $$5.toList();
      Optional<jq<dbs>> $$7 = ae.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwb a(cwb $$0, jq<dbs> $$1, azs $$2) {
      int $$3 = azk.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwf.qQ)) {
         $$0 = new cwb(cwf.uy);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static evf.a c() {
      return new evf.a();
   }

   public static evf.a a(js.a $$0) {
      return c().a($$0.d(lz.aM).b(axd.n));
   }

   public static class a extends evp.a<evf.a> {
      private Optional<ju<dbs>> a = Optional.empty();
      private boolean b = true;

      protected evf.a a() {
         return this;
      }

      public evf.a a(jq<dbs> $$0) {
         this.a = Optional.of(ju.a($$0));
         return this;
      }

      public evf.a a(ju<dbs> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evf.a e() {
         this.b = false;
         return this;
      }

      @Override
      public evq b() {
         return new evf(this.g(), this.a, this.b);
      }
   }
}
