import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fqt implements fqe<def> {
   private final Map<czx.a, fha> a;
   private static final Map<czx.a, aew> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czx.b.a, new aew("textures/entity/skeleton/skeleton.png"));
      $$0.put(czx.b.b, new aew("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(czx.b.d, new aew("textures/entity/zombie/zombie.png"));
      $$0.put(czx.b.e, new aew("textures/entity/creeper/creeper.png"));
      $$0.put(czx.b.g, new aew("textures/entity/enderdragon/dragon.png"));
      $$0.put(czx.b.f, new aew("textures/entity/piglin/piglin.png"));
      $$0.put(czx.b.c, fzw.a());
   });

   public static Map<czx.a, fha> a(fhy $$0) {
      Builder<czx.a, fha> $$1 = ImmutableMap.builder();
      $$1.put(czx.b.a, new fgz($$0.a(fib.bl)));
      $$1.put(czx.b.b, new fgz($$0.a(fib.bT)));
      $$1.put(czx.b.c, new fgz($$0.a(fib.aN)));
      $$1.put(czx.b.d, new fgz($$0.a(fib.bY)));
      $$1.put(czx.b.e, new fgz($$0.a(fib.D)));
      $$1.put(czx.b.g, new fhw($$0.a(fib.K)));
      $$1.put(czx.b.f, new fgg($$0.a(fib.aH)));
      return $$1.build();
   }

   public fqt(fqf.a $$0) {
      this.a = a($$0.e());
   }

   public void a(def $$0, float $$1, elp $$2, foe $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dfj $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dbu;
      ha $$9 = $$8 ? $$7.c(dbu.b) : null;
      int $$10 = $$8 ? dgp.a($$9.g()) : $$7.c(czx.c);
      float $$11 = dgp.b($$10);
      czx.a $$12 = ((crs)$$7.b()).a();
      fha $$13 = this.a.get($$12);
      fom $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ha $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5, fha $$6, fom $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      elt $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static fom a(czx.a $$0, @Nullable GameProfile $$1) {
      aew $$2 = b.get($$0);
      if ($$0 == czx.b.c && $$1 != null) {
         gaf $$3 = eqv.O().al();
         return fom.i($$3.b($$1).a());
      } else {
         return fom.f($$2);
      }
   }
}
