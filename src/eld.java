import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eld extends elk {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ip<ctz>> c = kh.f.r().listOf().xmap(ip::a, $$0 -> $$0.a().toList());
   public static final Codec<eld> a = RecordCodecBuilder.create($$0 -> a($$0).and(avu.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eld::new));
   private final Optional<ip<ctz>> d;

   eld(List<emx> $$0, Optional<ip<ctz>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public elm b() {
      return eln.e;
   }

   @Override
   public cpq a(cpq $$0, ejy $$1) {
      awt $$2 = $$1.b();
      Optional<il<ctz>> $$3 = this.d.<il<ctz>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cpt.qO);
         List<il.c<ctz>> $$3x = kh.f.h().filter($$0xx -> ((ctz)$$0xx.a()).j()).filter($$2xx -> $$2x || ((ctz)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cpq a(cpq $$0, ctz $$1, awt $$2) {
      int $$3 = awm.a($$2, $$1.f(), $$1.a());
      if ($$0.a(cpt.qO)) {
         $$0 = new cpq(cpt.us);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eld.a c() {
      return new eld.a();
   }

   public static elk.a<?> d() {
      return a($$0 -> new eld($$0, Optional.empty()));
   }

   public static class a extends elk.a<eld.a> {
      private final List<il<ctz>> a = new ArrayList<>();

      protected eld.a a() {
         return this;
      }

      public eld.a a(ctz $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public ell b() {
         return new eld(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ip.a(this.a)));
      }
   }
}
