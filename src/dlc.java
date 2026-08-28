import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class dlc extends deo {
   public static final MapCodec<dlc> c = b(dlc::new);
   public static final dss d = dsr.r;
   private static final Map<dbd, List<dlc.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dlc> a() {
      return c;
   }

   protected dlc(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      for (je $$5 : je.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dsb $$3, boolean $$4) {
      if (!$$4) {
         for (je $$5 : je.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   protected int a(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$0.c(d) && je.b != $$3 ? 15 : 0;
   }

   protected boolean a(dbx $$0, iz $$1, dsb $$2) {
      return $$0.b($$1.d(), je.a);
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dlc.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.Z() - $$5.get(0).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(d)) {
         if ($$4) {
            $$1.a($$2, $$0.a(d, Boolean.valueOf(false)), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.a(d, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.P().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dsb $$0, dbd $$1, iz $$2, je $$3) {
      return $$3 == je.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean e_(dsb $$0) {
      return true;
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ld.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(d);
   }

   private static boolean a(dbx $$0, iz $$1, boolean $$2) {
      List<dlc.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dlc.a($$1.i(), $$0.Z()));
      }

      int $$4 = 0;

      for (dlc.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final iz a;
      final long b;

      public a(iz $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
