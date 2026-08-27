import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fsw implements fsh<dgc> {
   private final Map<dbu.a, fiz> a;
   private static final Map<dbu.a, agg> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dbu.b.c, new agg("textures/entity/skeleton/skeleton.png"));
      $$0.put(dbu.b.d, new agg("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dbu.b.f, new agg("textures/entity/zombie/zombie.png"));
      $$0.put(dbu.b.g, new agg("textures/entity/creeper/creeper.png"));
      $$0.put(dbu.b.i, new agg("textures/entity/enderdragon/dragon.png"));
      $$0.put(dbu.b.h, new agg("textures/entity/piglin/piglin.png"));
      $$0.put(dbu.b.e, gbz.a());
   });

   public static Map<dbu.a, fiz> a(fjx $$0) {
      Builder<dbu.a, fiz> $$1 = ImmutableMap.builder();
      $$1.put(dbu.b.c, new fiy($$0.a(fka.bl)));
      $$1.put(dbu.b.d, new fiy($$0.a(fka.bT)));
      $$1.put(dbu.b.e, new fiy($$0.a(fka.aN)));
      $$1.put(dbu.b.f, new fiy($$0.a(fka.bY)));
      $$1.put(dbu.b.g, new fiy($$0.a(fka.D)));
      $$1.put(dbu.b.i, new fjv($$0.a(fka.K)));
      $$1.put(dbu.b.h, new fif($$0.a(fka.aH)));
      return $$1.build();
   }

   public fsw(fsi.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dgc $$0, float $$1, enk $$2, fqh $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dgw $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof ddq;
      hx $$9 = $$8 ? $$7.c(ddq.d) : null;
      int $$10 = $$8 ? dic.a($$9.g()) : $$7.c(dbu.e);
      float $$11 = dic.b($$10);
      dbu.a $$12 = ((ctp)$$7.b()).b();
      fiz $$13 = this.a.get($$12);
      fqp $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable hx $$0, float $$1, float $$2, enk $$3, fqh $$4, int $$5, fiz $$6, fqp $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eno $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fqp a(dbu.a $$0, @Nullable GameProfile $$1) {
      agg $$2 = b.get($$0);
      if ($$0 == dbu.b.e && $$1 != null) {
         gci $$3 = esr.N().ak();
         return fqp.i($$3.b($$1).a());
      } else {
         return fqp.f($$2);
      }
   }
}
