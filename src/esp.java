import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class esp extends esi {
   private final boolean k;
   private final Long2ObjectMap<esm> l = new Long2ObjectOpenHashMap();

   public esp(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dfz $$0, bvj $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public esh a() {
      return this.c(azm.a(this.b.cR().a), azm.a(this.b.cR().b + 0.5), azm.a(this.b.cR().c));
   }

   @Override
   public esq a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(esh[] $$0, esh $$1) {
      int $$2 = 0;
      Map<jm, esh> $$3 = Maps.newEnumMap(jm.class);

      for (jm $$4 : jm.values()) {
         esh $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jm $$6 : jm.c.a) {
         jm $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            esh $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable esh $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable esh $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected esh a(int $$0, int $$1, int $$2) {
      esh $$3 = null;
      esm $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == esm.u || $$4 == esm.j) {
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

   protected esm b(int $$0, int $$1, int $$2) {
      return (esm)this.l.computeIfAbsent(jh.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public esm a(eso $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public esm a(eso $$0, int $$1, int $$2, int $$3, bvj $$4) {
      jh.a $$5 = new jh.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dvv $$9 = $$0.a($$5.d($$6, $$7, $$8));
               erv $$10 = $$9.y();
               if ($$10.c() && $$9.a(esk.b) && $$9.l()) {
                  return esm.u;
               }

               if (!$$10.a(axi.a)) {
                  return esm.a;
               }
            }
         }
      }

      dvv $$11 = $$0.a($$5);
      return $$11.a(esk.b) ? esm.j : esm.a;
   }
}
