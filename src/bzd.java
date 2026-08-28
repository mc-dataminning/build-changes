import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzd extends byi<cpu> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jj e;
   private long f;
   private int g;
   private final List<jj> h = Lists.newArrayList();

   public bzd() {
      super(ImmutableMap.of(cft.o, cfu.b, cft.n, cfu.b, cft.f, cfu.a));
   }

   protected boolean a(arn $$0, cpu $$1) {
      if (!$$0.O().c(dhl.c)) {
         return false;
      } else if (!$$1.gy().b().a(cpx.g)) {
         return false;
      } else {
         jj.a $$2 = $$1.dv().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dA() + (double)$$3, $$1.dC() + (double)$$4, $$1.dG() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jj($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jj a(arn $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.C_().a(this.h.size()));
   }

   private boolean a(jj $$0, arn $$1) {
      dym $$2 = $$1.a_($$0);
      dku $$3 = $$2.b();
      dku $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dmq && ((dmq)$$3).i($$2) || $$2.l() && $$4 instanceof dns;
   }

   protected void a(arn $$0, cpu $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eb().a(cft.o, new byl(this.e));
         $$1.eb().a(cft.n, new cfw(new byl(this.e), 0.5F, 1));
      }
   }

   protected void b(arn $$0, cpu $$1, long $$2) {
      $$1.eb().b(cft.o);
      $$1.eb().b(cft.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arn $$0, cpu $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dym $$3 = $$0.a_(this.e);
            dku $$4 = $$3.b();
            dku $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dmq && ((dmq)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dns && $$1.gI()) {
               btx $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cxy $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axi.bM) && $$8.h() instanceof cwf $$10) {
                     dym $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(edm.i, this.e, edm.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awk.gH, awl.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cxy.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dmq && !((dmq)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eb().a(cft.n, new cfw(new byl(this.e), 0.5F, 1));
                  $$1.eb().a(cft.o, new byl(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arn $$0, cpu $$1, long $$2) {
      return this.g < 200;
   }
}
