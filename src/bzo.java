import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bzo extends byt<cqk> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iu e;
   private long f;
   private int g;
   private final List<iu> h = Lists.newArrayList();

   public bzo() {
      super(ImmutableMap.of(cge.o, cgf.b, cge.n, cgf.b, cge.f, cgf.a));
   }

   protected boolean a(arq $$0, cqk $$1) {
      if (!$$0.O().c(dir.c)) {
         return false;
      } else if (!$$1.gy().b().a(cqn.g)) {
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
      dzz $$2 = $$1.a_($$0);
      dma $$3 = $$2.b();
      dma $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dnw && ((dnw)$$3).i($$2) || $$2.l() && $$4 instanceof doy;
   }

   protected void a(arq $$0, cqk $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.eb().a(cge.o, new byw(this.e));
         $$1.eb().a(cge.n, new cgh(new byw(this.e), 0.5F, 1));
      }
   }

   protected void b(arq $$0, cqk $$1, long $$2) {
      $$1.eb().b(cge.o);
      $$1.eb().b(cge.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arq $$0, cqk $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dzz $$3 = $$0.a_(this.e);
            dma $$4 = $$3.b();
            dma $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dnw && ((dnw)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof doy && $$1.gJ()) {
               bui $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cyy $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axk.bM) && $$8.h() instanceof cxg $$10) {
                     dzz $$11 = $$10.c().m();
                     $$0.b(this.e, $$11);
                     $$0.a(eez.i, this.e, eez.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awn.gH, awo.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cyy.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dnw && !((dnw)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.eb().a(cge.n, new cgh(new byw(this.e), 0.5F, 1));
                  $$1.eb().a(cge.o, new byw(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arq $$0, cqk $$1, long $$2) {
      return this.g < 200;
   }
}
