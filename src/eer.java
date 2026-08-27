import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eer extends een {
   private final boolean k;
   private final Long2ObjectMap<eek> l = new Long2ObjectOpenHashMap();

   public eer(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(ctl $$0, blx $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eem a() {
      return this.b(aty.a(this.b.cH().a), aty.a(this.b.cH().b + 0.5), aty.a(this.b.cH().c));
   }

   @Override
   public ees a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aty.a($$0), aty.a($$1), aty.a($$2)));
   }

   @Override
   public int a(eem[] $$0, eem $$1) {
      int $$2 = 0;
      Map<ia, eem> $$3 = Maps.newEnumMap(ia.class);

      for (ia $$4 : ia.values()) {
         eem $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ia $$6 : ia.c.a) {
         ia $$7 = $$6.h();
         eem $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable eem $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable eem $$0, @Nullable eem $$1, @Nullable eem $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected eem a(int $$0, int $$1, int $$2) {
      eem $$3 = null;
      eek $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eek.u || $$4 == eek.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new hv($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eek c(int $$0, int $$1, int $$2) {
      return (eek)this.l.computeIfAbsent(hv.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eek a(cse $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eek a(cse $$0, int $$1, int $$2, int $$3, blx $$4) {
      hv.a $$5 = new hv.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               edz $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dip $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), eep.b) && $$10.i()) {
                  return eek.u;
               }

               if (!$$9.a(arw.a)) {
                  return eek.a;
               }
            }
         }
      }

      dip $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, eep.b) ? eek.j : eek.a;
   }
}
