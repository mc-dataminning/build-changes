import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bow extends bob<ceu> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hx e;
   private long f;
   private int g;
   private final List<hx> h = Lists.newArrayList();

   public bow() {
      super(ImmutableMap.of(bvm.n, bvn.b, bvm.m, bvn.b, bvm.f, bvn.a));
   }

   protected boolean a(and $$0, ceu $$1) {
      if (!$$0.Z().b(ctk.c)) {
         return false;
      } else if ($$1.gp().b() != cex.g) {
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
   private hx a(and $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hx $$0, and $$1) {
      djg $$2 = $$1.a_($$0);
      cwp $$3 = $$2.b();
      cwp $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cyk && ((cyk)$$3).h($$2) || $$2.i() && $$4 instanceof czm;
   }

   protected void a(and $$0, ceu $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dO().a(bvm.n, new boe(this.e));
         $$1.dO().a(bvm.m, new bvp(new boe(this.e), 0.5F, 1));
      }
   }

   protected void b(and $$0, ceu $$1, long $$2) {
      $$1.dO().b(bvm.n);
      $$1.dO().b(bvm.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(and $$0, ceu $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            djg $$3 = $$0.a_(this.e);
            cwp $$4 = $$3.b();
            cwp $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cyk && ((cyk)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof czm && $$1.gy()) {
               bki $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cmx $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(aso.aU) && $$8.d() instanceof ckq $$10) {
                     djg $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dnq.i, this.e, dnq.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), arr.fJ, ars.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cmx.f);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cyk && !((cyk)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dO().a(bvm.m, new bvp(new boe(this.e), 0.5F, 1));
                  $$1.dO().a(bvm.n, new boe(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(and $$0, ceu $$1, long $$2) {
      return this.g < 200;
   }
}
