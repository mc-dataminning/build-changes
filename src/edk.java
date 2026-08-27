import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class edk extends edg {
   private final boolean k;
   private final Long2ObjectMap<edd> l = new Long2ObjectOpenHashMap();

   public edk(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(csn $$0, bli $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public edf a() {
      return this.b(atm.a(this.b.cH().a), atm.a(this.b.cH().b + 0.5), atm.a(this.b.cH().c));
   }

   @Override
   public edl a(double $$0, double $$1, double $$2) {
      return this.a(this.b(atm.a($$0), atm.a($$1), atm.a($$2)));
   }

   @Override
   public int a(edf[] $$0, edf $$1) {
      int $$2 = 0;
      Map<hx, edf> $$3 = Maps.newEnumMap(hx.class);

      for (hx $$4 : hx.values()) {
         edf $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (hx $$6 : hx.c.a) {
         hx $$7 = $$6.h();
         edf $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable edf $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable edf $$0, @Nullable edf $$1, @Nullable edf $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected edf a(int $$0, int $$1, int $$2) {
      edf $$3 = null;
      edd $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == edd.u || $$4 == edd.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new ht($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected edd c(int $$0, int $$1, int $$2) {
      return (edd)this.l.computeIfAbsent(ht.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public edd a(crg $$0, int $$1, int $$2, int $$3, bli $$4) {
      ht.a $$5 = new ht.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               ecs $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dhi $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), edi.b) && $$10.i()) {
                  return edd.u;
               }

               if (!$$9.a(arl.a)) {
                  return edd.a;
               }
            }
         }
      }

      dhi $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, edi.b) ? edd.j : edd.a;
   }
}
