import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class far extends fbb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<far> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ju.a(mh.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, far::new)
   );
   private final Optional<jj<dfx>> c;
   private final boolean d;

   far(List<fcx> $$0, Optional<jj<dfx>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fbd<far> b() {
      return fbe.h;
   }

   @Override
   public czk a(czk $$0, ezo $$1) {
      azv $$2 = $$1.b();
      boolean $$3 = $$0.a(czo.rF);
      boolean $$4 = !$$3 && this.d;
      Stream<jf<dfx>> $$5 = this.c
         .<Stream<jf<dfx>>>map(jj::a)
         .orElseGet(() -> $$1.d().F_().f(mh.aR).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dfx)$$2x.a()).c($$0));
      List<jf<dfx>> $$6 = $$5.toList();
      Optional<jf<dfx>> $$7 = ag.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static czk a(czk $$0, jf<dfx> $$1, azv $$2) {
      int $$3 = azm.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(czo.rF)) {
         $$0 = new czk(czo.vG);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static far.a c() {
      return new far.a();
   }

   public static far.a a(jh.a $$0) {
      return c().a($$0.e(mh.aR).b(axe.n));
   }

   public static class a extends fbb.a<far.a> {
      private Optional<jj<dfx>> a = Optional.empty();
      private boolean b = true;

      protected far.a a() {
         return this;
      }

      public far.a a(jf<dfx> $$0) {
         this.a = Optional.of(jj.a($$0));
         return this;
      }

      public far.a a(jj<dfx> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public far.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fbc b() {
         return new far(this.g(), this.a, this.b);
      }
   }
}
