import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cga extends bug<cfy> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avn l;
   private final avn m;
   private ewu n;
   private cga.a o = cga.a.d;

   public cga(avn $$0, avn $$1) {
      super(ImmutableMap.of(cbr.m, cbs.b, cbr.n, cbs.c, cbr.o, cbs.a, cbr.Z, cbs.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqt $$0, cfy $$1) {
      bso $$2 = $$1.dZ().c(cbr.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dZ().b(cbr.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ar() != bsz.i && cfy.j($$2);
   }

   protected boolean a(aqt $$0, cfy $$1, long $$2) {
      return $$1.dZ().a(cbr.o) && this.o != cga.a.d && !$$1.dZ().a(cbr.Z);
   }

   protected void b(aqt $$0, cfy $$1, long $$2) {
      bso $$3 = $$1.dZ().c(cbr.o).get();
      bui.a($$1, $$3);
      $$1.b($$3);
      $$1.dZ().a(cbr.m, new cbu($$3.ds(), 2.0F, 0));
      this.k = 10;
      this.o = cga.a.a;
   }

   protected void c(aqt $$0, cfy $$1, long $$2) {
      $$1.dZ().b(cbr.o);
      $$1.r();
      $$1.b(bsz.a);
   }

   private void b(aqt $$0, cfy $$1) {
      $$0.a(null, $$1, this.m, avq.g, 2.0F, 1.0F);
      Optional<brv> $$2 = $$1.t();
      if ($$2.isPresent()) {
         brv $$3 = $$2.get();
         if ($$3.bI()) {
            $$1.C($$3);
            if (!$$3.bI()) {
               $$3.a(brv.d.a);
            }
         }
      }
   }

   protected void d(aqt $$0, cfy $$1, long $$2) {
      bso $$3 = $$1.dZ().c(cbr.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avq.g, 2.0F, 1.0F);
               $$1.b(bsz.j);
               $$3.g($$3.ds().a($$1.ds()).d().a(0.75));
               this.n = $$3.ds();
               this.j = 0;
               this.o = cga.a.b;
            } else if (this.k <= 0) {
               $$1.dZ().a(cbr.m, new cbu($$3.ds(), 2.0F, 0));
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
      eps $$2 = $$0.J().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cfy $$0, bso $$1) {
      List<UUID> $$2 = $$0.dZ().c(cbr.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cE());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cE());
      }

      $$0.dZ().a(cbr.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
