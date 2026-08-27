import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fpv implements fpg<ddu> {
   private final Map<czm.a, fgh> a;
   private static final Map<czm.a, aep> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czm.b.a, new aep("textures/entity/skeleton/skeleton.png"));
      $$0.put(czm.b.b, new aep("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(czm.b.d, new aep("textures/entity/zombie/zombie.png"));
      $$0.put(czm.b.e, new aep("textures/entity/creeper/creeper.png"));
      $$0.put(czm.b.g, new aep("textures/entity/enderdragon/dragon.png"));
      $$0.put(czm.b.f, new aep("textures/entity/piglin/piglin.png"));
      $$0.put(czm.b.c, fyy.a());
   });

   public static Map<czm.a, fgh> a(fhf $$0) {
      Builder<czm.a, fgh> $$1 = ImmutableMap.builder();
      $$1.put(czm.b.a, new fgg($$0.a(fhi.bl)));
      $$1.put(czm.b.b, new fgg($$0.a(fhi.bT)));
      $$1.put(czm.b.c, new fgg($$0.a(fhi.aN)));
      $$1.put(czm.b.d, new fgg($$0.a(fhi.bY)));
      $$1.put(czm.b.e, new fgg($$0.a(fhi.D)));
      $$1.put(czm.b.g, new fhd($$0.a(fhi.K)));
      $$1.put(czm.b.f, new ffn($$0.a(fhi.aH)));
      return $$1.build();
   }

   public fpv(fph.a $$0) {
      this.a = a($$0.e());
   }

   public void a(ddu $$0, float $$1, elh $$2, fng $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dey $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dbj;
      hb $$9 = $$8 ? $$7.c(dbj.a) : null;
      int $$10 = $$8 ? dge.a($$9.g()) : $$7.c(czm.b);
      float $$11 = dge.b($$10);
      czm.a $$12 = ((crh)$$7.b()).a();
      fgh $$13 = this.a.get($$12);
      fno $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable hb $$0, float $$1, float $$2, elh $$3, fng $$4, int $$5, fgh $$6, fno $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      ell $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fno a(czm.a $$0, @Nullable GameProfile $$1) {
      aep $$2 = b.get($$0);
      if ($$0 == czm.b.c && $$1 != null) {
         fzh $$3 = eqn.N().ak();
         return fno.h($$3.b($$1).a());
      } else {
         return fno.e($$2);
      }
   }
}
