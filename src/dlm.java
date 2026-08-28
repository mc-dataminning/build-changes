import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class dlm extends dey {
   public static final MapCodec<dlm> c = b(dlm::new);
   public static final dtc d = dtb.r;
   private static final Map<dbm, List<dlm.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dlm> a() {
      return c;
   }

   protected dlm(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      for (jf $$5 : jf.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      if (!$$4) {
         for (jf $$5 : jf.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   protected int a(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$0.c(d) && jf.b != $$3 ? 15 : 0;
   }

   protected boolean a(dcg $$0, ja $$1, dsl $$2) {
      return $$0.b($$1.d(), jf.a);
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dlm.a> $$5 = h.get($$1);

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
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.P().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dsl $$0, dbm $$1, ja $$2, jf $$3) {
      return $$3 == jf.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean e_(dsl $$0) {
      return true;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(le.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(d);
   }

   private static boolean a(dcg $$0, ja $$1, boolean $$2) {
      List<dlm.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dlm.a($$1.i(), $$0.Z()));
      }

      int $$4 = 0;

      for (dlm.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final ja a;
      final long b;

      public a(ja $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
