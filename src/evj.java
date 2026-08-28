import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class evj extends evt {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<evj> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.a(ma.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, evj::new)
   );
   private final Optional<ju<dbw>> c;
   private final boolean d;

   evj(List<exr> $$0, Optional<ju<dbw>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public evv<evj> b() {
      return evw.h;
   }

   @Override
   public cwf a(cwf $$0, eug $$1) {
      azv $$2 = $$1.b();
      boolean $$3 = $$0.a(cwj.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jq<dbw>> $$5 = this.c
         .<Stream<jq<dbw>>>map(ju::a)
         .orElseGet(() -> $$1.d().H_().e(ma.aM).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dbw)$$2x.a()).c($$0));
      List<jq<dbw>> $$6 = $$5.toList();
      Optional<jq<dbw>> $$7 = ae.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwf a(cwf $$0, jq<dbw> $$1, azv $$2) {
      int $$3 = azn.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwj.qQ)) {
         $$0 = new cwf(cwj.uO);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static evj.a c() {
      return new evj.a();
   }

   public static evj.a a(js.a $$0) {
      return c().a($$0.d(ma.aM).b(axg.n));
   }

   public static class a extends evt.a<evj.a> {
      private Optional<ju<dbw>> a = Optional.empty();
      private boolean b = true;

      protected evj.a a() {
         return this;
      }

      public evj.a a(jq<dbw> $$0) {
         this.a = Optional.of(ju.a($$0));
         return this;
      }

      public evj.a a(ju<dbw> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public evj.a e() {
         this.b = false;
         return this;
      }

      @Override
      public evu b() {
         return new evj(this.g(), this.a, this.b);
      }
   }
}
