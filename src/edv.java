import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class edv extends eec {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<hk<cno>> c = jd.g.r().listOf().xmap(hk::a, $$0 -> $$0.a().toList());
   public static final Codec<edv> a = RecordCodecBuilder.create($$0 -> a($$0).and(arg.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, edv::new));
   private final Optional<hk<cno>> d;

   edv(List<efp> $$0, Optional<hk<cno>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public eee b() {
      return eef.e;
   }

   @Override
   public cjf a(cjf $$0, ecq $$1) {
      asc $$2 = $$1.b();
      Optional<hg<cno>> $$3 = this.d.<hg<cno>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cji.qb);
         List<hg.c<cno>> $$3x = jd.g.h().filter($$0xx -> ((cno)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cno)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cjf a(cjf $$0, cno $$1, asc $$2) {
      int $$3 = arx.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cji.qb)) {
         $$0 = new cjf(cji.tC);
         cib.a($$0, new cnr($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edv.a c() {
      return new edv.a();
   }

   public static eec.a<?> d() {
      return a($$0 -> new edv($$0, Optional.empty()));
   }

   public static class a extends eec.a<edv.a> {
      private final List<hg<cno>> a = new ArrayList<>();

      protected edv.a a() {
         return this;
      }

      public edv.a a(cno $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public eed b() {
         return new edv(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(hk.a(this.a)));
      }
   }
}
