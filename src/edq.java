import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class edq extends edx {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<hk<cnj>> c = jd.g.r().listOf().xmap(hk::a, $$0 -> $$0.a().toList());
   public static final Codec<edq> a = RecordCodecBuilder.create($$0 -> a($$0).and(arb.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, edq::new));
   private final Optional<hk<cnj>> d;

   edq(List<efk> $$0, Optional<hk<cnj>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public edz b() {
      return eea.e;
   }

   @Override
   public cja a(cja $$0, ecl $$1) {
      arx $$2 = $$1.b();
      Optional<hg<cnj>> $$3 = this.d.<hg<cnj>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cjd.qb);
         List<hg.c<cnj>> $$3x = jd.g.h().filter($$0xx -> ((cnj)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cnj)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cja a(cja $$0, cnj $$1, arx $$2) {
      int $$3 = ars.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cjd.qb)) {
         $$0 = new cja(cjd.tC);
         chw.a($$0, new cnm($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edq.a c() {
      return new edq.a();
   }

   public static edx.a<?> d() {
      return a($$0 -> new edq($$0, Optional.empty()));
   }

   public static class a extends edx.a<edq.a> {
      private final List<hg<cnj>> a = new ArrayList<>();

      protected edq.a a() {
         return this;
      }

      public edq.a a(cnj $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public edy b() {
         return new edq(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(hk.a(this.a)));
      }
   }
}
