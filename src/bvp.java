import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bvp extends buu<clx> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ja e;
   private long f;
   private int g;
   private final List<ja> h = Lists.newArrayList();

   public bvp() {
      super(ImmutableMap.of(ccf.n, ccg.b, ccf.m, ccg.b, ccf.f, ccg.a));
   }

   protected boolean a(aqm $$0, clx $$1) {
      if (!$$0.ab().b(dcb.c)) {
         return false;
      } else if ($$1.gz().b() != cma.g) {
         return false;
      } else {
         ja.a $$2 = $$1.dq().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dv() + (double)$$3, $$1.dx() + (double)$$4, $$1.dB() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ja($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ja a(aqm $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ja $$0, aqm $$1) {
      dsk $$2 = $$1.a_($$0);
      dfh $$3 = $$2.b();
      dfh $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dhc && ((dhc)$$3).h($$2) || $$2.i() && $$4 instanceof die;
   }

   protected void a(aqm $$0, clx $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dU().a(ccf.n, new bux(this.e));
         $$1.dU().a(ccf.m, new cci(new bux(this.e), 0.5F, 1));
      }
   }

   protected void b(aqm $$0, clx $$1, long $$2) {
      $$1.dU().b(ccf.n);
      $$1.dU().b(ccf.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqm $$0, clx $$1, long $$2) {
      if (this.e == null || this.e.a($$1.do(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dsk $$3 = $$0.a_(this.e);
            dfh $$4 = $$3.b();
            dfh $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dhc && ((dhc)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof die && $$1.gI()) {
               bqp $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cuc $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awf.bx) && $$8.g() instanceof csb $$10) {
                     dsk $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dxg.i, this.e, dxg.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avh.gm, avi.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cuc.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dhc && !((dhc)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dU().a(ccf.m, new cci(new bux(this.e), 0.5F, 1));
                  $$1.dU().a(ccf.n, new bux(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqm $$0, clx $$1, long $$2) {
      return this.g < 200;
   }
}
