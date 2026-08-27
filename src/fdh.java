import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fdh extends fcs {
   private static final vf c = vf.c("options.graphics.fabulous").a(n.u);
   private static final vf k = vf.a("options.graphics.warning.message", c, c);
   private static final vf l = vf.c("options.graphics.warning.title").a(n.m);
   private static final vf m = vf.c("options.graphics.warning.accept");
   private static final vf n = vf.c("options.graphics.warning.cancel");
   private eyc o;
   private final fta p;
   private final int q;

   private static evk<?>[] a(evl $$0) {
      return new evk[]{
         $$0.j(),
         $$0.e(),
         $$0.l(),
         $$0.f(),
         $$0.k(),
         $$0.h(),
         $$0.L(),
         $$0.Y(),
         $$0.an(),
         $$0.B(),
         $$0.am(),
         $$0.i(),
         $$0.X(),
         $$0.ao(),
         $$0.A(),
         $$0.M(),
         $$0.ag(),
         $$0.g(),
         $$0.ah(),
         $$0.ac(),
         $$0.aj(),
         $$0.ak()
      };
   }

   public fdh(fda $$0, evl $$1) {
      super($$0, $$1, vf.c("options.videoTitle"));
      this.p = $$0.f.ah();
      this.p.i();
      if ($$1.j().c() == eva.c) {
         this.p.e();
      }

      this.q = $$1.A().c();
   }

   @Override
   protected void aN_() {
      this.o = this.d(new eyc(this.f, this.g, this.h - 64, 32, 25));
      int $$0 = -1;
      epe $$1 = this.f.aM();
      eoz $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<epd> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      evk<Integer> $$6 = new evk<>("options.fullscreen.resolution", evk.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return vf.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return evl.a($$1x, vf.c("options.fullscreen.current"));
         } else {
            epd $$3x = $$2.a($$2x);
            return evl.a($$1x, vf.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new evk.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.C());
      this.o.a(a(this.b));
      this.d(exf.a(ve.d, $$1x -> {
         this.f.m.as();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void j() {
      if (this.b.A().c() != this.q) {
         this.f.b(this.b.A().c());
         this.f.P();
      }

      super.j();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.b.an().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.b.an().c() != $$3) {
            this.f.a();
         }

         if (this.p.g()) {
            List<vf> $$4 = Lists.newArrayList(new vf[]{k, ve.r});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(ve.r);
               $$4.add(vf.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(ve.r);
               $$4.add(vf.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(ve.r);
               $$4.add(vf.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new fdg(l, $$4, ImmutableList.of(new fdg.a(m, $$0x -> {
               this.b.j().a(eva.c);
               evh.O().f.f();
               this.p.e();
               this.f.a(this);
            }), new fdg.a(n, $$0x -> {
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
      if (fda.s()) {
         evk<Integer> $$4 = this.b.an();
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
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
