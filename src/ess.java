import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ess extends eta {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<je<dad>> c = lh.f.r().listOf().xmap(je::a, $$0 -> $$0.a().toList());
   public static final Codec<ess> a = RecordCodecBuilder.create($$0 -> a($$0).and(axu.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, ess::new));
   private final Optional<je<dad>> d;

   ess(List<euu> $$0, Optional<je<dad>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public etc b() {
      return etd.g;
   }

   @Override
   public cuh a(cuh $$0, erp $$1) {
      ayt $$2 = $$1.b();
      Optional<ja<dad>> $$3 = this.d.<ja<dad>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cuk.sm);
         List<ja.c<dad>> $$3x = lh.f.h().filter($$0xx -> ((dad)$$0xx.a()).k()).filter($$2xx -> $$2x || ((dad)$$2xx.a()).b($$0)).toList();
         return ad.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cuh a(cuh $$0, dad $$1, ayt $$2) {
      int $$3 = aym.a($$2, $$1.f(), $$1.g());
      if ($$0.a(cuk.sm)) {
         $$0 = new cuh(cuk.wh);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static ess.a c() {
      return new ess.a();
   }

   public static eta.a<?> d() {
      return a($$0 -> new ess($$0, Optional.empty()));
   }

   public static class a extends eta.a<ess.a> {
      private final List<ja<dad>> a = new ArrayList<>();

      protected ess.a a() {
         return this;
      }

      public ess.a a(dad $$0) {
         this.a.add($$0.l());
         return this;
      }

      @Override
      public etb b() {
         return new ess(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(je.a(this.a)));
      }
   }
}
