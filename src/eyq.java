import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class eyq extends eyc {
   private static final tm c = tm.c("options.graphics.fabulous").a(n.u);
   private static final tm k = tm.a("options.graphics.warning.message", c, c);
   private static final tm l = tm.c("options.graphics.warning.title").a(n.m);
   private static final tm m = tm.c("options.graphics.warning.accept");
   private static final tm n = tm.c("options.graphics.warning.cancel");
   private etn o;
   private final fny p;
   private final int q;

   private static eqy<?>[] a(eqz $$0) {
      return new eqy[]{
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

   public eyq(eyk $$0, eqz $$1) {
      super($$0, $$1, tm.c("options.videoTitle"));
      this.p = $$0.f.ah();
      this.p.i();
      if ($$1.i().c() == eqo.c) {
         this.p.e();
      }

      this.q = $$1.z().c();
   }

   @Override
   protected void aI_() {
      this.o = new etn(this.f, this.g, this.h, 32, this.h - 32, 25);
      int $$0 = -1;
      ekt $$1 = this.f.aM();
      eko $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<eks> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      eqy<Integer> $$6 = new eqy<>("options.fullscreen.resolution", eqy.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return tm.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return eqz.a($$1x, tm.c("options.fullscreen.current"));
         } else {
            eks $$3x = $$2.a($$2x);
            return eqz.a($$1x, tm.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new eqy.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
         if ($$2 != null) {
            $$1.a($$2x == -1 ? Optional.empty() : Optional.of($$2.a($$2x)));
         }
      });
      this.o.a($$6);
      this.o.a(this.b.B());
      this.o.a(a(this.b));
      this.e(this.o);
      this.d(esq.a(tl.d, $$1x -> {
         this.f.m.ar();
         $$1.g();
         this.f.a(this.a);
      }).a(this.g / 2 - 100, this.h - 27, 200, 20).a());
   }

   @Override
   public void aA_() {
      if (this.b.z().c() != this.q) {
         this.f.b(this.b.z().c());
         this.f.P();
      }

      super.aA_();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      int $$3 = this.b.am().c();
      if (super.a($$0, $$1, $$2)) {
         if (this.b.am().c() != $$3) {
            this.f.a();
         }

         if (this.p.g()) {
            List<tm> $$4 = Lists.newArrayList(new tm[]{k, tl.r});
            String $$5 = this.p.j();
            if ($$5 != null) {
               $$4.add(tl.r);
               $$4.add(tm.a("options.graphics.warning.renderer", $$5).a(n.h));
            }

            String $$6 = this.p.l();
            if ($$6 != null) {
               $$4.add(tl.r);
               $$4.add(tm.a("options.graphics.warning.vendor", $$6).a(n.h));
            }

            String $$7 = this.p.k();
            if ($$7 != null) {
               $$4.add(tl.r);
               $$4.add(tm.a("options.graphics.warning.version", $$7).a(n.h));
            }

            this.f.a(new eyg(l, $$4, ImmutableList.of(new eyg.a(m, $$0x -> {
               this.b.i().a(eqo.c);
               eqv.O().f.f();
               this.p.e();
               this.f.a(this);
            }), new eyg.a(n, $$0x -> {
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
      if (eyk.p()) {
         eqy<Integer> $$4 = this.b.am();
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
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      this.a($$0, this.o, $$1, $$2, $$3);
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }
}
