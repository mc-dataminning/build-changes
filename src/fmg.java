import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fmg extends flr {
   private static final wx a = wx.c("options.videoTitle");
   private static final wx r = wx.c("options.graphics.fabulous").a(n.u);
   private static final wx s = wx.a("options.graphics.warning.message", r, r);
   private static final wx u = wx.c("options.graphics.warning.title").a(n.m);
   private static final wx v = wx.c("options.graphics.warning.accept");
   private static final wx w = wx.c("options.graphics.warning.cancel");
   private fgx x;
   private final gce y;
   private final int z;

   private static fee<?>[] a(fef $$0) {
      return new fee[]{
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

   public fmg(flz $$0, fef $$1) {
      super($$0, $$1, a);
      this.y = $$0.m.ai();
      this.y.i();
      if ($$1.j().c() == fdu.c) {
         this.y.e();
      }

      this.z = $$1.C().c();
   }

   @Override
   protected void aN_() {
      this.x = this.c(new fgx(this.m, this.n, this.o, this));
      int $$0 = -1;
      exy $$1 = this.m.aO();
      ext $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<exx> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fee<Integer> $$6 = new fee<>("options.fullscreen.resolution", fee.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wx.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fef.a($$1x, wx.c("options.fullscreen.current"));
         } else {
            exx $$3x = $$2.a($$2x);
            return fef.a($$1x, wx.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fee.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.x.a($$6);
      this.x.a(this.c.E());
      this.x.a(a(this.c));
      super.aN_();
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
            List<wx> $$3 = Lists.newArrayList(new wx[]{s, ww.s});
            String $$4 = this.y.j();
            if ($$4 != null) {
               $$3.add(ww.s);
               $$3.add(wx.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.y.l();
            if ($$5 != null) {
               $$3.add(ww.s);
               $$3.add(wx.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.y.k();
            if ($$6 != null) {
               $$3.add(ww.s);
               $$3.add(wx.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fmf(u, $$3, ImmutableList.of(new fmf.a(v, $$0x -> {
               this.c.j().a(fdu.c);
               feb.Q().f.f();
               this.y.e();
               this.m.a(this);
            }), new fmf.a(w, $$0x -> {
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
      if (flz.r()) {
         fee<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof fee.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fgh<Integer> $$9 = (fgh<Integer>)this.x.b($$4);
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
