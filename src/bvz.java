import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bvz extends bko<bvx> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aot l;
   private final aot m;
   private ehf n;
   private bvz.a o = bvz.a.d;

   public bvz(aot $$0, aot $$1) {
      super(ImmutableMap.of(bry.m, brz.b, bry.n, brz.c, bry.o, brz.a, bry.Y, brz.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aki $$0, bvx $$1) {
      biw $$2 = $$1.dM().c(bry.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dM().b(bry.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bji.i && bvx.l($$2);
   }

   protected boolean a(aki $$0, bvx $$1, long $$2) {
      return $$1.dM().a(bry.o) && this.o != bvz.a.d && !$$1.dM().a(bry.Y);
   }

   protected void b(aki $$0, bvx $$1, long $$2) {
      biw $$3 = $$1.dM().c(bry.o).get();
      bkq.a($$1, $$3);
      $$1.a((big)$$3);
      $$1.dM().a(bry.m, new bsb($$3.di(), 2.0F, 0));
      this.k = 10;
      this.o = bvz.a.a;
   }

   protected void c(aki $$0, bvx $$1, long $$2) {
      $$1.dM().b(bry.o);
      $$1.p();
      $$1.b(bji.a);
   }

   private void b(aki $$0, bvx $$1) {
      $$0.a(null, $$1, this.m, aov.g, 2.0F, 1.0F);
      Optional<big> $$2 = $$1.q();
      if ($$2.isPresent()) {
         big $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(big.c.a);
            }
         }
      }
   }

   protected void d(aki $$0, bvx $$1, long $$2) {
      biw $$3 = $$1.dM().c(bry.o).get();
      $$1.a((big)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aov.g, 2.0F, 1.0F);
               $$1.b(bji.j);
               $$3.f($$3.di().a($$1.di()).d().a(0.75));
               this.n = $$3.di();
               this.j = 0;
               this.o = bvz.a.b;
            } else if (this.k <= 0) {
               $$1.dM().a(bry.m, new bsb($$3.di(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bvz.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bvz.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bvx $$0, biw $$1) {
      eaq $$2 = $$0.H().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bvx $$0, biw $$1) {
      List<UUID> $$2 = $$0.dM().c(bry.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dM().a(bry.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
