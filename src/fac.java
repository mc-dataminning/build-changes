import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fac extends fam {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fac> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jt.a(mg.aQ).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fac::new)
   );
   private final Optional<ji<dfl>> c;
   private final boolean d;

   fac(List<fci> $$0, Optional<ji<dfl>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fao<fac> b() {
      return fap.h;
   }

   @Override
   public cyy a(cyy $$0, eyz $$1) {
      azv $$2 = $$1.b();
      boolean $$3 = $$0.a(czc.rC);
      boolean $$4 = !$$3 && this.d;
      Stream<je<dfl>> $$5 = this.c
         .<Stream<je<dfl>>>map(ji::a)
         .orElseGet(() -> $$1.d().F_().f(mg.aQ).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dfl)$$2x.a()).c($$0));
      List<je<dfl>> $$6 = $$5.toList();
      Optional<je<dfl>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cyy a(cyy $$0, je<dfl> $$1, azv $$2) {
      int $$3 = azm.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(czc.rC)) {
         $$0 = new cyy(czc.vB);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static fac.a c() {
      return new fac.a();
   }

   public static fac.a a(jg.a $$0) {
      return c().a($$0.e(mg.aQ).b(axe.n));
   }

   public static class a extends fam.a<fac.a> {
      private Optional<ji<dfl>> a = Optional.empty();
      private boolean b = true;

      protected fac.a a() {
         return this;
      }

      public fac.a a(je<dfl> $$0) {
         this.a = Optional.of(ji.a($$0));
         return this;
      }

      public fac.a a(ji<dfl> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fac.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fan b() {
         return new fac(this.g(), this.a, this.b);
      }
   }
}
