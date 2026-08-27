import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bqr extends bpw<cgu> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hz e;
   private long f;
   private int g;
   private final List<hz> h = Lists.newArrayList();

   public bqr() {
      super(ImmutableMap.of(bxh.n, bxi.b, bxh.m, bxi.b, bxh.f, bxi.a));
   }

   protected boolean a(aov $$0, cgu $$1) {
      if (!$$0.Z().b(cvj.c)) {
         return false;
      } else if ($$1.gr().b() != cgx.g) {
         return false;
      } else {
         hz.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new hz($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private hz a(aov $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hz $$0, aov $$1) {
      dlf $$2 = $$1.a_($$0);
      cyo $$3 = $$2.b();
      cyo $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof daj && ((daj)$$3).h($$2) || $$2.i() && $$4 instanceof dbl;
   }

   protected void a(aov $$0, cgu $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dO().a(bxh.n, new bpz(this.e));
         $$1.dO().a(bxh.m, new bxk(new bpz(this.e), 0.5F, 1));
      }
   }

   protected void b(aov $$0, cgu $$1, long $$2) {
      $$1.dO().b(bxh.n);
      $$1.dO().b(bxh.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aov $$0, cgu $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dlf $$3 = $$0.a_(this.e);
            cyo $$4 = $$3.b();
            cyo $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof daj && ((daj)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dbl && $$1.gA()) {
               bmd $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  coz $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(auh.aZ) && $$8.d() instanceof cms $$10) {
                     dlf $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dpp.i, this.e, dpp.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), atk.fY, atl.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, coz.h);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof daj && !((daj)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dO().a(bxh.m, new bxk(new bpz(this.e), 0.5F, 1));
                  $$1.dO().a(bxh.n, new bpz(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aov $$0, cgu $$1, long $$2) {
      return this.g < 200;
   }
}
