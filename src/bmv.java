import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bmv extends bma<cck> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ht e;
   private long f;
   private int g;
   private final List<ht> h = Lists.newArrayList();

   public bmv() {
      super(ImmutableMap.of(btk.n, btl.b, btk.m, btl.b, btk.f, btl.a));
   }

   protected boolean a(alq $$0, cck $$1) {
      if (!$$0.X().b(cqv.c)) {
         return false;
      } else if ($$1.gp().b() != ccn.g) {
         return false;
      } else {
         ht.a $$2 = $$1.dl().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dq() + (double)$$3, $$1.ds() + (double)$$4, $$1.dw() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ht($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ht a(alq $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ht $$0, alq $$1) {
      dgb $$2 = $$1.a_($$0);
      cua $$3 = $$2.b();
      cua $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cvt && ((cvt)$$3).h($$2) || $$2.i() && $$4 instanceof cwv;
   }

   protected void a(alq $$0, cck $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dN().a(btk.n, new bmd(this.e));
         $$1.dN().a(btk.m, new btn(new bmd(this.e), 0.5F, 1));
      }
   }

   protected void b(alq $$0, cck $$1, long $$2) {
      $$1.dN().b(btk.n);
      $$1.dN().b(btk.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(alq $$0, cck $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dj(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dgb $$3 = $$0.a_(this.e);
            cua $$4 = $$3.b();
            cua $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cvt && ((cvt)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cwv && $$1.gy()) {
               bii $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  ckj $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(ara.aU) && $$8.d() instanceof cic $$10) {
                     dgb $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dkl.i, this.e, dkl.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aqd.fi, aqe.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, ckj.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cvt && !((cvt)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dN().a(btk.m, new btn(new bmd(this.e), 0.5F, 1));
                  $$1.dN().a(btk.n, new bmd(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(alq $$0, cck $$1, long $$2) {
      return this.g < 200;
   }
}
