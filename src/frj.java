import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class frj extends frf {
   private static final wz a = wz.c("options.videoTitle");
   private static final wz u = wz.c("options.graphics.fabulous").a(n.u);
   private static final wz v = wz.a("options.graphics.warning.message", u, u);
   private static final wz w = wz.c("options.graphics.warning.title").a(n.m);
   private static final wz x = wz.c("options.graphics.warning.accept");
   private static final wz y = wz.c("options.graphics.warning.cancel");
   private final ger z;
   private final int A;

   private static fgp<?>[] a(fgq $$0) {
      return new fgp[]{
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

   public frj(fob $$0, fgm $$1, fgq $$2) {
      super($$0, $$2, a);
      this.z = $$1.ai();
      this.z.i();
      if ($$2.j().c() == fgf.c) {
         this.z.e();
      }

      this.A = $$2.C().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fak $$1 = this.l.aM();
      faf $$2 = $$1.u();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<faj> $$4 = $$1.g();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fgp<Integer> $$6 = new fgp<>("options.fullscreen.resolution", fgp.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wz.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fgq.a($$1x, wz.c("options.fullscreen.current"));
         } else {
            faj $$3x = $$2.a($$2x);
            return fgq.a($$1x, wz.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fgp.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.r.a($$6);
      this.r.a(this.c.E());
      this.r.a(a(this.c));
   }

   @Override
   public void d() {
      this.l.aM().h();
      super.d();
   }

   @Override
   public void j() {
      if (this.c.C().c() != this.A) {
         this.l.b(this.c.C().c());
         this.l.R();
      }

      super.j();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (super.a($$0, $$1, $$2)) {
         if (this.z.g()) {
            List<wz> $$3 = Lists.newArrayList(new wz[]{v, wy.s});
            String $$4 = this.z.j();
            if ($$4 != null) {
               $$3.add(wy.s);
               $$3.add(wz.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.z.l();
            if ($$5 != null) {
               $$3.add(wy.s);
               $$3.add(wz.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.z.k();
            if ($$6 != null) {
               $$3.add(wy.s);
               $$3.add(wz.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.l.a(new fri(w, $$3, ImmutableList.of(new fri.a(x, $$0x -> {
               this.c.j().a(fgf.c);
               fgm.Q().f.f();
               this.z.e();
               this.l.a(this);
            }), new fri.a(y, $$0x -> {
               this.z.f();
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
      if (fob.r()) {
         fgp<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof fgp.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fir<Integer> $$9 = (fir<Integer>)this.r.b($$4);
               if ($$9 != null) {
                  $$4.a($$8);
                  $$9.a($$8);
                  this.r.b(0.0);
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
