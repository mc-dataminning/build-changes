import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class byz extends bnm<byx> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final arb l;
   private final arb m;
   private elb n;
   private byz.a o = byz.a.d;

   public byz(arb $$0, arb $$1) {
      super(ImmutableMap.of(bux.m, buy.b, bux.n, buy.c, bux.o, buy.a, bux.Y, buy.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(amp $$0, byx $$1) {
      blv $$2 = $$1.dO().c(bux.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dO().b(bux.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bmh.i && byx.j($$2);
   }

   protected boolean a(amp $$0, byx $$1, long $$2) {
      return $$1.dO().a(bux.o) && this.o != byz.a.d && !$$1.dO().a(bux.Y);
   }

   protected void b(amp $$0, byx $$1, long $$2) {
      blv $$3 = $$1.dO().c(bux.o).get();
      bno.a($$1, $$3);
      $$1.a((blf)$$3);
      $$1.dO().a(bux.m, new bva($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = byz.a.a;
   }

   protected void c(amp $$0, byx $$1, long $$2) {
      $$1.dO().b(bux.o);
      $$1.u();
      $$1.b(bmh.a);
   }

   private void b(amp $$0, byx $$1) {
      $$0.a(null, $$1, this.m, ard.g, 2.0F, 1.0F);
      Optional<blf> $$2 = $$1.w();
      if ($$2.isPresent()) {
         blf $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.C($$3);
            if (!$$3.bx()) {
               $$3.a(blf.c.a);
            }
         }
      }
   }

   protected void d(amp $$0, byx $$1, long $$2) {
      blv $$3 = $$1.dO().c(bux.o).get();
      $$1.a((blf)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, ard.g, 2.0F, 1.0F);
               $$1.b(bmh.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = byz.a.b;
            } else if (this.k <= 0) {
               $$1.dO().a(bux.m, new bva($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = byz.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = byz.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(byx $$0, blv $$1) {
      eeo $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(byx $$0, blv $$1) {
      List<UUID> $$2 = $$0.dO().c(bux.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dO().a(bux.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
