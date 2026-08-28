import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxj extends bwo<cnt> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jg e;
   private long f;
   private int g;
   private final List<jg> h = Lists.newArrayList();

   public bxj() {
      super(ImmutableMap.of(cdz.n, cea.b, cdz.m, cea.b, cdz.f, cea.a));
   }

   protected boolean a(arm $$0, cnt $$1) {
      if (!$$0.ac().b(der.c)) {
         return false;
      } else if ($$1.gF().b() != cnw.g) {
         return false;
      } else {
         jg.a $$2 = $$1.dx().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dC() + (double)$$3, $$1.dE() + (double)$$4, $$1.dI() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jg($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jg a(arm $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(jg $$0, arm $$1) {
      dvd $$2 = $$1.a_($$0);
      dhy $$3 = $$2.b();
      dhy $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof djt && ((djt)$$3).i($$2) || $$2.l() && $$4 instanceof dku;
   }

   protected void a(arm $$0, cnt $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ed().a(cdz.n, new bwr(this.e));
         $$1.ed().a(cdz.m, new cec(new bwr(this.e), 0.5F, 1));
      }
   }

   protected void b(arm $$0, cnt $$1, long $$2) {
      $$1.ed().b(cdz.n);
      $$1.ed().b(cdz.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arm $$0, cnt $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dv(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dvd $$3 = $$0.a_(this.e);
            dhy $$4 = $$3.b();
            dhy $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof djt && ((djt)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dku && $$1.gO()) {
               bsf $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cvx $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axi.bK) && $$8.h() instanceof cuc $$10) {
                     dvd $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(eaa.i, this.e, eaa.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awk.gn, awl.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cvx.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof djt && !((djt)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ed().a(cdz.m, new cec(new bwr(this.e), 0.5F, 1));
                  $$1.ed().a(cdz.n, new bwr(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arm $$0, cnt $$1, long $$2) {
      return this.g < 200;
   }
}
