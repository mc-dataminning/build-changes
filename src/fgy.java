import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fgy extends fgx<fom.a> {
   private static final int r = 120;
   private static final vf t = vf.c("gui.chatReport.title");
   private static final vf u = vf.c("gui.chatReport.select_chat");
   private final fas v = fas.d().a(8);
   private exw w;
   private exe x;
   private exe y;
   private exe z;

   private fgy(fcz $$0, fou $$1, fom.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fgy(fcz $$0, fou $$1, UUID $$2) {
      this($$0, $$1, new fom.a($$2, $$1.a().b()));
   }

   public fgy(fcz $$0, fou $$1, fom $$2) {
      this($$0, $$1, new fom.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.v.c().b();
      this.v.a(new eyl(this.e, this.i));
      this.y = this.v.a(exe.a(u, $$0x -> this.f.a(new fha(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = exe.a(c, $$0x -> this.f.a(new fhd(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(fak.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(fak.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fas $$0 = this.v.a(fas.e().a(8));
      $$0.a(exe.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.x = $$0.a(exe.a(a, $$0x -> this.n()).a(120).a());
      this.v.a($$1 -> {
         exc var10000 = this.d($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.v.a();
      fam.a(this.v, this.F());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vf.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fos $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fop.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, fop.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
