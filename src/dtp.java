import com.google.common.collect.Lists;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import javax.annotation.Nullable;

public class dtp extends dmu {
   public static final MapCodec<dtp> a = b(dtp::new);
   public static final ebx b = ebw.u;
   private static final Map<djd, List<dtp.a>> f = new WeakHashMap<>();
   public static final int c = 60;
   public static final int d = 8;
   public static final int e = 160;
   private static final int g = 2;

   @Override
   public MapCodec<? extends dtp> a() {
      return a;
   }

   protected dtp(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)));
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      this.b($$1, $$2, $$0);
   }

   private void b(djz $$0, iw $$1, ebg $$2) {
      eyy $$3 = this.a($$0, $$2);

      for (jc $$4 : jc.values()) {
         $$0.a($$1.a($$4), this, eyu.a($$3, $$4));
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, boolean $$3) {
      if (!$$3) {
         this.b($$1, $$2, $$0);
      }
   }

   @Override
   protected int a(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$0.c(b) && jc.b != $$3 ? 15 : 0;
   }

   protected boolean a(djz $$0, iw $$1, ebg $$2) {
      return $$0.b($$1.e(), jc.a);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      boolean $$4 = this.a($$1, $$2, $$0);
      List<dtp.a> $$5 = f.get($$1);

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
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$0.c(b) == this.a($$1, $$2, $$0) && !$$1.U().b($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   @Override
   protected int b(ebg $$0, djd $$1, iw $$2, jc $$3) {
      return $$3 == jc.a ? $$0.a($$1, $$2, $$3) : 0;
   }

   @Override
   protected boolean f_(ebg $$0) {
      return true;
   }

   @Override
   public void a(ebg $$0, djz $$1, iw $$2, azz $$3) {
      if ($$0.c(b)) {
         double $$4 = (double)$$2.u() + 0.5 + ($$3.j() - 0.5) * 0.2;
         double $$5 = (double)$$2.v() + 0.7 + ($$3.j() - 0.5) * 0.2;
         double $$6 = (double)$$2.w() + 0.5 + ($$3.j() - 0.5) * 0.2;
         $$1.a(lu.b, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b);
   }

   private static boolean a(djz $$0, iw $$1, boolean $$2) {
      List<dtp.a> $$3 = f.computeIfAbsent($$0, $$0x -> Lists.newArrayList());
      if ($$2) {
         $$3.add(new dtp.a($$1.j(), $$0.ae()));
      }

      int $$4 = 0;

      for (dtp.a $$5 : $$3) {
         if ($$5.a.equals($$1)) {
            if (++$$4 >= 8) {
               return true;
            }
         }
      }

      return false;
   }

   @Nullable
   protected eyy a(djz $$0, ebg $$1) {
      return eyu.a($$0, null, jc.b);
   }

   public static class a {
      final iw a;
      final long b;

      public a(iw $$0, long $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
