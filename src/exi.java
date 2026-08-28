import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class exi extends exb {
   private final boolean a;
   private final Long2ObjectMap<exf> l = new Long2ObjectOpenHashMap();

   public exi(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(djn $$0, bxg $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public exa a() {
      return this.c(azm.a(this.c.cR().a), azm.a(this.c.cR().b + 0.5), azm.a(this.c.cR().c));
   }

   @Override
   public exj a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(exa[] $$0, exa $$1) {
      int $$2 = 0;
      Map<ja, exa> $$3 = Maps.newEnumMap(ja.class);

      for (ja $$4 : ja.values()) {
         exa $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ja $$6 : ja.c.a) {
         ja $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            exa $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable exa $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable exa $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected exa a(int $$0, int $$1, int $$2) {
      exa $$3 = null;
      exf $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == exf.u || $$4 == exf.j) {
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

   protected exf b(int $$0, int $$1, int $$2) {
      return (exf)this.l.computeIfAbsent(iu.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public exf a(exh $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public exf a(exh $$0, int $$1, int $$2, int $$3, bxg $$4) {
      iu.a $$5 = new iu.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               eah $$9 = $$0.a($$5.d($$6, $$7, $$8));
               ewo $$10 = $$9.y();
               if ($$10.c() && $$9.a(exd.b) && $$9.l()) {
                  return exf.u;
               }

               if (!$$10.a(axh.a)) {
                  return exf.a;
               }
            }
         }
      }

      eah $$11 = $$0.a($$5);
      return $$11.a(exd.b) ? exf.j : exf.a;
   }
}
