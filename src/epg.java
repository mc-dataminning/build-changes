import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class epg extends epo {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<iz<cxn>> c = lc.f.r().listOf().xmap(iz::a, $$0 -> $$0.a().toList());
   public static final Codec<epg> a = RecordCodecBuilder.create($$0 -> a($$0).and(axe.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, epg::new));
   private final Optional<iz<cxn>> d;

   epg(List<erh> $$0, Optional<iz<cxn>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public epq b() {
      return epr.e;
   }

   @Override
   public csd a(csd $$0, eoa $$1) {
      ayd $$2 = $$1.b();
      Optional<iv<cxn>> $$3 = this.d.<iv<cxn>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(csg.qP);
         List<iv.c<cxn>> $$3x = lc.f.h().filter($$0xx -> ((cxn)$$0xx.a()).j()).filter($$2xx -> $$2x || ((cxn)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static csd a(csd $$0, cxn $$1, ayd $$2) {
      int $$3 = axw.a($$2, $$1.f(), $$1.a());
      if ($$0.a(csg.qP)) {
         $$0 = new csd(csg.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static epg.a c() {
      return new epg.a();
   }

   public static epo.a<?> d() {
      return a($$0 -> new epg($$0, Optional.empty()));
   }

   public static class a extends epo.a<epg.a> {
      private final List<iv<cxn>> a = new ArrayList<>();

      protected epg.a a() {
         return this;
      }

      public epg.a a(cxn $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public epp b() {
         return new epg(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(iz.a(this.a)));
      }
   }
}
