import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bya extends bmp<bxy> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aqm l;
   private final aqm m;
   private eji n;
   private bya.a o = bya.a.d;

   public bya(aqm $$0, aqm $$1) {
      super(ImmutableMap.of(btz.m, bua.b, btz.n, bua.c, btz.o, bua.a, btz.Y, bua.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ama $$0, bxy $$1) {
      bky $$2 = $$1.dN().c(btz.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dN().b(btz.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != blk.i && bxy.j($$2);
   }

   protected boolean a(ama $$0, bxy $$1, long $$2) {
      return $$1.dN().a(btz.o) && this.o != bya.a.d && !$$1.dN().a(btz.Y);
   }

   protected void b(ama $$0, bxy $$1, long $$2) {
      bky $$3 = $$1.dN().c(btz.o).get();
      bmr.a($$1, $$3);
      $$1.a((bki)$$3);
      $$1.dN().a(btz.m, new buc($$3.dj(), 2.0F, 0));
      this.k = 10;
      this.o = bya.a.a;
   }

   protected void c(ama $$0, bxy $$1, long $$2) {
      $$1.dN().b(btz.o);
      $$1.s();
      $$1.b(blk.a);
   }

   private void b(ama $$0, bxy $$1) {
      $$0.a(null, $$1, this.m, aqo.g, 2.0F, 1.0F);
      Optional<bki> $$2 = $$1.t();
      if ($$2.isPresent()) {
         bki $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(bki.c.a);
            }
         }
      }
   }

   protected void d(ama $$0, bxy $$1, long $$2) {
      bky $$3 = $$1.dN().c(btz.o).get();
      $$1.a((bki)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, aqo.g, 2.0F, 1.0F);
               $$1.b(blk.j);
               $$3.f($$3.dj().a($$1.dj()).d().a(0.75));
               this.n = $$3.dj();
               this.j = 0;
               this.o = bya.a.b;
            } else if (this.k <= 0) {
               $$1.dN().a(btz.m, new buc($$3.dj(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bya.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bya.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bxy $$0, bky $$1) {
      ecv $$2 = $$0.L().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bxy $$0, bky $$1) {
      List<UUID> $$2 = $$0.dN().c(btz.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dN().a(btz.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
