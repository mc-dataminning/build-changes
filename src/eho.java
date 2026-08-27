import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eho extends ehk {
   private final boolean k;
   private final Long2ObjectMap<ehh> l = new Long2ObjectOpenHashMap();

   public eho(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cwe $$0, bok $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public ehj a() {
      return this.b(awi.a(this.b.cH().a), awi.a(this.b.cH().b + 0.5), awi.a(this.b.cH().c));
   }

   @Override
   public ehp a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awi.a($$0), awi.a($$1), awi.a($$2)));
   }

   @Override
   public int a(ehj[] $$0, ehj $$1) {
      int $$2 = 0;
      Map<ie, ehj> $$3 = Maps.newEnumMap(ie.class);

      for (ie $$4 : ie.values()) {
         ehj $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ie $$6 : ie.c.a) {
         ie $$7 = $$6.h();
         ehj $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable ehj $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable ehj $$0, @Nullable ehj $$1, @Nullable ehj $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected ehj a(int $$0, int $$1, int $$2) {
      ehj $$3 = null;
      ehh $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == ehh.u || $$4 == ehh.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new hz($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected ehh c(int $$0, int $$1, int $$2) {
      return (ehh)this.l.computeIfAbsent(hz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public ehh a(cux $$0, int $$1, int $$2, int $$3, bok $$4) {
      hz.a $$5 = new hz.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               egw $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dlj $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), ehm.b) && $$10.i()) {
                  return ehh.u;
               }

               if (!$$9.a(auf.a)) {
                  return ehh.a;
               }
            }
         }
      }

      dlj $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, ehm.b) ? ehh.j : ehh.a;
   }
}
