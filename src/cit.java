import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class cit extends bwz<cir> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final avz l;
   private final avz m;
   private faz n;
   private cit.a o = cit.a.d;

   public cit(avz $$0, avz $$1) {
      super(ImmutableMap.of(cek.m, cel.b, cek.n, cel.c, cek.o, cel.a, cek.Z, cel.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(ard $$0, cir $$1) {
      bvg $$2 = $$1.eb().c(cek.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.eb().b(cek.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.aw() != bvs.i && cir.j($$2);
   }

   protected boolean a(ard $$0, cir $$1, long $$2) {
      return $$1.eb().a(cek.o) && this.o != cit.a.d && !$$1.eb().a(cek.Z);
   }

   protected void b(ard $$0, cir $$1, long $$2) {
      bvg $$3 = $$1.eb().c(cek.o).get();
      bxb.a($$1, $$3);
      $$1.b($$3);
      $$1.eb().a(cek.m, new cen($$3.dt(), 2.0F, 0));
      this.k = 10;
      this.o = cit.a.a;
   }

   protected void c(ard $$0, cir $$1, long $$2) {
      $$1.eb().b(cek.o);
      $$1.p();
      $$1.b(bvs.a);
   }

   private void b(ard $$0, cir $$1) {
      $$0.a(null, $$1, this.m, awb.g, 2.0F, 1.0F);
      Optional<buk> $$2 = $$1.t();
      if ($$2.isPresent()) {
         buk $$3 = $$2.get();
         if ($$3.bL()) {
            $$1.c($$0, $$3);
            if (!$$3.bL()) {
               $$3.a(buk.d.a);
            }
         }
      }
   }

   protected void d(ard $$0, cir $$1, long $$2) {
      bvg $$3 = $$1.eb().c(cek.o).get();
      $$1.b($$3);
      switch (this.o) {
         case a:
            if ($$3.f($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, awb.g, 2.0F, 1.0F);
               $$1.b(bvs.j);
               $$3.i($$3.dt().a($$1.dt()).d().c(0.75));
               this.n = $$3.dt();
               this.j = 0;
               this.o = cit.a.b;
            } else if (this.k <= 0) {
               $$1.eb().a(cek.m, new cen($$3.dt(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = cit.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = cit.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(cir $$0, bvg $$1) {
      etm $$2 = $$0.P().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(cir $$0, bvg $$1) {
      List<UUID> $$2 = $$0.eb().c(cek.aa).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cG());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cG());
      }

      $$0.eb().a(cek.aa, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
