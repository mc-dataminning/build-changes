import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class frf extends frb {
   private static final wy a = wy.c("options.videoTitle");
   private static final wy s = wy.c("options.graphics.fabulous").a(n.u);
   private static final wy u = wy.a("options.graphics.warning.message", s, s);
   private static final wy v = wy.c("options.graphics.warning.title").a(n.m);
   private static final wy w = wy.c("options.graphics.warning.accept");
   private static final wy x = wy.c("options.graphics.warning.cancel");
   private final gen y;
   private final int z;

   private static fgl<?>[] a(fgm $$0) {
      return new fgl[]{
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

   public frf(fnx $$0, fgi $$1, fgm $$2) {
      super($$0, $$2, a);
      this.y = $$1.ai();
      this.y.i();
      if ($$2.j().c() == fgb.c) {
         this.y.e();
      }

      this.z = $$2.C().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fag $$1 = this.l.aM();
      fab $$2 = $$1.u();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<faf> $$4 = $$1.g();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fgl<Integer> $$6 = new fgl<>("options.fullscreen.resolution", fgl.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wy.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fgm.a($$1x, wy.c("options.fullscreen.current"));
         } else {
            faf $$3x = $$2.a($$2x);
            return fgm.a($$1x, wy.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fgl.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.q.a($$6);
      this.q.a(this.c.E());
      this.q.a(a(this.c));
   }

   @Override
   public void d() {
      this.l.aM().h();
      super.d();
   }

   @Override
   public void j() {
      if (this.c.C().c() != this.z) {
         this.l.b(this.c.C().c());
         this.l.R();
      }

      super.j();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.y.g()) {
            List<wy> $$3 = Lists.newArrayList(new wy[]{u, wx.s});
            String $$4 = this.y.j();
            if ($$4 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.y.l();
            if ($$5 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.y.k();
            if ($$6 != null) {
               $$3.add(wx.s);
               $$3.add(wy.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.l.a(new fre(v, $$3, ImmutableList.of(new fre.a(w, $$0x -> {
               this.c.j().a(fgb.c);
               fgi.Q().f.f();
               this.y.e();
               this.l.a(this);
            }), new fre.a(x, $$0x -> {
               this.y.f();
               this.l.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (fnx.r()) {
         fgl<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof fgl.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fin<Integer> $$9 = (fin<Integer>)this.q.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.q.b(0.0);
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
