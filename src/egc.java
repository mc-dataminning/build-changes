import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class egc extends egj {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ig<cpu>> c = jy.g.r().listOf().xmap(ig::a, $$0 -> $$0.a().toList());
   public static final Codec<egc> a = RecordCodecBuilder.create($$0 -> a($$0).and(asu.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, egc::new));
   private final Optional<ig<cpu>> d;

   egc(List<ehw> $$0, Optional<ig<cpu>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public egl b() {
      return egm.e;
   }

   @Override
   public clj a(clj $$0, eex $$1) {
      ats $$2 = $$1.b();
      Optional<ib<cpu>> $$3 = this.d.<ib<cpu>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(clm.qM);
         List<ib.c<cpu>> $$3x = jy.g.h().filter($$0xx -> ((cpu)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cpu)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static clj a(clj $$0, cpu $$1, ats $$2) {
      int $$3 = atm.a($$2, $$1.e(), $$1.a());
      if ($$0.a(clm.qM)) {
         $$0 = new clj(clm.uo);
         ckf.a($$0, new cpx($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static egc.a c() {
      return new egc.a();
   }

   public static egj.a<?> d() {
      return a($$0 -> new egc($$0, Optional.empty()));
   }

   public static class a extends egj.a<egc.a> {
      private final List<ib<cpu>> a = new ArrayList<>();

      protected egc.a a() {
         return this;
      }

      public egc.a a(cpu $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public egk b() {
         return new egc(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ig.a(this.a)));
      }
   }
}
