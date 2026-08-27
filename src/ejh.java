import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ejh extends ejc {
   private final boolean k;
   private final Long2ObjectMap<ejg> l = new Long2ObjectOpenHashMap();

   public ejh(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cxo $$0, bpr $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public ejb a() {
      return this.c(aww.a(this.b.cH().a), aww.a(this.b.cH().b + 0.5), aww.a(this.b.cH().c));
   }

   @Override
   public eji a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(ejb[] $$0, ejb $$1) {
      int $$2 = 0;
      Map<ih, ejb> $$3 = Maps.newEnumMap(ih.class);

      for (ih $$4 : ih.values()) {
         ejb $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ih $$6 : ih.c.a) {
         ih $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            ejb $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable ejb $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable ejb $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected ejb a(int $$0, int $$1, int $$2) {
      ejb $$3 = null;
      ejg $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == ejg.u || $$4 == ejg.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new ib($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected ejg b(int $$0, int $$1, int $$2) {
      return (ejg)this.l.computeIfAbsent(ib.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public ejg a(cwh $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public ejg a(cwh $$0, int $$1, int $$2, int $$3, bpr $$4) {
      ib.a $$5 = new ib.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eip $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dnb $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), eje.b) && $$10.i()) {
                  return ejg.u;
               }

               if (!$$9.a(aus.a)) {
                  return ejg.a;
               }
            }
         }
      }

      dnb $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, eje.b) ? ejg.j : ejg.a;
   }
}
