import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgw extends bvd<cgu> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avv l;
   private final avv m;
   private evm n;
   private cgw.a o = cgw.a.d;

   public cgw(avv $$0, avv $$1) {
      super(ImmutableMap.of(cco.m, ccp.b, cco.n, ccp.c, cco.o, ccp.a, cco.Z, ccp.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arb $$0, cgu $$1) {
      btk $$2 = $$1.dS().c(cco.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(cco.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != btw.i && cgu.j($$2);
   }

   protected boolean a(arb $$0, cgu $$1, long $$2) {
      return $$1.dS().a(cco.o) && this.o != cgw.a.d && !$$1.dS().a(cco.Z);
   }

   protected void b(arb $$0, cgu $$1, long $$2) {
      btk $$3 = $$1.dS().c(cco.o).get();
      bvf.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(cco.m, new ccr($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cgw.a.a;
   }

   protected void c(arb $$0, cgu $$1, long $$2) {
      $$1.dS().b(cco.o);
      $$1.s();
      $$1.b(btw.a);
   }

   private void b(arb $$0, cgu $$1) {
      $$0.a(null, $$1, this.m, avx.g, 2.0F, 1.0F);
      Optional<bsp> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bsp $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(bsp.c.a);
            }
         }
      }
   }

   protected void d(arb $$0, cgu $$1, long $$2) {
      btk $$3 = $$1.dS().c(cco.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avx.g, 2.0F, 1.0F);
               $$1.b(btw.j);
               $$3.h($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cgw.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(cco.m, new ccr($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgw.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgw.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgu $$0, btk $$1) {
      eoe $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgu $$0, btk $$1) {
      List<UUID> $$2 = $$0.dS().c(cco.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(cco.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
