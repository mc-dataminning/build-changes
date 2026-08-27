import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fla extends fkl {
   private static final ws a = ws.c("options.videoTitle");
   private static final ws r = ws.c("options.graphics.fabulous").a(n.u);
   private static final ws s = ws.a("options.graphics.warning.message", r, r);
   private static final ws u = ws.c("options.graphics.warning.title").a(n.m);
   private static final ws v = ws.c("options.graphics.warning.accept");
   private static final ws w = ws.c("options.graphics.warning.cancel");
   private ffr x;
   private final gay y;
   private final int z;

   private static fcx<?>[] a(fcy $$0) {
      return new fcx[]{
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

   public fla(fkt $$0, fcy $$1) {
      super($$0, $$1, a);
      this.y = $$0.m.aj();
      this.y.i();
      if ($$1.j().c() == fcn.c) {
         this.y.e();
      }

      this.z = $$1.C().c();
   }

   @Override
   protected void aM_() {
      this.x = this.c(new ffr(this.m, this.n, this.o, this));
      int $$0 = -1;
      ewr $$1 = this.m.aO();
      ewm $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ewq> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fcx<Integer> $$6 = new fcx<>("options.fullscreen.resolution", fcx.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return ws.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fcy.a($$1x, ws.c("options.fullscreen.current"));
         } else {
            ewq $$3x = $$2.a($$2x);
            return fcy.a($$1x, ws.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fcx.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
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
      int $$3 = this.c.aq().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.c.aq().c() != $$3) {
            this.m.a();
         }

         if (this.y.g()) {
            List<ws> $$4 = Lists.newArrayList(new ws[]{s, wr.s});
            String $$5 = this.y.j();
            if ($$5 != null) {
               $$4.add(wr.s);
               $$4.add(ws.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.y.l();
            if ($$6 != null) {
               $$4.add(wr.s);
               $$4.add(ws.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.y.k();
            if ($$7 != null) {
               $$4.add(wr.s);
               $$4.add(ws.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.m.a(new fkz(u, $$4, ImmutableList.of(new fkz.a(v, $$0x -> {
               this.c.j().a(fcn.c);
               fcu.Q().f.f();
               this.y.e();
               this.m.a(this);
            }), new fkz.a(w, $$0x -> {
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
      if (fkt.r()) {
         fcx<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof fcx.c $$5) {
            int $$6 = $$4.c() + (int)Math.signum($$3);
            if ($$6 != 0 && $$6 <= $$5.b()) {
               ffb<Integer> $$7 = (ffb<Integer>)this.x.b($$4);
               if ($$7 != null) {
                  $$4.a($$6);
                  $$7.a($$6);
               }

               if ($$4.c() == $$6) {
                  this.m.a();
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
