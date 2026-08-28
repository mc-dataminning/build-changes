import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgz extends bvg<cgx> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avy l;
   private final avy m;
   private evp n;
   private cgz.a o = cgz.a.d;

   public cgz(avy $$0, avy $$1) {
      super(ImmutableMap.of(ccr.m, ccs.b, ccr.n, ccs.c, ccr.o, ccs.a, ccr.Z, ccs.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(are $$0, cgx $$1) {
      btn $$2 = $$1.dS().c(ccr.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(ccr.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != btz.i && cgx.j($$2);
   }

   protected boolean a(are $$0, cgx $$1, long $$2) {
      return $$1.dS().a(ccr.o) && this.o != cgz.a.d && !$$1.dS().a(ccr.Z);
   }

   protected void b(are $$0, cgx $$1, long $$2) {
      btn $$3 = $$1.dS().c(ccr.o).get();
      bvi.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(ccr.m, new ccu($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cgz.a.a;
   }

   protected void c(are $$0, cgx $$1, long $$2) {
      $$1.dS().b(ccr.o);
      $$1.s();
      $$1.b(btz.a);
   }

   private void b(are $$0, cgx $$1) {
      $$0.a(null, $$1, this.m, awa.g, 2.0F, 1.0F);
      Optional<bss> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bss $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(bss.c.a);
            }
         }
      }
   }

   protected void d(are $$0, cgx $$1, long $$2) {
      btn $$3 = $$1.dS().c(ccr.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awa.g, 2.0F, 1.0F);
               $$1.b(btz.j);
               $$3.h($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cgz.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(ccr.m, new ccu($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgz.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgz.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgx $$0, btn $$1) {
      eoh $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgx $$0, btn $$1) {
      List<UUID> $$2 = $$0.dS().c(ccr.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(ccr.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
