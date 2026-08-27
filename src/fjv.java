import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fjv extends fjg {
   private static final wg a = wg.c("options.videoTitle");
   private static final wg o = wg.c("options.graphics.fabulous").a(n.u);
   private static final wg p = wg.a("options.graphics.warning.message", o, o);
   private static final wg q = wg.c("options.graphics.warning.title").a(n.m);
   private static final wg r = wg.c("options.graphics.warning.accept");
   private static final wg s = wg.c("options.graphics.warning.cancel");
   private fem u;
   private final fzt v;
   private final int w;

   private static fbs<?>[] a(fbt $$0) {
      return new fbs[]{
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

   public fjv(fjo $$0, fbt $$1) {
      super($$0, $$1, a);
      this.v = $$0.j.aj();
      this.v.i();
      if ($$1.j().c() == fbi.c) {
         this.v.e();
      }

      this.w = $$1.C().c();
   }

   @Override
   protected void aN_() {
      this.u = this.c(new fem(this.j, this.k, this.l, this));
      int $$0 = -1;
      evm $$1 = this.j.aO();
      evh $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<evl> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fbs<Integer> $$6 = new fbs<>("options.fullscreen.resolution", fbs.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wg.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fbt.a($$1x, wg.c("options.fullscreen.current"));
         } else {
            evl $$3x = $$2.a($$2x);
            return fbt.a($$1x, wg.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fbs.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.u.a($$6);
      this.u.a(this.c.E());
      this.u.a(a(this.c));
      super.aN_();
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
            List<wg> $$4 = Lists.newArrayList(new wg[]{p, wf.s});
            String $$5 = this.v.j();
            if ($$5 != null) {
               $$4.add(wf.s);
               $$4.add(wg.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.v.l();
            if ($$6 != null) {
               $$4.add(wf.s);
               $$4.add(wg.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.v.k();
            if ($$7 != null) {
               $$4.add(wf.s);
               $$4.add(wg.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.j.a(new fju(q, $$4, ImmutableList.of(new fju.a(r, $$0x -> {
               this.c.j().a(fbi.c);
               fbp.Q().f.f();
               this.v.e();
               this.j.a(this);
            }), new fju.a(s, $$0x -> {
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
      if (fjo.r()) {
         fbs<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof fbs.c $$5) {
            int $$6 = $$4.c() + (int)Math.signum($$3);
            if ($$6 != 0 && $$6 <= $$5.b()) {
               fdw<Integer> $$7 = (fdw<Integer>)this.u.b($$4);
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
