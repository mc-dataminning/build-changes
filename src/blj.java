import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class blj extends bko<cay> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private gv e;
   private long f;
   private int g;
   private final List<gv> h = Lists.newArrayList();

   public blj() {
      super(ImmutableMap.of(bry.n, brz.b, bry.m, brz.b, bry.f, brz.a));
   }

   protected boolean a(aki $$0, cay $$1) {
      if (!$$0.X().b(cpg.c)) {
         return false;
      } else if ($$1.gk().b() != cbb.g) {
         return false;
      } else {
         gv.a $$2 = $$1.dk().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dp() + (double)$$3, $$1.dr() + (double)$$4, $$1.dv() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new gv($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private gv a(aki $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.y_().a(this.h.size()));
   }

   private boolean a(gv $$0, aki $$1) {
      dey $$2 = $$1.a_($$0);
      csk $$3 = $$2.b();
      csk $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cub && ((cub)$$3).h($$2) || $$2.i() && $$4 instanceof cvd;
   }

   protected void a(aki $$0, cay $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dM().a(bry.n, new bkr(this.e));
         $$1.dM().a(bry.m, new bsb(new bkr(this.e), 0.5F, 1));
      }
   }

   protected void b(aki $$0, cay $$1, long $$2) {
      $$1.dM().b(bry.n);
      $$1.dM().b(bry.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aki $$0, cay $$1, long $$2) {
      if (this.e == null || this.e.a($$1.di(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dey $$3 = $$0.a_(this.e);
            csk $$4 = $$3.b();
            csk $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cub && ((cub)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cvd && $$1.gt()) {
               bgv $$6 = $$1.t();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  ciw $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(apr.aU) && $$8.d() instanceof cgp $$10) {
                     dey $$11 = $$10.e().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dji.i, this.e, dji.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aou.fi, aov.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, ciw.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cub && !((cub)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dM().a(bry.m, new bsb(new bkr(this.e), 0.5F, 1));
                  $$1.dM().a(bry.n, new bkr(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aki $$0, cay $$1, long $$2) {
      return this.g < 200;
   }
}
