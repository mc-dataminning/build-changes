import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class bxm extends bwx<coc> {
   private static final int c = 5;
   private static final int d = 600;
   private static final int e = 6600;
   private static final int f = 20;
   private static final Map<cof, alk<eul>> g = ImmutableMap.builder()
      .put(cof.c, euc.ar)
      .put(cof.d, euc.as)
      .put(cof.e, euc.at)
      .put(cof.f, euc.au)
      .put(cof.g, euc.av)
      .put(cof.h, euc.aw)
      .put(cof.i, euc.ax)
      .put(cof.j, euc.ay)
      .put(cof.k, euc.az)
      .put(cof.l, euc.aA)
      .put(cof.n, euc.aB)
      .put(cof.o, euc.aC)
      .put(cof.p, euc.aD)
      .build();
   private static final float h = 0.5F;
   private int i = 600;
   private boolean j;
   private long k;

   public bxm(int $$0) {
      super(ImmutableMap.of(cei.m, cej.c, cei.n, cej.c, cei.q, cej.c, cei.k, cej.a), $$0);
   }

   protected boolean a(arq $$0, coc $$1) {
      if (!this.b($$1)) {
         return false;
      } else if (this.i > 0) {
         this.i--;
         return false;
      } else {
         return true;
      }
   }

   protected void a(arq $$0, coc $$1, long $$2) {
      this.j = false;
      this.k = $$2;
      cor $$3 = this.c($$1).get();
      $$1.ee().a(cei.q, $$3);
      bwz.a($$1, $$3);
   }

   protected boolean b(arq $$0, coc $$1, long $$2) {
      return this.b($$1) && !this.j;
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      cor $$3 = this.c($$1).get();
      bwz.a($$1, $$3);
      if (this.a($$1, $$3)) {
         if ($$2 - this.k > 20L) {
            this.a($$1, (bve)$$3);
            this.j = true;
         }
      } else {
         bwz.a($$1, $$3, 0.5F, 5);
      }
   }

   protected void d(arq $$0, coc $$1, long $$2) {
      this.i = a($$0);
      $$1.ee().b(cei.q);
      $$1.ee().b(cei.m);
      $$1.ee().b(cei.n);
   }

   private void a(coc $$0, bve $$1) {
      $$0.a(a($$0), $$2 -> bwz.a($$0, $$2, $$1.dw()));
   }

   private static alk<eul> a(coc $$0) {
      if ($$0.p_()) {
         return euc.aF;
      } else {
         cof $$1 = $$0.gF().b();
         return g.getOrDefault($$1, euc.aE);
      }
   }

   private boolean b(coc $$0) {
      return this.c($$0).isPresent();
   }

   private Optional<cor> c(coc $$0) {
      return $$0.ee().c(cei.k).filter(this::a);
   }

   private boolean a(cor $$0) {
      return $$0.b(btp.F);
   }

   private boolean a(coc $$0, cor $$1) {
      jh $$2 = $$1.dy();
      jh $$3 = $$0.dy();
      return $$3.a($$2, 5.0);
   }

   private static int a(arq $$0) {
      return 600 + $$0.A.a(6001);
   }
}
