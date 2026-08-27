import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fpx extends fpw<fxs.a> {
   private static final int y = 120;
   private static final wx z = wx.c("gui.chatReport.title");
   private static final wx A = wx.c("gui.chatReport.select_chat");
   private final fjr B = fjr.d().a(8);
   private fgs C;
   private fga D;
   private fga E;
   private fga F;

   private fpx(flz $$0, fxz $$1, fxs.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fpx(flz $$0, fxz $$1, UUID $$2) {
      this($$0, $$1, new fxs.a($$2, $$1.a().b()));
   }

   public fpx(flz $$0, fxz $$1, fxs $$2) {
      this($$0, $$1, new fxs.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.B.c().b();
      this.B.a(new fhh(this.l, this.p));
      this.E = this.B.a(fga.a(A, $$0x -> this.m.a(new fpz(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.C();
         }))).a(280).a());
      this.F = fga.a(c, $$0x -> this.m.a(new fqc(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(280).a();
      this.B.a(fjj.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.B.a(fjj.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fjr $$0 = this.B.a(fjr.e().a(8));
      $$0.a(fga.a(ww.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fga.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         ffy var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.B.a();
      fjl.a(this.B, this.G());
   }

   private void C() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(wx.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fxx $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fxv.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fxv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
