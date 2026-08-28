import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ern extends erg {
   private final boolean k;
   private final Long2ObjectMap<erk> l = new Long2ObjectOpenHashMap();

   public ern(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dew $$0, bup $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public erf a() {
      return this.c(azf.a(this.b.cO().a), azf.a(this.b.cO().b + 0.5), azf.a(this.b.cO().c));
   }

   @Override
   public ero a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erf[] $$0, erf $$1) {
      int $$2 = 0;
      Map<jk, erf> $$3 = Maps.newEnumMap(jk.class);

      for (jk $$4 : jk.values()) {
         erf $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jk $$6 : jk.c.a) {
         jk $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            erf $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erf $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable erf $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected erf a(int $$0, int $$1, int $$2) {
      erf $$3 = null;
      erk $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == erk.u || $$4 == erk.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new jf($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected erk b(int $$0, int $$1, int $$2) {
      return (erk)this.l.computeIfAbsent(jf.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public erk a(erm $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public erk a(erm $$0, int $$1, int $$2, int $$3, bup $$4) {
      jf.a $$5 = new jf.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dus $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eqt $$10 = $$9.y();
               if ($$10.c() && $$9.a(eri.b) && $$9.l()) {
                  return erk.u;
               }

               if (!$$10.a(axb.a)) {
                  return erk.a;
               }
            }
         }
      }

      dus $$11 = $$0.a($$5);
      return $$11.a(eri.b) ? erk.j : erk.a;
   }
}
