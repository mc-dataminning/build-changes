import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eib extends eii {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<il<crj>> c = kd.f.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<eib> a = RecordCodecBuilder.create($$0 -> a($$0).and(atw.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eib::new));
   private final Optional<il<crj>> d;

   eib(List<ejv> $$0, Optional<il<crj>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eik b() {
      return eil.e;
   }

   @Override
   public cmy a(cmy $$0, egw $$1) {
      auv $$2 = $$1.b();
      Optional<ih<crj>> $$3 = this.d.<ih<crj>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cnb.qM);
         List<ih.c<crj>> $$3x = kd.f.h().filter($$0xx -> ((crj)$$0xx.a()).i()).filter($$2xx -> $$2x || ((crj)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cmy a(cmy $$0, crj $$1, auv $$2) {
      int $$3 = auo.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cnb.qM)) {
         $$0 = new cmy(cnb.up);
         clu.a($$0, new crm($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static eib.a c() {
      return new eib.a();
   }

   public static eii.a<?> d() {
      return a($$0 -> new eib($$0, Optional.empty()));
   }

   public static class a extends eii.a<eib.a> {
      private final List<ih<crj>> a = new ArrayList<>();

      protected eib.a a() {
         return this;
      }

      public eib.a a(crj $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eij b() {
         return new eib(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(il.a(this.a)));
      }
   }
}
