import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ese extends erx {
   private final boolean k;
   private final Long2ObjectMap<esb> l = new Long2ObjectOpenHashMap();

   public ese(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dfo $$0, bvc $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public erw a() {
      return this.c(azk.a(this.b.cS().a), azk.a(this.b.cS().b + 0.5), azk.a(this.b.cS().c));
   }

   @Override
   public esf a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erw[] $$0, erw $$1) {
      int $$2 = 0;
      Map<jm, erw> $$3 = Maps.newEnumMap(jm.class);

      for (jm $$4 : jm.values()) {
         erw $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jm $$6 : jm.c.a) {
         jm $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            erw $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erw $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable erw $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected erw a(int $$0, int $$1, int $$2) {
      erw $$3 = null;
      esb $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == esb.u || $$4 == esb.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new jh($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected esb b(int $$0, int $$1, int $$2) {
      return (esb)this.l.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public esb a(esd $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public esb a(esd $$0, int $$1, int $$2, int $$3, bvc $$4) {
      jh.a $$5 = new jh.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dvj $$9 = $$0.a($$5.d($$6, $$7, $$8));
               erk $$10 = $$9.y();
               if ($$10.c() && $$9.a(erz.b) && $$9.l()) {
                  return esb.u;
               }

               if (!$$10.a(axg.a)) {
                  return esb.a;
               }
            }
         }
      }

      dvj $$11 = $$0.a($$5);
      return $$11.a(erz.b) ? esb.j : esb.a;
   }
}
