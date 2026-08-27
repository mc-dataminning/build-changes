import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.authlib.GameProfile;
import java.util.Map;
import javax.annotation.Nullable;

public class fto implements fsz<dgt> {
   private final Map<dcg.a, fjr> a;
   private static final Map<dcg.a, agm> b = ac.a(Maps.newHashMap(), $$0 -> {
      $$0.put(dcg.b.c, new agm("textures/entity/skeleton/skeleton.png"));
      $$0.put(dcg.b.d, new agm("textures/entity/skeleton/wither_skeleton.png"));
      $$0.put(dcg.b.f, new agm("textures/entity/zombie/zombie.png"));
      $$0.put(dcg.b.g, new agm("textures/entity/creeper/creeper.png"));
      $$0.put(dcg.b.i, new agm("textures/entity/enderdragon/dragon.png"));
      $$0.put(dcg.b.h, new agm("textures/entity/piglin/piglin.png"));
      $$0.put(dcg.b.e, gcr.a());
   });

   public static Map<dcg.a, fjr> a(fkp $$0) {
      Builder<dcg.a, fjr> $$1 = ImmutableMap.builder();
      $$1.put(dcg.b.c, new fjq($$0.a(fks.bl)));
      $$1.put(dcg.b.d, new fjq($$0.a(fks.bT)));
      $$1.put(dcg.b.e, new fjq($$0.a(fks.aN)));
      $$1.put(dcg.b.f, new fjq($$0.a(fks.bY)));
      $$1.put(dcg.b.g, new fjq($$0.a(fks.D)));
      $$1.put(dcg.b.i, new fkn($$0.a(fks.K)));
      $$1.put(dcg.b.h, new fix($$0.a(fks.aH)));
      return $$1.build();
   }

   public fto(fta.a $$0) {
      this.a = a($$0.e());
   }

   public void a(dgt $$0, float $$1, eob $$2, fqz $$3, int $$4, int $$5) {
      float $$6 = $$0.a($$1);
      dhn $$7 = $$0.r();
      boolean $$8 = $$7.b() instanceof ded;
      ib $$9 = $$8 ? $$7.c(ded.d) : null;
      int $$10 = $$8 ? dit.a($$9.g()) : $$7.c(dcg.e);
      float $$11 = dit.b($$10);
      dcg.a $$12 = ((cub)$$7.b()).b();
      fjr $$13 = this.a.get($$12);
      frh $$14 = a($$12, $$0.d());
      a($$9, $$11, $$6, $$2, $$3, $$4, $$13, $$14);
   }

   public static void a(@Nullable ib $$0, float $$1, float $$2, eob $$3, fqz $$4, int $$5, fjr $$6, frh $$7) {
      $$3.a();
      if ($$0 == null) {
         $$3.a(0.5F, 0.0F, 0.5F);
      } else {
         float $$8 = 0.25F;
         $$3.a(0.5F - (float)$$0.j() * 0.25F, 0.25F, 0.5F - (float)$$0.l() * 0.25F);
      }

      $$3.b(-1.0F, -1.0F, 1.0F);
      eof $$9 = $$4.getBuffer($$7);
      $$6.a($$2, $$1, 0.0F);
      $$6.a($$3, $$9, $$5, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
   }

   public static frh a(dcg.a $$0, @Nullable GameProfile $$1) {
      agm $$2 = b.get($$0);
      if ($$0 == dcg.b.e && $$1 != null) {
         gda $$3 = eti.N().ak();
         return frh.i($$3.b($$1).a());
      } else {
         return frh.f($$2);
      }
   }
}
