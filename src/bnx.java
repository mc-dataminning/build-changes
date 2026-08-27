import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bnx extends bnc<cdm> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private hx e;
   private long f;
   private int g;
   private final List<hx> h = Lists.newArrayList();

   public bnx() {
      super(ImmutableMap.of(bum.n, bun.b, bum.m, bun.b, bum.f, bun.a));
   }

   protected boolean a(ami $$0, cdm $$1) {
      if (!$$0.Y().b(csb.c)) {
         return false;
      } else if ($$1.gq().b() != cdp.g) {
         return false;
      } else {
         hx.a $$2 = $$1.dn().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.ds() + (double)$$3, $$1.du() + (double)$$4, $$1.dy() + (double)$$5);
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
   private hx a(ami $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(hx $$0, ami $$1) {
      dhn $$2 = $$1.a_($$0);
      cvf $$3 = $$2.b();
      cvf $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof cxa && ((cxa)$$3).h($$2) || $$2.i() && $$4 instanceof cyc;
   }

   protected void a(ami $$0, cdm $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dP().a(bum.n, new bnf(this.e));
         $$1.dP().a(bum.m, new bup(new bnf(this.e), 0.5F, 1));
      }
   }

   protected void b(ami $$0, cdm $$1, long $$2) {
      $$1.dP().b(bum.n);
      $$1.dP().b(bum.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(ami $$0, cdm $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dl(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dhn $$3 = $$0.a_(this.e);
            cvf $$4 = $$3.b();
            cvf $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof cxa && ((cxa)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof cyc && $$1.gz()) {
               bjj $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  clo $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(ars.aU) && $$8.d() instanceof cjh $$10) {
                     dhn $$11 = $$10.e().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dlx.i, this.e, dlx.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), aqv.fA, aqw.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, clo.b);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof cxa && !((cxa)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dP().a(bum.m, new bup(new bnf(this.e), 0.5F, 1));
                  $$1.dP().a(bum.n, new bnf(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(ami $$0, cdm $$1, long $$2) {
      return this.g < 200;
   }
}
