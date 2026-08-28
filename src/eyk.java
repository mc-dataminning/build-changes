import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eyk extends eyd {
   private final boolean a;
   private final Long2ObjectMap<eyh> l = new Long2ObjectOpenHashMap();

   public eyk(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dkm $$0, bxy $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eyc a() {
      return this.c(azq.a(this.c.cR().a), azq.a(this.c.cR().b + 0.5), azq.a(this.c.cR().c));
   }

   @Override
   public eyl a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eyc[] $$0, eyc $$1) {
      int $$2 = 0;
      Map<jc, eyc> $$3 = Maps.newEnumMap(jc.class);

      for (jc $$4 : jc.values()) {
         eyc $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jc $$6 : jc.c.a) {
         jc $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eyc $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eyc $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eyc $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eyc a(int $$0, int $$1, int $$2) {
      eyc $$3 = null;
      eyh $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == eyh.u || $$4 == eyh.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new iw($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eyh b(int $$0, int $$1, int $$2) {
      return (eyh)this.l.computeIfAbsent(iw.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public eyh a(eyj $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public eyh a(eyj $$0, int $$1, int $$2, int $$3, bxy $$4) {
      iw.a $$5 = new iw.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               ebg $$9 = $$0.a($$5.d($$6, $$7, $$8));
               exq $$10 = $$9.y();
               if ($$10.c() && $$9.a(eyf.b) && $$9.l()) {
                  return eyh.u;
               }

               if (!$$10.a(axl.a)) {
                  return eyh.a;
               }
            }
         }
      }

      ebg $$11 = $$0.a($$5);
      return $$11.a(eyf.b) ? eyh.j : eyh.a;
   }
}
