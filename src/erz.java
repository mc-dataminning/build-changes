import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class erz extends esj {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erz> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jy.a(lr.aK).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erz::new)
   );
   private final Optional<jn<czm>> c;
   private final boolean d;

   erz(List<euh> $$0, Optional<jn<czm>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public esl<erz> b() {
      return esm.h;
   }

   @Override
   public cud a(cud $$0, eqw $$1) {
      ayo $$2 = $$1.b();
      boolean $$3 = $$0.a(cug.qP);
      boolean $$4 = !$$3 && this.d;
      Stream<jj<czm>> $$5 = this.c
         .<Stream<jj<czm>>>map(jn::a)
         .orElseGet(() -> $$1.d().H_().d(lr.aK).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((czm)$$2x.a()).c($$0));
      List<jj<czm>> $$6 = $$5.toList();
      Optional<jj<czm>> $$7 = ac.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cud a(cud $$0, jj<czm> $$1, ayo $$2) {
      int $$3 = ayg.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cug.qP)) {
         $$0 = new cud(cug.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erz.a c() {
      return new erz.a();
   }

   public static erz.a a(jl.a $$0) {
      return c().a($$0.b(lr.aK).b(avz.n));
   }

   public static class a extends esj.a<erz.a> {
      private Optional<jn<czm>> a = Optional.empty();
      private boolean b = true;

      protected erz.a a() {
         return this;
      }

      public erz.a a(jj<czm> $$0) {
         this.a = Optional.of(jn.a($$0));
         return this;
      }

      public erz.a a(jn<czm> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public erz.a e() {
         this.b = false;
         return this;
      }

      @Override
      public esk b() {
         return new erz(this.g(), this.a, this.b);
      }
   }
}
