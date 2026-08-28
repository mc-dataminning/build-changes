import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzv extends bza<cqv> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iv e;
   private long f;
   private int g;
   private final List<iv> h = Lists.newArrayList();

   public bzv() {
      super(ImmutableMap.of(cgl.o, cgm.b, cgl.n, cgm.b, cgl.f, cgm.a));
   }

   protected boolean a(arq $$0, cqv $$1) {
      if (!$$0.O().c(djd.d)) {
         return false;
      } else if (!$$1.gB().b().a(cqy.g)) {
         return false;
      } else {
         iv.a $$2 = $$1.du().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dz() + (double)$$3, $$1.dB() + (double)$$4, $$1.dF() + (double)$$5);
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
   private iv a(arq $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.C_().a(this.h.size()));
   }

   private boolean a(iv $$0, arq $$1) {
      eao $$2 = $$1.a_($$0);
      dmm $$3 = $$2.b();
      dmm $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof doj && ((doj)$$3).i($$2) || $$2.l() && $$4 instanceof dpl;
   }

   protected void a(arq $$0, cqv $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eb().a(cgl.o, new bzd(this.e));
         $$1.eb().a(cgl.n, new cgo(new bzd(this.e), 0.5F, 1));
      }
   }

   protected void b(arq $$0, cqv $$1, long $$2) {
      $$1.eb().b(cgl.o);
      $$1.eb().b(cgl.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arq $$0, cqv $$1, long $$2) {
      if (this.e == null || this.e.a($$1.ds(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            eao $$3 = $$0.a_(this.e);
            dmm $$4 = $$3.b();
            dmm $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof doj && ((doj)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dpl && $$1.gM()) {
               bun $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  czk $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axk.bN) && $$8.h() instanceof cxs $$10) {
                     eao $$11 = $$10.c().m();
                     $$0.b(this.e, $$11);
                     $$0.a(efo.i, this.e, efo.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awn.gJ, awo.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, czk.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof doj && !((doj)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eb().a(cgl.n, new cgo(new bzd(this.e), 0.5F, 1));
                  $$1.eb().a(cgl.o, new bzd(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arq $$0, cqv $$1, long $$2) {
      return this.g < 200;
   }
}
