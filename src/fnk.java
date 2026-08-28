import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fnk extends fmv {
   private static final xp a = xp.c("options.videoTitle");
   private static final xp r = xp.c("options.graphics.fabulous").a(n.u);
   private static final xp s = xp.a("options.graphics.warning.message", r, r);
   private static final xp u = xp.c("options.graphics.warning.title").a(n.m);
   private static final xp v = xp.c("options.graphics.warning.accept");
   private static final xp w = xp.c("options.graphics.warning.cancel");
   private fib x;
   private final gdi y;
   private final int z;

   private static ffi<?>[] a(ffj $$0) {
      return new ffi[]{
         $$0.j(),
         $$0.e(),
         $$0.l(),
         $$0.f(),
         $$0.k(),
         $$0.h(),
         $$0.N(),
         $$0.ab(),
         $$0.aq(),
         $$0.D(),
         $$0.ap(),
         $$0.i(),
         $$0.aa(),
         $$0.ar(),
         $$0.C(),
         $$0.O(),
         $$0.aj(),
         $$0.g(),
         $$0.ak(),
         $$0.af(),
         $$0.am(),
         $$0.an(),
         $$0.p()
      };
   }

   public fnk(fnd $$0, ffj $$1) {
      super($$0, $$1, a);
      this.y = $$0.m.ai();
      this.y.i();
      if ($$1.j().c() == fey.c) {
         this.y.e();
      }

      this.z = $$1.C().c();
   }

   @Override
   protected void aM_() {
      this.x = this.c(new fib(this.m, this.n, this.o, this));
      int $$0 = -1;
      ezc $$1 = this.m.aO();
      eyx $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ezb> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      ffi<Integer> $$6 = new ffi<>("options.fullscreen.resolution", ffi.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xp.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return ffj.a($$1x, xp.c("options.fullscreen.current"));
         } else {
            ezb $$3x = $$2.a($$2x);
            return ffj.a($$1x, xp.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new ffi.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.x.a($$6);
      this.x.a(this.c.E());
      this.x.a(a(this.c));
      super.aM_();
   }

   @Override
   public void d() {
      this.m.aO().g();
      super.d();
   }

   @Override
   protected void c() {
      super.c();
      this.x.a(this.n, this.d);
   }

   @Override
   public void j() {
      if (this.c.C().c() != this.z) {
         this.m.b(this.c.C().c());
         this.m.R();
      }

      super.j();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.y.g()) {
            List<xp> $$3 = Lists.newArrayList(new xp[]{s, xo.s});
            String $$4 = this.y.j();
            if ($$4 != null) {
               $$3.add(xo.s);
               $$3.add(xp.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.y.l();
            if ($$5 != null) {
               $$3.add(xo.s);
               $$3.add(xp.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.y.k();
            if ($$6 != null) {
               $$3.add(xo.s);
               $$3.add(xp.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fnj(u, $$3, ImmutableList.of(new fnj.a(v, $$0x -> {
               this.c.j().a(fey.c);
               fff.Q().f.f();
               this.y.e();
               this.m.a(this);
            }), new fnj.a(w, $$0x -> {
               this.y.f();
               this.m.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (fnd.s()) {
         ffi<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof ffi.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fhl<Integer> $$9 = (fhl<Integer>)this.x.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.x.a(0.0);
                  return true;
               }
            }
         }

         return false;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }
}
