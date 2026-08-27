import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eoq extends eox {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ir<cwz>> c = kt.f.r().listOf().xmap(ir::a, $$0 -> $$0.a().toList());
   public static final Codec<eoq> a = RecordCodecBuilder.create($$0 -> a($$0).and(awu.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eoq::new));
   private final Optional<ir<cwz>> d;

   eoq(List<eql> $$0, Optional<ir<cwz>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eoz b() {
      return epa.e;
   }

   @Override
   public crs a(crs $$0, enk $$1) {
      axt $$2 = $$1.b();
      Optional<in<cwz>> $$3 = this.d.<in<cwz>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(crv.qO);
         List<in.c<cwz>> $$3x = kt.f.h().filter($$0xx -> ((cwz)$$0xx.a()).j()).filter($$2xx -> $$2x || ((cwz)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static crs a(crs $$0, cwz $$1, axt $$2) {
      int $$3 = axm.a($$2, $$1.f(), $$1.a());
      if ($$0.a(crv.qO)) {
         $$0 = new crs(crv.uu);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static eoq.a c() {
      return new eoq.a();
   }

   public static eox.a<?> d() {
      return a($$0 -> new eoq($$0, Optional.empty()));
   }

   public static class a extends eox.a<eoq.a> {
      private final List<in<cwz>> a = new ArrayList<>();

      protected eoq.a a() {
         return this;
      }

      public eoq.a a(cwz $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public eoy b() {
         return new eoq(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ir.a(this.a)));
      }
   }
}
