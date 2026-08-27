import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bwk extends bkz<bwi> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final ape l;
   private final ape m;
   private ehp n;
   private bwk.a o = bwk.a.d;

   public bwk(ape $$0, ape $$1) {
      super(ImmutableMap.of(bsj.m, bsk.b, bsj.n, bsk.c, bsj.o, bsk.a, bsj.Y, bsk.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aks $$0, bwi $$1) {
      bji $$2 = $$1.dN().c(bsj.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dN().b(bsj.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bju.i && bwi.j($$2);
   }

   protected boolean a(aks $$0, bwi $$1, long $$2) {
      return $$1.dN().a(bsj.o) && this.o != bwk.a.d && !$$1.dN().a(bsj.Y);
   }

   protected void b(aks $$0, bwi $$1, long $$2) {
      bji $$3 = $$1.dN().c(bsj.o).get();
      blb.a($$1, $$3);
      $$1.a((bis)$$3);
      $$1.dN().a(bsj.m, new bsm($$3.dj(), 2.0F, 0));
      this.k = 10;
      this.o = bwk.a.a;
   }

   protected void c(aks $$0, bwi $$1, long $$2) {
      $$1.dN().b(bsj.o);
      $$1.s();
      $$1.b(bju.a);
   }

   private void b(aks $$0, bwi $$1) {
      $$0.a(null, $$1, this.m, apg.g, 2.0F, 1.0F);
      Optional<bis> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bis $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(bis.c.a);
            }
         }
      }
   }

   protected void d(aks $$0, bwi $$1, long $$2) {
      bji $$3 = $$1.dN().c(bsj.o).get();
      $$1.a((bis)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, apg.g, 2.0F, 1.0F);
               $$1.b(bju.j);
               $$3.f($$3.dj().a($$1.dj()).d().a(0.75));
               this.n = $$3.dj();
               this.j = 0;
               this.o = bwk.a.b;
            } else if (this.k <= 0) {
               $$1.dN().a(bsj.m, new bsm($$3.dj(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bwk.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bwk.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bwi $$0, bji $$1) {
      ebd $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bwi $$0, bji $$1) {
      List<UUID> $$2 = $$0.dN().c(bsj.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dN().a(bsj.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
