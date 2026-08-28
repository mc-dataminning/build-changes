import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class epb extends eou {
   private final boolean k;
   private final Long2ObjectMap<eoy> l = new Long2ObjectOpenHashMap();

   public epb(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dcs $$0, btd $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eot a() {
      return this.c(ayg.a(this.b.cL().a), ayg.a(this.b.cL().b + 0.5), ayg.a(this.b.cL().c));
   }

   @Override
   public epc a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eot[] $$0, eot $$1) {
      int $$2 = 0;
      Map<jf, eot> $$3 = Maps.newEnumMap(jf.class);

      for (jf $$4 : jf.values()) {
         eot $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jf $$6 : jf.c.a) {
         jf $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eot $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eot $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eot $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eot a(int $$0, int $$1, int $$2) {
      eot $$3 = null;
      eoy $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == eoy.u || $$4 == eoy.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new ja($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eoy b(int $$0, int $$1, int $$2) {
      return (eoy)this.l.computeIfAbsent(ja.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eoy a(epa $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eoy a(epa $$0, int $$1, int $$2, int $$3, btd $$4) {
      ja.a $$5 = new ja.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dsk $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eoh $$10 = $$9.u();
               if ($$10.c() && $$9.a(eow.b) && $$9.i()) {
                  return eoy.u;
               }

               if (!$$10.a(awc.a)) {
                  return eoy.a;
               }
            }
         }
      }

      dsk $$11 = $$0.a($$5);
      return $$11.a(eow.b) ? eoy.j : eoy.a;
   }
}
