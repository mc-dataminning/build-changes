import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwc extends bvh<cmk> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private jd e;
   private long f;
   private int g;
   private final List<jd> h = Lists.newArrayList();

   public bwc() {
      super(ImmutableMap.of(ccs.n, cct.b, ccs.m, cct.b, ccs.f, cct.a));
   }

   protected boolean a(aqu $$0, cmk $$1) {
      if (!$$0.ab().b(dcs.c)) {
         return false;
      } else if ($$1.gw().b() != cmn.g) {
         return false;
      } else {
         jd.a $$2 = $$1.dp().k();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
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
   private jd a(aqu $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(jd $$0, aqu $$1) {
      dtc $$2 = $$1.a_($$0);
      dfy $$3 = $$2.b();
      dfy $$4 = $$1.a_($$0.e()).b();
      return $$3 instanceof dht && ((dht)$$3).h($$2) || $$2.i() && $$4 instanceof div;
   }

   protected void a(aqu $$0, cmk $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dU().a(ccs.n, new bvk(this.e));
         $$1.dU().a(ccs.m, new ccv(new bvk(this.e), 0.5F, 1));
      }
   }

   protected void b(aqu $$0, cmk $$1, long $$2) {
      $$1.dU().b(ccs.n);
      $$1.dU().b(ccs.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqu $$0, cmk $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dtc $$3 = $$0.a_(this.e);
            dfy $$4 = $$3.b();
            dfy $$5 = $$0.a_(this.e.e()).b();
            if ($$4 instanceof dht && ((dht)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof div && $$1.gF()) {
               bra $$6 = $$1.x();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cuq $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awn.bw) && $$8.g() instanceof cso $$10) {
                     dtc $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dxz.i, this.e, dxz.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avp.gm, avq.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cuq.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dht && !((dht)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dU().a(ccs.m, new ccv(new bvk(this.e), 0.5F, 1));
                  $$1.dU().a(ccs.n, new bvk(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqu $$0, cmk $$1, long $$2) {
      return this.g < 200;
   }
}
