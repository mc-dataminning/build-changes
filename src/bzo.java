import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bzo extends bob<bzm> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final arq l;
   private final arq m;
   private els n;
   private bzo.a o = bzo.a.d;

   public bzo(arq $$0, arq $$1) {
      super(ImmutableMap.of(bvm.m, bvn.b, bvm.n, bvn.c, bvm.o, bvn.a, bvm.Y, bvn.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(and $$0, bzm $$1) {
      bmk $$2 = $$1.dO().c(bvm.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dO().b(bvm.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bmw.i && bzm.j($$2);
   }

   protected boolean a(and $$0, bzm $$1, long $$2) {
      return $$1.dO().a(bvm.o) && this.o != bzo.a.d && !$$1.dO().a(bvm.Y);
   }

   protected void b(and $$0, bzm $$1, long $$2) {
      bmk $$3 = $$1.dO().c(bvm.o).get();
      bod.a($$1, $$3);
      $$1.a((blu)$$3);
      $$1.dO().a(bvm.m, new bvp($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = bzo.a.a;
   }

   protected void c(and $$0, bzm $$1, long $$2) {
      $$1.dO().b(bvm.o);
      $$1.u();
      $$1.b(bmw.a);
   }

   private void b(and $$0, bzm $$1) {
      $$0.a(null, $$1, this.m, ars.g, 2.0F, 1.0F);
      Optional<blu> $$2 = $$1.w();
      if ($$2.isPresent()) {
         blu $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.C($$3);
            if (!$$3.bx()) {
               $$3.a(blu.c.a);
            }
         }
      }
   }

   protected void d(and $$0, bzm $$1, long $$2) {
      bmk $$3 = $$1.dO().c(bvm.o).get();
      $$1.a((blu)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, ars.g, 2.0F, 1.0F);
               $$1.b(bmw.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = bzo.a.b;
            } else if (this.k <= 0) {
               $$1.dO().a(bvm.m, new bvp($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bzo.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bzo.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bzm $$0, bmk $$1) {
      eff $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bzm $$0, bmk $$1) {
      List<UUID> $$2 = $$0.dO().c(bvm.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dO().a(bvm.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
