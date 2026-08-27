import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eaz extends eav {
   private final boolean k;
   private final Long2ObjectMap<eas> l = new Long2ObjectOpenHashMap();

   public eaz(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cqd $$0, bjd $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eau a() {
      return this.b(ars.a(this.b.cG().a), ars.a(this.b.cG().b + 0.5), ars.a(this.b.cG().c));
   }

   @Override
   public eba a(double $$0, double $$1, double $$2) {
      return this.a(this.b(ars.a($$0), ars.a($$1), ars.a($$2)));
   }

   @Override
   public int a(eau[] $$0, eau $$1) {
      int $$2 = 0;
      Map<hc, eau> $$3 = Maps.newEnumMap(hc.class);

      for (hc $$4 : hc.values()) {
         eau $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (hc $$6 : hc.c.a) {
         hc $$7 = $$6.h();
         eau $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable eau $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable eau $$0, @Nullable eau $$1, @Nullable eau $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected eau a(int $$0, int $$1, int $$2) {
      eau $$3 = null;
      eas $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eas.u || $$4 == eas.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new gw($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eas c(int $$0, int $$1, int $$2) {
      return (eas)this.l.computeIfAbsent(gw.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eas a(cow $$0, int $$1, int $$2, int $$3, bjd $$4) {
      gw.a $$5 = new gw.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eah $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dfe $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), eax.b) && $$10.i()) {
                  return eas.u;
               }

               if (!$$9.a(apt.a)) {
                  return eas.a;
               }
            }
         }
      }

      dfe $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, eax.b) ? eas.j : eas.a;
   }
}
