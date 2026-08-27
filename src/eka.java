import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eka extends ekh {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<in<cti>> c = kf.f.r().listOf().xmap(in::a, $$0 -> $$0.a().toList());
   public static final Codec<eka> a = RecordCodecBuilder.create($$0 -> a($$0).and(avp.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eka::new));
   private final Optional<in<cti>> d;

   eka(List<elu> $$0, Optional<in<cti>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public ekj b() {
      return ekk.e;
   }

   @Override
   public coz a(coz $$0, eiv $$1) {
      awo $$2 = $$1.b();
      Optional<ij<cti>> $$3 = this.d.<ij<cti>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cpc.qO);
         List<ij.c<cti>> $$3x = kf.f.h().filter($$0xx -> ((cti)$$0xx.a()).j()).filter($$2xx -> $$2x || ((cti)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static coz a(coz $$0, cti $$1, awo $$2) {
      int $$3 = awh.a($$2, $$1.f(), $$1.a());
      if ($$0.a(cpc.qO)) {
         $$0 = new coz(cpc.us);
         cnv.a($$0, new ctk($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static eka.a c() {
      return new eka.a();
   }

   public static ekh.a<?> d() {
      return a($$0 -> new eka($$0, Optional.empty()));
   }

   public static class a extends ekh.a<eka.a> {
      private final List<ij<cti>> a = new ArrayList<>();

      protected eka.a a() {
         return this;
      }

      public eka.a a(cti $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public eki b() {
         return new eka(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(in.a(this.a)));
      }
   }
}
