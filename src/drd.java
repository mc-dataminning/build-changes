import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class drd extends dkk {
   public static final MapCodec<drd> a = b(drd::new);
   public static final dzd b = dzc.u;
   private static final Map<dgv, List<drd.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends drd> a() {
      return a;
   }

   protected drd(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dhp $$0, jj $$1, dym $$2) {
      ewb $$3 = this.a($$0, $$2);

      for (jo $$4 : jo.values()) {
         $$0.a($$1.a($$4), this, evx.a($$3, $$4));
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$0.c(b) && jo.b != $$3 ? 15 : 0;
   }

   protected boolean a(dhp $$0, jj $$1, dym $$2) {
      return $$0.b($$1.e(), jo.a);
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<drd.a> $$5 = f.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.ae() - $$5.get(0).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(b)) {
         if ($$4) {
            $$1.a($$2, $$0.b(b, Boolean.valueOf(false)), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.b(b, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dym $$0, dgv $$1, jj $$2, jo $$3) {
      return $$3 == jo.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dym $$0) {
      return true;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lq.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }

   private static boolean a(dhp $$0, jj $$1, boolean $$2) {
      List<drd.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new drd.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (drd.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected ewb a(dhp $$0, dym $$1) {
      return evx.a($$0, null, jo.b);
   }

   public static class a {
      final jj a;
      final long b;

      public a(jj $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
