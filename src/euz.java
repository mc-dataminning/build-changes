import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class euz extends evj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ke.a(ly.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euz::new)
   );
   private final Optional<jt<dbm>> c;
   private final boolean d;

   euz(List<exh> $$0, Optional<jt<dbm>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public evl<euz> b() {
      return evm.h;
   }

   @Override
   public cvx a(cvx $$0, etw $$1) {
      azr $$2 = $$1.b();
      boolean $$3 = $$0.a(cwb.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jp<dbm>> $$5 = this.c
         .<Stream<jp<dbm>>>map(jt::a)
         .orElseGet(() -> $$1.d().H_().e(ly.aM).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dbm)$$2x.a()).c($$0));
      List<jp<dbm>> $$6 = $$5.toList();
      Optional<jp<dbm>> $$7 = ad.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cvx a(cvx $$0, jp<dbm> $$1, azr $$2) {
      int $$3 = azj.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwb.qQ)) {
         $$0 = new cvx(cwb.uy);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static euz.a c() {
      return new euz.a();
   }

   public static euz.a a(jr.a $$0) {
      return c().a($$0.d(ly.aM).b(axc.n));
   }

   public static class a extends evj.a<euz.a> {
      private Optional<jt<dbm>> a = Optional.empty();
      private boolean b = true;

      protected euz.a a() {
         return this;
      }

      public euz.a a(jp<dbm> $$0) {
         this.a = Optional.of(jt.a($$0));
         return this;
      }

      public euz.a a(jt<dbm> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euz.a e() {
         this.b = false;
         return this;
      }

      @Override
      public evk b() {
         return new euz(this.g(), this.a, this.b);
      }
   }
}
