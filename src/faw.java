import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class faw extends fbg {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<faw> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ju.a(mh.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, faw::new)
   );
   private final Optional<jj<dga>> c;
   private final boolean d;

   faw(List<fdc> $$0, Optional<jj<dga>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fbi<faw> b() {
      return fbj.h;
   }

   @Override
   public czn a(czn $$0, ezt $$1) {
      azv $$2 = $$1.b();
      boolean $$3 = $$0.a(czr.rF);
      boolean $$4 = !$$3 && this.d;
      Stream<jf<dga>> $$5 = this.c
         .<Stream<jf<dga>>>map(jj::a)
         .orElseGet(() -> $$1.d().F_().f(mh.aR).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dga)$$2x.a()).c($$0));
      List<jf<dga>> $$6 = $$5.toList();
      Optional<jf<dga>> $$7 = ag.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static czn a(czn $$0, jf<dga> $$1, azv $$2) {
      int $$3 = azm.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(czr.rF)) {
         $$0 = new czn(czr.vG);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static faw.a c() {
      return new faw.a();
   }

   public static faw.a a(jh.a $$0) {
      return c().a($$0.e(mh.aR).b(axe.n));
   }

   public static class a extends fbg.a<faw.a> {
      private Optional<jj<dga>> a = Optional.empty();
      private boolean b = true;

      protected faw.a a() {
         return this;
      }

      public faw.a a(jf<dga> $$0) {
         this.a = Optional.of(jj.a($$0));
         return this;
      }

      public faw.a a(jj<dga> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public faw.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fbh b() {
         return new faw(this.g(), this.a, this.b);
      }
   }
}
