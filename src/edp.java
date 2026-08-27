import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class edp extends edw {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<hi<cnu>> c = jb.g.r().listOf().xmap(hi::a, $$0 -> $$0.a().toList());
   public static final Codec<edp> a = RecordCodecBuilder.create($$0 -> a($$0).and(arj.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, edp::new));
   private final Optional<hi<cnu>> d;

   edp(List<efj> $$0, Optional<hi<cnu>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public edy b() {
      return edz.e;
   }

   @Override
   public cjl a(cjl $$0, eck $$1) {
      ash $$2 = $$1.b();
      Optional<he<cnu>> $$3 = this.d.<he<cnu>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(cjo.qb);
         List<he.c<cnu>> $$3x = jb.g.h().filter($$0xx -> ((cnu)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cnu)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static cjl a(cjl $$0, cnu $$1, ash $$2) {
      int $$3 = asb.a($$2, $$1.e(), $$1.a());
      if ($$0.a(cjo.qb)) {
         $$0 = new cjl(cjo.tC);
         cih.a($$0, new cnx($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static edp.a c() {
      return new edp.a();
   }

   public static edw.a<?> d() {
      return a($$0 -> new edp($$0, Optional.empty()));
   }

   public static class a extends edw.a<edp.a> {
      private final List<he<cnu>> a = new ArrayList<>();

      protected edp.a a() {
         return this;
      }

      public edp.a a(cnu $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public edx b() {
         return new edp(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(hi.a(this.a)));
      }
   }
}
