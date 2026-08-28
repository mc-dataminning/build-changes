import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eyo extends eyy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eyo> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kh.a(me.aS).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eyo::new)
   );
   private final Optional<jw<deh>> c;
   private final boolean d;

   eyo(List<fau> $$0, Optional<jw<deh>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eza<eyo> b() {
      return ezb.h;
   }

   @Override
   public cxy a(cxy $$0, exl $$1) {
      azs $$2 = $$1.b();
      boolean $$3 = $$0.a(cyc.rA);
      boolean $$4 = !$$3 && this.d;
      Stream<js<deh>> $$5 = this.c
         .<Stream<js<deh>>>map(jw::a)
         .orElseGet(() -> $$1.d().F_().f(me.aS).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((deh)$$2x.a()).c($$0));
      List<js<deh>> $$6 = $$5.toList();
      Optional<js<deh>> $$7 = af.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cxy a(cxy $$0, js<deh> $$1, azs $$2) {
      int $$3 = azk.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cyc.rA)) {
         $$0 = new cxy(cyc.vz);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eyo.a c() {
      return new eyo.a();
   }

   public static eyo.a a(ju.a $$0) {
      return c().a($$0.e(me.aS).b(axc.n));
   }

   public static class a extends eyy.a<eyo.a> {
      private Optional<jw<deh>> a = Optional.empty();
      private boolean b = true;

      protected eyo.a a() {
         return this;
      }

      public eyo.a a(js<deh> $$0) {
         this.a = Optional.of(jw.a($$0));
         return this;
      }

      public eyo.a a(jw<deh> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eyo.a e() {
         this.b = false;
         return this;
      }

      @Override
      public eyz b() {
         return new eyo(this.g(), this.a, this.b);
      }
   }
}
