import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class fbm extends fbw {
   private static final Logger b = LogUtils.getLogger();
   public static final MapCodec<fbm> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0)
            .and(
               $$0.group(
                  jv.a(mi.aR).optionalFieldOf("options").forGetter($$0x -> $$0x.c),
                  Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter($$0x -> $$0x.d)
               )
            )
            .apply($$0, fbm::new)
   );
   private final Optional<jk<dgn>> c;
   private final boolean d;

   fbm(List<fds> $$0, Optional<jk<dgn>> $$1, boolean $$2) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public fby<fbm> b() {
      return fbz.h;
   }

   @Override
   public daa a(daa $$0, faj $$1) {
      azz $$2 = $$1.b();
      boolean $$3 = $$0.a(dae.rF);
      boolean $$4 = !$$3 && this.d;
      Stream<jg<dgn>> $$5 = this.c
         .<Stream<jg<dgn>>>map(jk::a)
         .orElseGet(() -> $$1.d().J_().f(mi.aR).c().map(Function.identity()))
         .filter($$2x -> !$$4 || ((dgn)$$2x.a()).c($$0));
      List<jg<dgn>> $$6 = $$5.toList();
      Optional<jg<dgn>> $$7 = ag.b($$6, $$2);
      if ($$7.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$7.get(), $$2);
      }
   }

   private static daa a(daa $$0, jg<dgn> $$1, azz $$2) {
      int $$3 = azq.a($$2, $$1.a().d(), $$1.a().e());
      if ($$0.a(dae.rF)) {
         $$0 = new daa(dae.vG);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static fbm.a c() {
      return new fbm.a();
   }

   public static fbm.a a(ji.a $$0) {
      return c().a($$0.e(mi.aR).b(axi.n));
   }

   public static class a extends fbw.a<fbm.a> {
      private Optional<jk<dgn>> a = Optional.empty();
      private boolean b = true;

      protected fbm.a a() {
         return this;
      }

      public fbm.a a(jg<dgn> $$0) {
         this.a = Optional.of(jk.a($$0));
         return this;
      }

      public fbm.a a(jk<dgn> $$0) {
         this.a = Optional.of($$0);
         return this;
      }

      public fbm.a e() {
         this.b = false;
         return this;
      }

      @Override
      public fbx b() {
         return new fbm(this.g(), this.a, this.b);
      }
   }
}
