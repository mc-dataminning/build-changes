import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fqp implements fqa<dej> {
   private final Map<dac.a, fgv> a;
   private static final Map<dac.a, aez> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dac.b.c, new aez("textures/entity/skeleton/skeleton.png"));
      $$0.put(dac.b.d, new aez("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dac.b.f, new aez("textures/entity/zombie/zombie.png"));
      $$0.put(dac.b.g, new aez("textures/entity/creeper/creeper.png"));
      $$0.put(dac.b.i, new aez("textures/entity/enderdragon/dragon.png"));
      $$0.put(dac.b.h, new aez("textures/entity/piglin/piglin.png"));
      $$0.put(dac.b.e, fzs.a());
   });

   public static Map<dac.a, fgv> a(fht $$0) {
      Builder<dac.a, fgv> $$1 = ImmutableMap.builder();
      $$1.put(dac.b.c, new fgu($$0.a(fhw.bl)));
      $$1.put(dac.b.d, new fgu($$0.a(fhw.bT)));
      $$1.put(dac.b.e, new fgu($$0.a(fhw.aN)));
      $$1.put(dac.b.f, new fgu($$0.a(fhw.bY)));
      $$1.put(dac.b.g, new fgu($$0.a(fhw.D)));
      $$1.put(dac.b.i, new fhr($$0.a(fhw.K)));
      $$1.put(dac.b.h, new fgb($$0.a(fhw.aH)));
      return $$1.build();
   }

   public fqp(fqb.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dej $$0, float $$1, elj $$2, foa $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dfd $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dby;
      ha $$9 = $$8 ? $$7.c(dby.d) : null;
      int $$10 = $$8 ? dgj.a($$9.g()) : $$7.c(dac.e);
      float $$11 = dgj.b($$10);
      dac.a $$12 = ((cry)$$7.b()).b();
      fgv $$13 = this.a.get($$12);
      foi $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ha $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5, fgv $$6, foi $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eln $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static foi a(dac.a $$0, @Nullable GameProfile $$1) {
      aez $$2 = b.get($$0);
      if ($$0 == dac.b.e && $$1 != null) {
         gab $$3 = eqp.O().al();
         return foi.i($$3.b($$1).a());
      } else {
         return foi.f($$2);
      }
   }
}
