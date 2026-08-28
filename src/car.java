import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class car extends bzw<cru> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iw e;
   private long f;
   private int g;
   private final List<iw> h = Lists.newArrayList();

   public car() {
      super(ImmutableMap.of(chh.o, chi.b, chh.n, chi.b, chh.f, chi.a));
   }

   protected boolean a(asb $$0, cru $$1) {
      if (!$$0.O().c(dkf.d)) {
         return false;
      } else if (!$$1.gF().b().a(crx.g)) {
         return false;
      } else {
         iw.a $$2 = $$1.dv().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dA() + (double)$$3, $$1.dC() + (double)$$4, $$1.dG() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new iw($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private iw a(asb $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.G_().a(this.h.size()));
   }

   private boolean a(iw $$0, asb $$1) {
      ebq $$2 = $$1.a_($$0);
      dno $$3 = $$2.b();
      dno $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dpl && ((dpl)$$3).i($$2) || $$2.l() && $$4 instanceof dqn;
   }

   protected void a(asb $$0, cru $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ec().a(chh.o, new bzz(this.e));
         $$1.ec().a(chh.n, new chk(new bzz(this.e), 0.5F, 1));
      }
   }

   protected void b(asb $$0, cru $$1, long $$2) {
      $$1.ec().b(chh.o);
      $$1.ec().b(chh.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(asb $$0, cru $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            ebq $$3 = $$0.a_(this.e);
            dno $$4 = $$3.b();
            dno $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dpl && ((dpl)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dqn && $$1.gO()) {
               bvj $$6 = $$1.u();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  dak $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axv.bO) && $$8.h() instanceof cys $$10) {
                     ebq $$11 = $$10.c().m();
                     $$0.b(this.e, $$11);
                     $$0.a(egq.i, this.e, egq.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awy.gJ, awz.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, dak.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dpl && !((dpl)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ec().a(chh.n, new chk(new bzz(this.e), 0.5F, 1));
                  $$1.ec().a(chh.o, new bzz(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(asb $$0, cru $$1, long $$2) {
      return this.g < 200;
   }
}
