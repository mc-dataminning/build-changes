import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class elv extends elo {
   private final boolean k;
   private final Long2ObjectMap<els> l = new Long2ObjectOpenHashMap();

   public elv(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(czt $$0, bqv $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eln a() {
      return this.c(axm.a(this.b.cH().a), axm.a(this.b.cH().b + 0.5), axm.a(this.b.cH().c));
   }

   @Override
   public elw a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eln[] $$0, eln $$1) {
      int $$2 = 0;
      Map<ij, eln> $$3 = Maps.newEnumMap(ij.class);

      for (ij $$4 : ij.values()) {
         eln $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ij $$6 : ij.c.a) {
         ij $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eln $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eln $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eln $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eln a(int $$0, int $$1, int $$2) {
      eln $$3 = null;
      els $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == els.u || $$4 == els.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new id($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected els b(int $$0, int $$1, int $$2) {
      return (els)this.l.computeIfAbsent(id.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public els a(elu $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public els a(elu $$0, int $$1, int $$2, int $$3, bqv $$4) {
      id.a $$5 = new id.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dpi $$9 = $$0.a($$5.d($$6, $$7, $$8));
               elb $$10 = $$9.u();
               if ($$10.c() && $$9.a(elq.b) && $$9.i()) {
                  return els.u;
               }

               if (!$$10.a(avj.a)) {
                  return els.a;
               }
            }
         }
      }

      dpi $$11 = $$0.a($$5);
      return $$11.a(elq.b) ? els.j : els.a;
   }
}
