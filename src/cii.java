import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cii extends bwo<cig> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final awj l;
   private final awj m;
   private ezh n;
   private cii.a o = cii.a.d;

   public cii(awj $$0, awj $$1) {
      super(ImmutableMap.of(cdz.m, cea.b, cdz.n, cea.c, cdz.o, cea.a, cdz.Z, cea.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(arm $$0, cig $$1) {
      buv $$2 = $$1.ed().c(cdz.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.ed().b(cdz.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ax() != bvh.i && cig.j($$2);
   }

   protected boolean a(arm $$0, cig $$1, long $$2) {
      return $$1.ed().a(cdz.o) && this.o != cii.a.d && !$$1.ed().a(cdz.Z);
   }

   protected void b(arm $$0, cig $$1, long $$2) {
      buv $$3 = $$1.ed().c(cdz.o).get();
      bwq.a($$1, $$3);
      $$1.c($$3);
      $$1.ed().a(cdz.m, new cec($$3.dv(), 2.0F, 0));
      this.k = 10;
      this.o = cii.a.a;
   }

   protected void c(arm $$0, cig $$1, long $$2) {
      $$1.ed().b(cdz.o);
      $$1.q();
      $$1.b(bvh.a);
   }

   private void b(arm $$0, cig $$1) {
      $$0.a(null, $$1, this.m, awl.g, 2.0F, 1.0F);
      Optional<btz> $$2 = $$1.t();
      if ($$2.isPresent()) {
         btz $$3 = $$2.get();
         if ($$3.bM()) {
            $$1.E($$3);
            if (!$$3.bM()) {
               $$3.a(btz.c.a);
            }
         }
      }
   }

   protected void d(arm $$0, cig $$1, long $$2) {
      buv $$3 = $$1.ed().c(cdz.o).get();
      $$1.c($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awl.g, 2.0F, 1.0F);
               $$1.b(bvh.j);
               $$3.h($$3.dv().a($$1.dv()).d().c(0.75));
               this.n = $$3.dv();
               this.j = 0;
               this.o = cii.a.b;
            } else if (this.k <= 0) {
               $$1.ed().a(cdz.m, new cec($$3.dv(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cii.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cii.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cig $$0, buv $$1) {
      ers $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cig $$0, buv $$1) {
      List<UUID> $$2 = $$0.ed().c(cdz.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cH());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cH());
      }

      $$0.ed().a(cdz.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
