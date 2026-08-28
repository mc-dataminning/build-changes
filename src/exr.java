import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class exr extends eyb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<exr> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kf.a(mb.aO).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, exr::new)
   );
   private final Optional<ju<ddy>> c;
   private final boolean d;

   exr(List<ezx> $$0, Optional<ju<ddy>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eyd<exr> b() {
      return eye.h;
   }

   @Override
   public cxo a(cxo $$0, ewo $$1) {
      bam $$2 = $$1.b();
      boolean $$3 = $$0.a(cxs.rn);
      boolean $$4 = !$$3 && this.d;
      Stream<jq<ddy>> $$5 = this.c
         .<Stream<jq<ddy>>>map(ju::a)
         .orElseGet(() -> $$1.d().K_().e(mb.aO).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((ddy)$$2x.a()).c($$0));
      List<jq<ddy>> $$6 = $$5.toList();
      Optional<jq<ddy>> $$7 = ae.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cxo a(cxo $$0, jq<ddy> $$1, bam $$2) {
      int $$3 = bae.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cxs.rn)) {
         $$0 = new cxo(cxs.vm);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static exr.a c() {
      return new exr.a();
   }

   public static exr.a a(js.a $$0) {
      return c().a($$0.d(mb.aO).b(axx.n));
   }

   public static class a extends eyb.a<exr.a> {
      private Optional<ju<ddy>> a = Optional.empty();
      private boolean b = true;

      protected exr.a a() {
         return this;
      }

      public exr.a a(jq<ddy> $$0) {
         this.a = Optional.of(ju.a($$0));
         return this;
      }

      public exr.a a(ju<ddy> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public exr.a e() {
         this.b = false;
         return this;
      }

      @Override
      public eyc b() {
         return new exr(this.g(), this.a, this.b);
      }
   }
}
