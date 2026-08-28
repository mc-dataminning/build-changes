import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cgo extends buv<cgm> {
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
   private ewh n;
   private cgo.a o = cgo.a.d;

   public cgo(avg $$0, avg $$1) {
      super(ImmutableMap.of(ccg.m, cch.b, ccg.n, cch.c, ccg.o, cch.a, ccg.Z, cch.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(aqm $$0, cgm $$1) {
      btc $$2 = $$1.dV().c(ccg.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dV().b(ccg.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.at() != bto.i && cgm.j($$2);
   }

   protected boolean a(aqm $$0, cgm $$1, long $$2) {
      return $$1.dV().a(ccg.o) && this.o != cgo.a.d && !$$1.dV().a(ccg.Z);
   }

   protected void b(aqm $$0, cgm $$1, long $$2) {
      btc $$3 = $$1.dV().c(ccg.o).get();
      bux.a($$1, $$3);
      $$1.b($$3);
      $$1.dV().a(ccg.m, new ccj($$3.dp(), 2.0F, 0));
      this.k = 10;
      this.o = cgo.a.a;
   }

   protected void c(aqm $$0, cgm $$1, long $$2) {
      $$1.dV().b(ccg.o);
      $$1.s();
      $$1.b(bto.a);
   }

   private void b(aqm $$0, cgm $$1) {
      $$0.a(null, $$1, this.m, avi.g, 2.0F, 1.0F);
      Optional<bsh> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bsh $$3 = $$2.get();
         if ($$3.bF()) {
            $$1.D($$3);
            if (!$$3.bF()) {
               $$3.a(bsh.d.a);
            }
         }
      }
   }

   protected void d(aqm $$0, cgm $$1, long $$2) {
      btc $$3 = $$1.dV().c(ccg.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, avi.g, 2.0F, 1.0F);
               $$1.b(bto.j);
               $$3.j($$3.dp().a($$1.dp()).d().a(0.75));
               this.n = $$3.dp();
               this.j = 0;
               this.o = cgo.a.b;
            } else if (this.k <= 0) {
               $$1.dV().a(ccg.m, new ccj($$3.dp(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cgo.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cgo.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cgm $$0, btc $$1) {
      eox $$2 = $$0.J().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cgm $$0, btc $$1) {
      List<UUID> $$2 = $$0.dV().c(ccg.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cB());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cB());
      }

      $$0.dV().a(ccg.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
