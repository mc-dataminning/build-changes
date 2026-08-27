import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bwo extends bld<bwm> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final apf l;
   private final apf m;
   private ehh n;
   private bwo.a o = bwo.a.d;

   public bwo(apf $$0, apf $$1) {
      super(ImmutableMap.of(bsn.m, bso.b, bsn.n, bso.c, bsn.o, bso.a, bsn.Y, bso.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(akt $$0, bwm $$1) {
      bjm $$2 = $$1.dN().c(bsn.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dN().b(bsn.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bjy.i && bwm.j($$2);
   }

   protected boolean a(akt $$0, bwm $$1, long $$2) {
      return $$1.dN().a(bsn.o) && this.o != bwo.a.d && !$$1.dN().a(bsn.Y);
   }

   protected void b(akt $$0, bwm $$1, long $$2) {
      bjm $$3 = $$1.dN().c(bsn.o).get();
      blf.a($$1, $$3);
      $$1.a((biw)$$3);
      $$1.dN().a(bsn.m, new bsq($$3.dj(), 2.0F, 0));
      this.k = 10;
      this.o = bwo.a.a;
   }

   protected void c(akt $$0, bwm $$1, long $$2) {
      $$1.dN().b(bsn.o);
      $$1.s();
      $$1.b(bjy.a);
   }

   private void b(akt $$0, bwm $$1) {
      $$0.a(null, $$1, this.m, aph.g, 2.0F, 1.0F);
      Optional<biw> $$2 = $$1.t();
      if ($$2.isPresent()) {
         biw $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(biw.c.a);
            }
         }
      }
   }

   protected void d(akt $$0, bwm $$1, long $$2) {
      bjm $$3 = $$1.dN().c(bsn.o).get();
      $$1.a((biw)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aph.g, 2.0F, 1.0F);
               $$1.b(bjy.j);
               $$3.f($$3.dj().a($$1.dj()).d().a(0.75));
               this.n = $$3.dj();
               this.j = 0;
               this.o = bwo.a.b;
            } else if (this.k <= 0) {
               $$1.dN().a(bsn.m, new bsq($$3.dj(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bwo.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bwo.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bwm $$0, bjm $$1) {
      eav $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bwm $$0, bjm $$1) {
      List<UUID> $$2 = $$0.dN().c(bsn.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dN().a(bsn.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
