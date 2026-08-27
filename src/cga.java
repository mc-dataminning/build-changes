import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cga extends buh<cfy> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avg l;
   private final avg m;
   private euk n;
   private cga.a o = cga.a.d;

   public cga(avg $$0, avg $$1) {
      super(ImmutableMap.of(cbs.m, cbt.b, cbs.n, cbt.c, cbs.o, cbt.a, cbs.Z, cbt.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqm $$0, cfy $$1) {
      bso $$2 = $$1.dS().c(cbs.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dS().b(cbs.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != bta.i && cfy.j($$2);
   }

   protected boolean a(aqm $$0, cfy $$1, long $$2) {
      return $$1.dS().a(cbs.o) && this.o != cga.a.d && !$$1.dS().a(cbs.Z);
   }

   protected void b(aqm $$0, cfy $$1, long $$2) {
      bso $$3 = $$1.dS().c(cbs.o).get();
      buj.a($$1, $$3);
      $$1.b($$3);
      $$1.dS().a(cbs.m, new cbv($$3.dn(), 2.0F, 0));
      this.k = 10;
      this.o = cga.a.a;
   }

   protected void c(aqm $$0, cfy $$1, long $$2) {
      $$1.dS().b(cbs.o);
      $$1.s();
      $$1.b(bta.a);
   }

   private void b(aqm $$0, cfy $$1) {
      $$0.a(null, $$1, this.m, avi.g, 2.0F, 1.0F);
      Optional<bru> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bru $$3 = $$2.get();
         if ($$3.bD()) {
            $$1.C($$3);
            if (!$$3.bD()) {
               $$3.a(bru.c.a);
            }
         }
      }
   }

   protected void d(aqm $$0, cfy $$1, long $$2) {
      bso $$3 = $$1.dS().c(cbs.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avi.g, 2.0F, 1.0F);
               $$1.b(bta.j);
               $$3.g($$3.dn().a($$1.dn()).d().a(0.75));
               this.n = $$3.dn();
               this.j = 0;
               this.o = cga.a.b;
            } else if (this.k <= 0) {
               $$1.dS().a(cbs.m, new cbv($$3.dn(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cga.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cga.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cfy $$0, bso $$1) {
      eni $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cfy $$0, bso $$1) {
      List<UUID> $$2 = $$0.dS().c(cbs.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cz());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cz());
      }

      $$0.dS().a(cbs.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
