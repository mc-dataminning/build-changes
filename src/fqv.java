import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fqv implements fqg<deh> {
   private final Map<czz.a, fhc> a;
   private static final Map<czz.a, aey> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(czz.b.a, new aey("textures/entity/skeleton/skeleton.png"));
      $$0.put(czz.b.b, new aey("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(czz.b.d, new aey("textures/entity/zombie/zombie.png"));
      $$0.put(czz.b.e, new aey("textures/entity/creeper/creeper.png"));
      $$0.put(czz.b.g, new aey("textures/entity/enderdragon/dragon.png"));
      $$0.put(czz.b.f, new aey("textures/entity/piglin/piglin.png"));
      $$0.put(czz.b.c, fzy.a());
   });

   public static Map<czz.a, fhc> a(fia $$0) {
      Builder<czz.a, fhc> $$1 = ImmutableMap.builder();
      $$1.put(czz.b.a, new fhb($$0.a(fid.bl)));
      $$1.put(czz.b.b, new fhb($$0.a(fid.bT)));
      $$1.put(czz.b.c, new fhb($$0.a(fid.aN)));
      $$1.put(czz.b.d, new fhb($$0.a(fid.bY)));
      $$1.put(czz.b.e, new fhb($$0.a(fid.D)));
      $$1.put(czz.b.g, new fhy($$0.a(fid.K)));
      $$1.put(czz.b.f, new fgi($$0.a(fid.aH)));
      return $$1.build();
   }

   public fqv(fqh.a $$0) {
      this.a = a($$0.e());
   }

   public void a(deh $$0, float $$1, elr $$2, fog $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dfl $$7 = $$0.q();
      boolean $$8 = $$7.b() instanceof dbw;
      hc $$9 = $$8 ? $$7.c(dbw.b) : null;
      int $$10 = $$8 ? dgr.a($$9.g()) : $$7.c(czz.c);
      float $$11 = dgr.b($$10);
      czz.a $$12 = ((cru)$$7.b()).a();
      fhc $$13 = this.a.get($$12);
      foo $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable hc $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5, fhc $$6, foo $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      elv $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static foo a(czz.a $$0, @Nullable GameProfile $$1) {
      aey $$2 = b.get($$0);
      if ($$0 == czz.b.c && $$1 != null) {
         gah $$3 = eqx.O().al();
         return foo.i($$3.b($$1).a());
      } else {
         return foo.f($$2);
      }
   }
}
