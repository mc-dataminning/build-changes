import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class emu extends emn {
   private final boolean k;
   private final Long2ObjectMap<emr> l = new Long2ObjectOpenHashMap();

   public emu(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(daq $$0, bsc $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public emm a() {
      return this.c(axz.a(this.b.cI().a), axz.a(this.b.cI().b + 0.5), axz.a(this.b.cI().c));
   }

   @Override
   public emv a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(emm[] $$0, emm $$1) {
      int $$2 = 0;
      Map<is, emm> $$3 = Maps.newEnumMap(is.class);

      for (is $$4 : is.values()) {
         emm $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (is $$6 : is.c.a) {
         is $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            emm $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable emm $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable emm $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected emm a(int $$0, int $$1, int $$2) {
      emm $$3 = null;
      emr $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == emr.u || $$4 == emr.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new in($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected emr b(int $$0, int $$1, int $$2) {
      return (emr)this.l.computeIfAbsent(in.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public emr a(emt $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public emr a(emt $$0, int $$1, int $$2, int $$3, bsc $$4) {
      in.a $$5 = new in.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dqh $$9 = $$0.a($$5.d($$6, $$7, $$8));
               ema $$10 = $$9.u();
               if ($$10.c() && $$9.a(emp.b) && $$9.i()) {
                  return emr.u;
               }

               if (!$$10.a(avw.a)) {
                  return emr.a;
               }
            }
         }
      }

      dqh $$11 = $$0.a($$5);
      return $$11.a(emp.b) ? emr.j : emr.a;
   }
}
