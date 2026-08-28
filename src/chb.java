import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class chb extends bvi<cgz> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avz l;
   private final avz m;
   private evr n;
   private chb.a o = chb.a.d;

   public chb(avz $$0, avz $$1) {
      super(ImmutableMap.of(cct.m, ccu.b, cct.n, ccu.c, cct.o, ccu.a, cct.Z, ccu.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arf $$0, cgz $$1) {
      btp $$2 = $$1.dS().c(cct.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(cct.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != bub.i && cgz.j($$2);
   }

   protected boolean a(arf $$0, cgz $$1, long $$2) {
      return $$1.dS().a(cct.o) && this.o != chb.a.d && !$$1.dS().a(cct.Z);
   }

   protected void b(arf $$0, cgz $$1, long $$2) {
      btp $$3 = $$1.dS().c(cct.o).get();
      bvk.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(cct.m, new ccw($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = chb.a.a;
   }

   protected void c(arf $$0, cgz $$1, long $$2) {
      $$1.dS().b(cct.o);
      $$1.s();
      $$1.b(bub.a);
   }

   private void b(arf $$0, cgz $$1) {
      $$0.a(null, $$1, this.m, awb.g, 2.0F, 1.0F);
      Optional<bsu> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bsu $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(bsu.c.a);
            }
         }
      }
   }

   protected void d(arf $$0, cgz $$1, long $$2) {
      btp $$3 = $$1.dS().c(cct.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awb.g, 2.0F, 1.0F);
               $$1.b(bub.j);
               $$3.h($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = chb.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(cct.m, new ccw($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = chb.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = chb.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgz $$0, btp $$1) {
      eoj $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgz $$0, btp $$1) {
      List<UUID> $$2 = $$0.dS().c(cct.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(cct.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
