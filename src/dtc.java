import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dtc extends dmh {
   public static final MapCodec<dtc> a = b(dtc::new);
   public static final ebk b = ebj.u;
   private static final Map<diq, List<dtc.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends dtc> a() {
      return a;
   }

   protected dtc(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(djm $$0, iv $$1, eat $$2) {
      eyi $$3 = this.a($$0, $$2);

      for (jb $$4 : jb.values()) {
         $$0.a($$1.a($$4), this, eye.a($$3, $$4));
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(b) && jb.b != $$3 ? 15 : 0;
   }

   protected boolean a(djm $$0, iv $$1, eat $$2) {
      return $$0.b($$1.e(), jb.a);
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dtc.a> $$5 = f.get($$1);

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
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$3 == jb.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   public void a(eat $$0, djm $$1, iv $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lt.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }

   private static boolean a(djm $$0, iv $$1, boolean $$2) {
      List<dtc.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dtc.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (dtc.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected eyi a(djm $$0, eat $$1) {
      return eye.a($$0, null, jb.b);
   }

   public static class a {
      final iv a;
      final long b;

      public a(iv $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
