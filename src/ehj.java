import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class ehj extends ehq {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ij<cqs>> c = kb.f.r().listOf().xmap(ij::a, $$0 -> $$0.a().toList());
   public static final Codec<ehj> a = RecordCodecBuilder.create($$0 -> a($$0).and(atg.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, ehj::new));
   private final Optional<ij<cqs>> d;

   ehj(List<ejd> $$0, Optional<ij<cqs>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public ehs b() {
      return eht.e;
   }

   @Override
   public cmh a(cmh $$0, ege $$1) {
      auf $$2 = $$1.b();
      Optional<ie<cqs>> $$3 = this.d.<ie<cqs>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cmk.qM);
         List<ie.c<cqs>> $$3x = kb.f.h().filter($$0xx -> ((cqs)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cqs)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cmh a(cmh $$0, cqs $$1, auf $$2) {
      int $$3 = aty.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cmk.qM)) {
         $$0 = new cmh(cmk.up);
         cld.a($$0, new cqv($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static ehj.a c() {
      return new ehj.a();
   }

   public static ehq.a<?> d() {
      return a($$0 -> new ehj($$0, Optional.empty()));
   }

   public static class a extends ehq.a<ehj.a> {
      private final List<ie<cqs>> a = new ArrayList<>();

      protected ehj.a a() {
         return this;
      }

      public ehj.a a(cqs $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public ehr b() {
         return new ehj(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ij.a(this.a)));
      }
   }
}
