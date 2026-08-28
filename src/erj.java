import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class erj extends erc {
   private final boolean k;
   private final Long2ObjectMap<erg> l = new Long2ObjectOpenHashMap();

   public erj(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(det $$0, bum $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public erb a() {
      return this.c(azd.a(this.b.cO().a), azd.a(this.b.cO().b + 0.5), azd.a(this.b.cO().c));
   }

   @Override
   public erk a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(erb[] $$0, erb $$1) {
      int $$2 = 0;
      Map<jj, erb> $$3 = Maps.newEnumMap(jj.class);

      for (jj $$4 : jj.values()) {
         erb $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jj $$6 : jj.c.a) {
         jj $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            erb $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable erb $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable erb $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected erb a(int $$0, int $$1, int $$2) {
      erb $$3 = null;
      erg $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == erg.u || $$4 == erg.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new je($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected erg b(int $$0, int $$1, int $$2) {
      return (erg)this.l.computeIfAbsent(je.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public erg a(eri $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public erg a(eri $$0, int $$1, int $$2, int $$3, bum $$4) {
      je.a $$5 = new je.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               duo $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eqp $$10 = $$9.y();
               if ($$10.c() && $$9.a(ere.b) && $$9.l()) {
                  return erg.u;
               }

               if (!$$10.a(awz.a)) {
                  return erg.a;
               }
            }
         }
      }

      duo $$11 = $$0.a($$5);
      return $$11.a(ere.b) ? erg.j : erg.a;
   }
}
