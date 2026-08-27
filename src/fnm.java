import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fnm extends fnl<fvi.a> {
   private static final int v = 120;
   private static final wg w = wg.c("gui.chatReport.title");
   private static final wg x = wg.c("gui.chatReport.select_chat");
   private final fhg y = fhg.d().a(8);
   private feh z;
   private fdp A;
   private fdp B;
   private fdp C;

   private fnm(fjo $$0, fvp $$1, fvi.a $$2) {
      super(w, $$0, $$1, $$2);
   }

   public fnm(fjo $$0, fvp $$1, UUID $$2) {
      this($$0, $$1, new fvi.a($$2, $$1.a().b()));
   }

   public fnm(fjo $$0, fvp $$1, fvi $$2) {
      this($$0, $$1, new fvi.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.y.c().b();
      this.y.a(new few(this.i, this.m));
      this.B = this.y.a(fdp.a(x, $$0x -> this.j.a(new fno(this, this.s, this.u, $$0xx -> {
            this.u = $$0xx;
            this.C();
         }))).a(280).a());
      this.C = fdp.a(c, $$0x -> this.j.a(new fnr(this, this.u.h(), $$0xx -> {
            this.u.a($$0xx);
            this.C();
         }))).a(280).a();
      this.y.a(fgy.a(this.m, this.C, b));
      this.z = this.a(280, 9 * 8, $$0x -> {
         this.u.a($$0x);
         this.C();
      });
      this.y.a(fgy.a(this.m, this.z, d, $$0x -> $$0x.e(12)));
      fhg $$0 = this.y.a(fhg.e().a(8));
      $$0.a(fdp.a(wf.k, $$0x -> this.d()).a(120).a());
      this.A = $$0.a(fdp.a(a, $$0x -> this.m()).a(120).a());
      this.y.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.y.a();
      fha.a(this.y, this.G());
   }

   private void C() {
      IntSet $$0 = this.u.a();
      if ($$0.isEmpty()) {
         this.B.b(x);
      } else {
         this.B.b(wg.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fvn $$1 = this.u.h();
      if ($$1 != null) {
         this.C.b($$1.b());
      } else {
         this.C.b(c);
      }

      fvl.b $$2 = this.u.c();
      this.A.j = $$2 == null;
      this.A.a(x.a($$2, fvl.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.z.b($$0, $$1, $$2);
   }
}
