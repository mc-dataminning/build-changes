import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class dke extends ddq {
   public static final MapCodec<dke> c = b(dke::new);
   public static final dru d = drt.r;
   private static final Map<daf, List<dke.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dke> a() {
      return c;
   }

   protected dke(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      for (it $$5 : it.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, drd $$3, boolean $$4) {
      if (!$$4) {
         for (it $$5 : it.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   protected int a(drd $$0, daf $$1, io $$2, it $$3) {
      return $$0.c(d) && it.b != $$3 ? 15 : 0;
   }

   protected boolean a(daz $$0, io $$1, drd $$2) {
      return $$0.b($$1.d(), it.a);
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dke.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.Y() - $$5.get(0).b > 60L) {
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
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.O().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(drd $$0, daf $$1, io $$2, it $$3) {
      return $$3 == it.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean e_(drd $$0) {
      return true;
   }

   @Override
   public void a(drd $$0, daz $$1, io $$2, aym $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ks.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(d);
   }

   private static boolean a(daz $$0, io $$1, boolean $$2) {
      List<dke.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dke.a($$1.i(), $$0.Y()));
      }

      int $$4 = 0;

      for (dke.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final io a;
      final long b;

      public a(io $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
