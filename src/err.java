import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class err extends esb {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<err> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jy.a(lr.aK).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, err::new)
   );
   private final Optional<jn<czj>> c;
   private final boolean d;

   err(List<etz> $$0, Optional<jn<czj>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public esd<err> b() {
      return ese.h;
   }

   @Override
   public cua a(cua $$0, eqo $$1) {
      aym $$2 = $$1.b();
      boolean $$3 = $$0.a(cud.qP);
      boolean $$4 = !$$3 && this.d;
      Stream<jj<czj>> $$5 = this.c
         .<Stream<jj<czj>>>map(jn::a)
         .orElseGet(() -> $$1.d().H_().d(lr.aK).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((czj)$$2x.a()).c($$0));
      List<jj<czj>> $$6 = $$5.toList();
      Optional<jj<czj>> $$7 = ac.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cua a(cua $$0, jj<czj> $$1, aym $$2) {
      int $$3 = aye.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cud.qP)) {
         $$0 = new cua(cud.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static err.a c() {
      return new err.a();
   }

   public static err.a a(jl.a $$0) {
      return c().a($$0.b(lr.aK).b(avx.n));
   }

   public static class a extends esb.a<err.a> {
      private Optional<jn<czj>> a = Optional.empty();
      private boolean b = true;

      protected err.a a() {
         return this;
      }

      public err.a a(jj<czj> $$0) {
         this.a = Optional.of(jn.a($$0));
         return this;
      }

      public err.a a(jn<czj> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public err.a e() {
         this.b = false;
         return this;
      }

      @Override
      public esc b() {
         return new err(this.g(), this.a, this.b);
      }
   }
}
