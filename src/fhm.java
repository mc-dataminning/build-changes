import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fhm extends fgx {
   private static final vu c = vu.c("options.graphics.fabulous").a(n.u);
   private static final vu k = vu.a("options.graphics.warning.message", c, c);
   private static final vu l = vu.c("options.graphics.warning.title").a(n.m);
   private static final vu m = vu.c("options.graphics.warning.accept");
   private static final vu n = vu.c("options.graphics.warning.cancel");
   private fcd o;
   private final fxk p;
   private final int q;

   private static ezj<?>[] a(ezk $$0) {
      return new ezj[]{
         $$0.j(),
         $$0.e(),
         $$0.l(),
         $$0.f(),
         $$0.k(),
         $$0.h(),
         $$0.L(),
         $$0.Z(),
         $$0.ao(),
         $$0.B(),
         $$0.an(),
         $$0.i(),
         $$0.Y(),
         $$0.ap(),
         $$0.A(),
         $$0.M(),
         $$0.ah(),
         $$0.g(),
         $$0.ai(),
         $$0.ad(),
         $$0.ak(),
         $$0.al()
      };
   }

   public fhm(fhf $$0, ezk $$1) {
      super($$0, $$1, vu.c("options.videoTitle"));
      this.p = $$0.f.aj();
      this.p.i();
      if ($$1.j().c() == eyz.c) {
         this.p.e();
      }

      this.q = $$1.A().c();
   }

   @Override
   protected void aO_() {
      this.o = this.c(new fcd(this.f, this.g, this.h - 64, 32, 25));
      int $$0 = -1;
      etd $$1 = this.f.aO();
      esy $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<etc> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      ezj<Integer> $$6 = new ezj<>("options.fullscreen.resolution", ezj.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return vu.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return ezk.a($$1x, vu.c("options.fullscreen.current"));
         } else {
            etc $$3x = $$2.a($$2x);
            return ezk.a($$1x, vu.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new ezj.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.C());
      this.o.a(a(this.b));
      this.c(fbg.a(vt.d, $$1x -> {
         this.f.m.at();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void k() {
      if (this.b.A().c() != this.q) {
         this.f.b(this.b.A().c());
         this.f.R();
      }

      super.k();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.b.ao().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.b.ao().c() != $$3) {
            this.f.a();
         }

         if (this.p.g()) {
            List<vu> $$4 = Lists.newArrayList(new vu[]{k, vt.s});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(vt.s);
               $$4.add(vu.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(vt.s);
               $$4.add(vu.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(vt.s);
               $$4.add(vu.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new fhl(l, $$4, ImmutableList.of(new fhl.a(m, $$0x -> {
               this.b.j().a(eyz.c);
               ezg.Q().f.f();
               this.p.e();
               this.f.a(this);
            }), new fhl.a(n, $$0x -> {
               this.p.f();
               this.f.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (fhf.t()) {
         ezj<Integer> $$4 = this.b.ao();
         int $$5 = $$4.c() + (int)Math.signum($$3);
         if ($$5 != 0) {
            $$4.a($$5);
            if ($$4.c() == $$5) {
               this.f.a();
               return true;
            }
         }

         return false;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
