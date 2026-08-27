import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class efj extends eff {
   private final boolean k;
   private final Long2ObjectMap<efc> l = new Long2ObjectOpenHashMap();

   public efj(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(cuc $$0, bmn $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public efe a() {
      return this.b(auo.a(this.b.cH().a), auo.a(this.b.cH().b + 0.5), auo.a(this.b.cH().c));
   }

   @Override
   public efk a(double $$0, double $$1, double $$2) {
      return this.a(this.b(auo.a($$0), auo.a($$1), auo.a($$2)));
   }

   @Override
   public int a(efe[] $$0, efe $$1) {
      int $$2 = 0;
      Map<ic, efe> $$3 = Maps.newEnumMap(ic.class);

      for (ic $$4 : ic.values()) {
         efe $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.b($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (ic $$6 : ic.c.a) {
         ic $$7 = $$6.h();
         efe $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
         if (this.a($$8, $$3.get($$6), $$3.get($$7))) {
            $$0[$$2++] = $$8;
         }
      }

      return $$2;
   }

   protected boolean b(@Nullable efe $$0) {
      return $$0 != null && !$$0.i;
   }

   protected boolean a(@Nullable efe $$0, @Nullable efe $$1, @Nullable efe $$2) {
      return this.b($$0) && $$1 != null && $$1.k >= 0.0F && $$2 != null && $$2.k >= 0.0F;
   }

   @Nullable
   protected efe a(int $$0, int $$1, int $$2) {
      efe $$3 = null;
      efc $$4 = this.c($$0, $$1, $$2);
      if (this.k && $$4 == efc.u || $$4 == efc.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.b($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.b_(new hx($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected efc c(int $$0, int $$1, int $$2) {
      return (efc)this.l.computeIfAbsent(hx.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public efc a(csv $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public efc a(csv $$0, int $$1, int $$2, int $$3, bmn $$4) {
      hx.a $$5 = new hx.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               eer $$9 = $$0.b_($$5.d($$6, $$7, $$8));
               djh $$10 = $$0.a_($$5.d($$6, $$7, $$8));
               if ($$9.c() && $$10.a($$0, $$5.d(), efh.b) && $$10.i()) {
                  return efc.u;
               }

               if (!$$9.a(asm.a)) {
                  return efc.a;
               }
            }
         }
      }

      djh $$11 = $$0.a_($$5);
      return $$11.a($$0, $$5, efh.b) ? efc.j : efc.a;
   }
}
