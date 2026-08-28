import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class ewt extends exd {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<ewt> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kg.a(mc.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, ewt::new)
   );
   private final Optional<jv<dcy>> c;
   private final boolean d;

   ewt(List<eyz> $$0, Optional<jv<dcy>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exf<ewt> b() {
      return exg.h;
   }

   @Override
   public cwo a(cwo $$0, evq $$1) {
      azh $$2 = $$1.b();
      boolean $$3 = $$0.a(cws.rw);
      boolean $$4 = !$$3 && this.d;
      Stream<jr<dcy>> $$5 = this.c
         .<Stream<jr<dcy>>>map(jv::a)
         .orElseGet(() -> $$1.d().K_().e(mc.aO).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dcy)$$2x.a()).c($$0));
      List<jr<dcy>> $$6 = $$5.toList();
      Optional<jr<dcy>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cwo a(cwo $$0, jr<dcy> $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cws.rw)) {
         $$0 = new cwo(cws.vv);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ewt.a c() {
      return new ewt.a();
   }

   public static ewt.a a(jt.a $$0) {
      return c().a($$0.d(mc.aO).b(aws.n));
   }

   public static class a extends exd.a<ewt.a> {
      private Optional<jv<dcy>> a = Optional.empty();
      private boolean b = true;

      protected ewt.a a() {
         return this;
      }

      public ewt.a a(jr<dcy> $$0) {
         this.a = Optional.of(jv.a($$0));
         return this;
      }

      public ewt.a a(jv<dcy> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public ewt.a e() {
         this.b = false;
         return this;
      }

      @Override
      public exe b() {
         return new ewt(this.g(), this.a, this.b);
      }
   }
}
