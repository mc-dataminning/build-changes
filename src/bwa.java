import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bwa extends bkp<bvy> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aov l;
   private final aov m;
   private ehd n;
   private bwa.a o = bwa.a.d;

   public bwa(aov $$0, aov $$1) {
      super(ImmutableMap.of(brz.m, bsa.b, brz.n, bsa.c, brz.o, bsa.a, brz.Y, bsa.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(akk $$0, bvy $$1) {
      biy $$2 = $$1.dM().c(brz.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dM().b(brz.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bjk.i && bvy.j($$2);
   }

   protected boolean a(akk $$0, bvy $$1, long $$2) {
      return $$1.dM().a(brz.o) && this.o != bwa.a.d && !$$1.dM().a(brz.Y);
   }

   protected void b(akk $$0, bvy $$1, long $$2) {
      biy $$3 = $$1.dM().c(brz.o).get();
      bkr.a($$1, $$3);
      $$1.a((bii)$$3);
      $$1.dM().a(brz.m, new bsc($$3.di(), 2.0F, 0));
      this.k = 10;
      this.o = bwa.a.a;
   }

   protected void c(akk $$0, bvy $$1, long $$2) {
      $$1.dM().b(brz.o);
      $$1.p();
      $$1.b(bjk.a);
   }

   private void b(akk $$0, bvy $$1) {
      $$0.a(null, $$1, this.m, aox.g, 2.0F, 1.0F);
      Optional<bii> $$2 = $$1.q();
      if ($$2.isPresent()) {
         bii $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(bii.c.a);
            }
         }
      }
   }

   protected void d(akk $$0, bvy $$1, long $$2) {
      biy $$3 = $$1.dM().c(brz.o).get();
      $$1.a((bii)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aox.g, 2.0F, 1.0F);
               $$1.b(bjk.j);
               $$3.f($$3.di().a($$1.di()).d().a(0.75));
               this.n = $$3.di();
               this.j = 0;
               this.o = bwa.a.b;
            } else if (this.k <= 0) {
               $$1.dM().a(brz.m, new bsc($$3.di(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bwa.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bwa.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bvy $$0, biy $$1) {
      ear $$2 = $$0.H().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bvy $$0, biy $$1) {
      List<UUID> $$2 = $$0.dM().c(brz.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dM().a(brz.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
