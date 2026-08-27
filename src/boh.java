import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class boh extends bnm<cee> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hv e;
   private long f;
   private int g;
   private final List<hv> h = Lists.newArrayList();

   public boh() {
      super(ImmutableMap.of(bux.n, buy.b, bux.m, buy.b, bux.f, buy.a));
   }

   protected boolean a(amp $$0, cee $$1) {
      if (!$$0.Y().b(csu.c)) {
         return false;
      } else if ($$1.gp().b() != ceh.g) {
         return false;
      } else {
         hv.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new hv($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private hv a(amp $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hv $$0, amp $$1) {
      dip $$2 = $$1.a_($$0);
      cvz $$3 = $$2.b();
      cvz $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cxu && ((cxu)$$3).h($$2) || $$2.i() && $$4 instanceof cyw;
   }

   protected void a(amp $$0, cee $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dO().a(bux.n, new bnp(this.e));
         $$1.dO().a(bux.m, new bva(new bnp(this.e), 0.5F, 1));
      }
   }

   protected void b(amp $$0, cee $$1, long $$2) {
      $$1.dO().b(bux.n);
      $$1.dO().b(bux.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(amp $$0, cee $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dip $$3 = $$0.a_(this.e);
            cvz $$4 = $$3.b();
            cvz $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cxu && ((cxu)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cyw && $$1.gy()) {
               bjt $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cmh $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(arz.aU) && $$8.d() instanceof cka $$10) {
                     dip $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dmz.i, this.e, dmz.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), arc.fJ, ard.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cmh.f);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cxu && !((cxu)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dO().a(bux.m, new bva(new bnp(this.e), 0.5F, 1));
                  $$1.dO().a(bux.n, new bnp(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(amp $$0, cee $$1, long $$2) {
      return this.g < 200;
   }
}
