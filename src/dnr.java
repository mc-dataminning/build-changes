import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dnr extends dhc {
   public static final MapCodec<dnr> c = b(dnr::new);
   public static final dvj d = dvi.r;
   private static final Map<ddo, List<dnr.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dnr> a() {
      return c;
   }

   protected dnr(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dej $$0, jf $$1, dus $$2) {
      esb $$3 = this.a($$0, $$2);

      for (jk $$4 : jk.values()) {
         $$0.a($$1.a($$4), this, erx.a($$3, $$4));
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      if (!$$4) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$0.c(d) && jk.b != $$3 ? 15 : 0;
   }

   protected boolean a(dej $$0, jf $$1, dus $$2) {
      return $$0.b($$1.e(), jk.a);
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dnr.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.aa() - $$5.get(0).b > 60L) {
         $$5.remove(0);
      }

      if ($$0.c(d)) {
         if ($$4) {
            $$1.a($$2, $$0.b(d, Boolean.valueOf(false)), 3);
            if (a($$1, $$2, true)) {
               $$1.c(1502, $$2, 0);
               $$1.a($$2, $$1.a_($$2).b(), 160);
            }
         }
      } else if (!$$4 && !a($$1, $$2, false)) {
         $$1.a($$2, $$0.b(d, Boolean.valueOf(true)), 3);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.R().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dus $$0, ddo $$1, jf $$2, jk $$3) {
      return $$3 == jk.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dus $$0) {
      return true;
   }

   @Override
   public void a(dus $$0, dej $$1, jf $$2, azn $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lj.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(d);
   }

   private static boolean a(dej $$0, jf $$1, boolean $$2) {
      List<dnr.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dnr.a($$1.j(), $$0.aa()));
      }

      int $$4 = 0;

      for (dnr.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected esb a(dej $$0, dus $$1) {
      return erx.a($$0, null, jk.b);
   }

   public static class a {
      final jf a;
      final long b;

      public a(jf $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
