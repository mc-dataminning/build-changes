import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class chc extends bvj<cha> {
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
   private evs n;
   private chc.a o = chc.a.d;

   public chc(avz $$0, avz $$1) {
      super(ImmutableMap.of(ccu.m, ccv.b, ccu.n, ccv.c, ccu.o, ccv.a, ccu.Z, ccv.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arf $$0, cha $$1) {
      btq $$2 = $$1.dS().c(ccu.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(ccu.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != buc.i && cha.j($$2);
   }

   protected boolean a(arf $$0, cha $$1, long $$2) {
      return $$1.dS().a(ccu.o) && this.o != chc.a.d && !$$1.dS().a(ccu.Z);
   }

   protected void b(arf $$0, cha $$1, long $$2) {
      btq $$3 = $$1.dS().c(ccu.o).get();
      bvl.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(ccu.m, new ccx($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = chc.a.a;
   }

   protected void c(arf $$0, cha $$1, long $$2) {
      $$1.dS().b(ccu.o);
      $$1.s();
      $$1.b(buc.a);
   }

   private void b(arf $$0, cha $$1) {
      $$0.a(null, $$1, this.m, awb.g, 2.0F, 1.0F);
      Optional<bsv> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bsv $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(bsv.c.a);
            }
         }
      }
   }

   protected void d(arf $$0, cha $$1, long $$2) {
      btq $$3 = $$1.dS().c(ccu.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awb.g, 2.0F, 1.0F);
               $$1.b(buc.j);
               $$3.h($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = chc.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(ccu.m, new ccx($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = chc.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = chc.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cha $$0, btq $$1) {
      eok $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cha $$0, btq $$1) {
      List<UUID> $$2 = $$0.dS().c(ccu.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(ccu.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
