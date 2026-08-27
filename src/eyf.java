import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eyf extends exr {
   private static final tf c = tf.c("options.graphics.fabulous").a(n.u);
   private static final tf k = tf.a("options.graphics.warning.message", c, c);
   private static final tf l = tf.c("options.graphics.warning.title").a(n.m);
   private static final tf m = tf.c("options.graphics.warning.accept");
   private static final tf n = tf.c("options.graphics.warning.cancel");
   private ete o;
   private final fnf p;
   private final int q;

   private static eqp<?>[] a(eqq $$0) {
      return new eqp[]{
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

   public eyf(exz $$0, eqq $$1) {
      super($$0, $$1, tf.c("options.videoTitle"));
      this.p = $$0.f.ah();
      this.p.i();
      if ($$1.i().c() == eqf.c) {
         this.p.e();
      }

      this.q = $$1.y().c();
   }

   @Override
   protected void aE_() {
      this.o = new ete(this.f, this.g, this.h, 32, this.h - 32, 25);
      int $$0 = -1;
      ekk $$1 = this.f.aN();
      ekf $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ekj> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      eqp<Integer> $$6 = new eqp<>("options.fullscreen.resolution", eqp.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return tf.c("options.fullscreen.unavailable");
         } else {
            return $$2x == -1 ? eqq.a($$1x, tf.c("options.fullscreen.current")) : eqq.a($$1x, tf.b($$2.a($$2x).toString()));
         }
      }, new eqp.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.A());
      this.o.a(a(this.b));
      this.e(this.o);
      this.d(esh.a(te.d, $$1x -> {
         this.f.m.aq();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void h() {
      if (this.b.y().c() != this.q) {
         this.f.b(this.b.y().c());
         this.f.P();
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
            List<tf> $$4 = Lists.newArrayList(new tf[]{k, te.r});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(te.r);
               $$4.add(tf.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(te.r);
               $$4.add(tf.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(te.r);
               $$4.add(tf.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new exv(l, $$4, ImmutableList.of(new exv.a(m, $$0x -> {
               this.b.i().a(eqf.c);
               eqm.O().f.f();
               this.p.e();
               this.f.a(this);
            }), new exv.a(n, $$0x -> {
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
      if (exz.p()) {
         eqp<Integer> $$4 = this.b.al();
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
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.o, $$1, $$2, $$3);
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
