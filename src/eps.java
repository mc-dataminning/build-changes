import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eps extends epl {
   private final boolean k;
   private final Long2ObjectMap<epp> l = new Long2ObjectOpenHashMap();

   public eps(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(ddh $$0, btn $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public epk a() {
      return this.c(ayn.a(this.b.cL().a), ayn.a(this.b.cL().b + 0.5), ayn.a(this.b.cL().c));
   }

   @Override
   public ept a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(epk[] $$0, epk $$1) {
      int $$2 = 0;
      Map<ji, epk> $$3 = Maps.newEnumMap(ji.class);

      for (ji $$4 : ji.values()) {
         epk $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ji $$6 : ji.c.a) {
         ji $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            epk $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable epk $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable epk $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected epk a(int $$0, int $$1, int $$2) {
      epk $$3 = null;
      epp $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == epp.u || $$4 == epp.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new jd($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected epp b(int $$0, int $$1, int $$2) {
      return (epp)this.l.computeIfAbsent(jd.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public epp a(epr $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public epp a(epr $$0, int $$1, int $$2, int $$3, btn $$4) {
      jd.a $$5 = new jd.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dta $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eoy $$10 = $$9.u();
               if ($$10.c() && $$9.a(epn.b) && $$9.i()) {
                  return epp.u;
               }

               if (!$$10.a(awj.a)) {
                  return epp.a;
               }
            }
         }
      }

      dta $$11 = $$0.a($$5);
      return $$11.a(epn.b) ? epp.j : epp.a;
   }
}
