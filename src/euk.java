import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class euk extends eud {
   private final boolean a;
   private final Long2ObjectMap<euh> l = new Long2ObjectOpenHashMap();

   public euk(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dhm $$0, bvz $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public euc a() {
      return this.c(azu.a(this.c.cR().a), azu.a(this.c.cR().b + 0.5), azu.a(this.c.cR().c));
   }

   @Override
   public eul a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(euc[] $$0, euc $$1) {
      int $$2 = 0;
      Map<jm, euc> $$3 = Maps.newEnumMap(jm.class);

      for (jm $$4 : jm.values()) {
         euc $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jm $$6 : jm.c.a) {
         jm $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            euc $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable euc $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable euc $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected euc a(int $$0, int $$1, int $$2) {
      euc $$3 = null;
      euh $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == euh.u || $$4 == euh.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new jh($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected euh b(int $$0, int $$1, int $$2) {
      return (euh)this.l.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public euh a(euj $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public euh a(euj $$0, int $$1, int $$2, int $$3, bvz $$4) {
      jh.a $$5 = new jh.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               dxo $$9 = $$0.a($$5.d($$6, $$7, $$8));
               etq $$10 = $$9.y();
               if ($$10.c() && $$9.a(euf.b) && $$9.l()) {
                  return euh.u;
               }

               if (!$$10.a(axq.a)) {
                  return euh.a;
               }
            }
         }
      }

      dxo $$11 = $$0.a($$5);
      return $$11.a(euf.b) ? euh.j : euh.a;
   }
}
