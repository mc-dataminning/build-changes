import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cjk extends bxq<cji> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awu l;
   private final awu m;
   private fbr n;
   private cjk.a o = cjk.a.d;

   public cjk(awu $$0, awu $$1) {
      super(ImmutableMap.of(cfb.m, cfc.b, cfb.n, cfc.c, cfb.o, cfc.a, cfb.Z, cfc.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arx $$0, cji $$1) {
      bvx $$2 = $$1.ec().c(cfb.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ec().b(cfb.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bwj.i && cji.j($$2);
   }

   protected boolean a(arx $$0, cji $$1, long $$2) {
      return $$1.ec().a(cfb.o) && this.o != cjk.a.d && !$$1.ec().a(cfb.Z);
   }

   protected void b(arx $$0, cji $$1, long $$2) {
      bvx $$3 = $$1.ec().c(cfb.o).get();
      bxs.a($$1, $$3);
      $$1.b($$3);
      $$1.ec().a(cfb.m, new cfe($$3.du(), 2.0F, 0));
      this.k = 10;
      this.o = cjk.a.a;
   }

   protected void c(arx $$0, cji $$1, long $$2) {
      $$1.ec().b(cfb.o);
      $$1.p();
      $$1.b(bwj.a);
   }

   private void b(arx $$0, cji $$1) {
      $$0.a(null, $$1, this.m, aww.g, 2.0F, 1.0F);
      Optional<bvb> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bvb $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(bvb.d.a);
            }
         }
      }
   }

   protected void d(arx $$0, cji $$1, long $$2) {
      bvx $$3 = $$1.ec().c(cfb.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aww.g, 2.0F, 1.0F);
               $$1.b(bwj.j);
               $$3.h($$3.du().a($$1.du()).d().c(0.75));
               this.n = $$3.du();
               this.j = 0;
               this.o = cjk.a.b;
            } else if (this.k <= 0) {
               $$1.ec().a(cfb.m, new cfe($$3.du(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cjk.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cjk.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cji $$0, bvx $$1) {
      eue $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cji $$0, bvx $$1) {
      List<UUID> $$2 = $$0.ec().c(cfb.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.ec().a(cfb.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
