import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class frd extends frc<fyy.a> {
   private static final int y = 120;
   private static final xp z = xp.c("gui.chatReport.title");
   private static final xp A = xp.c("gui.chatReport.select_chat");
   private final fkx B = fkx.d().a(8);
   private fhy C;
   private fhg D;
   private fhg E;
   private fhg F;

   private frd(fnf $$0, fzf $$1, fyy.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frd(fnf $$0, fzf $$1, UUID $$2) {
      this($$0, $$1, new fyy.a($$2, $$1.a().b()));
   }

   public frd(fnf $$0, fzf $$1, fyy $$2) {
      this($$0, $$1, new fyy.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.B.c().b();
      this.B.a(new fin(this.l, this.p));
      this.E = this.B.a(fhg.a(A, $$0x -> this.m.a(new frf(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.E();
         }))).a(280).a());
      this.F = fhg.a(c, $$0x -> this.m.a(new fri(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(280).a();
      this.B.a(fkp.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.B.a(fkp.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fkx $$0 = this.B.a(fkx.e().a(8));
      $$0.a(fhg.a(xo.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fhg.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fhe var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.B.a();
      fkr.a(this.B, this.G());
   }

   private void E() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(xp.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fzd $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fzb.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fzb.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
