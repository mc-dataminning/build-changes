import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fqj implements fpu<ddv> {
   private final Map<czn.a, fgq> a;
   private static final Map<czn.a, aer> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czn.b.a, new aer("textures/entity/skeleton/skeleton.png"));
      $$0.put(czn.b.b, new aer("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(czn.b.d, new aer("textures/entity/zombie/zombie.png"));
      $$0.put(czn.b.e, new aer("textures/entity/creeper/creeper.png"));
      $$0.put(czn.b.g, new aer("textures/entity/enderdragon/dragon.png"));
      $$0.put(czn.b.f, new aer("textures/entity/piglin/piglin.png"));
      $$0.put(czn.b.c, fzm.a());
   });

   public static Map<czn.a, fgq> a(fho $$0) {
      Builder<czn.a, fgq> $$1 = ImmutableMap.builder();
      $$1.put(czn.b.a, new fgp($$0.a(fhr.bl)));
      $$1.put(czn.b.b, new fgp($$0.a(fhr.bT)));
      $$1.put(czn.b.c, new fgp($$0.a(fhr.aN)));
      $$1.put(czn.b.d, new fgp($$0.a(fhr.bY)));
      $$1.put(czn.b.e, new fgp($$0.a(fhr.D)));
      $$1.put(czn.b.g, new fhm($$0.a(fhr.K)));
      $$1.put(czn.b.f, new ffw($$0.a(fhr.aH)));
      return $$1.build();
   }

   public fqj(fpv.a $$0) {
      this.a = a($$0.e());
   }

   public void a(ddv $$0, float $$1, elf $$2, fnu $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dez $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dbk;
      ha $$9 = $$8 ? $$7.c(dbk.a) : null;
      int $$10 = $$8 ? dgf.a($$9.g()) : $$7.c(czn.b);
      float $$11 = dgf.b($$10);
      czn.a $$12 = ((cri)$$7.b()).a();
      fgq $$13 = this.a.get($$12);
      foc $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ha $$0, float $$1, float $$2, elf $$3, fnu $$4, int $$5, fgq $$6, foc $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      elj $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static foc a(czn.a $$0, @Nullable GameProfile $$1) {
      aer $$2 = b.get($$0);
      if ($$0 == czn.b.c && $$1 != null) {
         fzv $$3 = eql.O().al();
         return foc.i($$3.b($$1).a());
      } else {
         return foc.f($$2);
      }
   }
}
