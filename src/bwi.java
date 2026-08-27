import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bwi extends bkx<bwg> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final apd l;
   private final apd m;
   private ehn n;
   private bwi.a o = bwi.a.d;

   public bwi(apd $$0, apd $$1) {
      super(ImmutableMap.of(bsh.m, bsi.b, bsh.n, bsi.c, bsh.o, bsi.a, bsh.Y, bsi.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(akr $$0, bwg $$1) {
      bjg $$2 = $$1.dN().c(bsh.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dN().b(bsh.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bjs.i && bwg.j($$2);
   }

   protected boolean a(akr $$0, bwg $$1, long $$2) {
      return $$1.dN().a(bsh.o) && this.o != bwi.a.d && !$$1.dN().a(bsh.Y);
   }

   protected void b(akr $$0, bwg $$1, long $$2) {
      bjg $$3 = $$1.dN().c(bsh.o).get();
      bkz.a($$1, $$3);
      $$1.a((biq)$$3);
      $$1.dN().a(bsh.m, new bsk($$3.dj(), 2.0F, 0));
      this.k = 10;
      this.o = bwi.a.a;
   }

   protected void c(akr $$0, bwg $$1, long $$2) {
      $$1.dN().b(bsh.o);
      $$1.s();
      $$1.b(bjs.a);
   }

   private void b(akr $$0, bwg $$1) {
      $$0.a(null, $$1, this.m, apf.g, 2.0F, 1.0F);
      Optional<biq> $$2 = $$1.t();
      if ($$2.isPresent()) {
         biq $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(biq.c.a);
            }
         }
      }
   }

   protected void d(akr $$0, bwg $$1, long $$2) {
      bjg $$3 = $$1.dN().c(bsh.o).get();
      $$1.a((biq)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, apf.g, 2.0F, 1.0F);
               $$1.b(bjs.j);
               $$3.f($$3.dj().a($$1.dj()).d().a(0.75));
               this.n = $$3.dj();
               this.j = 0;
               this.o = bwi.a.b;
            } else if (this.k <= 0) {
               $$1.dN().a(bsh.m, new bsk($$3.dj(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bwi.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bwi.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bwg $$0, bjg $$1) {
      ebb $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bwg $$0, bjg $$1) {
      List<UUID> $$2 = $$0.dN().c(bsh.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dN().a(bsh.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
