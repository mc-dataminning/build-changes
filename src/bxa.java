import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxa extends bwf<cnk> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jf e;
   private long f;
   private int g;
   private final List<jf> h = Lists.newArrayList();

   public bxa() {
      super(ImmutableMap.of(cdq.n, cdr.b, cdq.m, cdr.b, cdq.f, cdr.a));
   }

   protected boolean a(arj $$0, cnk $$1) {
      if (!$$0.ac().b(def.c)) {
         return false;
      } else if ($$1.gy().b() != cnn.g) {
         return false;
      } else {
         jf.a $$2 = $$1.ds().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dx() + (double)$$3, $$1.dz() + (double)$$4, $$1.dD() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jf($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jf a(arj $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.D_().a(this.h.size()));
   }

   private boolean a(jf $$0, arj $$1) {
      dus $$2 = $$1.a_($$0);
      dhm $$3 = $$2.b();
      dhm $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof djh && ((djh)$$3).i($$2) || $$2.l() && $$4 instanceof dkj;
   }

   protected void a(arj $$0, cnk $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dY().a(cdq.n, new bwi(this.e));
         $$1.dY().a(cdq.m, new cdt(new bwi(this.e), 0.5F, 1));
      }
   }

   protected void b(arj $$0, cnk $$1, long $$2) {
      $$1.dY().b(cdq.n);
      $$1.dY().b(cdq.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arj $$0, cnk $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dq(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dus $$3 = $$0.a_(this.e);
            dhm $$4 = $$3.b();
            dhm $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof djh && ((djh)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dkj && $$1.gH()) {
               brz $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cvs $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axe.bB) && $$8.h() instanceof ctu $$10) {
                     dus $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dzp.i, this.e, dzp.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awg.gn, awh.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cvs.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof djh && !((djh)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dY().a(cdq.m, new cdt(new bwi(this.e), 0.5F, 1));
                  $$1.dY().a(cdq.n, new bwi(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arj $$0, cnk $$1, long $$2) {
      return this.g < 200;
   }
}
