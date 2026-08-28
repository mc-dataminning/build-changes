import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cll extends bzl<clh> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awo l;
   private final awo m;
   private ffq n;
   private cll.a o = cll.a.d;

   public cll(awo $$0, awo $$1) {
      super(ImmutableMap.of(cgw.n, cgx.b, cgw.o, cgx.c, cgw.p, cgx.a, cgw.aa, cgx.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ars $$0, clh $$1) {
      bxu $$2 = $$1.ec().c(cgw.p).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ec().b(cgw.p);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != byg.i && clh.i($$2);
   }

   protected boolean a(ars $$0, clh $$1, long $$2) {
      return $$1.ec().a(cgw.p) && this.o != cll.a.d && !$$1.ec().a(cgw.aa);
   }

   protected void b(ars $$0, clh $$1, long $$2) {
      bxu $$3 = $$1.ec().c(cgw.p).get();
      bzn.a($$1, $$3);
      $$1.b($$3);
      $$1.ec().a(cgw.n, new cgz($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = cll.a.a;
   }

   protected void c(ars $$0, clh $$1, long $$2) {
      $$1.ec().b(cgw.p);
      $$1.q();
      $$1.b(byg.a);
   }

   private void b(ars $$0, clh $$1) {
      $$0.a(null, $$1, this.m, awq.g, 2.0F, 1.0F);
      Optional<bwt> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bwt $$3 = $$2.get();
         if ($$3.bJ()) {
            $$1.c($$0, $$3);
            if (!$$3.bJ()) {
               $$3.a(bwt.d.a);
            }
         }
      }
   }

   protected void d(ars $$0, clh $$1, long $$2) {
      bxu $$3 = $$1.ec().c(cgw.p).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awq.g, 2.0F, 1.0F);
               $$1.b(byg.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = cll.a.b;
            } else if (this.k <= 0) {
               $$1.ec().a(cgw.n, new cgz($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cll.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cll.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(clh $$0, bxu $$1) {
      eyc $$2 = $$0.O().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(clh $$0, bxu $$1) {
      List<UUID> $$2 = $$0.ec().c(cgw.ab).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.ec().a(cgw.ab, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
