import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class egh extends ego {
   private static final Logger b = LogUtils.getLogger();
   private static final Codec<ik<cpz>> c = kc.g.r().listOf().xmap(ik::a, $$0 -> $$0.a().toList());
   public static final Codec<egh> a = RecordCodecBuilder.create($$0 -> a($$0).and(asy.a(c, "enchantments").forGetter($$0x -> $$0x.d)).apply($$0, egh::new));
   private final Optional<ik<cpz>> d;

   egh(List<eib> $$0, Optional<ik<cpz>> $$1) {
      super($$0);
      this.d = $$1;
   }

   @Override
   public egq b() {
      return egr.e;
   }

   @Override
   public clo a(clo $$0, efc $$1) {
      atw $$2 = $$1.b();
      Optional<ig<cpz>> $$3 = this.d.<ig<cpz>>flatMap($$1x -> $$1x.a($$2)).or(() -> {
         boolean $$2x = $$0.a(clr.qM);
         List<ig.c<cpz>> $$3x = kc.g.h().filter($$0xx -> ((cpz)$$0xx.a()).i()).filter($$2xx -> $$2x || ((cpz)$$2xx.a()).a($$0)).toList();
         return ac.b($$3x, $$2);
      });
      if ($$3.isEmpty()) {
         b.warn("Couldn't find a compatible enchantment for {}", $$0);
         return $$0;
      } else {
         return a($$0, $$3.get().a(), $$2);
      }
   }

   private static clo a(clo $$0, cpz $$1, atw $$2) {
      int $$3 = atq.a($$2, $$1.e(), $$1.a());
      if ($$0.a(clr.qM)) {
         $$0 = new clo(clr.uo);
         ckk.a($$0, new cqc($$1, $$3));
      } else {
         $$0.a($$1, $$3);
      }

      return $$0;
   }

   public static egh.a c() {
      return new egh.a();
   }

   public static ego.a<?> d() {
      return a($$0 -> new egh($$0, Optional.empty()));
   }

   public static class a extends ego.a<egh.a> {
      private final List<ig<cpz>> a = new ArrayList<>();

      protected egh.a a() {
         return this;
      }

      public egh.a a(cpz $$0) {
         this.a.add($$0.j());
         return this;
      }

      @Override
      public egp b() {
         return new egh(this.g(), this.a.isEmpty() ? Optional.empty() : Optional.of(ik.a(this.a)));
      }
   }
}
