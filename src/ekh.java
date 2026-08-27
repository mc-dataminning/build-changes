import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ekh extends eko {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<in<ctm>> c = kf.f.r().listOf().xmap(in::a, $$0 -> $$0.a().toList());
   public static final Codec<ekh> a = RecordCodecBuilder.create($$0 -> a($$0).and(avq.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, ekh::new));
   private final Optional<in<ctm>> d;

   ekh(List<emb> $$0, Optional<in<ctm>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public ekq b() {
      return ekr.e;
   }

   @Override
   public cpd a(cpd $$0, ejc $$1) {
      awp $$2 = $$1.b();
      Optional<ij<ctm>> $$3 = this.d.<ij<ctm>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cpg.qO);
         List<ij.c<ctm>> $$3x = kf.f.h().filter($$0xx -> ((ctm)$$0xx.a()).j()).filter($$2xx -> $$2x || ((ctm)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cpd a(cpd $$0, ctm $$1, awp $$2) {
      int $$3 = awi.a($$2, $$1.f(), $$1.a());
      if ($$0.a(cpg.qO)) {
         $$0 = new cpd(cpg.us);
         cnz.a($$0, new cto($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static ekh.a c() {
      return new ekh.a();
   }

   public static eko.a<?> d() {
      return a($$0 -> new ekh($$0, Optional.empty()));
   }

   public static class a extends eko.a<ekh.a> {
      private final List<ij<ctm>> a = new ArrayList<>();

      protected ekh.a a() {
         return this;
      }

      public ekh.a a(ctm $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public ekp b() {
         return new ekh(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(in.a(this.a)));
      }
   }
}
