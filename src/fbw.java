import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fbw extends fcg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jv.a(mi.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbw::new)
   );
   private final Optional<jk<dgx>> c;
   private final boolean d;

   fbw(List<fec> $$0, Optional<jk<dgx>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fci<fbw> b() {
      return fcj.h;
   }

   @Override
   public dak a(dak $$0, fat $$1) {
      bai $$2 = $$1.b();
      boolean $$3 = $$0.a(dao.rF);
      boolean $$4 = !$$3 && this.d;
      Stream<jg<dgx>> $$5 = this.c
         .<Stream<jg<dgx>>>map(jk::a)
         .orElseGet(() -> $$1.d().J_().f(mi.aR).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dgx)$$2x.a()).c($$0));
      List<jg<dgx>> $$6 = $$5.toList();
      Optional<jg<dgx>> $$7 = ag.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static dak a(dak $$0, jg<dgx> $$1, bai $$2) {
      int $$3 = azz.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(dao.rF)) {
         $$0 = new dak(dao.vG);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static fbw.a c() {
      return new fbw.a();
   }

   public static fbw.a a(ji.a $$0) {
      return c().a($$0.e(mi.aR).b(axp.n));
   }

   public static class a extends fcg.a<fbw.a> {
      private Optional<jk<dgx>> a = Optional.empty();
      private boolean b = true;

      protected fbw.a a() {
         return this;
      }

      public fbw.a a(jg<dgx> $$0) {
         this.a = Optional.of(jk.a($$0));
         return this;
      }

      public fbw.a a(jk<dgx> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbw.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fch b() {
         return new fbw(this.g(), this.a, this.b);
      }
   }
}
