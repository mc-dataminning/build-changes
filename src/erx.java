import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class erx extends esh {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<erx> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jy.a(lr.aK).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, erx::new)
   );
   private final Optional<jn<czl>> c;
   private final boolean d;

   erx(List<euf> $$0, Optional<jn<czl>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public esj<erx> b() {
      return esk.h;
   }

   @Override
   public cuc a(cuc $$0, equ $$1) {
      ayo $$2 = $$1.b();
      boolean $$3 = $$0.a(cuf.qP);
      boolean $$4 = !$$3 && this.d;
      Stream<jj<czl>> $$5 = this.c
         .<Stream<jj<czl>>>map(jn::a)
         .orElseGet(() -> $$1.d().H_().d(lr.aK).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((czl)$$2x.a()).c($$0));
      List<jj<czl>> $$6 = $$5.toList();
      Optional<jj<czl>> $$7 = ac.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cuc a(cuc $$0, jj<czl> $$1, ayo $$2) {
      int $$3 = ayg.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cuf.qP)) {
         $$0 = new cuc(cuf.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erx.a c() {
      return new erx.a();
   }

   public static erx.a a(jl.a $$0) {
      return c().a($$0.b(lr.aK).b(avz.n));
   }

   public static class a extends esh.a<erx.a> {
      private Optional<jn<czl>> a = Optional.empty();
      private boolean b = true;

      protected erx.a a() {
         return this;
      }

      public erx.a a(jj<czl> $$0) {
         this.a = Optional.of(jn.a($$0));
         return this;
      }

      public erx.a a(jn<czl> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public erx.a e() {
         this.b = false;
         return this;
      }

      @Override
      public esi b() {
         return new erx(this.g(), this.a, this.b);
      }
   }
}
