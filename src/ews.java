import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ews extends exc {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ews> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ews::new)
   );
   private final Optional<jv<dcx>> c;
   private final boolean d;

   ews(List<eyy> $$0, Optional<jv<dcx>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exe<ews> b() {
      return exf.h;
   }

   @Override
   public cwn a(cwn $$0, evp $$1) {
      azg $$2 = $$1.b();
      boolean $$3 = $$0.a(cwr.rw);
      boolean $$4 = !$$3 && this.d;
      Stream<jr<dcx>> $$5 = this.c
         .<Stream<jr<dcx>>>map(jv::a)
         .orElseGet(() -> $$1.d().K_().e(mc.aO).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dcx)$$2x.a()).c($$0));
      List<jr<dcx>> $$6 = $$5.toList();
      Optional<jr<dcx>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwn a(cwn $$0, jr<dcx> $$1, azg $$2) {
      int $$3 = ayy.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwr.rw)) {
         $$0 = new cwn(cwr.vv);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ews.a c() {
      return new ews.a();
   }

   public static ews.a a(jt.a $$0) {
      return c().a($$0.d(mc.aO).b(awr.n));
   }

   public static class a extends exc.a<ews.a> {
      private Optional<jv<dcx>> a = Optional.empty();
      private boolean b = true;

      protected ews.a a() {
         return this;
      }

      public ews.a a(jr<dcx> $$0) {
         this.a = Optional.of(jv.a($$0));
         return this;
      }

      public ews.a a(jv<dcx> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ews.a e() {
         this.b = false;
         return this;
      }

      @Override
      public exd b() {
         return new ews(this.g(), this.a, this.b);
      }
   }
}
