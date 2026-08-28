import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dpv extends djc {
   public static final MapCodec<dpv> c = b(dpv::new);
   public static final dxo d = dxn.v;
   private static final Map<dfn, List<dpv.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dpv> a() {
      return c;
   }

   protected dpv(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dgi $$0, ji $$1, dwx $$2) {
      euh $$3 = this.a($$0, $$2);

      for (jn $$4 : jn.values()) {
         $$0.a($$1.a($$4), this, eud.a($$3, $$4));
      }
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, dwx $$3, boolean $$4) {
      if (!$$4) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$0.c(d) && jn.b != $$3 ? 15 : 0;
   }

   protected boolean a(dgi $$0, ji $$1, dwx $$2) {
      return $$0.b($$1.e(), jn.a);
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dpv.a> $$5 = h.get($$1);

      while ($$5 != null && !$$5.isEmpty() && $$1.ad() - $$5.get(0).b > 60L) {
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
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dwx $$0, dfn $$1, ji $$2, jn $$3) {
      return $$3 == jn.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dwx $$0) {
      return true;
   }

   @Override
   public void a(dwx $$0, dgi $$1, ji $$2, azh $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lo.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(d);
   }

   private static boolean a(dgi $$0, ji $$1, boolean $$2) {
      List<dpv.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dpv.a($$1.j(), $$0.ad()));
      }

      int $$4 = 0;

      for (dpv.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected euh a(dgi $$0, dwx $$1) {
      return eud.a($$0, null, jn.b);
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
