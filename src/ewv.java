import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ewv extends exf {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewv> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewv::new)
   );
   private final Optional<jv<dda>> c;
   private final boolean d;

   ewv(List<ezb> $$0, Optional<jv<dda>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exh<ewv> b() {
      return exi.h;
   }

   @Override
   public cwq a(cwq $$0, evs $$1) {
      azh $$2 = $$1.b();
      boolean $$3 = $$0.a(cwu.rw);
      boolean $$4 = !$$3 && this.d;
      Stream<jr<dda>> $$5 = this.c
         .<Stream<jr<dda>>>map(jv::a)
         .orElseGet(() -> $$1.d().K_().e(mc.aO).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dda)$$2x.a()).c($$0));
      List<jr<dda>> $$6 = $$5.toList();
      Optional<jr<dda>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwq a(cwq $$0, jr<dda> $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cwu.rw)) {
         $$0 = new cwq(cwu.vv);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ewv.a c() {
      return new ewv.a();
   }

   public static ewv.a a(jt.a $$0) {
      return c().a($$0.d(mc.aO).b(aws.n));
   }

   public static class a extends exf.a<ewv.a> {
      private Optional<jv<dda>> a = Optional.empty();
      private boolean b = true;

      protected ewv.a a() {
         return this;
      }

      public ewv.a a(jr<dda> $$0) {
         this.a = Optional.of(jv.a($$0));
         return this;
      }

      public ewv.a a(jv<dda> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewv.a e() {
         this.b = false;
         return this;
      }

      @Override
      public exg b() {
         return new ewv(this.g(), this.a, this.b);
      }
   }
}
