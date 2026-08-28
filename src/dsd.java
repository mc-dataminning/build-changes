import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dsd extends dlk {
   public static final MapCodec<dsd> a = b(dsd::new);
   public static final eaf b = eae.u;
   private static final Map<dhv, List<dsd.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends dsd> a() {
      return a;
   }

   protected dsd(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dip $$0, iu $$1, dzo $$2) {
      exd $$3 = this.a($$0, $$2);

      for (ja $$4 : ja.values()) {
         $$0.a($$1.a($$4), this, ewz.a($$3, $$4));
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$0.c(b) && ja.b != $$3 ? 15 : 0;
   }

   protected boolean a(dip $$0, iu $$1, dzo $$2) {
      return $$0.b($$1.e(), ja.a);
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dsd.a> $$5 = f.get($$1);

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
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dzo $$0, dhv $$1, iu $$2, ja $$3) {
      return $$3 == ja.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dzo $$0) {
      return true;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ls.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   private static boolean a(dip $$0, iu $$1, boolean $$2) {
      List<dsd.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dsd.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (dsd.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected exd a(dip $$0, dzo $$1) {
      return ewz.a($$0, null, ja.b);
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
