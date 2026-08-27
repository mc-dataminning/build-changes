import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class enq extends enj {
   private final boolean k;
   private final Long2ObjectMap<enn> l = new Long2ObjectOpenHashMap();

   public enq(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dbm $$0, bss $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eni a() {
      return this.c(ayf.a(this.b.cK().a), ayf.a(this.b.cK().b + 0.5), ayf.a(this.b.cK().c));
   }

   @Override
   public enr a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eni[] $$0, eni $$1) {
      int $$2 = 0;
      Map<it, eni> $$3 = Maps.newEnumMap(it.class);

      for (it $$4 : it.values()) {
         eni $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (it $$6 : it.c.a) {
         it $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eni $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eni $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eni $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eni a(int $$0, int $$1, int $$2) {
      eni $$3 = null;
      enn $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == enn.u || $$4 == enn.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new io($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected enn b(int $$0, int $$1, int $$2) {
      return (enn)this.l.computeIfAbsent(io.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public enn a(enp $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public enn a(enp $$0, int $$1, int $$2, int $$3, bss $$4) {
      io.a $$5 = new io.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               drd $$9 = $$0.a($$5.d($$6, $$7, $$8));
               emw $$10 = $$9.u();
               if ($$10.c() && $$9.a(enl.b) && $$9.i()) {
                  return enn.u;
               }

               if (!$$10.a(awc.a)) {
                  return enn.a;
               }
            }
         }
      }

      drd $$11 = $$0.a($$5);
      return $$11.a(enl.b) ? enn.j : enn.a;
   }
}
