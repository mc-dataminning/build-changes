import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eav extends ear {
   private final boolean k;
   private final Long2ObjectMap<eao> l = new Long2ObjectOpenHashMap();

   public eav(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cpz $$0, bja $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eaq a() {
      return this.b(arp.a(this.b.cG().a), arp.a(this.b.cG().b + 0.5), arp.a(this.b.cG().c));
   }

   @Override
   public eaw a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arp.a($$0), arp.a($$1), arp.a($$2)));
   }

   @Override
   public int a(eaq[] $$0, eaq $$1) {
      int $$2 = 0;
      Map<ha, eaq> $$3 = Maps.newEnumMap(ha.class);

      for (ha $$4 : ha.values()) {
         eaq $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ha $$6 : ha.c.a) {
         ha $$7 = $$6.h();
         eaq $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable eaq $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable eaq $$0, @Nullable eaq $$1, @Nullable eaq $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected eaq a(int $$0, int $$1, int $$2) {
      eaq $$3 = null;
      eao $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eao.u || $$4 == eao.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new gu($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eao c(int $$0, int $$1, int $$2) {
      return (eao)this.l.computeIfAbsent(gu.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eao a(cos $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eao a(cos $$0, int $$1, int $$2, int $$3, bja $$4) {
      gu.a $$5 = new gu.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               ead $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dfa $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), eat.b) && $$10.i()) {
                  return eao.u;
               }

               if (!$$9.a(apq.a)) {
                  return eao.a;
               }
            }
         }
      }

      dfa $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, eat.b) ? eao.j : eao.a;
   }
}
