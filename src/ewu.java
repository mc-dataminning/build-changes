import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ewu extends exe {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewu> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewu::new)
   );
   private final Optional<jv<dcz>> c;
   private final boolean d;

   ewu(List<eza> $$0, Optional<jv<dcz>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exg<ewu> b() {
      return exh.h;
   }

   @Override
   public cwp a(cwp $$0, evr $$1) {
      azh $$2 = $$1.b();
      boolean $$3 = $$0.a(cwt.rw);
      boolean $$4 = !$$3 && this.d;
      Stream<jr<dcz>> $$5 = this.c
         .<Stream<jr<dcz>>>map(jv::a)
         .orElseGet(() -> $$1.d().K_().e(mc.aO).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dcz)$$2x.a()).c($$0));
      List<jr<dcz>> $$6 = $$5.toList();
      Optional<jr<dcz>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwp a(cwp $$0, jr<dcz> $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwt.rw)) {
         $$0 = new cwp(cwt.vv);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ewu.a c() {
      return new ewu.a();
   }

   public static ewu.a a(jt.a $$0) {
      return c().a($$0.d(mc.aO).b(aws.n));
   }

   public static class a extends exe.a<ewu.a> {
      private Optional<jv<dcz>> a = Optional.empty();
      private boolean b = true;

      protected ewu.a a() {
         return this;
      }

      public ewu.a a(jr<dcz> $$0) {
         this.a = Optional.of(jv.a($$0));
         return this;
      }

      public ewu.a a(jv<dcz> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewu.a e() {
         this.b = false;
         return this;
      }

      @Override
      public exf b() {
         return new ewu(this.g(), this.a, this.b);
      }
   }
}
