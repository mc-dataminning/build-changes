import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzq extends byv<cqo> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iu e;
   private long f;
   private int g;
   private final List<iu> h = Lists.newArrayList();

   public bzq() {
      super(ImmutableMap.of(cgg.o, cgh.b, cgg.n, cgh.b, cgg.f, cgh.a));
   }

   protected boolean a(arq $$0, cqo $$1) {
      if (!$$0.O().c(diw.d)) {
         return false;
      } else if (!$$1.gz().b().a(cqr.g)) {
         return false;
      } else {
         iu.a $$2 = $$1.dv().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dA() + (double)$$3, $$1.dC() + (double)$$4, $$1.dG() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new iu($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private iu a(arq $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.C_().a(this.h.size()));
   }

   private boolean a(iu $$0, arq $$1) {
      eah $$2 = $$1.a_($$0);
      dmf $$3 = $$2.b();
      dmf $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof doc && ((doc)$$3).i($$2) || $$2.l() && $$4 instanceof dpe;
   }

   protected void a(arq $$0, cqo $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ec().a(cgg.o, new byy(this.e));
         $$1.ec().a(cgg.n, new cgj(new byy(this.e), 0.5F, 1));
      }
   }

   protected void b(arq $$0, cqo $$1, long $$2) {
      $$1.ec().b(cgg.o);
      $$1.ec().b(cgg.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arq $$0, cqo $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            eah $$3 = $$0.a_(this.e);
            dmf $$4 = $$3.b();
            dmf $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof doc && ((doc)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dpe && $$1.gK()) {
               buk $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  czd $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axk.bN) && $$8.h() instanceof cxl $$10) {
                     eah $$11 = $$10.c().m();
                     $$0.b(this.e, $$11);
                     $$0.a(efh.i, this.e, efh.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awn.gJ, awo.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, czd.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof doc && !((doc)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ec().a(cgg.n, new cgj(new byy(this.e), 0.5F, 1));
                  $$1.ec().a(cgg.o, new byy(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arq $$0, cqo $$1, long $$2) {
      return this.g < 200;
   }
}
