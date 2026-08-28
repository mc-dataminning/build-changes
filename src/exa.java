import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class exa extends ewt {
   private final boolean a;
   private final Long2ObjectMap<ewx> l = new Long2ObjectOpenHashMap();

   public exa(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dji $$0, bxe $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public ews a() {
      return this.c(azm.a(this.c.cR().a), azm.a(this.c.cR().b + 0.5), azm.a(this.c.cR().c));
   }

   @Override
   public exb a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ews[] $$0, ews $$1) {
      int $$2 = 0;
      Map<ja, ews> $$3 = Maps.newEnumMap(ja.class);

      for (ja $$4 : ja.values()) {
         ews $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ja $$6 : ja.c.a) {
         ja $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            ews $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable ews $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable ews $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected ews a(int $$0, int $$1, int $$2) {
      ews $$3 = null;
      ewx $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == ewx.u || $$4 == ewx.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new iu($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected ewx b(int $$0, int $$1, int $$2) {
      return (ewx)this.l.computeIfAbsent(iu.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public ewx a(ewz $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public ewx a(ewz $$0, int $$1, int $$2, int $$3, bxe $$4) {
      iu.a $$5 = new iu.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               dzz $$9 = $$0.a($$5.d($$6, $$7, $$8));
               ewg $$10 = $$9.y();
               if ($$10.c() && $$9.a(ewv.b) && $$9.l()) {
                  return ewx.u;
               }

               if (!$$10.a(axh.a)) {
                  return ewx.a;
               }
            }
         }
      }

      dzz $$11 = $$0.a($$5);
      return $$11.a(ewv.b) ? ewx.j : ewx.a;
   }
}
