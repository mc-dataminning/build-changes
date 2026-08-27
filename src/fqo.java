import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fqo implements fpz<dea> {
   private final Map<czs.a, fgv> a;
   private static final Map<czs.a, aeu> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czs.b.a, new aeu("textures/entity/skeleton/skeleton.png"));
      $$0.put(czs.b.b, new aeu("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(czs.b.d, new aeu("textures/entity/zombie/zombie.png"));
      $$0.put(czs.b.e, new aeu("textures/entity/creeper/creeper.png"));
      $$0.put(czs.b.g, new aeu("textures/entity/enderdragon/dragon.png"));
      $$0.put(czs.b.f, new aeu("textures/entity/piglin/piglin.png"));
      $$0.put(czs.b.c, fzr.a());
   });

   public static Map<czs.a, fgv> a(fht $$0) {
      Builder<czs.a, fgv> $$1 = ImmutableMap.builder();
      $$1.put(czs.b.a, new fgu($$0.a(fhw.bl)));
      $$1.put(czs.b.b, new fgu($$0.a(fhw.bT)));
      $$1.put(czs.b.c, new fgu($$0.a(fhw.aN)));
      $$1.put(czs.b.d, new fgu($$0.a(fhw.bY)));
      $$1.put(czs.b.e, new fgu($$0.a(fhw.D)));
      $$1.put(czs.b.g, new fhr($$0.a(fhw.K)));
      $$1.put(czs.b.f, new fgb($$0.a(fhw.aH)));
      return $$1.build();
   }

   public fqo(fqa.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dea $$0, float $$1, elk $$2, fnz $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dfe $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dbp;
      hc $$9 = $$8 ? $$7.c(dbp.b) : null;
      int $$10 = $$8 ? dgk.a($$9.g()) : $$7.c(czs.c);
      float $$11 = dgk.b($$10);
      czs.a $$12 = ((crn)$$7.b()).a();
      fgv $$13 = this.a.get($$12);
      foh $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable hc $$0, float $$1, float $$2, elk $$3, fnz $$4, int $$5, fgv $$6, foh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      elo $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static foh a(czs.a $$0, @Nullable GameProfile $$1) {
      aeu $$2 = b.get($$0);
      if ($$0 == czs.b.c && $$1 != null) {
         gaa $$3 = eqq.O().al();
         return foh.i($$3.b($$1).a());
      } else {
         return foh.f($$2);
      }
   }
}
