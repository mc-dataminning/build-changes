import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class ftj implements fsu<dgo> {
   private final Map<dcb.a, fjm> a;
   private static final Map<dcb.a, agi> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcb.b.c, new agi("textures/entity/skeleton/skeleton.png"));
      $$0.put(dcb.b.d, new agi("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dcb.b.f, new agi("textures/entity/zombie/zombie.png"));
      $$0.put(dcb.b.g, new agi("textures/entity/creeper/creeper.png"));
      $$0.put(dcb.b.i, new agi("textures/entity/enderdragon/dragon.png"));
      $$0.put(dcb.b.h, new agi("textures/entity/piglin/piglin.png"));
      $$0.put(dcb.b.e, gcm.a());
   });

   public static Map<dcb.a, fjm> a(fkk $$0) {
      Builder<dcb.a, fjm> $$1 = ImmutableMap.builder();
      $$1.put(dcb.b.c, new fjl($$0.a(fkn.bl)));
      $$1.put(dcb.b.d, new fjl($$0.a(fkn.bT)));
      $$1.put(dcb.b.e, new fjl($$0.a(fkn.aN)));
      $$1.put(dcb.b.f, new fjl($$0.a(fkn.bY)));
      $$1.put(dcb.b.g, new fjl($$0.a(fkn.D)));
      $$1.put(dcb.b.i, new fki($$0.a(fkn.K)));
      $$1.put(dcb.b.h, new fis($$0.a(fkn.aH)));
      return $$1.build();
   }

   public ftj(fsv.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dgo $$0, float $$1, enw $$2, fqu $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dhi $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof ddy;
      hx $$9 = $$8 ? $$7.c(ddy.d) : null;
      int $$10 = $$8 ? dio.a($$9.g()) : $$7.c(dcb.e);
      float $$11 = dio.b($$10);
      dcb.a $$12 = ((ctw)$$7.b()).b();
      fjm $$13 = this.a.get($$12);
      frc $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable hx $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5, fjm $$6, frc $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eoa $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static frc a(dcb.a $$0, @Nullable GameProfile $$1) {
      agi $$2 = b.get($$0);
      if ($$0 == dcb.b.e && $$1 != null) {
         gcv $$3 = etd.N().ak();
         return frc.i($$3.b($$1).a());
      } else {
         return frc.f($$2);
      }
   }
}
