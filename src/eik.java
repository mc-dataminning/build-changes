import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class eik extends eir {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<il<crr>> c = kd.f.r().listOf().xmap(il::a, $$0 -> $$0.a().toList());
   public static final Codec<eik> a = RecordCodecBuilder.create($$0 -> a($$0).and(atx.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, eik::new));
   private final Optional<il<crr>> d;

   eik(List<eke> $$0, Optional<il<crr>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eit b() {
      return eiu.e;
   }

   @Override
   public cng a(cng $$0, ehf $$1) {
      auw $$2 = $$1.b();
      Optional<ih<crr>> $$3 = this.d.<ih<crr>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cnj.qO);
         List<ih.c<crr>> $$3x = kd.f.h().filter($$0xx -> ((crr)$$0xx.a()).i()).filter($$2xx -> $$2x || ((crr)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cng a(cng $$0, crr $$1, auw $$2) {
      int $$3 = aup.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cnj.qO)) {
         $$0 = new cng(cnj.us);
         cmd.a($$0, new cru($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static eik.a c() {
      return new eik.a();
   }

   public static eir.a<?> d() {
      return a($$0 -> new eik($$0, Optional.empty()));
   }

   public static class a extends eir.a<eik.a> {
      private final List<ih<crr>> a = new ArrayList<>();

      protected eik.a a() {
         return this;
      }

      public eik.a a(crr $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eis b() {
         return new eik(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(il.a(this.a)));
      }
   }
}
