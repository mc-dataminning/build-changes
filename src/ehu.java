import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ehu extends eib {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<il<crc>> c = kd.f.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<ehu> a = RecordCodecBuilder.create($$0 -> a($$0).and(atq.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, ehu::new));
   private final Optional<il<crc>> d;

   ehu(List<ejo> $$0, Optional<il<crc>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eid b() {
      return eie.e;
   }

   @Override
   public cmr a(cmr $$0, egp $$1) {
      aup $$2 = $$1.b();
      Optional<ih<crc>> $$3 = this.d.<ih<crc>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cmu.qM);
         List<ih.c<crc>> $$3x = kd.f.h().filter($$0xx -> ((crc)$$0xx.a()).i()).filter($$2xx -> $$2x || ((crc)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cmr a(cmr $$0, crc $$1, aup $$2) {
      int $$3 = aui.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cmu.qM)) {
         $$0 = new cmr(cmu.up);
         cln.a($$0, new crf($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static ehu.a c() {
      return new ehu.a();
   }

   public static eib.a<?> d() {
      return a($$0 -> new ehu($$0, Optional.empty()));
   }

   public static class a extends eib.a<ehu.a> {
      private final List<ih<crc>> a = new ArrayList<>();

      protected ehu.a a() {
         return this;
      }

      public ehu.a a(crc $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eic b() {
         return new ehu(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(il.a(this.a)));
      }
   }
}
