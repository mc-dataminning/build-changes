import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cag extends bzl<crj> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iv e;
   private long f;
   private int g;
   private final List<iv> h = Lists.newArrayList();

   public cag() {
      super(ImmutableMap.of(cgw.o, cgx.b, cgw.n, cgx.b, cgw.f, cgx.a));
   }

   protected boolean a(ars $$0, crj $$1) {
      if (!$$0.O().c(djt.d)) {
         return false;
      } else if (!$$1.gC().b().a(crm.g)) {
         return false;
      } else {
         iv.a $$2 = $$1.dv().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dA() + (double)$$3, $$1.dC() + (double)$$4, $$1.dG() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new iv($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private iv a(ars $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.G_().a(this.h.size()));
   }

   private boolean a(iv $$0, ars $$1) {
      ebe $$2 = $$1.a_($$0);
      dnc $$3 = $$2.b();
      dnc $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof doz && ((doz)$$3).i($$2) || $$2.l() && $$4 instanceof dqb;
   }

   protected void a(ars $$0, crj $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ec().a(cgw.o, new bzo(this.e));
         $$1.ec().a(cgw.n, new cgz(new bzo(this.e), 0.5F, 1));
      }
   }

   protected void b(ars $$0, crj $$1, long $$2) {
      $$1.ec().b(cgw.o);
      $$1.ec().b(cgw.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ars $$0, crj $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            ebe $$3 = $$0.a_(this.e);
            dnc $$4 = $$3.b();
            dnc $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof doz && ((doz)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dqb && $$1.gN()) {
               buy $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  czy $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axm.bN) && $$8.h() instanceof cyg $$10) {
                     ebe $$11 = $$10.c().m();
                     $$0.b(this.e, $$11);
                     $$0.a(ege.i, this.e, ege.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awp.gJ, awq.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, czy.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof doz && !((doz)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ec().a(cgw.n, new cgz(new bzo(this.e), 0.5F, 1));
                  $$1.ec().a(cgw.o, new bzo(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ars $$0, crj $$1, long $$2) {
      return this.g < 200;
   }
}
