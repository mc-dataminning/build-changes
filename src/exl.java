import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class exl extends exv {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.a(mb.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exl::new)
   );
   private final Optional<ju<ddq>> c;
   private final boolean d;

   exl(List<ezr> $$0, Optional<ju<ddq>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public exx<exl> b() {
      return exy.h;
   }

   @Override
   public cxg a(cxg $$0, ewi $$1) {
      bac $$2 = $$1.b();
      boolean $$3 = $$0.a(cxk.rw);
      boolean $$4 = !$$3 && this.d;
      Stream<jq<ddq>> $$5 = this.c
         .<Stream<jq<ddq>>>map(ju::a)
         .orElseGet(() -> $$1.d().K_().e(mb.aO).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((ddq)$$2x.a()).c($$0));
      List<jq<ddq>> $$6 = $$5.toList();
      Optional<jq<ddq>> $$7 = ae.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cxg a(cxg $$0, jq<ddq> $$1, bac $$2) {
      int $$3 = azu.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cxk.rw)) {
         $$0 = new cxg(cxk.vv);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static exl.a c() {
      return new exl.a();
   }

   public static exl.a a(js.a $$0) {
      return c().a($$0.d(mb.aO).b(axn.n));
   }

   public static class a extends exv.a<exl.a> {
      private Optional<ju<ddq>> a = Optional.empty();
      private boolean b = true;

      protected exl.a a() {
         return this;
      }

      public exl.a a(jq<ddq> $$0) {
         this.a = Optional.of(ju.a($$0));
         return this;
      }

      public exl.a a(ju<ddq> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exl.a e() {
         this.b = false;
         return this;
      }

      @Override
      public exw b() {
         return new exl(this.g(), this.a, this.b);
      }
   }
}
