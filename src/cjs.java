import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cjs extends bxy<cjq> {
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
   private fbx n;
   private cjs.a o = cjs.a.d;

   public cjs(axe $$0, axe $$1) {
      super(ImmutableMap.of(cfj.m, cfk.b, cfj.n, cfk.c, cfj.o, cfk.a, cfj.Z, cfk.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ash $$0, cjq $$1) {
      bwf $$2 = $$1.eb().c(cfj.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cfj.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bwr.i && cjq.j($$2);
   }

   protected boolean a(ash $$0, cjq $$1, long $$2) {
      return $$1.eb().a(cfj.o) && this.o != cjs.a.d && !$$1.eb().a(cfj.Z);
   }

   protected void b(ash $$0, cjq $$1, long $$2) {
      bwf $$3 = $$1.eb().c(cfj.o).get();
      bya.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cfj.m, new cfm($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = cjs.a.a;
   }

   protected void c(ash $$0, cjq $$1, long $$2) {
      $$1.eb().b(cfj.o);
      $$1.p();
      $$1.b(bwr.a);
   }

   private void b(ash $$0, cjq $$1) {
      $$0.a(null, $$1, this.m, axg.g, 2.0F, 1.0F);
      Optional<bvj> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bvj $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(bvj.c.a);
            }
         }
      }
   }

   protected void d(ash $$0, cjq $$1, long $$2) {
      bwf $$3 = $$1.eb().c(cfj.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, axg.g, 2.0F, 1.0F);
               $$1.b(bwr.j);
               $$3.h($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = cjs.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cfj.m, new cfm($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cjs.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cjs.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cjq $$0, bwf $$1) {
      euk $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cjq $$0, bwf $$1) {
      List<UUID> $$2 = $$0.eb().c(cfj.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cfj.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
