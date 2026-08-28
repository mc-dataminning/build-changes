import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dqn extends dju {
   public static final MapCodec<dqn> a = b(dqn::new);
   public static final dyh b = dyg.u;
   private static final Map<dgf, List<dqn.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends dqn> a() {
      return a;
   }

   protected dqn(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dgz $$0, ji $$1, dxq $$2) {
      eve $$3 = this.a($$0, $$2);

      for (jn $$4 : jn.values()) {
         $$0.a($$1.a($$4), this, eva.a($$3, $$4));
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$0.c(b) && jn.b != $$3 ? 15 : 0;
   }

   protected boolean a(dgz $$0, ji $$1, dxq $$2) {
      return $$0.b($$1.e(), jn.a);
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dqn.a> $$5 = f.get($$1);

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
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dxq $$0, dgf $$1, ji $$2, jn $$3) {
      return $$3 == jn.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dxq $$0) {
      return true;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lo.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   private static boolean a(dgz $$0, ji $$1, boolean $$2) {
      List<dqn.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dqn.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (dqn.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected eve a(dgz $$0, dxq $$1) {
      return eva.a($$0, null, jn.b);
   }

   public static class a {
      final ji a;
      final long b;

      public a(ji $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
