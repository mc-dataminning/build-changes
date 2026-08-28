import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class evn extends evg {
   private final boolean a;
   private final Long2ObjectMap<evk> l = new Long2ObjectOpenHashMap();

   public evn(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dic $$0, bwt $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public evf a() {
      return this.c(azk.a(this.c.cR().a), azk.a(this.c.cR().b + 0.5), azk.a(this.c.cR().c));
   }

   @Override
   public evo a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(evf[] $$0, evf $$1) {
      int $$2 = 0;
      Map<jo, evf> $$3 = Maps.newEnumMap(jo.class);

      for (jo $$4 : jo.values()) {
         evf $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jo $$6 : jo.c.a) {
         jo $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            evf $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable evf $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable evf $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected evf a(int $$0, int $$1, int $$2) {
      evf $$3 = null;
      evk $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == evk.u || $$4 == evk.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new jj($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected evk b(int $$0, int $$1, int $$2) {
      return (evk)this.l.computeIfAbsent(jj.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public evk a(evm $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public evk a(evm $$0, int $$1, int $$2, int $$3, bwt $$4) {
      jj.a $$5 = new jj.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               dym $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eut $$10 = $$9.y();
               if ($$10.c() && $$9.a(evi.b) && $$9.l()) {
                  return evk.u;
               }

               if (!$$10.a(axf.a)) {
                  return evk.a;
               }
            }
         }
      }

      dym $$11 = $$0.a($$5);
      return $$11.a(evi.b) ? evk.j : evk.a;
   }
}
