import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class esu extends ete {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<esu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kb.a(lu.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, esu::new)
   );
   private final Optional<jq<dac>> c;
   private final boolean d;

   esu(List<evc> $$0, Optional<jq<dac>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public etg<esu> b() {
      return eth.h;
   }

   @Override
   public cuq a(cuq $$0, err $$1) {
      ayw $$2 = $$1.b();
      boolean $$3 = $$0.a(cut.qP);
      boolean $$4 = !$$3 && this.d;
      Stream<jm<dac>> $$5 = this.c
         .<Stream<jm<dac>>>map(jq::a)
         .orElseGet(() -> $$1.d().H_().d(lu.aL).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dac)$$2x.a()).c($$0));
      List<jm<dac>> $$6 = $$5.toList();
      Optional<jm<dac>> $$7 = ad.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cuq a(cuq $$0, jm<dac> $$1, ayw $$2) {
      int $$3 = ayo.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cut.qP)) {
         $$0 = new cuq(cut.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static esu.a c() {
      return new esu.a();
   }

   public static esu.a a(jo.a $$0) {
      return c().a($$0.b(lu.aL).b(awh.n));
   }

   public static class a extends ete.a<esu.a> {
      private Optional<jq<dac>> a = Optional.empty();
      private boolean b = true;

      protected esu.a a() {
         return this;
      }

      public esu.a a(jm<dac> $$0) {
         this.a = Optional.of(jq.a($$0));
         return this;
      }

      public esu.a a(jq<dac> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public esu.a e() {
         this.b = false;
         return this;
      }

      @Override
      public etf b() {
         return new esu(this.g(), this.a, this.b);
      }
   }
}
