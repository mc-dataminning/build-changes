import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bor extends bnw<ceo> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hx e;
   private long f;
   private int g;
   private final List<hx> h = Lists.newArrayList();

   public bor() {
      super(ImmutableMap.of(bvh.n, bvi.b, bvh.m, bvi.b, bvh.f, bvi.a));
   }

   protected boolean a(amz $$0, ceo $$1) {
      if (!$$0.Z().b(cte.c)) {
         return false;
      } else if ($$1.gp().b() != cer.g) {
         return false;
      } else {
         hx.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new hx($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private hx a(amz $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hx $$0, amz $$1) {
      dja $$2 = $$1.a_($$0);
      cwj $$3 = $$2.b();
      cwj $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cye && ((cye)$$3).h($$2) || $$2.i() && $$4 instanceof czg;
   }

   protected void a(amz $$0, ceo $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dO().a(bvh.n, new bnz(this.e));
         $$1.dO().a(bvh.m, new bvk(new bnz(this.e), 0.5F, 1));
      }
   }

   protected void b(amz $$0, ceo $$1, long $$2) {
      $$1.dO().b(bvh.n);
      $$1.dO().b(bvh.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(amz $$0, ceo $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dja $$3 = $$0.a_(this.e);
            cwj $$4 = $$3.b();
            cwj $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cye && ((cye)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof czg && $$1.gy()) {
               bkd $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cmr $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(asj.aU) && $$8.d() instanceof ckk $$10) {
                     dja $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dnk.i, this.e, dnk.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), arm.fJ, arn.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cmr.f);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cye && !((cye)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dO().a(bvh.m, new bvk(new bnz(this.e), 0.5F, 1));
                  $$1.dO().a(bvh.n, new bnz(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(amz $$0, ceo $$1, long $$2) {
      return this.g < 200;
   }
}
