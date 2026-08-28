import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class euk extends euu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<euk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kc.a(lv.aM).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, euk::new)
   );
   private final Optional<jr<dbk>> c;
   private final boolean d;

   euk(List<ews> $$0, Optional<jr<dbk>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public euw<euk> b() {
      return eux.h;
   }

   @Override
   public cvp a(cvp $$0, eth $$1) {
      azl $$2 = $$1.b();
      boolean $$3 = $$0.a(cvt.qQ);
      boolean $$4 = !$$3 && this.d;
      Stream<jn<dbk>> $$5 = this.c
         .<Stream<jn<dbk>>>map(jr::a)
         .orElseGet(() -> $$1.d().F_().d(lv.aM).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dbk)$$2x.a()).c($$0));
      List<jn<dbk>> $$6 = $$5.toList();
      Optional<jn<dbk>> $$7 = ad.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cvp a(cvp $$0, jn<dbk> $$1, azl $$2) {
      int $$3 = azd.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cvt.qQ)) {
         $$0 = new cvp(cvt.uy);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static euk.a c() {
      return new euk.a();
   }

   public static euk.a a(jp.a $$0) {
      return c().a($$0.b(lv.aM).b(aww.n));
   }

   public static class a extends euu.a<euk.a> {
      private Optional<jr<dbk>> a = Optional.empty();
      private boolean b = true;

      protected euk.a a() {
         return this;
      }

      public euk.a a(jn<dbk> $$0) {
         this.a = Optional.of(jr.a($$0));
         return this;
      }

      public euk.a a(jr<dbk> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public euk.a e() {
         this.b = false;
         return this;
      }

      @Override
      public euv b() {
         return new euk(this.g(), this.a, this.b);
      }
   }
}
