import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ehh extends ehd {
   private final boolean k;
   private final Long2ObjectMap<eha> l = new Long2ObjectOpenHashMap();

   public ehh(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cwa $$0, boi $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public ehc a() {
      return this.b(awh.a(this.b.cH().a), awh.a(this.b.cH().b + 0.5), awh.a(this.b.cH().c));
   }

   @Override
   public ehi a(double $$0, double $$1, double $$2) {
      return this.a(this.b(awh.a($$0), awh.a($$1), awh.a($$2)));
   }

   @Override
   public int a(ehc[] $$0, ehc $$1) {
      int $$2 = 0;
      Map<ie, ehc> $$3 = Maps.newEnumMap(ie.class);

      for (ie $$4 : ie.values()) {
         ehc $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ie $$6 : ie.c.a) {
         ie $$7 = $$6.h();
         ehc $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable ehc $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable ehc $$0, @Nullable ehc $$1, @Nullable ehc $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected ehc a(int $$0, int $$1, int $$2) {
      ehc $$3 = null;
      eha $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == eha.u || $$4 == eha.j) {
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

   protected eha c(int $$0, int $$1, int $$2) {
      return (eha)this.l.computeIfAbsent(hz.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eha a(cut $$0, int $$1, int $$2, int $$3, boi $$4) {
      hz.a $$5 = new hz.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               egp $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dlf $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), ehf.b) && $$10.i()) {
                  return eha.u;
               }

               if (!$$9.a(aue.a)) {
                  return eha.a;
               }
            }
         }
      }

      dlf $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, ehf.b) ? eha.j : eha.a;
   }
}
