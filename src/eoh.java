import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eoh extends eoo {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ip<cwq>> c = kr.f.r().listOf().xmap(ip::a, $$0 -> $$0.a().toList());
   public static final Codec<eoh> a = RecordCodecBuilder.create($$0 -> a($$0).and(aws.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eoh::new));
   private final Optional<ip<cwq>> d;

   eoh(List<eqc> $$0, Optional<ip<cwq>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eoq b() {
      return eor.e;
   }

   @Override
   public crj a(crj $$0, enb $$1) {
      axr $$2 = $$1.b();
      Optional<il<cwq>> $$3 = this.d.<il<cwq>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(crm.qO);
         List<il.c<cwq>> $$3x = kr.f.h().filter($$0xx -> ((cwq)$$0xx.a()).j()).filter($$2xx -> $$2x || ((cwq)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static crj a(crj $$0, cwq $$1, axr $$2) {
      int $$3 = axk.a($$2, $$1.f(), $$1.a());
      if ($$0.a(crm.qO)) {
         $$0 = new crj(crm.uu);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eoh.a c() {
      return new eoh.a();
   }

   public static eoo.a<?> d() {
      return a($$0 -> new eoh($$0, Optional.empty()));
   }

   public static class a extends eoo.a<eoh.a> {
      private final List<il<cwq>> a = new ArrayList<>();

      protected eoh.a a() {
         return this;
      }

      public eoh.a a(cwq $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public eop b() {
         return new eoh(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ip.a(this.a)));
      }
   }
}
