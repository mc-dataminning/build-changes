import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgn extends buu<cgl> {
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
   private ewf n;
   private cgn.a o = cgn.a.d;

   public cgn(avg $$0, avg $$1) {
      super(ImmutableMap.of(ccf.m, ccg.b, ccf.n, ccg.c, ccf.o, ccg.a, ccf.Z, ccg.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqm $$0, cgl $$1) {
      btb $$2 = $$1.dU().c(ccf.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dU().b(ccf.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.as() != btn.i && cgl.j($$2);
   }

   protected boolean a(aqm $$0, cgl $$1, long $$2) {
      return $$1.dU().a(ccf.o) && this.o != cgn.a.d && !$$1.dU().a(ccf.Z);
   }

   protected void b(aqm $$0, cgl $$1, long $$2) {
      btb $$3 = $$1.dU().c(ccf.o).get();
      buw.a($$1, $$3);
      $$1.b($$3);
      $$1.dU().a(ccf.m, new cci($$3.do(), 2.0F, 0));
      this.k = 10;
      this.o = cgn.a.a;
   }

   protected void c(aqm $$0, cgl $$1, long $$2) {
      $$1.dU().b(ccf.o);
      $$1.s();
      $$1.b(btn.a);
   }

   private void b(aqm $$0, cgl $$1) {
      $$0.a(null, $$1, this.m, avi.g, 2.0F, 1.0F);
      Optional<bsg> $$2 = $$1.u();
      if ($$2.isPresent()) {
         bsg $$3 = $$2.get();
         if ($$3.bE()) {
            $$1.D($$3);
            if (!$$3.bE()) {
               $$3.a(bsg.c.a);
            }
         }
      }
   }

   protected void d(aqm $$0, cgl $$1, long $$2) {
      btb $$3 = $$1.dU().c(ccf.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avi.g, 2.0F, 1.0F);
               $$1.b(btn.j);
               $$3.i($$3.do().a($$1.do()).d().a(0.75));
               this.n = $$3.do();
               this.j = 0;
               this.o = cgn.a.b;
            } else if (this.k <= 0) {
               $$1.dU().a(ccf.m, new cci($$3.do(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgn.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgn.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgl $$0, btb $$1) {
      eov $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgl $$0, btb $$1) {
      List<UUID> $$2 = $$0.dU().c(ccf.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cA());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cA());
      }

      $$0.dU().a(ccf.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
