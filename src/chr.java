import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class chr extends bvx<chp> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awc l;
   private final awc m;
   private eye n;
   private chr.a o = chr.a.d;

   public chr(awc $$0, awc $$1) {
      super(ImmutableMap.of(cdi.m, cdj.b, cdi.n, cdj.c, cdi.o, cdj.a, cdi.Z, cdj.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arg $$0, chp $$1) {
      buf $$2 = $$1.dX().c(cdi.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dX().b(cdi.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.av() != bur.i && chp.j($$2);
   }

   protected boolean a(arg $$0, chp $$1, long $$2) {
      return $$1.dX().a(cdi.o) && this.o != chr.a.d && !$$1.dX().a(cdi.Z);
   }

   protected void b(arg $$0, chp $$1, long $$2) {
      buf $$3 = $$1.dX().c(cdi.o).get();
      bvz.a($$1, $$3);
      $$1.c($$3);
      $$1.dX().a(cdi.m, new cdl($$3.dq(), 2.0F, 0));
      this.k = 10;
      this.o = chr.a.a;
   }

   protected void c(arg $$0, chp $$1, long $$2) {
      $$1.dX().b(cdi.o);
      $$1.q();
      $$1.b(bur.a);
   }

   private void b(arg $$0, chp $$1) {
      $$0.a(null, $$1, this.m, awe.g, 2.0F, 1.0F);
      Optional<btj> $$2 = $$1.t();
      if ($$2.isPresent()) {
         btj $$3 = $$2.get();
         if ($$3.bI()) {
            $$1.E($$3);
            if (!$$3.bI()) {
               $$3.a(btj.c.a);
            }
         }
      }
   }

   protected void d(arg $$0, chp $$1, long $$2) {
      buf $$3 = $$1.dX().c(cdi.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awe.g, 2.0F, 1.0F);
               $$1.b(bur.j);
               $$3.h($$3.dq().a($$1.dq()).d().c(0.75));
               this.n = $$3.dq();
               this.j = 0;
               this.o = chr.a.b;
            } else if (this.k <= 0) {
               $$1.dX().a(cdi.m, new cdl($$3.dq(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = chr.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = chr.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(chp $$0, buf $$1) {
      eqp $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(chp $$0, buf $$1) {
      List<UUID> $$2 = $$0.dX().c(cdi.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cD());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cD());
      }

      $$0.dX().a(cdi.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
