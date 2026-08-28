import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dsq extends dlv {
   public static final MapCodec<dsq> a = b(dsq::new);
   public static final eay b = eax.u;
   private static final Map<dig, List<dsq.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends dsq> a() {
      return a;
   }

   protected dsq(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, eah $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dja $$0, iu $$1, eah $$2) {
      exw $$3 = this.a($$0, $$2);

      for (ja $$4 : ja.values()) {
         $$0.a($$1.a($$4), this, exs.a($$3, $$4));
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$0.c(b) && ja.b != $$3 ? 15 : 0;
   }

   protected boolean a(dja $$0, iu $$1, eah $$2) {
      return $$0.b($$1.e(), ja.a);
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dsq.a> $$5 = f.get($$1);

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
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(eah $$0, dig $$1, iu $$2, ja $$3) {
      return $$3 == ja.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(eah $$0) {
      return true;
   }

   @Override
   public void a(eah $$0, dja $$1, iu $$2, azv $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ls.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b);
   }

   private static boolean a(dja $$0, iu $$1, boolean $$2) {
      List<dsq.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dsq.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (dsq.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected exw a(dja $$0, eah $$1) {
      return exs.a($$0, null, ja.b);
   }

   public static class a {
      final iu a;
      final long b;

      public a(iu $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
