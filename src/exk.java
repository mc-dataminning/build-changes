import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class exk extends exu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.a(mb.aN).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exk::new)
   );
   private final Optional<ju<ddr>> c;
   private final boolean d;

   exk(List<ezs> $$0, Optional<ju<ddr>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exw<exk> b() {
      return exx.h;
   }

   @Override
   public cxk a(cxk $$0, ewh $$1) {
      bam $$2 = $$1.b();
      boolean $$3 = $$0.a(cxo.rn);
      boolean $$4 = !$$3 && this.d;
      Stream<jq<ddr>> $$5 = this.c
         .<Stream<jq<ddr>>>map(ju::a)
         .orElseGet(() -> $$1.d().K_().e(mb.aN).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((ddr)$$2x.a()).c($$0));
      List<jq<ddr>> $$6 = $$5.toList();
      Optional<jq<ddr>> $$7 = ae.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cxk a(cxk $$0, jq<ddr> $$1, bam $$2) {
      int $$3 = bae.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cxo.rn)) {
         $$0 = new cxk(cxo.vm);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static exk.a c() {
      return new exk.a();
   }

   public static exk.a a(js.a $$0) {
      return c().a($$0.d(mb.aN).b(axx.n));
   }

   public static class a extends exu.a<exk.a> {
      private Optional<ju<ddr>> a = Optional.empty();
      private boolean b = true;

      protected exk.a a() {
         return this;
      }

      public exk.a a(jq<ddr> $$0) {
         this.a = Optional.of(ju.a($$0));
         return this;
      }

      public exk.a a(ju<ddr> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exk.a e() {
         this.b = false;
         return this;
      }

      @Override
      public exv b() {
         return new exk(this.g(), this.a, this.b);
      }
   }
}
