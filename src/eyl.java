import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eyl extends exx {
   private static final ti c = ti.c("options.graphics.fabulous").a(n.u);
   private static final ti k = ti.a("options.graphics.warning.message", c, c);
   private static final ti l = ti.c("options.graphics.warning.title").a(n.m);
   private static final ti m = ti.c("options.graphics.warning.accept");
   private static final ti n = ti.c("options.graphics.warning.cancel");
   private eti o;
   private final fnt p;
   private final int q;

   private static eqt<?>[] a(equ $$0) {
      return new eqt[]{
         $$0.i(),
         $$0.d(),
         $$0.k(),
         $$0.e(),
         $$0.j(),
         $$0.g(),
         $$0.K(),
         $$0.X(),
         $$0.am(),
         $$0.A(),
         $$0.al(),
         $$0.h(),
         $$0.W(),
         $$0.an(),
         $$0.z(),
         $$0.L(),
         $$0.af(),
         $$0.f(),
         $$0.ag(),
         $$0.ab(),
         $$0.ai(),
         $$0.aj()
      };
   }

   public eyl(eyf $$0, equ $$1) {
      super($$0, $$1, ti.c("options.videoTitle"));
      this.p = $$0.f.ah();
      this.p.i();
      if ($$1.i().c() == eqj.c) {
         this.p.e();
      }

      this.q = $$1.z().c();
   }

   @Override
   protected void aD_() {
      this.o = new eti(this.f, this.g, this.h, 32, this.h - 32, 25);
      int $$0 = -1;
      eko $$1 = this.f.aM();
      ekj $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ekn> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      eqt<Integer> $$6 = new eqt<>("options.fullscreen.resolution", eqt.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return ti.c("options.fullscreen.unavailable");
         } else {
            return $$2x == -1 ? equ.a($$1x, ti.c("options.fullscreen.current")) : equ.a($$1x, ti.b($$2.a($$2x).toString()));
         }
      }, new eqt.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.B());
      this.o.a(a(this.b));
      this.e(this.o);
      this.d(esl.a(th.d, $$1x -> {
         this.f.m.ar();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void av_() {
      if (this.b.z().c() != this.q) {
         this.f.b(this.b.z().c());
         this.f.P();
      }

      super.av_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.b.am().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.b.am().c() != $$3) {
            this.f.a();
         }

         if (this.p.g()) {
            List<ti> $$4 = Lists.newArrayList(new ti[]{k, th.r});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(th.r);
               $$4.add(ti.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(th.r);
               $$4.add(ti.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(th.r);
               $$4.add(ti.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new eyb(l, $$4, ImmutableList.of(new eyb.a(m, $$0x -> {
               this.b.i().a(eqj.c);
               eqq.O().f.f();
               this.p.e();
               this.f.a(this);
            }), new eyb.a(n, $$0x -> {
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
      if (eyf.p()) {
         eqt<Integer> $$4 = this.b.am();
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
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.o, $$1, $$2, $$3);
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
