import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fqa implements fpl<ddw> {
   private final Map<czo.a, fgl> a;
   private static final Map<czo.a, aer> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czo.b.a, new aer("textures/entity/skeleton/skeleton.png"));
      $$0.put(czo.b.b, new aer("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(czo.b.d, new aer("textures/entity/zombie/zombie.png"));
      $$0.put(czo.b.e, new aer("textures/entity/creeper/creeper.png"));
      $$0.put(czo.b.g, new aer("textures/entity/enderdragon/dragon.png"));
      $$0.put(czo.b.f, new aer("textures/entity/piglin/piglin.png"));
      $$0.put(czo.b.c, fzd.a());
   });

   public static Map<czo.a, fgl> a(fhj $$0) {
      Builder<czo.a, fgl> $$1 = ImmutableMap.builder();
      $$1.put(czo.b.a, new fgk($$0.a(fhm.bl)));
      $$1.put(czo.b.b, new fgk($$0.a(fhm.bT)));
      $$1.put(czo.b.c, new fgk($$0.a(fhm.aN)));
      $$1.put(czo.b.d, new fgk($$0.a(fhm.bY)));
      $$1.put(czo.b.e, new fgk($$0.a(fhm.D)));
      $$1.put(czo.b.g, new fhh($$0.a(fhm.K)));
      $$1.put(czo.b.f, new ffr($$0.a(fhm.aH)));
      return $$1.build();
   }

   public fqa(fpm.a $$0) {
      this.a = a($$0.e());
   }

   public void a(ddw $$0, float $$1, elg $$2, fnl $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dfa $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dbl;
      ha $$9 = $$8 ? $$7.c(dbl.a) : null;
      int $$10 = $$8 ? dgg.a($$9.g()) : $$7.c(czo.b);
      float $$11 = dgg.b($$10);
      czo.a $$12 = ((crj)$$7.b()).a();
      fgl $$13 = this.a.get($$12);
      fnt $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ha $$0, float $$1, float $$2, elg $$3, fnl $$4, int $$5, fgl $$6, fnt $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      elk $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fyc.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fnt a(czo.a $$0, @Nullable GameProfile $$1) {
      aer $$2 = b.get($$0);
      if ($$0 == czo.b.c && $$1 != null) {
         fzm $$3 = eqm.O().al();
         return fnt.i($$3.b($$1).a());
      } else {
         return fnt.f($$2);
      }
   }
}
