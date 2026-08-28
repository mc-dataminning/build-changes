import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cai extends bzn<crl> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iw e;
   private long f;
   private int g;
   private final List<iw> h = Lists.newArrayList();

   public cai() {
      super(ImmutableMap.of(cgy.o, cgz.b, cgy.n, cgz.b, cgy.f, cgz.a));
   }

   protected boolean a(aru $$0, crl $$1) {
      if (!$$0.O().c(djv.d)) {
         return false;
      } else if (!$$1.gC().b().a(cro.g)) {
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
   private iw a(aru $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.G_().a(this.h.size()));
   }

   private boolean a(iw $$0, aru $$1) {
      ebg $$2 = $$1.a_($$0);
      dne $$3 = $$2.b();
      dne $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dpb && ((dpb)$$3).i($$2) || $$2.l() && $$4 instanceof dqd;
   }

   protected void a(aru $$0, crl $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ec().a(cgy.o, new bzq(this.e));
         $$1.ec().a(cgy.n, new chb(new bzq(this.e), 0.5F, 1));
      }
   }

   protected void b(aru $$0, crl $$1, long $$2) {
      $$1.ec().b(cgy.o);
      $$1.ec().b(cgy.n);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aru $$0, crl $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dt(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            ebg $$3 = $$0.a_(this.e);
            dne $$4 = $$3.b();
            dne $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dpb && ((dpb)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dqd && $$1.gN()) {
               bva $$6 = $$1.n();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  daa $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axo.bO) && $$8.h() instanceof cyi $$10) {
                     ebg $$11 = $$10.c().m();
                     $$0.b(this.e, $$11);
                     $$0.a(egg.i, this.e, egg.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awr.gJ, aws.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, daa.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dpb && !((dpb)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ec().a(cgy.n, new chb(new bzq(this.e), 0.5F, 1));
                  $$1.ec().a(cgy.o, new bzq(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aru $$0, crl $$1, long $$2) {
      return this.g < 200;
   }
}
