import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eau extends eaq {
   private final boolean k;
   private final Long2ObjectMap<ean> l = new Long2ObjectOpenHashMap();

   public eau(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cpy $$0, bja $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eap a() {
      return this.b(arp.a(this.b.cG().a), arp.a(this.b.cG().b + 0.5), arp.a(this.b.cG().c));
   }

   @Override
   public eav a(double $$0, double $$1, double $$2) {
      return this.a(this.b(arp.a($$0), arp.a($$1), arp.a($$2)));
   }

   @Override
   public int a(eap[] $$0, eap $$1) {
      int $$2 = 0;
      Map<ha, eap> $$3 = Maps.newEnumMap(ha.class);

      for (ha $$4 : ha.values()) {
         eap $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ha $$6 : ha.c.a) {
         ha $$7 = $$6.h();
         eap $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable eap $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable eap $$0, @Nullable eap $$1, @Nullable eap $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected eap a(int $$0, int $$1, int $$2) {
      eap $$3 = null;
      ean $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == ean.u || $$4 == ean.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new gu($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected ean c(int $$0, int $$1, int $$2) {
      return (ean)this.l.computeIfAbsent(gu.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public ean a(cor $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public ean a(cor $$0, int $$1, int $$2, int $$3, bja $$4) {
      gu.a $$5 = new gu.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eac $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               dez $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), eas.b) && $$10.i()) {
                  return ean.u;
               }

               if (!$$9.a(apq.a)) {
                  return ean.a;
               }
            }
         }
      }

      dez $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, eas.b) ? ean.j : ean.a;
   }
}
