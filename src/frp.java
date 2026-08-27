import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class frp implements fra<dfh> {
   private final Map<dba.a, fhu> a;
   private static final Map<dba.a, afw> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dba.b.c, new afw("textures/entity/skeleton/skeleton.png"));
      $$0.put(dba.b.d, new afw("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dba.b.f, new afw("textures/entity/zombie/zombie.png"));
      $$0.put(dba.b.g, new afw("textures/entity/creeper/creeper.png"));
      $$0.put(dba.b.i, new afw("textures/entity/enderdragon/dragon.png"));
      $$0.put(dba.b.h, new afw("textures/entity/piglin/piglin.png"));
      $$0.put(dba.b.e, gas.a());
   });

   public static Map<dba.a, fhu> a(fis $$0) {
      Builder<dba.a, fhu> $$1 = ImmutableMap.builder();
      $$1.put(dba.b.c, new fht($$0.a(fiv.bl)));
      $$1.put(dba.b.d, new fht($$0.a(fiv.bT)));
      $$1.put(dba.b.e, new fht($$0.a(fiv.aN)));
      $$1.put(dba.b.f, new fht($$0.a(fiv.bY)));
      $$1.put(dba.b.g, new fht($$0.a(fiv.D)));
      $$1.put(dba.b.i, new fiq($$0.a(fiv.K)));
      $$1.put(dba.b.h, new fha($$0.a(fiv.aH)));
      return $$1.build();
   }

   public frp(frb.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dfh $$0, float $$1, emh $$2, fpb $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dgb $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dcw;
      hx $$9 = $$8 ? $$7.c(dcw.d) : null;
      int $$10 = $$8 ? dhh.a($$9.g()) : $$7.c(dba.e);
      float $$11 = dhh.b($$10);
      dba.a $$12 = ((csw)$$7.b()).b();
      fhu $$13 = this.a.get($$12);
      fpj $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable hx $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5, fhu $$6, fpj $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eml $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fpj a(dba.a $$0, @Nullable GameProfile $$1) {
      afw $$2 = b.get($$0);
      if ($$0 == dba.b.e && $$1 != null) {
         gbb $$3 = ero.O().al();
         return fpj.i($$3.b($$1).a());
      } else {
         return fpj.f($$2);
      }
   }
}
