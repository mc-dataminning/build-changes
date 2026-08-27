import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bzp extends boc<bzn> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final arr l;
   private final arr m;
   private elt n;
   private bzp.a o = bzp.a.d;

   public bzp(arr $$0, arr $$1) {
      super(ImmutableMap.of(bvn.m, bvo.b, bvn.n, bvo.c, bvn.o, bvo.a, bvn.Y, bvo.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(and $$0, bzn $$1) {
      bml $$2 = $$1.dO().c(bvn.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dO().b(bvn.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bmx.i && bzn.j($$2);
   }

   protected boolean a(and $$0, bzn $$1, long $$2) {
      return $$1.dO().a(bvn.o) && this.o != bzp.a.d && !$$1.dO().a(bvn.Y);
   }

   protected void b(and $$0, bzn $$1, long $$2) {
      bml $$3 = $$1.dO().c(bvn.o).get();
      boe.a($$1, $$3);
      $$1.a((blv)$$3);
      $$1.dO().a(bvn.m, new bvq($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = bzp.a.a;
   }

   protected void c(and $$0, bzn $$1, long $$2) {
      $$1.dO().b(bvn.o);
      $$1.u();
      $$1.b(bmx.a);
   }

   private void b(and $$0, bzn $$1) {
      $$0.a(null, $$1, this.m, art.g, 2.0F, 1.0F);
      Optional<blv> $$2 = $$1.w();
      if ($$2.isPresent()) {
         blv $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.C($$3);
            if (!$$3.bx()) {
               $$3.a(blv.c.a);
            }
         }
      }
   }

   protected void d(and $$0, bzn $$1, long $$2) {
      bml $$3 = $$1.dO().c(bvn.o).get();
      $$1.a((blv)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, art.g, 2.0F, 1.0F);
               $$1.b(bmx.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = bzp.a.b;
            } else if (this.k <= 0) {
               $$1.dO().a(bvn.m, new bvq($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bzp.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bzp.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bzn $$0, bml $$1) {
      efg $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bzn $$0, bml $$1) {
      List<UUID> $$2 = $$0.dO().c(bvn.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dO().a(bvn.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
