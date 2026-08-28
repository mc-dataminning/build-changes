import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bvy extends bvd<cmf> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private iz e;
   private long f;
   private int g;
   private final List<iz> h = Lists.newArrayList();

   public bvy() {
      super(ImmutableMap.of(cco.n, ccp.b, cco.m, ccp.b, cco.f, ccp.a));
   }

   protected boolean a(arb $$0, cmf $$1) {
      if (!$$0.ab().b(dbp.c)) {
         return false;
      } else if ($$1.gB().b() != cmi.g) {
         return false;
      } else {
         iz.a $$2 = $$1.dp().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.du() + (double)$$3, $$1.dw() + (double)$$4, $$1.dA() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new iz($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private iz a(arb $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(iz $$0, arb $$1) {
      drx $$2 = $$1.a_($$0);
      deu $$3 = $$2.b();
      deu $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dgp && ((dgp)$$3).h($$2) || $$2.i() && $$4 instanceof dhr;
   }

   protected void a(arb $$0, cmf $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dS().a(cco.n, new bvg(this.e));
         $$1.dS().a(cco.m, new ccr(new bvg(this.e), 0.5F, 1));
      }
   }

   protected void b(arb $$0, cmf $$1, long $$2) {
      $$1.dS().b(cco.n);
      $$1.dS().b(cco.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(arb $$0, cmf $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dn(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            drx $$3 = $$0.a_(this.e);
            deu $$4 = $$3.b();
            deu $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dgp && ((dgp)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dhr && $$1.gK()) {
               bqy $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cuk $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.e() && $$8.a(awu.bx) && $$8.g() instanceof csi $$10) {
                     drx $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dwq.i, this.e, dwq.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avw.gm, avx.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.e()) {
                        $$6.a($$7, cuk.l);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dgp && !((dgp)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dS().a(cco.m, new ccr(new bvg(this.e), 0.5F, 1));
                  $$1.dS().a(cco.n, new bvg(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(arb $$0, cmf $$1, long $$2) {
      return this.g < 200;
   }
}
