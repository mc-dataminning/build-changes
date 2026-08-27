import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bln extends bks<cbc> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private gw e;
   private long f;
   private int g;
   private final List<gw> h = Lists.newArrayList();

   public bln() {
      super(ImmutableMap.of(bsc.n, bsd.b, bsc.m, bsd.b, bsc.f, bsd.a));
   }

   protected boolean a(akn $$0, cbc $$1) {
      if (!$$0.X().b(cpm.c)) {
         return false;
      } else if ($$1.gl().b() != cbf.g) {
         return false;
      } else {
         gw.a $$2 = $$1.dk().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dp() + (double)$$3, $$1.dr() + (double)$$4, $$1.dv() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new gw($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private gw a(akn $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.y_().a(this.h.size()));
   }

   private boolean a(gw $$0, akn $$1) {
      dfe $$2 = $$1.a_($$0);
      csq $$3 = $$2.b();
      csq $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cuh && ((cuh)$$3).h($$2) || $$2.i() && $$4 instanceof cvj;
   }

   protected void a(akn $$0, cbc $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dM().a(bsc.n, new bkv(this.e));
         $$1.dM().a(bsc.m, new bsf(new bkv(this.e), 0.5F, 1));
      }
   }

   protected void b(akn $$0, cbc $$1, long $$2) {
      $$1.dM().b(bsc.n);
      $$1.dM().b(bsc.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(akn $$0, cbc $$1, long $$2) {
      if (this.e == null || this.e.a($$1.di(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dfe $$3 = $$0.a_(this.e);
            csq $$4 = $$3.b();
            csq $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cuh && ((cuh)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cvj && $$1.gu()) {
               bha $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cja $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(apw.aU) && $$8.d() instanceof cgt $$10) {
                     dfe $$11 = $$10.e().n();
                     $$0.b(this.e, $$11);
                     $$0.a(djo.i, this.e, djo.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aoz.fi, apa.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cja.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cuh && !((cuh)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dM().a(bsc.m, new bsf(new bkv(this.e), 0.5F, 1));
                  $$1.dM().a(bsc.n, new bkv(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(akn $$0, cbc $$1, long $$2) {
      return this.g < 200;
   }
}
