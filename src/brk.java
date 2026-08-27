import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class brk extends bqp<chn> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private ib e;
   private long f;
   private int g;
   private final List<ib> h = Lists.newArrayList();

   public brk() {
      super(ImmutableMap.of(bya.n, byb.b, bya.m, byb.b, bya.f, byb.a));
   }

   protected boolean a(apa $$0, chn $$1) {
      if (!$$0.Z().b(cwa.c)) {
         return false;
      } else if ($$1.gw().b() != chq.g) {
         return false;
      } else {
         ib.a $$2 = $$1.dj().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.do() + (double)$$3, $$1.dq() + (double)$$4, $$1.du() + (double)$$5);
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
   private ib a(apa $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.F_().a(this.h.size()));
   }

   private boolean a(ib $$0, apa $$1) {
      dme $$2 = $$1.a_($$0);
      czf $$3 = $$2.b();
      czf $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dba && ((dba)$$3).h($$2) || $$2.i() && $$4 instanceof dcc;
   }

   protected void a(apa $$0, chn $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dM().a(bya.n, new bqs(this.e));
         $$1.dM().a(bya.m, new byd(new bqs(this.e), 0.5F, 1));
      }
   }

   protected void b(apa $$0, chn $$1, long $$2) {
      $$1.dM().b(bya.n);
      $$1.dM().b(bya.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(apa $$0, chn $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dh(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dme $$3 = $$0.a_(this.e);
            czf $$4 = $$3.b();
            czf $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dba && ((dba)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dcc && $$1.gF()) {
               bmu $$6 = $$1.A();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  cpq $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.b() && $$8.a(aum.aZ) && $$8.d() instanceof cnl $$10) {
                     dme $$11 = $$10.d().o();
                     $$0.b(this.e, $$11);
                     $$0.a(dqr.i, this.e, dqr.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), atp.fZ, atq.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.b()) {
                        $$6.a($$7, cpq.h);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dba && !((dba)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dM().a(bya.m, new byd(new bqs(this.e), 0.5F, 1));
                  $$1.dM().a(bya.n, new bqs(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(apa $$0, chn $$1, long $$2) {
      return this.g < 200;
   }
}
