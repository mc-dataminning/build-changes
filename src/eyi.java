import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eyi extends eyb {
   private final boolean a;
   private final Long2ObjectMap<eyf> l = new Long2ObjectOpenHashMap();

   public eyi(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dkk $$0, bxw $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eya a() {
      return this.c(azo.a(this.c.cR().a), azo.a(this.c.cR().b + 0.5), azo.a(this.c.cR().c));
   }

   @Override
   public eyj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eya[] $$0, eya $$1) {
      int $$2 = 0;
      Map<jb, eya> $$3 = Maps.newEnumMap(jb.class);

      for (jb $$4 : jb.values()) {
         eya $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jb $$6 : jb.c.a) {
         jb $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eya $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eya $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eya $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eya a(int $$0, int $$1, int $$2) {
      eya $$3 = null;
      eyf $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == eyf.u || $$4 == eyf.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new iv($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eyf b(int $$0, int $$1, int $$2) {
      return (eyf)this.l.computeIfAbsent(iv.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public eyf a(eyh $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public eyf a(eyh $$0, int $$1, int $$2, int $$3, bxw $$4) {
      iv.a $$5 = new iv.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               ebe $$9 = $$0.a($$5.d($$6, $$7, $$8));
               exo $$10 = $$9.y();
               if ($$10.c() && $$9.a(eyd.b) && $$9.l()) {
                  return eyf.u;
               }

               if (!$$10.a(axj.a)) {
                  return eyf.a;
               }
            }
         }
      }

      ebe $$11 = $$0.a($$5);
      return $$11.a(eyd.b) ? eyf.j : eyf.a;
   }
}
