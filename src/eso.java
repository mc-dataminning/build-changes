import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class eso extends esy {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<eso> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  kb.a(lu.aL).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, eso::new)
   );
   private final Optional<jq<daa>> c;
   private final boolean d;

   eso(List<euw> $$0, Optional<jq<daa>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public eta<eso> b() {
      return etb.h;
   }

   @Override
   public cuo a(cuo $$0, erl $$1) {
      ayv $$2 = $$1.b();
      boolean $$3 = $$0.a(cur.qP);
      boolean $$4 = !$$3 && this.d;
      Stream<jm<daa>> $$5 = this.c
         .<Stream<jm<daa>>>map(jq::a)
         .orElseGet(() -> $$1.d().H_().d(lu.aL).i().map(Function.identity()))
         .filter($$2x -> !$$4 || ((daa)$$2x.a()).c($$0));
      List<jm<daa>> $$6 = $$5.toList();
      Optional<jm<daa>> $$7 = ad.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static cuo a(cuo $$0, jm<daa> $$1, ayv $$2) {
      int $$3 = ayn.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(cur.qP)) {
         $$0 = new cuo(cur.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eso.a c() {
      return new eso.a();
   }

   public static eso.a a(jo.a $$0) {
      return c().a($$0.b(lu.aL).b(awg.n));
   }

   public static class a extends esy.a<eso.a> {
      private Optional<jq<daa>> a = Optional.empty();
      private boolean b = true;

      protected eso.a a() {
         return this;
      }

      public eso.a a(jm<daa> $$0) {
         this.a = Optional.of(jq.a($$0));
         return this;
      }

      public eso.a a(jq<daa> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public eso.a e() {
         this.b = false;
         return this;
      }

      @Override
      public esz b() {
         return new eso(this.g(), this.a, this.b);
      }
   }
}
