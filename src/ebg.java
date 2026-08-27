import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ebg extends ebc {
   private final boolean k;
   private final Long2ObjectMap<eaz> l = new Long2ObjectOpenHashMap();

   public ebg(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cqk $$0, bjk $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public ebb a() {
      return this.b(ary.a(this.b.cG().a), ary.a(this.b.cG().b + 0.5), ary.a(this.b.cG().c));
   }

   @Override
   public ebh a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ary.a($$0), ary.a($$1), ary.a($$2)));
   }

   @Override
   public int a(ebb[] $$0, ebb $$1) {
      int $$2 = 0;
      Map<hc, ebb> $$3 = Maps.newEnumMap(hc.class);

      for (hc $$4 : hc.values()) {
         ebb $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (hc $$6 : hc.c.a) {
         hc $$7 = $$6.h();
         ebb $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable ebb $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable ebb $$0, @Nullable ebb $$1, @Nullable ebb $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected ebb a(int $$0, int $$1, int $$2) {
      ebb $$3 = null;
      eaz $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eaz.u || $$4 == eaz.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new gw($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eaz c(int $$0, int $$1, int $$2) {
      return (eaz)this.l.computeIfAbsent(gw.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eaz a(cpd $$0, int $$1, int $$2, int $$3, bjk $$4) {
      gw.a $$5 = new gw.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eao $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dfl $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), ebe.b) && $$10.i()) {
                  return eaz.u;
               }

               if (!$$9.a(apz.a)) {
                  return eaz.a;
               }
            }
         }
      }

      dfl $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, ebe.b) ? eaz.j : eaz.a;
   }
}
