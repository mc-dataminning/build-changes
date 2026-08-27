import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ccg extends bqp<cce> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final ato l;
   private final ato m;
   private eov n;
   private ccg.a o = ccg.a.d;

   public ccg(ato $$0, ato $$1) {
      super(ImmutableMap.of(bya.m, byb.b, bya.n, byb.c, bya.o, byb.a, bya.Z, byb.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(apa $$0, cce $$1) {
      box $$2 = $$1.dM().c(bya.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dM().b(bya.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bpi.i && cce.j($$2);
   }

   protected boolean a(apa $$0, cce $$1, long $$2) {
      return $$1.dM().a(bya.o) && this.o != ccg.a.d && !$$1.dM().a(bya.Z);
   }

   protected void b(apa $$0, cce $$1, long $$2) {
      box $$3 = $$1.dM().c(bya.o).get();
      bqr.a($$1, $$3);
      $$1.a((bof)$$3);
      $$1.dM().a(bya.m, new byd($$3.dh(), 2.0F, 0));
      this.k = 10;
      this.o = ccg.a.a;
   }

   protected void c(apa $$0, cce $$1, long $$2) {
      $$1.dM().b(bya.o);
      $$1.u();
      $$1.b(bpi.a);
   }

   private void b(apa $$0, cce $$1) {
      $$0.a(null, $$1, this.m, atq.g, 2.0F, 1.0F);
      Optional<bof> $$2 = $$1.w();
      if ($$2.isPresent()) {
         bof $$3 = $$2.get();
         if ($$3.bx()) {
            $$1.B($$3);
            if (!$$3.bx()) {
               $$3.a(bof.c.a);
            }
         }
      }
   }

   protected void d(apa $$0, cce $$1, long $$2) {
      box $$3 = $$1.dM().c(bya.o).get();
      $$1.a((bof)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, atq.g, 2.0F, 1.0F);
               $$1.b(bpi.j);
               $$3.g($$3.dh().a($$1.dh()).d().a(0.75));
               this.n = $$3.dh();
               this.j = 0;
               this.o = ccg.a.b;
            } else if (this.k <= 0) {
               $$1.dM().a(bya.m, new byd($$3.dh(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = ccg.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = ccg.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cce $$0, box $$1) {
      eig $$2 = $$0.N().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cce $$0, box $$1) {
      List<UUID> $$2 = $$0.dM().c(bya.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.ct());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.ct());
      }

      $$0.dM().a(bya.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
