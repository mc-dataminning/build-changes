import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bxl extends bma<bxj> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aqc l;
   private final aqc m;
   private eif n;
   private bxl.a o = bxl.a.d;

   public bxl(aqc $$0, aqc $$1) {
      super(ImmutableMap.of(btk.m, btl.b, btk.n, btl.c, btk.o, btl.a, btk.Y, btl.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(alq $$0, bxj $$1) {
      bkj $$2 = $$1.dN().c(btk.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dN().b(btk.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bkv.i && bxj.j($$2);
   }

   protected boolean a(alq $$0, bxj $$1, long $$2) {
      return $$1.dN().a(btk.o) && this.o != bxl.a.d && !$$1.dN().a(btk.Y);
   }

   protected void b(alq $$0, bxj $$1, long $$2) {
      bkj $$3 = $$1.dN().c(btk.o).get();
      bmc.a($$1, $$3);
      $$1.a((bjt)$$3);
      $$1.dN().a(btk.m, new btn($$3.dj(), 2.0F, 0));
      this.k = 10;
      this.o = bxl.a.a;
   }

   protected void c(alq $$0, bxj $$1, long $$2) {
      $$1.dN().b(btk.o);
      $$1.s();
      $$1.b(bkv.a);
   }

   private void b(alq $$0, bxj $$1) {
      $$0.a(null, $$1, this.m, aqe.g, 2.0F, 1.0F);
      Optional<bjt> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bjt $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(bjt.c.a);
            }
         }
      }
   }

   protected void d(alq $$0, bxj $$1, long $$2) {
      bkj $$3 = $$1.dN().c(btk.o).get();
      $$1.a((bjt)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aqe.g, 2.0F, 1.0F);
               $$1.b(bkv.j);
               $$3.f($$3.dj().a($$1.dj()).d().a(0.75));
               this.n = $$3.dj();
               this.j = 0;
               this.o = bxl.a.b;
            } else if (this.k <= 0) {
               $$1.dN().a(btk.m, new btn($$3.dj(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bxl.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bxl.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bxj $$0, bkj $$1) {
      ebt $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bxj $$0, bkj $$1) {
      List<UUID> $$2 = $$0.dN().c(btk.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dN().a(btk.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
