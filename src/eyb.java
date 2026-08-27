import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eyb extends exn {
   private static final te c = te.c("options.graphics.fabulous").a(n.u);
   private static final te k = te.a("options.graphics.warning.message", c, c);
   private static final te l = te.c("options.graphics.warning.title").a(n.m);
   private static final te m = te.c("options.graphics.warning.accept");
   private static final te n = te.c("options.graphics.warning.cancel");
   private etf o;
   private final fna p;
   private final int q;

   private static eqq<?>[] a(eqr $$0) {
      return new eqq[]{
         $$0.i(),
         $$0.d(),
         $$0.k(),
         $$0.e(),
         $$0.j(),
         $$0.g(),
         $$0.J(),
         $$0.W(),
         $$0.al(),
         $$0.z(),
         $$0.ak(),
         $$0.h(),
         $$0.V(),
         $$0.am(),
         $$0.y(),
         $$0.K(),
         $$0.ae(),
         $$0.f(),
         $$0.af(),
         $$0.aa(),
         $$0.ah(),
         $$0.ai()
      };
   }

   public eyb(exv $$0, eqr $$1) {
      super($$0, $$1, te.c("options.videoTitle"));
      this.p = $$0.f.ag();
      this.p.i();
      if ($$1.i().c() == eqg.c) {
         this.p.e();
      }

      this.q = $$1.y().c();
   }

   @Override
   protected void aE_() {
      this.o = new etf(this.f, this.g, this.h, 32, this.h - 32, 25);
      int $$0 = -1;
      ekl $$1 = this.f.aM();
      ekg $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ekk> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      eqq<Integer> $$6 = new eqq<>("options.fullscreen.resolution", eqq.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return te.c("options.fullscreen.unavailable");
         } else {
            return $$2x == -1 ? eqr.a($$1x, te.c("options.fullscreen.current")) : eqr.a($$1x, te.b($$2.a($$2x).toString()));
         }
      }, new eqq.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.A());
      this.o.a(a(this.b));
      this.e(this.o);
      this.d(esi.a(td.d, $$1x -> {
         this.f.m.aq();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void h() {
      if (this.b.y().c() != this.q) {
         this.f.b(this.b.y().c());
         this.f.O();
      }

      super.h();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.b.al().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.b.al().c() != $$3) {
            this.f.a();
         }

         if (this.p.g()) {
            List<te> $$4 = Lists.newArrayList(new te[]{k, td.r});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(td.r);
               $$4.add(te.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(td.r);
               $$4.add(te.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(td.r);
               $$4.add(te.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new exr(l, $$4, ImmutableList.of(new exr.a(m, $$0x -> {
               this.b.i().a(eqg.c);
               eqn.N().f.f();
               this.p.e();
               this.f.a(this);
            }), new exr.a(n, $$0x -> {
               this.p.f();
               this.f.a(this);
            }))));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      if (exv.p()) {
         eqq<Integer> $$4 = this.b.al();
         int $$5 = $$4.c() + (int)Math.signum($$3);
         if ($$5 != 0) {
            $$4.a($$5);
            if ($$4.c() == $$5) {
               this.f.a();
               return true;
            }
         }

         return false;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.o, $$1, $$2, $$3);
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
