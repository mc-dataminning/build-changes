import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class etr extends etk {
   private final boolean a;
   private final Long2ObjectMap<eto> l = new Long2ObjectOpenHashMap();

   public etr(boolean $$0) {
      this.a = $$0;
   }

   @Override
   public void a(dgt $$0, bvh $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public etj a() {
      return this.c(ayy.a(this.c.cR().a), ayy.a(this.c.cR().b + 0.5), ayy.a(this.c.cR().c));
   }

   @Override
   public ets a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(etj[] $$0, etj $$1) {
      int $$2 = 0;
      Map<jn, etj> $$3 = Maps.newEnumMap(jn.class);

      for (jn $$4 : jn.values()) {
         etj $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jn $$6 : jn.c.a) {
         jn $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            etj $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable etj $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable etj $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected etj a(int $$0, int $$1, int $$2) {
      etj $$3 = null;
      eto $$4 = this.b($$0, $$1, $$2);
      if (this.a && $$4 == eto.u || $$4 == eto.j) {
         float $$5 = this.c.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.b.a().b_(new ji($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eto b(int $$0, int $$1, int $$2) {
      return (eto)this.l.computeIfAbsent(ji.a($$0, $$1, $$2), $$3 -> this.a(this.b, $$0, $$1, $$2));
   }

   @Override
   public eto a(etq $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.c);
   }

   @Override
   public eto a(etq $$0, int $$1, int $$2, int $$3, bvh $$4) {
      ji.a $$5 = new ji.a();

      for (int $$6 = $$1; $$6 < $$1 + this.e; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.f; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.g; $$8++) {
               dwv $$9 = $$0.a($$5.d($$6, $$7, $$8));
               esx $$10 = $$9.y();
               if ($$10.c() && $$9.a(etm.b) && $$9.l()) {
                  return eto.u;
               }

               if (!$$10.a(awu.a)) {
                  return eto.a;
               }
            }
         }
      }

      dwv $$11 = $$0.a($$5);
      return $$11.a(etm.b) ? eto.j : eto.a;
   }
}
