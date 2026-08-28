import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fra extends fqz<fyv.a> {
   private static final int y = 120;
   private static final xo z = xo.c("gui.chatReport.title");
   private static final xo A = xo.c("gui.chatReport.select_chat");
   private final fku B = fku.d().a(8);
   private fhv C;
   private fhd D;
   private fhd E;
   private fhd F;

   private fra(fnc $$0, fzc $$1, fyv.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fra(fnc $$0, fzc $$1, UUID $$2) {
      this($$0, $$1, new fyv.a($$2, $$1.a().b()));
   }

   public fra(fnc $$0, fzc $$1, fyv $$2) {
      this($$0, $$1, new fyv.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.B.c().b();
      this.B.a(new fik(this.l, this.p));
      this.E = this.B.a(fhd.a(A, $$0x -> this.m.a(new frc(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.E();
         }))).a(280).a());
      this.F = fhd.a(c, $$0x -> this.m.a(new frf(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(280).a();
      this.B.a(fkm.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.B.a(fkm.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fku $$0 = this.B.a(fku.e().a(8));
      $$0.a(fhd.a(xn.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fhd.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fhb var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.B.a();
      fko.a(this.B, this.G());
   }

   private void E() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(xo.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fza $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fyy.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fyy.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
