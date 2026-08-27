import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bun extends bts<cku> {
   private static final int d = 200;
   public static final float c = 0.5F;
   @Nullable
   private in e;
   private long f;
   private int g;
   private final List<in> h = Lists.newArrayList();

   public bun() {
      super(ImmutableMap.of(cbd.n, cbe.b, cbd.m, cbe.b, cbd.f, cbe.a));
   }

   protected boolean a(aqh $$0, cku $$1) {
      if (!$$0.aa().b(czz.c)) {
         return false;
      } else if ($$1.gA().b() != ckx.g) {
         return false;
      } else {
         in.a $$2 = $$1.dn().j();
         this.h.clear();

         for (int $$3 = -1; $$3 <= 1; $$3++) {
            for (int $$4 = -1; $$4 <= 1; $$4++) {
               for (int $$5 = -1; $$5 <= 1; $$5++) {
                  $$2.b($$1.ds() + (double)$$3, $$1.du() + (double)$$4, $$1.dy() + (double)$$5);
                  if (this.a($$2, $$0)) {
                     this.h.add(new in($$2));
                  }
               }
            }
         }

         this.e = this.a($$0);
         return this.e != null;
      }
   }

   @Nullable
   private in a(aqh $$0) {
      return this.h.isEmpty() ? null : this.h.get($$0.E_().a(this.h.size()));
   }

   private boolean a(in $$0, aqh $$1) {
      dqh $$2 = $$1.a_($$0);
      dde $$3 = $$2.b();
      dde $$4 = $$1.a_($$0.d()).b();
      return $$3 instanceof dez && ((dez)$$3).h($$2) || $$2.i() && $$4 instanceof dgb;
   }

   protected void a(aqh $$0, cku $$1, long $$2) {
      if ($$2 > this.f && this.e != null) {
         $$1.dQ().a(cbd.n, new btv(this.e));
         $$1.dQ().a(cbd.m, new cbg(new btv(this.e), 0.5F, 1));
      }
   }

   protected void b(aqh $$0, cku $$1, long $$2) {
      $$1.dQ().b(cbd.n);
      $$1.dQ().b(cbd.m);
      this.g = 0;
      this.f = $$2 + 40L;
   }

   protected void c(aqh $$0, cku $$1, long $$2) {
      if (this.e == null || this.e.a($$1.dl(), 1.0)) {
         if (this.e != null && $$2 > this.f) {
            dqh $$3 = $$0.a_(this.e);
            dde $$4 = $$3.b();
            dde $$5 = $$0.a_(this.e.d()).b();
            if ($$4 instanceof dez && ((dez)$$4).h($$3)) {
               $$0.a(this.e, true, $$1);
            }

            if ($$3.i() && $$5 instanceof dgb && $$1.gJ()) {
               bpv $$6 = $$1.y();

               for (int $$7 = 0; $$7 < $$6.b(); $$7++) {
                  csz $$8 = $$6.a($$7);
                  boolean $$9 = false;
                  if (!$$8.d() && $$8.a(avz.by) && $$8.f() instanceof cqx $$10) {
                     dqh $$11 = $$10.d().n();
                     $$0.b(this.e, $$11);
                     $$0.a(dva.i, this.e, dva.a.a($$1, $$11));
                     $$9 = true;
                  }

                  if ($$9) {
                     $$0.a(null, (double)this.e.u(), (double)this.e.v(), (double)this.e.w(), avc.gh, avd.e, 1.0F, 1.0F);
                     $$8.h(1);
                     if ($$8.d()) {
                        $$6.a($$7, csz.i);
                     }
                     break;
                  }
               }
            }

            if ($$4 instanceof dez && !((dez)$$4).h($$3)) {
               this.h.remove(this.e);
               this.e = this.a($$0);
               if (this.e != null) {
                  this.f = $$2 + 20L;
                  $$1.dQ().a(cbd.m, new cbg(new btv(this.e), 0.5F, 1));
                  $$1.dQ().a(cbd.n, new btv(this.e));
               }
            }
         }

         this.g++;
      }
   }

   protected boolean d(aqh $$0, cku $$1, long $$2) {
      return this.g < 200;
   }
}
