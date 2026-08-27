import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eqi extends eqq {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jb<cyz>> c = le.f.r().listOf().xmap(jb::a, $$0 -> $$0.a().toList());
   public static final MapCodec<eqi> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eqi::new)
   );
   private final Optional<jb<cyz>> d;

   eqi(List<esl> $$0, Optional<jb<cyz>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eqs b() {
      return eqt.g;
   }

   @Override
   public cto a(cto $$0, epf $$1) {
      ayk $$2 = $$1.b();
      Optional<ix<cyz>> $$3 = this.d
         .<ix<cyz>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(ctr.qP);
               List<ix.c<cyz>> $$4 = le.f
                  .h()
                  .filter($$1xx -> ((cyz)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((cyz)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((cyz)$$2xx.a()).b($$0))
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

   private static cto a(cto $$0, cyz $$1, ayk $$2) {
      int $$3 = ayd.a($$2, $$1.f(), $$1.g());
      if ($$0.a(ctr.qP)) {
         $$0 = new cto(ctr.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eqi.a c() {
      return new eqi.a();
   }

   public static eqq.a<?> d() {
      return a($$0 -> new eqi($$0, Optional.empty()));
   }

   public static class a extends eqq.a<eqi.a> {
      private final List<ix<cyz>> a = new ArrayList<>();

      protected eqi.a a() {
         return this;
      }

      public eqi.a a(cyz $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public eqr b() {
         return new eqi(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jb.a(this.a)));
      }
   }
}
