import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dno extends dgz {
   public static final MapCodec<dno> c = b(dno::new);
   public static final dvf d = dve.r;
   private static final Map<ddl, List<dno.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends dno> a() {
      return c;
   }

   protected dno(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(deg $$0, je $$1, duo $$2) {
      erx $$3 = this.a($$0, $$2);

      for (jj $$4 : jj.values()) {
         $$0.a($$1.a($$4), this, ert.a($$3, $$4));
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, duo $$3, boolean $$4) {
      if (!$$4) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$0.c(d) && jj.b != $$3 ? 15 : 0;
   }

   protected boolean a(deg $$0, je $$1, duo $$2) {
      return $$0.b($$1.e(), jj.a);
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dno.a> $$5 = h.get($$1);

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
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.R().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(duo $$0, ddl $$1, je $$2, jj $$3) {
      return $$3 == jj.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(duo $$0) {
      return true;
   }

   @Override
   public void a(duo $$0, deg $$1, je $$2, azl $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(li.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(d);
   }

   private static boolean a(deg $$0, je $$1, boolean $$2) {
      List<dno.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dno.a($$1.j(), $$0.aa()));
      }

      int $$4 = 0;

      for (dno.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected erx a(deg $$0, duo $$1) {
      return ert.a($$0, null, jj.b);
   }

   public static class a {
      final je a;
      final long b;

      public a(je $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
