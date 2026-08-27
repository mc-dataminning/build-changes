import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fke extends fjp {
   private static final wi a = wi.c("options.videoTitle");
   private static final wi o = wi.c("options.graphics.fabulous").a(n.u);
   private static final wi p = wi.a("options.graphics.warning.message", o, o);
   private static final wi q = wi.c("options.graphics.warning.title").a(n.m);
   private static final wi r = wi.c("options.graphics.warning.accept");
   private static final wi s = wi.c("options.graphics.warning.cancel");
   private fev u;
   private final gac v;
   private final int w;

   private static fcb<?>[] a(fcc $$0) {
      return new fcb[]{
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
         $$0.an()
      };
   }

   public fke(fjx $$0, fcc $$1) {
      super($$0, $$1, a);
      this.v = $$0.j.aj();
      this.v.i();
      if ($$1.j().c() == fbr.c) {
         this.v.e();
      }

      this.w = $$1.C().c();
   }

   @Override
   protected void aM_() {
      this.u = this.c(new fev(this.j, this.k, this.l, this));
      int $$0 = -1;
      evv $$1 = this.j.aO();
      evq $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<evu> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fcb<Integer> $$6 = new fcb<>("options.fullscreen.resolution", fcb.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wi.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fcc.a($$1x, wi.c("options.fullscreen.current"));
         } else {
            evu $$3x = $$2.a($$2x);
            return fcc.a($$1x, wi.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fcb.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.u.a($$6);
      this.u.a(this.c.E());
      this.u.a(a(this.c));
      super.aM_();
   }

   @Override
   public void d() {
      this.j.m.av();
      this.j.aO().g();
      super.d();
   }

   @Override
   protected void c() {
      super.c();
      this.u.a(this.k, this.d);
   }

   @Override
   public void j() {
      if (this.c.C().c() != this.w) {
         this.j.b(this.c.C().c());
         this.j.R();
      }

      super.j();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.c.aq().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.c.aq().c() != $$3) {
            this.j.a();
         }

         if (this.v.g()) {
            List<wi> $$4 = Lists.newArrayList(new wi[]{p, wh.s});
            String $$5 = this.v.j();
            if ($$5 != null) {
               $$4.add(wh.s);
               $$4.add(wi.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.v.l();
            if ($$6 != null) {
               $$4.add(wh.s);
               $$4.add(wi.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.v.k();
            if ($$7 != null) {
               $$4.add(wh.s);
               $$4.add(wi.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.j.a(new fkd(q, $$4, ImmutableList.of(new fkd.a(r, $$0x -> {
               this.c.j().a(fbr.c);
               fby.Q().f.f();
               this.v.e();
               this.j.a(this);
            }), new fkd.a(s, $$0x -> {
               this.v.f();
               this.j.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (fjx.r()) {
         fcb<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof fcb.c $$5) {
            int $$6 = $$4.c() + (int)Math.signum($$3);
            if ($$6 != 0 && $$6 <= $$5.b()) {
               fef<Integer> $$7 = (fef<Integer>)this.u.b($$4);
               if ($$7 != null) {
                  $$4.a($$6);
                  $$7.a($$6);
               }

               if ($$4.c() == $$6) {
                  this.j.a();
                  this.u.a(0.0);
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
