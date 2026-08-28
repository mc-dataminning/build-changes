import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class etu extends etn {
   private final boolean a;
   private final Long2ObjectMap<etr> l = new Long2ObjectOpenHashMap();

   public etu(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dgw $$0, bvk $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public etm a() {
      return this.c(ayz.a(this.c.cR().a), ayz.a(this.c.cR().b + 0.5), ayz.a(this.c.cR().c));
   }

   @Override
   public etv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(etm[] $$0, etm $$1) {
      int $$2 = 0;
      Map<jn, etm> $$3 = Maps.newEnumMap(jn.class);

      for (jn $$4 : jn.values()) {
         etm $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jn $$6 : jn.c.a) {
         jn $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            etm $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable etm $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable etm $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected etm a(int $$0, int $$1, int $$2) {
      etm $$3 = null;
      etr $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == etr.u || $$4 == etr.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new ji($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected etr b(int $$0, int $$1, int $$2) {
      return (etr)this.l.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public etr a(ett $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public etr a(ett $$0, int $$1, int $$2, int $$3, bvk $$4) {
      ji.a $$5 = new ji.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               dwy $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eta $$10 = $$9.y();
               if ($$10.c() && $$9.a(etp.b) && $$9.l()) {
                  return etr.u;
               }

               if (!$$10.a(awv.a)) {
                  return etr.a;
               }
            }
         }
      }

      dwy $$11 = $$0.a($$5);
      return $$11.a(etp.b) ? etr.j : etr.a;
   }
}
