import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class efr extends efn {
   private final boolean k;
   private final Long2ObjectMap<efk> l = new Long2ObjectOpenHashMap();

   public efr(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cuk $$0, bmq $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public efm a() {
      return this.b(aup.a(this.b.cH().a), aup.a(this.b.cH().b + 0.5), aup.a(this.b.cH().c));
   }

   @Override
   public efs a(double $$0, double $$1, double $$2) {
      return this.a(this.b(aup.a($$0), aup.a($$1), aup.a($$2)));
   }

   @Override
   public int a(efm[] $$0, efm $$1) {
      int $$2 = 0;
      Map<ic, efm> $$3 = Maps.newEnumMap(ic.class);

      for (ic $$4 : ic.values()) {
         efm $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ic $$6 : ic.c.a) {
         ic $$7 = $$6.h();
         efm $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable efm $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable efm $$0, @Nullable efm $$1, @Nullable efm $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected efm a(int $$0, int $$1, int $$2) {
      efm $$3 = null;
      efk $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == efk.u || $$4 == efk.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new hx($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected efk c(int $$0, int $$1, int $$2) {
      return (efk)this.l.computeIfAbsent(hx.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public efk a(ctd $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public efk a(ctd $$0, int $$1, int $$2, int $$3, bmq $$4) {
      hx.a $$5 = new hx.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eez $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               djp $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), efp.b) && $$10.i()) {
                  return efk.u;
               }

               if (!$$9.a(asn.a)) {
                  return efk.a;
               }
            }
         }
      }

      djp $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, efp.b) ? efk.j : efk.a;
   }
}
