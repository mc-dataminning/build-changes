import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class bwd extends bks<bwb> {
   public static final int c = 100;
   public static final int d = 6;
   public static final int e = 10;
   private static final float h = 1.75F;
   private static final float i = 0.75F;
   public static final int f = 100;
   public static final int g = 5;
   private int j;
   private int k;
   private final aoy l;
   private final aoy m;
   private ehi n;
   private bwd.a o = bwd.a.d;

   public bwd(aoy $$0, aoy $$1) {
      super(ImmutableMap.of(bsc.m, bsd.b, bsc.n, bsd.c, bsc.o, bsd.a, bsc.Y, bsd.b), 100);
      this.l = $$0;
      this.m = $$1;
   }

   protected boolean a(akn $$0, bwb $$1) {
      bjb $$2 = $$1.dM().c(bsc.o).get();
      boolean $$3 = this.a($$1, $$2);
      if (!$$3) {
         $$1.dM().b(bsc.o);
         this.b($$1, $$2);
      }

      return $$3 && $$1.an() != bjn.i && bwb.j($$2);
   }

   protected boolean a(akn $$0, bwb $$1, long $$2) {
      return $$1.dM().a(bsc.o) && this.o != bwd.a.d && !$$1.dM().a(bsc.Y);
   }

   protected void b(akn $$0, bwb $$1, long $$2) {
      bjb $$3 = $$1.dM().c(bsc.o).get();
      bku.a($$1, $$3);
      $$1.a((bil)$$3);
      $$1.dM().a(bsc.m, new bsf($$3.di(), 2.0F, 0));
      this.k = 10;
      this.o = bwd.a.a;
   }

   protected void c(akn $$0, bwb $$1, long $$2) {
      $$1.dM().b(bsc.o);
      $$1.p();
      $$1.b(bjn.a);
   }

   private void b(akn $$0, bwb $$1) {
      $$0.a(null, $$1, this.m, apa.g, 2.0F, 1.0F);
      Optional<bil> $$2 = $$1.q();
      if ($$2.isPresent()) {
         bil $$3 = $$2.get();
         if ($$3.bv()) {
            $$1.C($$3);
            if (!$$3.bv()) {
               $$3.a(bil.c.a);
            }
         }
      }
   }

   protected void d(akn $$0, bwb $$1, long $$2) {
      bjb $$3 = $$1.dM().c(bsc.o).get();
      $$1.a((bil)$$3);
      switch (this.o) {
         case a:
            if ($$3.e($$1) < 1.75F) {
               $$0.a(null, $$1, this.l, apa.g, 2.0F, 1.0F);
               $$1.b(bjn.j);
               $$3.f($$3.di().a($$1.di()).d().a(0.75));
               this.n = $$3.di();
               this.j = 0;
               this.o = bwd.a.b;
            } else if (this.k <= 0) {
               $$1.dM().a(bsc.m, new bsf($$3.di(), 2.0F, 0));
               this.k = 10;
            } else {
               this.k--;
            }
            break;
         case b:
            if (this.j++ >= 6) {
               this.o = bwd.a.c;
               this.b($$0, $$1);
            }
            break;
         case c:
            if (this.j >= 10) {
               this.o = bwd.a.d;
            } else {
               this.j++;
            }
         case d:
      }
   }

   private boolean a(bwb $$0, bjb $$1) {
      eaw $$2 = $$0.H().a($$1, 0);
      return $$2 != null && $$2.m() < 1.75F;
   }

   private void b(bwb $$0, bjb $$1) {
      List<UUID> $$2 = $$0.dM().c(bsc.Z).orElseGet(ArrayList::new);
      boolean $$3 = !$$2.contains($$1.cv());
      if ($$2.size() == 5 && $$3) {
         $$2.remove(0);
      }

      if ($$3) {
         $$2.add($$1.cv());
      }

      $$0.dM().a(bsc.Z, $$2, 100L);
   }

   static enum a {
      a,
      b,
      c,
      d;
   }
}
