import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxs extends bwx<coc> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jh e;
   private long f;
   private int g;
   private final List<jh> h = Lists.newArrayList();

   public bxs() {
      super(ImmutableMap.of(cei.n, cej.b, cei.m, cej.b, cei.f, cej.a));
   }

   protected boolean a(arq $$0, coc $$1) {
      if (!$$0.ac().b(dfb.c)) {
         return false;
      } else if ($$1.gF().b() != cof.g) {
         return false;
      } else {
         jh.a $$2 = $$1.dy().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dD() + (double)$$3, $$1.dF() + (double)$$4, $$1.dJ() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jh($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jh a(arq $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(jh $$0, arq $$1) {
      dvo $$2 = $$1.a_($$0);
      dij $$3 = $$2.b();
      dij $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dke && ((dke)$$3).i($$2) || $$2.l() && $$4 instanceof dlf;
   }

   protected void a(arq $$0, coc $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ee().a(cei.n, new bxa(this.e));
         $$1.ee().a(cei.m, new cel(new bxa(this.e), 0.5F, 1));
      }
   }

   protected void b(arq $$0, coc $$1, long $$2) {
      $$1.ee().b(cei.n);
      $$1.ee().b(cei.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arq $$0, coc $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dw(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dvo $$3 = $$0.a_(this.e);
            dij $$4 = $$3.b();
            dij $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dke && ((dke)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dlf && $$1.gO()) {
               bso $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cwf $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axm.bO) && $$8.h() instanceof cul $$10) {
                     dvo $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(eak.i, this.e, eak.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awo.gn, awp.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cwf.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dke && !((dke)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ee().a(cei.m, new cel(new bxa(this.e), 0.5F, 1));
                  $$1.ee().a(cei.n, new bxa(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arq $$0, coc $$1, long $$2) {
      return this.g < 200;
   }
}
