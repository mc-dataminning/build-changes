import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bzj extends bnw<bzh> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final arl l;
   private final arl m;
   private elm n;
   private bzj.a o = bzj.a.d;

   public bzj(arl $$0, arl $$1) {
      super(ImmutableMap.of(bvh.m, bvi.b, bvh.n, bvi.c, bvh.o, bvi.a, bvh.Y, bvi.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(amz $$0, bzh $$1) {
      bmf $$2 = $$1.dO().c(bvh.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dO().b(bvh.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bmr.i && bzh.j($$2);
   }

   protected boolean a(amz $$0, bzh $$1, long $$2) {
      return $$1.dO().a(bvh.o) && this.o != bzj.a.d && !$$1.dO().a(bvh.Y);
   }

   protected void b(amz $$0, bzh $$1, long $$2) {
      bmf $$3 = $$1.dO().c(bvh.o).get();
      bny.a($$1, $$3);
      $$1.a((blp)$$3);
      $$1.dO().a(bvh.m, new bvk($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = bzj.a.a;
   }

   protected void c(amz $$0, bzh $$1, long $$2) {
      $$1.dO().b(bvh.o);
      $$1.u();
      $$1.b(bmr.a);
   }

   private void b(amz $$0, bzh $$1) {
      $$0.a(null, $$1, this.m, arn.g, 2.0F, 1.0F);
      Optional<blp> $$2 = $$1.w();
      if ($$2.isPresent()) {
         blp $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.C($$3);
            if (!$$3.bx()) {
               $$3.a(blp.c.a);
            }
         }
      }
   }

   protected void d(amz $$0, bzh $$1, long $$2) {
      bmf $$3 = $$1.dO().c(bvh.o).get();
      $$1.a((blp)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, arn.g, 2.0F, 1.0F);
               $$1.b(bmr.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = bzj.a.b;
            } else if (this.k <= 0) {
               $$1.dO().a(bvh.m, new bvk($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bzj.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bzj.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bzh $$0, bmf $$1) {
      eez $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bzh $$0, bmf $$1) {
      List<UUID> $$2 = $$0.dO().c(bvh.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dO().a(bvh.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
