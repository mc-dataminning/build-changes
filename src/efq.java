import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class efq extends efx {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ig<cpm>> c = jy.g.r().listOf().xmap(ig::a, $$0 -> $$0.a().toList());
   public static final Codec<efq> a = RecordCodecBuilder.create($$0 -> a($$0).and(asq.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, efq::new));
   private final Optional<ig<cpm>> d;

   efq(List<ehk> $$0, Optional<ig<cpm>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public efz b() {
      return ega.e;
   }

   @Override
   public clb a(clb $$0, eel $$1) {
      ato $$2 = $$1.b();
      Optional<ib<cpm>> $$3 = this.d.<ib<cpm>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cle.qb);
         List<ib.c<cpm>> $$3x = jy.g.h().filter($$0xx -> ((cpm)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cpm)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static clb a(clb $$0, cpm $$1, ato $$2) {
      int $$3 = ati.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cle.qb)) {
         $$0 = new clb(cle.tD);
         cjx.a($$0, new cpp($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static efq.a c() {
      return new efq.a();
   }

   public static efx.a<?> d() {
      return a($$0 -> new efq($$0, Optional.empty()));
   }

   public static class a extends efx.a<efq.a> {
      private final List<ib<cpm>> a = new ArrayList<>();

      protected efq.a a() {
         return this;
      }

      public efq.a a(cpm $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public efy b() {
         return new efq(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ig.a(this.a)));
      }
   }
}
