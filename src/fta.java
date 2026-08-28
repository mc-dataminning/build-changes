import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fta extends fsw {
   private static final xd a = xd.c("options.videoTitle");
   private static final xd u = xd.c("options.graphics.fabulous").a(n.u);
   private static final xd v = xd.a("options.graphics.warning.message", u, u);
   private static final xd w = xd.c("options.graphics.warning.title").a(n.m);
   private static final xd x = xd.c("options.graphics.warning.accept");
   private static final xd y = xd.c("options.graphics.warning.cancel");
   private final ggm z;
   private final int A;

   private static fie<?>[] a(fif $$0) {
      return new fie[]{
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

   public fta(fpt $$0, fib $$1, fif $$2) {
      super($$0, $$2, a);
      this.z = $$1.ai();
      this.z.i();
      if ($$2.k().c() == fht.c) {
         this.z.e();
      }

      this.A = $$2.D().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      fbs $$1 = this.m.aO();
      fbn $$2 = $$1.u();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<fbr> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      fie<Integer> $$6 = new fie<>("options.fullscreen.resolution", fie.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return xd.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return fif.a($$1x, xd.c("options.fullscreen.current"));
         } else {
            fbr $$3x = $$2.a($$2x);
            return fif.a($$1x, xd.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new fie.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
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
      this.m.aO().g();
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
            List<xd> $$3 = Lists.newArrayList(new xd[]{v, xc.s});
            String $$4 = this.z.j();
            if ($$4 != null) {
               $$3.add(xc.s);
               $$3.add(xd.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.z.l();
            if ($$5 != null) {
               $$3.add(xc.s);
               $$3.add(xd.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.z.k();
            if ($$6 != null) {
               $$3.add(xc.s);
               $$3.add(xd.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.m.a(new fsz(w, $$3, ImmutableList.of(new fsz.a(x, $$0x -> {
               this.c.k().a(fht.c);
               fib.Q().f.f();
               this.z.e();
               this.m.a(this);
            }), new fsz.a(y, $$0x -> {
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
      if (fpt.s()) {
         fie<Integer> $$4 = this.c.as();
         if ($$4.e() instanceof fie.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fkh<Integer> $$9 = (fkh<Integer>)this.d.b($$4);
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
