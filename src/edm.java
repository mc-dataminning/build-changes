import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class edm extends edt {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<hi<cnf>> c = jb.g.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<edm> a = RecordCodecBuilder.create($$0 -> a($$0).and(aqy.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, edm::new));
   private final Optional<hi<cnf>> d;

   edm(List<efg> $$0, Optional<hi<cnf>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public edv b() {
      return edw.e;
   }

   @Override
   public ciy a(ciy $$0, ech $$1) {
      aru $$2 = $$1.b();
      Optional<he<cnf>> $$3 = this.d.<he<cnf>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cjb.qb);
         List<he.c<cnf>> $$3x = jb.g.h().filter($$0xx -> ((cnf)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cnf)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static ciy a(ciy $$0, cnf $$1, aru $$2) {
      int $$3 = arp.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cjb.qb)) {
         $$0 = new ciy(cjb.tC);
         chu.a($$0, new cni($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edm.a c() {
      return new edm.a();
   }

   public static edt.a<?> d() {
      return a($$0 -> new edm($$0, Optional.empty()));
   }

   public static class a extends edt.a<edm.a> {
      private final List<he<cnf>> a = new ArrayList<>();

      protected edm.a a() {
         return this;
      }

      public edm.a a(cnf $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public edu b() {
         return new edm(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(hi.a(this.a)));
      }
   }
}
