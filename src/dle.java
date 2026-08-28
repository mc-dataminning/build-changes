import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class dle extends deq {
   public static final MapCodec<dle> c = b(dle::new);
   public static final dsu d = dst.r;
   private static final Map<dbf, List<dle.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dle> a() {
      return c;
   }

   protected dle(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      for (je $$5 : je.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (!$$4) {
         for (je $$5 : je.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   protected int a(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$0.c(d) && je.b != $$3 ? 15 : 0;
   }

   protected boolean a(dbz $$0, iz $$1, dsd $$2) {
      return $$0.b($$1.d(), je.a);
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dle.a> $$5 = h.get($$1);

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
   protected void a(dsd $$0, dbz $$1, iz $$2, dfa $$3, iz $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.P().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dsd $$0, dbf $$1, iz $$2, je $$3) {
      return $$3 == je.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean e_(dsd $$0) {
      return true;
   }

   @Override
   public void a(dsd $$0, dbz $$1, iz $$2, azh $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ld.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(d);
   }

   private static boolean a(dbz $$0, iz $$1, boolean $$2) {
      List<dle.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dle.a($$1.i(), $$0.Z()));
      }

      int $$4 = 0;

      for (dle.a $$5 : $$3) {
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
