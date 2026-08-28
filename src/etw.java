import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class etw extends eug {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<etw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kc.a(lv.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, etw::new)
   );
   private final Optional<jr<daw>> c;
   private final boolean d;

   etw(List<ewe> $$0, Optional<jr<daw>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eui<etw> b() {
      return euj.h;
   }

   @Override
   public cvl a(cvl $$0, est $$1) {
      azk $$2 = $$1.b();
      boolean $$3 = $$0.a(cvo.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jn<daw>> $$5 = this.c
         .<Stream<jn<daw>>>map(jr::a)
         .orElseGet(() -> $$1.d().F_().d(lv.aL).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((daw)$$2x.a()).c($$0));
      List<jn<daw>> $$6 = $$5.toList();
      Optional<jn<daw>> $$7 = ad.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cvl a(cvl $$0, jn<daw> $$1, azk $$2) {
      int $$3 = azc.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cvo.qQ)) {
         $$0 = new cvl(cvo.uy);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static etw.a c() {
      return new etw.a();
   }

   public static etw.a a(jp.a $$0) {
      return c().a($$0.b(lv.aL).b(awv.n));
   }

   public static class a extends eug.a<etw.a> {
      private Optional<jr<daw>> a = Optional.empty();
      private boolean b = true;

      protected etw.a a() {
         return this;
      }

      public etw.a a(jn<daw> $$0) {
         this.a = Optional.of(jr.a($$0));
         return this;
      }

      public etw.a a(jr<daw> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public etw.a e() {
         this.b = false;
         return this;
      }

      @Override
      public euh b() {
         return new etw(this.g(), this.a, this.b);
      }
   }
}
