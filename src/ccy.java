import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ccy extends brh<ccw> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final atx l;
   private final atx m;
   private ept n;
   private ccy.a o = ccy.a.d;

   public ccy(atx $$0, atx $$1) {
      super(ImmutableMap.of(bys.m, byt.b, bys.n, byt.c, bys.o, byt.a, bys.Z, byt.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(apf $$0, ccw $$1) {
      bpp $$2 = $$1.dP().c(bys.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dP().b(bys.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.ap() != bqa.i && ccw.j($$2);
   }

   protected boolean a(apf $$0, ccw $$1, long $$2) {
      return $$1.dP().a(bys.o) && this.o != ccy.a.d && !$$1.dP().a(bys.Z);
   }

   protected void b(apf $$0, ccw $$1, long $$2) {
      bpp $$3 = $$1.dP().c(bys.o).get();
      brj.a($$1, $$3);
      $$1.b($$3);
      $$1.dP().a(bys.m, new byv($$3.dk(), 2.0F, 0));
      this.k = 10;
      this.o = ccy.a.a;
   }

   protected void c(apf $$0, ccw $$1, long $$2) {
      $$1.dP().b(bys.o);
      $$1.r();
      $$1.b(bqa.a);
   }

   private void b(apf $$0, ccw $$1) {
      $$0.a(null, $$1, this.m, atz.g, 2.0F, 1.0F);
      Optional<box> $$2 = $$1.s();
      if ($$2.isPresent()) {
         box $$3 = $$2.get();
         if ($$3.bA()) {
            $$1.C($$3);
            if (!$$3.bA()) {
               $$3.a(box.c.a);
            }
         }
      }
   }

   protected void d(apf $$0, ccw $$1, long $$2) {
      bpp $$3 = $$1.dP().c(bys.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, atz.g, 2.0F, 1.0F);
               $$1.b(bqa.j);
               $$3.g($$3.dk().a($$1.dk()).d().a(0.75));
               this.n = $$3.dk();
               this.j = 0;
               this.o = ccy.a.b;
            } else if (this.k <= 0) {
               $$1.dP().a(bys.m, new byv($$3.dk(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = ccy.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = ccy.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(ccw $$0, bpp $$1) {
      ejd $$2 = $$0.K().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(ccw $$0, bpp $$1) {
      List<UUID> $$2 = $$0.dP().c(bys.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cw());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cw());
      }

      $$0.dP().a(bys.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
