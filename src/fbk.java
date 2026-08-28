import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fbk extends fbu {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  ju.a(mh.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbk::new)
   );
   private final Optional<jj<dgl>> c;
   private final boolean d;

   fbk(List<fdq> $$0, Optional<jj<dgl>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fbw<fbk> b() {
      return fbx.h;
   }

   @Override
   public czy a(czy $$0, fah $$1) {
      azx $$2 = $$1.b();
      boolean $$3 = $$0.a(dac.rF);
      boolean $$4 = !$$3 && this.d;
      Stream<jf<dgl>> $$5 = this.c
         .<Stream<jf<dgl>>>map(jj::a)
         .orElseGet(() -> $$1.d().J_().f(mh.aR).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dgl)$$2x.a()).c($$0));
      List<jf<dgl>> $$6 = $$5.toList();
      Optional<jf<dgl>> $$7 = ag.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static czy a(czy $$0, jf<dgl> $$1, azx $$2) {
      int $$3 = azo.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(dac.rF)) {
         $$0 = new czy(dac.vG);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static fbk.a c() {
      return new fbk.a();
   }

   public static fbk.a a(jh.a $$0) {
      return c().a($$0.e(mh.aR).b(axg.n));
   }

   public static class a extends fbu.a<fbk.a> {
      private Optional<jj<dgl>> a = Optional.empty();
      private boolean b = true;

      protected fbk.a a() {
         return this;
      }

      public fbk.a a(jf<dgl> $$0) {
         this.a = Optional.of(jj.a($$0));
         return this;
      }

      public fbk.a a(jj<dgl> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbk.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fbv b() {
         return new fbk(this.g(), this.a, this.b);
      }
   }
}
