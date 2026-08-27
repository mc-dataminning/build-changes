import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class epo extends epw {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ja<cyg>> c = ld.f.r().listOf().xmap(ja::a, $$0 -> $$0.a().toList());
   public static final Codec<epo> a = RecordCodecBuilder.create($$0 -> a($$0).and(axh.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, epo::new));
   private final Optional<ja<cyg>> d;

   epo(List<erq> $$0, Optional<ja<cyg>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public epy b() {
      return epz.g;
   }

   @Override
   public csz a(csz $$0, eol $$1) {
      ayg $$2 = $$1.b();
      Optional<iw<cyg>> $$3 = this.d.<iw<cyg>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(ctc.qP);
         List<iw.c<cyg>> $$3x = ld.f.h().filter($$0xx -> ((cyg)$$0xx.a()).k()).filter($$2xx -> $$2x || ((cyg)$$2xx.a()).b($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static csz a(csz $$0, cyg $$1, ayg $$2) {
      int $$3 = axz.a($$2, $$1.f(), $$1.g());
      if ($$0.a(ctc.qP)) {
         $$0 = new csz(ctc.uw);
      }

      $$0.a($$1, $$3);
      return $$0;
   }

   public static epo.a c() {
      return new epo.a();
   }

   public static epw.a<?> d() {
      return a($$0 -> new epo($$0, Optional.empty()));
   }

   public static class a extends epw.a<epo.a> {
      private final List<iw<cyg>> a = new ArrayList<>();

      protected epo.a a() {
         return this;
      }

      public epo.a a(cyg $$0) {
         this.a.add($$0.l());
         return this;
      }

      @Override
      public epx b() {
         return new epo(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ja.a(this.a)));
      }
   }
}
