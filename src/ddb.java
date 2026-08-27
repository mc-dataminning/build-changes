import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class ddb extends cwo {
   public static final MapCodec<ddb> c = b(ddb::new);
   public static final dkg d = dkf.r;
   private static final Map<ctd, List<ddb.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends ddb> a() {
      return c;
   }

   protected ddb(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Boolean.valueOf(true)));
   }

   @Override
   public void b(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      for (ic $$5 : ic.values()) {
         $$1.a($$2.a($$5), this);
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      if (!$$4) {
         for (ic $$5 : ic.values()) {
            $$1.a($$2.a($$5), this);
         }
      }
   }

   @Override
   public int a(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$0.c(d) && ic.b != $$3 ? 15 : 0;
   }

   protected boolean a(ctx $$0, hx $$1, djp $$2) {
      return $$0.b($$1.d(), ic.a);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<ddb.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.X() - $$5.get(0).b > 60L) {
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
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.N().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   public int b(djp $$0, ctd $$1, hx $$2, ic $$3) {
      return $$3 == ic.a ? $$0.b($$1, $$2, $$3) : 0;
   }

   @Override
   public boolean f_(djp $$0) {
      return true;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(jr.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(d);
   }

   private static boolean a(ctx $$0, hx $$1, boolean $$2) {
      List<ddb.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new ddb.a($$1.i(), $$0.X()));
      }

      int $$4 = 0;

      for (ddb.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   public static class a {
      final hx a;
      final long b;

      public a(hx $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
