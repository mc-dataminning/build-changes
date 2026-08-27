import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class edx extends eee {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<hk<cnq>> c = jd.g.r().listOf().xmap(hk::a, $$0 -> $$0.a().toList());
   public static final Codec<edx> a = RecordCodecBuilder.create($$0 -> a($$0).and(arh.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, edx::new));
   private final Optional<hk<cnq>> d;

   edx(List<efr> $$0, Optional<hk<cnq>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eeg b() {
      return eeh.e;
   }

   @Override
   public cjh a(cjh $$0, ecs $$1) {
      ase $$2 = $$1.b();
      Optional<hg<cnq>> $$3 = this.d.<hg<cnq>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cjk.qb);
         List<hg.c<cnq>> $$3x = jd.g.h().filter($$0xx -> ((cnq)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cnq)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cjh a(cjh $$0, cnq $$1, ase $$2) {
      int $$3 = ary.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cjk.qb)) {
         $$0 = new cjh(cjk.tC);
         cid.a($$0, new cnt($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edx.a c() {
      return new edx.a();
   }

   public static eee.a<?> d() {
      return a($$0 -> new edx($$0, Optional.empty()));
   }

   public static class a extends eee.a<edx.a> {
      private final List<hg<cnq>> a = new ArrayList<>();

      protected edx.a a() {
         return this;
      }

      public edx.a a(cnq $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eef b() {
         return new edx(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(hk.a(this.a)));
      }
   }
}
