import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwa extends bvf<cmi> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jd e;
   private long f;
   private int g;
   private final List<jd> h = Lists.newArrayList();

   public bwa() {
      super(ImmutableMap.of(ccq.n, ccr.b, ccq.m, ccr.b, ccq.f, ccr.a));
   }

   protected boolean a(aqt $$0, cmi $$1) {
      if (!$$0.ab().b(dcq.c)) {
         return false;
      } else if ($$1.gx().b() != cml.g) {
         return false;
      } else {
         jd.a $$2 = $$1.dq().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dv() + (double)$$3, $$1.dx() + (double)$$4, $$1.dB() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new jd($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private jd a(aqt $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(jd $$0, aqt $$1) {
      dta $$2 = $$1.a_($$0);
      dfw $$3 = $$2.b();
      dfw $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dhr && ((dhr)$$3).h($$2) || $$2.i() && $$4 instanceof dit;
   }

   protected void a(aqt $$0, cmi $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dU().a(ccq.n, new bvi(this.e));
         $$1.dU().a(ccq.m, new cct(new bvi(this.e), 0.5F, 1));
      }
   }

   protected void b(aqt $$0, cmi $$1, long $$2) {
      $$1.dU().b(ccq.n);
      $$1.dU().b(ccq.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqt $$0, cmi $$1, long $$2) {
      if (this.e == null || this.e.a($$1.do(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dta $$3 = $$0.a_(this.e);
            dfw $$4 = $$3.b();
            dfw $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dhr && ((dhr)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dit && $$1.gG()) {
               bqz $$6 = $$1.x();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cuo $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awm.bw) && $$8.g() instanceof csm $$10) {
                     dta $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dxw.i, this.e, dxw.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avo.gm, avp.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cuo.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dhr && !((dhr)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dU().a(ccq.m, new cct(new bvi(this.e), 0.5F, 1));
                  $$1.dU().a(ccq.n, new bvi(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqt $$0, cmi $$1, long $$2) {
      return this.g < 200;
   }
}
