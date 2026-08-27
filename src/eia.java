import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eia extends eih {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<il<cri>> c = kd.f.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<eia> a = RecordCodecBuilder.create($$0 -> a($$0).and(atv.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eia::new));
   private final Optional<il<cri>> d;

   eia(List<eju> $$0, Optional<il<cri>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eij b() {
      return eik.e;
   }

   @Override
   public cmx a(cmx $$0, egv $$1) {
      auu $$2 = $$1.b();
      Optional<ih<cri>> $$3 = this.d.<ih<cri>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cna.qM);
         List<ih.c<cri>> $$3x = kd.f.h().filter($$0xx -> ((cri)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cri)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cmx a(cmx $$0, cri $$1, auu $$2) {
      int $$3 = aun.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cna.qM)) {
         $$0 = new cmx(cna.up);
         clt.a($$0, new crl($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static eia.a c() {
      return new eia.a();
   }

   public static eih.a<?> d() {
      return a($$0 -> new eia($$0, Optional.empty()));
   }

   public static class a extends eih.a<eia.a> {
      private final List<ih<cri>> a = new ArrayList<>();

      protected eia.a a() {
         return this;
      }

      public eia.a a(cri $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eii b() {
         return new eia(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(il.a(this.a)));
      }
   }
}
