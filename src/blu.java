import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class blu extends bkz<cbj> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private gw e;
   private long f;
   private int g;
   private final List<gw> h = Lists.newArrayList();

   public blu() {
      super(ImmutableMap.of(bsj.n, bsk.b, bsj.m, bsk.b, bsj.f, bsk.a));
   }

   protected boolean a(aks $$0, cbj $$1) {
      if (!$$0.X().b(cpt.c)) {
         return false;
      } else if ($$1.go().b() != cbm.g) {
         return false;
      } else {
         gw.a $$2 = $$1.dl().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dq() + (double)$$3, $$1.ds() + (double)$$4, $$1.dw() + (double)$$5);
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
   private gw a(aks $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.D_().a(this.h.size()));
   }

   private boolean a(gw $$0, aks $$1) {
      dfl $$2 = $$1.a_($$0);
      csx $$3 = $$2.b();
      csx $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cuo && ((cuo)$$3).h($$2) || $$2.i() && $$4 instanceof cvq;
   }

   protected void a(aks $$0, cbj $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dN().a(bsj.n, new blc(this.e));
         $$1.dN().a(bsj.m, new bsm(new blc(this.e), 0.5F, 1));
      }
   }

   protected void b(aks $$0, cbj $$1, long $$2) {
      $$1.dN().b(bsj.n);
      $$1.dN().b(bsj.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aks $$0, cbj $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dj(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dfl $$3 = $$0.a_(this.e);
            csx $$4 = $$3.b();
            csx $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cuo && ((cuo)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cvq && $$1.gx()) {
               bhh $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cjh $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(aqc.aU) && $$8.d() instanceof cha $$10) {
                     dfl $$11 = $$10.e().n();
                     $$0.b(this.e, $$11);
                     $$0.a(djv.i, this.e, djv.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), apf.fi, apg.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cjh.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cuo && !((cuo)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dN().a(bsj.m, new bsm(new blc(this.e), 0.5F, 1));
                  $$1.dN().a(bsj.n, new blc(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aks $$0, cbj $$1, long $$2) {
      return this.g < 200;
   }
}
