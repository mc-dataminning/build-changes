import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dqs extends dkb {
   public static final MapCodec<dqs> c = b(dqs::new);
   public static final dyl d = dyk.r;
   private static final Map<dgm, List<dqs.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dqs> a() {
      return c;
   }

   protected dqs(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dhh $$0, jh $$1, dxu $$2) {
      eve $$3 = this.a($$0, $$2);

      for (jm $$4 : jm.values()) {
         $$0.a($$1.a($$4), this, eva.a($$3, $$4));
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$4) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(d) && jm.b != $$3 ? 15 : 0;
   }

   protected boolean a(dhh $$0, jh $$1, dxu $$2) {
      return $$0.b($$1.e(), jm.a);
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dqs.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.ac() - $$5.get(0).b > 60L) {
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
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.T().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$3 == jm.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ln.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(d);
   }

   private static boolean a(dhh $$0, jh $$1, boolean $$2) {
      List<dqs.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dqs.a($$1.j(), $$0.ac()));
      }

      int $$4 = 0;

      for (dqs.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected eve a(dhh $$0, dxu $$1) {
      return eva.a($$0, null, jm.b);
   }

   public static class a {
      final jh a;
      final long b;

      public a(jh $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
