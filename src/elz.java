import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class elz extends emg {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ip<cuu>> c = ki.f.r().listOf().xmap(ip::a, $$0 -> $$0.a().toList());
   public static final Codec<elz> a = RecordCodecBuilder.create($$0 -> a($$0).and(awe.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, elz::new));
   private final Optional<ip<cuu>> d;

   elz(List<ent> $$0, Optional<ip<cuu>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public emi b() {
      return emj.e;
   }

   @Override
   public cqk a(cqk $$0, eku $$1) {
      axd $$2 = $$1.b();
      Optional<il<cuu>> $$3 = this.d.<il<cuu>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cqn.qO);
         List<il.c<cuu>> $$3x = ki.f.h().filter($$0xx -> ((cuu)$$0xx.a()).j()).filter($$2xx -> $$2x || ((cuu)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cqk a(cqk $$0, cuu $$1, axd $$2) {
      int $$3 = aww.a($$2, $$1.f(), $$1.a());
      if ($$0.a(cqn.qO)) {
         $$0 = new cqk(cqn.ut);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static elz.a c() {
      return new elz.a();
   }

   public static emg.a<?> d() {
      return a($$0 -> new elz($$0, Optional.empty()));
   }

   public static class a extends emg.a<elz.a> {
      private final List<il<cuu>> a = new ArrayList<>();

      protected elz.a a() {
         return this;
      }

      public elz.a a(cuu $$0) {
         this.a.add($$0.k());
         return this;
      }

      @Override
      public emh b() {
         return new elz(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ip.a(this.a)));
      }
   }
}
