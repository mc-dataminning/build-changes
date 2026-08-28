import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxo extends bwt<cny> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jh e;
   private long f;
   private int g;
   private final List<jh> h = Lists.newArrayList();

   public bxo() {
      super(ImmutableMap.of(cee.n, cef.b, cee.m, cef.b, cee.f, cef.a));
   }

   protected boolean a(arn $$0, cny $$1) {
      if (!$$0.ac().b(dex.c)) {
         return false;
      } else if ($$1.gE().b() != cob.g) {
         return false;
      } else {
         jh.a $$2 = $$1.dx().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dC() + (double)$$3, $$1.dE() + (double)$$4, $$1.dI() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jh($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jh a(arn $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(jh $$0, arn $$1) {
      dvj $$2 = $$1.a_($$0);
      die $$3 = $$2.b();
      die $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof djz && ((djz)$$3).i($$2) || $$2.l() && $$4 instanceof dla;
   }

   protected void a(arn $$0, cny $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.ed().a(cee.n, new bww(this.e));
         $$1.ed().a(cee.m, new ceh(new bww(this.e), 0.5F, 1));
      }
   }

   protected void b(arn $$0, cny $$1, long $$2) {
      $$1.ed().b(cee.n);
      $$1.ed().b(cee.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arn $$0, cny $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dv(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dvj $$3 = $$0.a_(this.e);
            die $$4 = $$3.b();
            die $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof djz && ((djz)$$4).i($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.l() && $$5 instanceof dla && $$1.gN()) {
               bsk $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cwb $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.f() && $$8.a(axj.bN) && $$8.h() instanceof cuh $$10) {
                     dvj $$11 = $$10.d().m();
                     $$0.b(this.e, $$11);
                     $$0.a(eag.i, this.e, eag.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), awl.gn, awm.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.f()) {
                        $$6.a($$7, cwb.k);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof djz && !((djz)$$4).i($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.ed().a(cee.m, new ceh(new bww(this.e), 0.5F, 1));
                  $$1.ed().a(cee.n, new bww(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arn $$0, cny $$1, long $$2) {
      return this.g < 200;
   }
}
