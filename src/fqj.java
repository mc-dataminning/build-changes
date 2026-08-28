import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class fqj extends fqf {
   private static final wu a = wu.c("options.videoTitle");
   private static final wu s = wu.c("options.graphics.fabulous").a(n.u);
   private static final wu u = wu.a("options.graphics.warning.message", s, s);
   private static final wu v = wu.c("options.graphics.warning.title").a(n.m);
   private static final wu w = wu.c("options.graphics.warning.accept");
   private static final wu x = wu.c("options.graphics.warning.cancel");
   private final gdr y;
   private final int z;

   private static ffq<?>[] a(ffr $$0) {
      return new ffq[]{
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

   public fqj(fnd $$0, ffn $$1, ffr $$2) {
      super($$0, $$2, a);
      this.y = $$1.ai();
      this.y.i();
      if ($$2.j().c() == ffg.c) {
         this.y.e();
      }

      this.z = $$2.C().c();
   }

   @Override
   protected void m() {
      int $$0 = -1;
      ezk $$1 = this.l.aO();
      ezf $$2 = $$1.t();
      int $$3;
      if ($$2 == null) {
         $$3 = -1;
      } else {
         Optional<ezj> $$4 = $$1.f();
         $$3 = $$4.<Integer>map($$2::a).orElse(-1);
      }

      ffq<Integer> $$6 = new ffq<>("options.fullscreen.resolution", ffq.a(), ($$1x, $$2x) -> {
         if ($$2 == null) {
            return wu.c("options.fullscreen.unavailable");
         } else if ($$2x == -1) {
            return ffr.a($$1x, wu.c("options.fullscreen.current"));
         } else {
            ezj $$3x = $$2.a($$2x);
            return ffr.a($$1x, wu.a("options.fullscreen.entry", $$3x.a(), $$3x.b(), $$3x.f(), $$3x.c() + $$3x.d() + $$3x.e()));
         }
      }, new ffq.f(-1, $$2 != null ? $$2.e() - 1 : -1), $$3, $$2x -> {
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
      this.l.aO().g();
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
            List<wu> $$3 = Lists.newArrayList(new wu[]{u, wt.s});
            String $$4 = this.y.j();
            if ($$4 != null) {
               $$3.add(wt.s);
               $$3.add(wu.a("options.graphics.warning.renderer", $$4).a(n.h));
            }

            String $$5 = this.y.l();
            if ($$5 != null) {
               $$3.add(wt.s);
               $$3.add(wu.a("options.graphics.warning.vendor", $$5).a(n.h));
            }

            String $$6 = this.y.k();
            if ($$6 != null) {
               $$3.add(wt.s);
               $$3.add(wu.a("options.graphics.warning.version", $$6).a(n.h));
            }

            this.l.a(new fqi(v, $$3, ImmutableList.of(new fqi.a(w, $$0x -> {
               this.c.j().a(ffg.c);
               ffn.Q().f.f();
               this.y.e();
               this.l.a(this);
            }), new fqi.a(x, $$0x -> {
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
      if (fnd.s()) {
         ffq<Integer> $$4 = this.c.aq();
         if ($$4.e() instanceof ffq.c $$5) {
            int $$6 = $$4.c();
            int $$7 = $$6 == 0 ? $$5.b() + 1 : $$6;
            int $$8 = $$7 + (int)Math.signum($$3);
            if ($$8 != 0 && $$8 <= $$5.b() && $$8 >= $$5.d()) {
               fht<Integer> $$9 = (fht<Integer>)this.q.b($$4);
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
