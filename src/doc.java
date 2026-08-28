import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class doc extends dho {
   public static final MapCodec<doc> c = b(doc::new);
   public static final dvu d = dvt.r;
   private static final Map<dea, List<doc.a>> h = new WeakHashMap<>();
   public static final int e = 60;
   public static final int f = 8;
   public static final int g = 160;
   private static final int i = 2;

   @Override
   public MapCodec<? extends doc> a() {
      return c;
   }

   protected doc(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Boolean.valueOf(true)));
   }

   @Override
   protected void b(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(dev $$0, jg $$1, dvd $$2) {
      esm $$3 = this.a($$0, $$2);

      for (jl $$4 : jl.values()) {
         $$0.a($$1.a($$4), this, esi.a($$3, $$4));
      }
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, dvd $$3, boolean $$4) {
      if (!$$4) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$0.c(d) && jl.b != $$3 ? 15 : 0;
   }

   protected boolean a(dev $$0, jg $$1, dvd $$2) {
      return $$0.b($$1.e(), jl.a);
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<doc.a> $$5 = h.get($$1);

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
   protected void a(dvd $$0, dev $$1, jg $$2, dhy $$3, @Nullable esm $$4, boolean $$5) {
      if ($$0.c(d) == this.a($$1, $$2, $$0) && !$$1.R().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(dvd $$0, dea $$1, jg $$2, jl $$3) {
      return $$3 == jl.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(dvd $$0) {
      return true;
   }

   @Override
   public void a(dvd $$0, dev $$1, jg $$2, azr $$3) {
      if ($$0.c(d)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(ll.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(d);
   }

   private static boolean a(dev $$0, jg $$1, boolean $$2) {
      List<doc.a> $$3 = h.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new doc.a($$1.j(), $$0.aa()));
      }

      int $$4 = 0;

      for (doc.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected esm a(dev $$0, dvd $$1) {
      return esi.a($$0, null, jl.b);
   }

   public static class a {
      final jg a;
      final long b;

      public a(jg $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
