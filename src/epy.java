import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class epy extends epr {
   private final boolean k;
   private final Long2ObjectMap<epv> l = new Long2ObjectOpenHashMap();

   public epy(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dcn $$0, bsq $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public epq a() {
      return this.c(aym.a(this.b.cP().a), aym.a(this.b.cP().b + 0.5), aym.a(this.b.cP().c));
   }

   @Override
   public epz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(epq[] $$0, epq $$1) {
      int $$2 = 0;
      Map<iw, epq> $$3 = Maps.newEnumMap(iw.class);

      for (iw $$4 : iw.values()) {
         epq $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (iw $$6 : iw.c.a) {
         iw $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            epq $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable epq $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable epq $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected epq a(int $$0, int $$1, int $$2) {
      epq $$3 = null;
      epv $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == epv.u || $$4 == epv.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new ir($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected epv b(int $$0, int $$1, int $$2) {
      return (epv)this.l.computeIfAbsent(ir.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public epv a(epx $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public epv a(epx $$0, int $$1, int $$2, int $$3, bsq $$4) {
      ir.a $$5 = new ir.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dtc $$9 = $$0.a($$5.d($$6, $$7, $$8));
               epe $$10 = $$9.u();
               if ($$10.c() && $$9.a(ept.b) && $$9.i()) {
                  return epv.u;
               }

               if (!$$10.a(awj.a)) {
                  return epv.a;
               }
            }
         }
      }

      dtc $$11 = $$0.a($$5);
      return $$11.a(ept.b) ? epv.j : epv.a;
   }
}
