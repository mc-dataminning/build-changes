import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ery extends err {
   private final boolean k;
   private final Long2ObjectMap<erv> l = new Long2ObjectOpenHashMap();

   public ery(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dfi $$0, bux $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public erq a() {
      return this.c(azj.a(this.b.cS().a), azj.a(this.b.cS().b + 0.5), azj.a(this.b.cS().c));
   }

   @Override
   public erz a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erq[] $$0, erq $$1) {
      int $$2 = 0;
      Map<jl, erq> $$3 = Maps.newEnumMap(jl.class);

      for (jl $$4 : jl.values()) {
         erq $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jl $$6 : jl.c.a) {
         jl $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            erq $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erq $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable erq $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected erq a(int $$0, int $$1, int $$2) {
      erq $$3 = null;
      erv $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == erv.u || $$4 == erv.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new jg($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected erv b(int $$0, int $$1, int $$2) {
      return (erv)this.l.computeIfAbsent(jg.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public erv a(erx $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public erv a(erx $$0, int $$1, int $$2, int $$3, bux $$4) {
      jg.a $$5 = new jg.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dvd $$9 = $$0.a($$5.d($$6, $$7, $$8));
               ere $$10 = $$9.y();
               if ($$10.c() && $$9.a(ert.b) && $$9.l()) {
                  return erv.u;
               }

               if (!$$10.a(axf.a)) {
                  return erv.a;
               }
            }
         }
      }

      dvd $$11 = $$0.a($$5);
      return $$11.a(ert.b) ? erv.j : erv.a;
   }
}
