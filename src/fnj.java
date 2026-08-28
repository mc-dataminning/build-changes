import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fnj extends fmu {
   private static final xo a = xo.c("options.videoTitle");
   private static final xo r = xo.c("options.graphics.fabulous").a(n.u);
   private static final xo s = xo.a("options.graphics.warning.message", r, r);
   private static final xo u = xo.c("options.graphics.warning.title").a(n.m);
   private static final xo v = xo.c("options.graphics.warning.accept");
   private static final xo w = xo.c("options.graphics.warning.cancel");
   private fia x;
   private final gdh y;
   private final int z;

   private static ffh<?>[] a(ffi $$0) {
      return new ffh[]{
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

   public fnj(fnc $$0, ffi $$1) {
      super($$0, $$1, a);
      this.y = $$0.m.ai();
      this.y.i();
      if ($$1.j().c() == fex.c) {
         this.y.e();
      }

      this.z = $$1.C().c();
   }

   @Override
   protected void aM_() {
      this.x = this.c(new fia(this.m, this.n, this.o, this));
      int $$0 = -1;
      ezb $$1 = this.m.aO();
      eyw $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<eza> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      ffh<Integer> $$6 = new ffh<>("options.fullscreen.resolution", ffh.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xo.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return ffi.a($$1x, xo.c("options.fullscreen.current"));
         } else {
            eza $$3x = $$2.a($$2x);
            return ffi.a($$1x, xo.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new ffh.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
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
            List<xo> $$3 = Lists.newArrayList(new xo[]{s, xn.s});
            String $$4 = this.y.j();
            if ($$4 != null) {
               $$3.add(xn.s);
               $$3.add(xo.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.y.l();
            if ($$5 != null) {
               $$3.add(xn.s);
               $$3.add(xo.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.y.k();
            if ($$6 != null) {
               $$3.add(xn.s);
               $$3.add(xo.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fni(u, $$3, ImmutableList.of(new fni.a(v, $$0x -> {
               this.c.j().a(fex.c);
               ffe.Q().f.f();
               this.y.e();
               this.m.a(this);
            }), new fni.a(w, $$0x -> {
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
      if (fnc.s()) {
         ffh<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof ffh.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fhk<Integer> $$9 = (fhk<Integer>)this.x.b($$4);
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
