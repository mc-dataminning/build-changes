import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fuh extends fud {
   private static final xi a = xi.c("options.videoTitle");
   private static final xi u = xi.c("options.graphics.fabulous").a(n.u);
   private static final xi v = xi.a("options.graphics.warning.message", u, u);
   private static final xi w = xi.c("options.graphics.warning.title").a(n.m);
   private static final xi x = xi.c("options.graphics.warning.accept");
   private static final xi y = xi.c("options.graphics.warning.cancel");
   private final ghy z;
   private final int A;

   private static fjl<?>[] a(fjm $$0) {
      return new fjl[]{
         $$0.k(),
         $$0.e(),
         $$0.m(),
         $$0.f(),
         $$0.l(),
         $$0.h(),
         $$0.P(),
         $$0.i(),
         $$0.as(),
         $$0.E(),
         $$0.ar(),
         $$0.j(),
         $$0.ac(),
         $$0.at(),
         $$0.D(),
         $$0.Q(),
         $$0.al(),
         $$0.g(),
         $$0.am(),
         $$0.ah(),
         $$0.ao(),
         $$0.ap(),
         $$0.q(),
         $$0.ad()
      };
   }

   public fuh(fra $$0, fji $$1, fjm $$2) {
      super($$0, $$2, a);
      this.z = $$1.aj();
      this.z.i();
      if ($$2.k().c() == fja.c) {
         this.z.e();
      }

      this.A = $$2.D().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fde $$1 = this.m.aO();
      fcz $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fdd> $$4 = $$1.e();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fjl<Integer> $$6 = new fjl<>("options.fullscreen.resolution", fjl.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xi.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fjm.a($$1x, xi.c("options.fullscreen.current"));
         } else {
            fdd $$3x = $$2.a($$2x);
            return fjm.a($$1x, xi.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fjl.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.d.a($$6);
      this.d.a(this.c.F());
      this.d.a(a(this.c));
   }

   @Override
   public void d() {
      this.m.aO().f();
      super.d();
   }

   @Override
   public void j() {
      if (this.c.D().c() != this.A) {
         this.m.a(this.c.D().c());
         this.m.R();
      }

      super.j();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.g()) {
            List<xi> $$3 = Lists.newArrayList(new xi[]{v, xh.s});
            String $$4 = this.z.j();
            if ($$4 != null) {
               $$3.add(xh.s);
               $$3.add(xi.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.z.l();
            if ($$5 != null) {
               $$3.add(xh.s);
               $$3.add(xi.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.z.k();
            if ($$6 != null) {
               $$3.add(xh.s);
               $$3.add(xi.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fug(w, $$3, ImmutableList.of(new fug.a(x, $$0x -> {
               this.c.k().a(fja.c);
               fji.Q().f.e();
               this.z.e();
               this.m.a(this);
            }), new fug.a(y, $$0x -> {
               this.z.f();
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
      if (fra.s()) {
         fjl<Integer> $$4 = this.c.as();
         if ($$4.e() instanceof fjl.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               flo<Integer> $$9 = (flo<Integer>)this.d.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.d.b(0.0);
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
