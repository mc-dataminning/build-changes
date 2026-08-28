import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class euo extends euy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kd.a(lw.aN).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euo::new)
   );
   private final Optional<js<dbn>> c;
   private final boolean d;

   euo(List<eww> $$0, Optional<js<dbn>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eva<euo> b() {
      return evb.h;
   }

   @Override
   public cvs a(cvs $$0, etl $$1) {
      azn $$2 = $$1.b();
      boolean $$3 = $$0.a(cvw.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jo<dbn>> $$5 = this.c
         .<Stream<jo<dbn>>>map(js::a)
         .orElseGet(() -> $$1.d().G_().e(lw.aN).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dbn)$$2x.a()).c($$0));
      List<jo<dbn>> $$6 = $$5.toList();
      Optional<jo<dbn>> $$7 = ad.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cvs a(cvs $$0, jo<dbn> $$1, azn $$2) {
      int $$3 = azf.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cvw.qQ)) {
         $$0 = new cvs(cvw.uy);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static euo.a c() {
      return new euo.a();
   }

   public static euo.a a(jq.a $$0) {
      return c().a($$0.d(lw.aN).b(awy.n));
   }

   public static class a extends euy.a<euo.a> {
      private Optional<js<dbn>> a = Optional.empty();
      private boolean b = true;

      protected euo.a a() {
         return this;
      }

      public euo.a a(jo<dbn> $$0) {
         this.a = Optional.of(js.a($$0));
         return this;
      }

      public euo.a a(js<dbn> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euo.a e() {
         this.b = false;
         return this;
      }

      @Override
      public euz b() {
         return new euo(this.g(), this.a, this.b);
      }
   }
}
