import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public class eov extends eoo {
   private final boolean k;
   private final Long2ObjectMap<eos> l = new Long2ObjectOpenHashMap();

   public eov(boolean $$0) {
      this.k = $$0;
   }

   @Override
   public void a(dcq $$0, bta $$1) {
      super.a($$0, $$1);
      this.l.clear();
   }

   @Override
   public void b() {
      super.b();
      this.l.clear();
   }

   @Override
   public eon a() {
      return this.c(aye.a(this.b.cK().a), aye.a(this.b.cK().b + 0.5), aye.a(this.b.cK().c));
   }

   @Override
   public eow a(double $$0, double $$1, double $$2) {
      return this.b($$0, $$1, $$2);
   }

   @Override
   public int a(eon[] $$0, eon $$1) {
      int $$2 = 0;
      Map<jf, eon> $$3 = Maps.newEnumMap(jf.class);

      for (jf $$4 : jf.values()) {
         eon $$5 = this.a($$1.a + $$4.j(), $$1.b + $$4.k(), $$1.c + $$4.l());
         $$3.put($$4, $$5);
         if (this.a($$5)) {
            $$0[$$2++] = $$5;
         }
      }

      for (jf $$6 : jf.c.a) {
         jf $$7 = $$6.h();
         if (b($$3.get($$6)) && b($$3.get($$7))) {
            eon $$8 = this.a($$1.a + $$6.j() + $$7.j(), $$1.b, $$1.c + $$6.l() + $$7.l());
            if (this.a($$8)) {
               $$0[$$2++] = $$8;
            }
         }
      }

      return $$2;
   }

   protected boolean a(@Nullable eon $$0) {
      return $$0 != null && !$$0.i;
   }

   private static boolean b(@Nullable eon $$0) {
      return $$0 != null && $$0.k >= 0.0F;
   }

   @Nullable
   protected eon a(int $$0, int $$1, int $$2) {
      eon $$3 = null;
      eos $$4 = this.b($$0, $$1, $$2);
      if (this.k && $$4 == eos.u || $$4 == eos.j) {
         float $$5 = this.b.a($$4);
         if ($$5 >= 0.0F) {
            $$3 = this.c($$0, $$1, $$2);
            $$3.l = $$4;
            $$3.k = Math.max($$3.k, $$5);
            if (this.a.a().b_(new ja($$0, $$1, $$2)).c()) {
               $$3.k += 8.0F;
            }
         }
      }

      return $$3;
   }

   protected eos b(int $$0, int $$1, int $$2) {
      return (eos)this.l.computeIfAbsent(ja.a($$0, $$1, $$2), $$3 -> this.a(this.a, $$0, $$1, $$2));
   }

   @Override
   public eos a(eou $$0, int $$1, int $$2, int $$3) {
      return this.a($$0, $$1, $$2, $$3, this.b);
   }

   @Override
   public eos a(eou $$0, int $$1, int $$2, int $$3, bta $$4) {
      ja.a $$5 = new ja.a();

      for (int $$6 = $$1; $$6 < $$1 + this.d; $$6++) {
         for (int $$7 = $$2; $$7 < $$2 + this.e; $$7++) {
            for (int $$8 = $$3; $$8 < $$3 + this.f; $$8++) {
               dsh $$9 = $$0.a($$5.d($$6, $$7, $$8));
               eob $$10 = $$9.u();
               if ($$10.c() && $$9.a(eoq.b) && $$9.i()) {
                  return eos.u;
               }

               if (!$$10.a(awa.a)) {
                  return eos.a;
               }
            }
         }
      }

      dsh $$11 = $$0.a($$5);
      return $$11.a(eoq.b) ? eos.j : eos.a;
   }
}
