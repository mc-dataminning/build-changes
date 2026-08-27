import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class emb extends emi {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ip<cuw>> c = ki.f.r().listOf().xmap(ip::a, $$0 -> $$0.a().toList());
   public static final Codec<emb> a = RecordCodecBuilder.create($$0 -> a($$0).and(awe.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, emb::new));
   private final Optional<ip<cuw>> d;

   emb(List<env> $$0, Optional<ip<cuw>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public emk b() {
      return eml.e;
   }

   @Override
   public cqm a(cqm $$0, ekw $$1) {
      axd $$2 = $$1.b();
      Optional<il<cuw>> $$3 = this.d.<il<cuw>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cqp.qO);
         List<il.c<cuw>> $$3x = ki.f.h().filter($$0xx -> ((cuw)$$0xx.a()).j()).filter($$2xx -> $$2x || ((cuw)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cqm a(cqm $$0, cuw $$1, axd $$2) {
      int $$3 = aww.a($$2, $$1.f(), $$1.a());
      if ($$0.a(cqp.qO)) {
         $$0 = new cqm(cqp.uu);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static emb.a c() {
      return new emb.a();
   }

   public static emi.a<?> d() {
      return a($$0 -> new emb($$0, Optional.empty()));
   }

   public static class a extends emi.a<emb.a> {
      private final List<il<cuw>> a = new ArrayList<>();

      protected emb.a a() {
         return this;
      }

      public emb.a a(cuw $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public emj b() {
         return new emb(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ip.a(this.a)));
      }
   }
}
