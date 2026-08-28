import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fqw extends fqv<fyr.a> {
   private static final int y = 120;
   private static final xl z = xl.c("gui.chatReport.title");
   private static final xl A = xl.c("gui.chatReport.select_chat");
   private final fkq B = fkq.d().a(8);
   private fhr C;
   private fgz D;
   private fgz E;
   private fgz F;

   private fqw(fmy $$0, fyy $$1, fyr.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fqw(fmy $$0, fyy $$1, UUID $$2) {
      this($$0, $$1, new fyr.a($$2, $$1.a().b()));
   }

   public fqw(fmy $$0, fyy $$1, fyr $$2) {
      this($$0, $$1, new fyr.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.B.c().b();
      this.B.a(new fig(this.l, this.p));
      this.E = this.B.a(fgz.a(A, $$0x -> this.m.a(new fqy(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.C();
         }))).a(280).a());
      this.F = fgz.a(c, $$0x -> this.m.a(new frb(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(280).a();
      this.B.a(fki.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.B.a(fki.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fkq $$0 = this.B.a(fkq.e().a(8));
      $$0.a(fgz.a(xk.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fgz.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fgx var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.B.a();
      fkk.a(this.B, this.G());
   }

   private void C() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(xl.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fyw $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fyu.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fyu.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
