import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eqk extends eqs {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jb<czb>> c = le.f.r().listOf().xmap(jb::a, $$0 -> $$0.a().toList());
   public static final MapCodec<eqk> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eqk::new)
   );
   private final Optional<jb<czb>> d;

   eqk(List<esn> $$0, Optional<jb<czb>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public equ b() {
      return eqv.g;
   }

   @Override
   public ctq a(ctq $$0, eph $$1) {
      aym $$2 = $$1.b();
      Optional<ix<czb>> $$3 = this.d
         .<ix<czb>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(ctt.qP);
               List<ix.c<czb>> $$4 = le.f
                  .h()
                  .filter($$1xx -> ((czb)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((czb)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((czb)$$2xx.a()).b($$0))
                  .toList();
               return ac.b($$4, $$2);
            }
         );
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static ctq a(ctq $$0, czb $$1, aym $$2) {
      int $$3 = ayf.a($$2, $$1.f(), $$1.g());
      if ($$0.a(ctt.qP)) {
         $$0 = new ctq(ctt.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eqk.a c() {
      return new eqk.a();
   }

   public static eqs.a<?> d() {
      return a($$0 -> new eqk($$0, Optional.empty()));
   }

   public static class a extends eqs.a<eqk.a> {
      private final List<ix<czb>> a = new ArrayList<>();

      protected eqk.a a() {
         return this;
      }

      public eqk.a a(czb $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public eqt b() {
         return new eqk(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jb.a(this.a)));
      }
   }
}
