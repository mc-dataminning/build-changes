import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ezq extends faa {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ezq> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jt.a(mg.aP).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ezq::new)
   );
   private final Optional<ji<dff>> c;
   private final boolean d;

   ezq(List<fbw> $$0, Optional<ji<dff>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fac<ezq> b() {
      return fad.h;
   }

   @Override
   public cys a(cys $$0, eyn $$1) {
      azt $$2 = $$1.b();
      boolean $$3 = $$0.a(cyw.rA);
      boolean $$4 = !$$3 && this.d;
      Stream<je<dff>> $$5 = this.c
         .<Stream<je<dff>>>map(ji::a)
         .orElseGet(() -> $$1.d().F_().f(mg.aP).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dff)$$2x.a()).c($$0));
      List<je<dff>> $$6 = $$5.toList();
      Optional<je<dff>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cys a(cys $$0, je<dff> $$1, azt $$2) {
      int $$3 = azk.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cyw.rA)) {
         $$0 = new cys(cyw.vz);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ezq.a c() {
      return new ezq.a();
   }

   public static ezq.a a(jg.a $$0) {
      return c().a($$0.e(mg.aP).b(axc.n));
   }

   public static class a extends faa.a<ezq.a> {
      private Optional<ji<dff>> a = Optional.empty();
      private boolean b = true;

      protected ezq.a a() {
         return this;
      }

      public ezq.a a(je<dff> $$0) {
         this.a = Optional.of(ji.a($$0));
         return this;
      }

      public ezq.a a(ji<dff> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ezq.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fab b() {
         return new ezq(this.g(), this.a, this.b);
      }
   }
}
