import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cjt extends bxz<cjr> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final axe l;
   private final axe m;
   private fby n;
   private cjt.a o = cjt.a.d;

   public cjt(axe $$0, axe $$1) {
      super(ImmutableMap.of(cfk.m, cfl.b, cfk.n, cfl.c, cfk.o, cfl.a, cfk.Z, cfl.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ash $$0, cjr $$1) {
      bwg $$2 = $$1.ec().c(cfk.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ec().b(cfk.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bws.i && cjr.j($$2);
   }

   protected boolean a(ash $$0, cjr $$1, long $$2) {
      return $$1.ec().a(cfk.o) && this.o != cjt.a.d && !$$1.ec().a(cfk.Z);
   }

   protected void b(ash $$0, cjr $$1, long $$2) {
      bwg $$3 = $$1.ec().c(cfk.o).get();
      byb.a($$1, $$3);
      $$1.b($$3);
      $$1.ec().a(cfk.m, new cfn($$3.du(), 2.0F, 0));
      this.k = 10;
      this.o = cjt.a.a;
   }

   protected void c(ash $$0, cjr $$1, long $$2) {
      $$1.ec().b(cfk.o);
      $$1.p();
      $$1.b(bws.a);
   }

   private void b(ash $$0, cjr $$1) {
      $$0.a(null, $$1, this.m, axg.g, 2.0F, 1.0F);
      Optional<bvk> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bvk $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(bvk.d.a);
            }
         }
      }
   }

   protected void d(ash $$0, cjr $$1, long $$2) {
      bwg $$3 = $$1.ec().c(cfk.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, axg.g, 2.0F, 1.0F);
               $$1.b(bws.j);
               $$3.h($$3.du().a($$1.du()).d().c(0.75));
               this.n = $$3.du();
               this.j = 0;
               this.o = cjt.a.b;
            } else if (this.k <= 0) {
               $$1.ec().a(cfk.m, new cfn($$3.du(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cjt.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cjt.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cjr $$0, bwg $$1) {
      eul $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cjr $$0, bwg $$1) {
      List<UUID> $$2 = $$0.ec().c(cfk.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.ec().a(cfk.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
