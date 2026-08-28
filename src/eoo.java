import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eoo extends eoh {
   private final boolean k;
   private final Long2ObjectMap<eol> l = new Long2ObjectOpenHashMap();

   public eoo(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dck $$0, btq $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eog a() {
      return this.c(ayy.a(this.b.cK().a), ayy.a(this.b.cK().b + 0.5), ayy.a(this.b.cK().c));
   }

   @Override
   public eop a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eog[] $$0, eog $$1) {
      int $$2 = 0;
      Map<je, eog> $$3 = Maps.newEnumMap(je.class);

      for (je $$4 : je.values()) {
         eog $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (je $$6 : je.c.a) {
         je $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eog $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eog $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eog $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eog a(int $$0, int $$1, int $$2) {
      eog $$3 = null;
      eol $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == eol.u || $$4 == eol.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new iz($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eol b(int $$0, int $$1, int $$2) {
      return (eol)this.l.computeIfAbsent(iz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eol a(eon $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eol a(eon $$0, int $$1, int $$2, int $$3, btq $$4) {
      iz.a $$5 = new iz.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dsb $$9 = $$0.a($$5.d($$6, $$7, $$8));
               enu $$10 = $$9.u();
               if ($$10.c() && $$9.a(eoj.b) && $$9.i()) {
                  return eol.u;
               }

               if (!$$10.a(awu.a)) {
                  return eol.a;
               }
            }
         }
      }

      dsb $$11 = $$0.a($$5);
      return $$11.a(eoj.b) ? eol.j : eol.a;
   }
}
