import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class esi extends esb {
   private final boolean k;
   private final Long2ObjectMap<esf> l = new Long2ObjectOpenHashMap();

   public esi(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dfs $$0, bvg $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public esa a() {
      return this.c(azn.a(this.b.cT().a), azn.a(this.b.cT().b + 0.5), azn.a(this.b.cT().c));
   }

   @Override
   public esj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(esa[] $$0, esa $$1) {
      int $$2 = 0;
      Map<jm, esa> $$3 = Maps.newEnumMap(jm.class);

      for (jm $$4 : jm.values()) {
         esa $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jm $$6 : jm.c.a) {
         jm $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            esa $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable esa $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable esa $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected esa a(int $$0, int $$1, int $$2) {
      esa $$3 = null;
      esf $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == esf.u || $$4 == esf.j) {
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

   protected esf b(int $$0, int $$1, int $$2) {
      return (esf)this.l.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public esf a(esh $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public esf a(esh $$0, int $$1, int $$2, int $$3, bvg $$4) {
      jh.a $$5 = new jh.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dvo $$9 = $$0.a($$5.d($$6, $$7, $$8));
               ero $$10 = $$9.y();
               if ($$10.c() && $$9.a(esd.b) && $$9.l()) {
                  return esf.u;
               }

               if (!$$10.a(axj.a)) {
                  return esf.a;
               }
            }
         }
      }

      dvo $$11 = $$0.a($$5);
      return $$11.a(esd.b) ? esf.j : esf.a;
   }
}
