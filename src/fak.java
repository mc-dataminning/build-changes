import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fak extends fau {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fak> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jt.a(mg.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fak::new)
   );
   private final Optional<ji<dfq>> c;
   private final boolean d;

   fak(List<fcq> $$0, Optional<ji<dfq>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public faw<fak> b() {
      return fax.h;
   }

   @Override
   public czd a(czd $$0, ezh $$1) {
      azv $$2 = $$1.b();
      boolean $$3 = $$0.a(czh.rF);
      boolean $$4 = !$$3 && this.d;
      Stream<je<dfq>> $$5 = this.c
         .<Stream<je<dfq>>>map(ji::a)
         .orElseGet(() -> $$1.d().F_().f(mg.aR).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dfq)$$2x.a()).c($$0));
      List<je<dfq>> $$6 = $$5.toList();
      Optional<je<dfq>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static czd a(czd $$0, je<dfq> $$1, azv $$2) {
      int $$3 = azm.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(czh.rF)) {
         $$0 = new czd(czh.vG);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static fak.a c() {
      return new fak.a();
   }

   public static fak.a a(jg.a $$0) {
      return c().a($$0.e(mg.aR).b(axe.n));
   }

   public static class a extends fau.a<fak.a> {
      private Optional<ji<dfq>> a = Optional.empty();
      private boolean b = true;

      protected fak.a a() {
         return this;
      }

      public fak.a a(je<dfq> $$0) {
         this.a = Optional.of(ji.a($$0));
         return this;
      }

      public fak.a a(ji<dfq> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fak.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fav b() {
         return new fak(this.g(), this.a, this.b);
      }
   }
}
