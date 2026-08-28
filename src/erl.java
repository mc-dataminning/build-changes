import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class erl extends eru {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<jm<daa>> c = lp.f.r().listOf().xmap(jm::a, $$0 -> $$0.a().toList());
   public static final MapCodec<erl> a = RecordCodecBuilder.mapCodec(
      $$0 -> a($$0).and(c.optionalFieldOf("enchantments").forGetter($$0x -> $$0x.d)).apply($$0, erl::new)
   );
   private final Optional<jm<daa>> d;

   erl(List<ets> $$0, Optional<jm<daa>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public erw<erl> b() {
      return erx.h;
   }

   @Override
   public cup a(cup $$0, eqi $$1) {
      azh $$2 = $$1.b();
      Optional<ji<daa>> $$3 = this.d
         .<ji<daa>>flatMap($$1x -> $$1x.a($$2))
         .or(
            () -> {
               boolean $$3x = $$0.a(cus.qP);
               List<ji.c<daa>> $$4 = lp.f
                  .h()
                  .filter($$1xx -> ((daa)$$1xx.a()).a($$1.d().J()))
                  .filter($$0xx -> ((daa)$$0xx.a()).l())
                  .filter($$2xx -> $$3x || ((daa)$$2xx.a()).b($$0))
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

   private static cup a(cup $$0, daa $$1, azh $$2) {
      int $$3 = ayz.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cus.qP)) {
         $$0 = new cup(cus.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static erl.a c() {
      return new erl.a();
   }

   public static eru.a<?> d() {
      return a($$0 -> new erl($$0, Optional.empty()));
   }

   public static class a extends eru.a<erl.a> {
      private final List<ji<daa>> a = new ArrayList<>();

      protected erl.a a() {
         return this;
      }

      public erl.a a(daa $$0) {
         this.a.add($$0.m());
         return this;
      }

      @Override
      public erv b() {
         return new erl(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(jm.a(this.a)));
      }
   }
}
