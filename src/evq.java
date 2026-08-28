import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class evq extends ewa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.a(ma.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evq::new)
   );
   private final Optional<ju<dcd>> c;
   private final boolean d;

   evq(List<exy> $$0, Optional<ju<dcd>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public ewc<evq> b() {
      return ewd.h;
   }

   @Override
   public cwm a(cwm $$0, eun $$1) {
      azu $$2 = $$1.b();
      boolean $$3 = $$0.a(cwq.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jq<dcd>> $$5 = this.c
         .<Stream<jq<dcd>>>map(ju::a)
         .orElseGet(() -> $$1.d().J_().e(ma.aM).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dcd)$$2x.a()).c($$0));
      List<jq<dcd>> $$6 = $$5.toList();
      Optional<jq<dcd>> $$7 = ae.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwm a(cwm $$0, jq<dcd> $$1, azu $$2) {
      int $$3 = azm.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwq.qQ)) {
         $$0 = new cwm(cwq.uO);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static evq.a c() {
      return new evq.a();
   }

   public static evq.a a(js.a $$0) {
      return c().a($$0.d(ma.aM).b(axf.n));
   }

   public static class a extends ewa.a<evq.a> {
      private Optional<ju<dcd>> a = Optional.empty();
      private boolean b = true;

      protected evq.a a() {
         return this;
      }

      public evq.a a(jq<dcd> $$0) {
         this.a = Optional.of(ju.a($$0));
         return this;
      }

      public evq.a a(ju<dcd> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evq.a e() {
         this.b = false;
         return this;
      }

      @Override
      public ewb b() {
         return new evq(this.g(), this.a, this.b);
      }
   }
}
