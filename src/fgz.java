import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fgz extends fgy<fon.a> {
   private static final int r = 120;
   private static final vf t = vf.c("gui.chatReport.title");
   private static final vf u = vf.c("gui.chatReport.select_chat");
   private final fat v = fat.d().a(8);
   private exx w;
   private exf x;
   private exf y;
   private exf z;

   private fgz(fda $$0, fov $$1, fon.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fgz(fda $$0, fov $$1, UUID $$2) {
      this($$0, $$1, new fon.a($$2, $$1.a().b()));
   }

   public fgz(fda $$0, fov $$1, fon $$2) {
      this($$0, $$1, new fon.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.v.c().b();
      this.v.a(new eym(this.e, this.i));
      this.y = this.v.a(exf.a(u, $$0x -> this.f.a(new fhb(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.D();
         }))).a(280).a());
      this.z = exf.a(c, $$0x -> this.f.a(new fhe(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(280).a();
      this.v.a(fal.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.v.a(fal.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fat $$0 = this.v.a(fat.e().a(8));
      $$0.a(exf.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.x = $$0.a(exf.a(a, $$0x -> this.n()).a(120).a());
      this.v.a($$1 -> {
         exd var10000 = this.d($$1);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.v.a();
      fan.a(this.v, this.F());
   }

   private void D() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vf.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fot $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      foq.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, foq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
