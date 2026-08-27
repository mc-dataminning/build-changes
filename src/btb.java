import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class btb extends bsg<cjg> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ib e;
   private long f;
   private int g;
   private final List<ib> h = Lists.newArrayList();

   public btb() {
      super(ImmutableMap.of(bzr.n, bzs.b, bzr.m, bzs.b, bzr.f, bzs.a));
   }

   protected boolean a(aps $$0, cjg $$1) {
      if (!$$0.aa().b(cyt.c)) {
         return false;
      } else if ($$1.gy().b() != cjj.g) {
         return false;
      } else {
         ib.a $$2 = $$1.dm().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.dr() + (double)$$3, $$1.dt() + (double)$$4, $$1.dx() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new ib($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private ib a(aps $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(ib $$0, aps $$1) {
      doz $$2 = $$1.a_($$0);
      dby $$3 = $$2.b();
      dby $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof ddt && ((ddt)$$3).h($$2) || $$2.i() && $$4 instanceof dev;
   }

   protected void a(aps $$0, cjg $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dP().a(bzr.n, new bsj(this.e));
         $$1.dP().a(bzr.m, new bzu(new bsj(this.e), 0.5F, 1));
      }
   }

   protected void b(aps $$0, cjg $$1, long $$2) {
      $$1.dP().b(bzr.n);
      $$1.dP().b(bzr.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aps $$0, cjg $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dk(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            doz $$3 = $$0.a_(this.e);
            dby $$4 = $$3.b();
            dby $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof ddt && ((ddt)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dev && $$1.gH()) {
               boj $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  crj $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.d() && $$8.a(avk.aZ) && $$8.f() instanceof cph $$10) {
                     doz $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dts.i, this.e, dts.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aum.gh, aun.e, 1.0F, 1.0F);
                     $$8.g(1);
                     if ($$8.d()) {
                        $$6.a($$7, crj.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof ddt && !((ddt)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dP().a(bzr.m, new bzu(new bsj(this.e), 0.5F, 1));
                  $$1.dP().a(bzr.n, new bsj(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aps $$0, cjg $$1, long $$2) {
      return this.g < 200;
   }
}
