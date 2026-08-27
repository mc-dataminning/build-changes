import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eij extends eif {
   private final boolean k;
   private final Long2ObjectMap<eic> l = new Long2ObjectOpenHashMap();

   public eij(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cwr $$0, boz $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eie a() {
      return this.b(awm.a(this.b.cE().a), awm.a(this.b.cE().b + 0.5), awm.a(this.b.cE().c));
   }

   @Override
   public eik a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awm.a($$0), awm.a($$1), awm.a($$2)));
   }

   @Override
   public int a(eie[] $$0, eie $$1) {
      int $$2 = 0;
      Map<ih, eie> $$3 = Maps.newEnumMap(ih.class);

      for (ih $$4 : ih.values()) {
         eie $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ih $$6 : ih.c.a) {
         ih $$7 = $$6.h();
         eie $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable eie $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable eie $$0, @Nullable eie $$1, @Nullable eie $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected eie a(int $$0, int $$1, int $$2) {
      eie $$3 = null;
      eic $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eic.u || $$4 == eic.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new ib($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eic c(int $$0, int $$1, int $$2) {
      return (eic)this.l.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eic a(cvk $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eic a(cvk $$0, int $$1, int $$2, int $$3, boz $$4) {
      ib.a $$5 = new ib.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               ehr $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dme $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), eih.b) && $$10.i()) {
                  return eic.u;
               }

               if (!$$9.a(auj.a)) {
                  return eic.a;
               }
            }
         }
      }

      dme $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, eih.b) ? eic.j : eic.a;
   }
}
