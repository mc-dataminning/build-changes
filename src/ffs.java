import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ffs extends ffd {
   private static final vq c = vq.c("options.graphics.fabulous").a(n.u);
   private static final vq k = vq.a("options.graphics.warning.message", c, c);
   private static final vq l = vq.c("options.graphics.warning.title").a(n.m);
   private static final vq m = vq.c("options.graphics.warning.accept");
   private static final vq n = vq.c("options.graphics.warning.cancel");
   private fal o;
   private final fvn p;
   private final int q;

   private static exr<?>[] a(exs $$0) {
      return new exr[]{
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

   public ffs(ffl $$0, exs $$1) {
      super($$0, $$1, vq.c("options.videoTitle"));
      this.p = $$0.f.ai();
      this.p.i();
      if ($$1.j().c() == exh.c) {
         this.p.e();
      }

      this.q = $$1.A().c();
   }

   @Override
   protected void aQ_() {
      this.o = this.c(new fal(this.f, this.g, this.h - 64, 32, 25));
      int $$0 = -1;
      erl $$1 = this.f.aN();
      erg $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<erk> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      exr<Integer> $$6 = new exr<>("options.fullscreen.resolution", exr.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return vq.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return exs.a($$1x, vq.c("options.fullscreen.current"));
         } else {
            erk $$3x = $$2.a($$2x);
            return exs.a($$1x, vq.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new exr.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.C());
      this.o.a(a(this.b));
      this.c(ezo.a(vp.d, $$1x -> {
         this.f.m.as();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void k() {
      if (this.b.A().c() != this.q) {
         this.f.b(this.b.A().c());
         this.f.Q();
      }

      super.k();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.b.an().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.b.an().c() != $$3) {
            this.f.a();
         }

         if (this.p.g()) {
            List<vq> $$4 = Lists.newArrayList(new vq[]{k, vp.s});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(vp.s);
               $$4.add(vq.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(vp.s);
               $$4.add(vq.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(vp.s);
               $$4.add(vq.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new ffr(l, $$4, ImmutableList.of(new ffr.a(m, $$0x -> {
               this.b.j().a(exh.c);
               exo.P().f.f();
               this.p.e();
               this.f.a(this);
            }), new ffr.a(n, $$0x -> {
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
      if (ffl.t()) {
         exr<Integer> $$4 = this.b.an();
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 20, 16777215);
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
