import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class clw extends bzw<cls> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awx l;
   private final awx m;
   private fgc n;
   private clw.a o = clw.a.d;

   public clw(awx $$0, awx $$1) {
      super(ImmutableMap.of(chh.n, chi.b, chh.o, chi.c, chh.p, chi.a, chh.aa, chi.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(asb $$0, cls $$1) {
      byf $$2 = $$1.ec().c(chh.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ec().b(chh.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != byr.i && cls.i($$2);
   }

   protected boolean a(asb $$0, cls $$1, long $$2) {
      return $$1.ec().a(chh.p) && this.o != clw.a.d && !$$1.ec().a(chh.aa);
   }

   protected void b(asb $$0, cls $$1, long $$2) {
      byf $$3 = $$1.ec().c(chh.p).get();
      bzy.a($$1, $$3);
      $$1.b($$3);
      $$1.ec().a(chh.n, new chk($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = clw.a.a;
   }

   protected void c(asb $$0, cls $$1, long $$2) {
      $$1.ec().b(chh.p);
      $$1.q();
      $$1.b(byr.a);
   }

   private void b(asb $$0, cls $$1) {
      $$0.a(null, $$1, this.m, awz.g, 2.0F, 1.0F);
      Optional<bxe> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bxe $$3 = $$2.get();
         if ($$3.bJ()) {
            $$1.c($$0, $$3);
            if (!$$3.bJ()) {
               $$3.a(bxe.d.a);
            }
         }
      }
   }

   protected void d(asb $$0, cls $$1, long $$2) {
      byf $$3 = $$1.ec().c(chh.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awz.g, 2.0F, 1.0F);
               $$1.b(byr.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = clw.a.b;
            } else if (this.k <= 0) {
               $$1.ec().a(chh.n, new chk($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = clw.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = clw.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cls $$0, byf $$1) {
      eyo $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cls $$0, byf $$1) {
      List<UUID> $$2 = $$0.ec().c(chh.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.ec().a(chh.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
