import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class frc extends frb<fyx.a> {
   private static final int y = 120;
   private static final xp z = xp.c("gui.chatReport.title");
   private static final xp A = xp.c("gui.chatReport.select_chat");
   private final fkw B = fkw.d().a(8);
   private fhx C;
   private fhf D;
   private fhf E;
   private fhf F;

   private frc(fne $$0, fze $$1, fyx.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frc(fne $$0, fze $$1, UUID $$2) {
      this($$0, $$1, new fyx.a($$2, $$1.a().b()));
   }

   public frc(fne $$0, fze $$1, fyx $$2) {
      this($$0, $$1, new fyx.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.B.c().b();
      this.B.a(new fim(this.l, this.p));
      this.E = this.B.a(fhf.a(A, $$0x -> this.m.a(new fre(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.E();
         }))).a(280).a());
      this.F = fhf.a(c, $$0x -> this.m.a(new frh(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(280).a();
      this.B.a(fko.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.B.a(fko.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fkw $$0 = this.B.a(fkw.e().a(8));
      $$0.a(fhf.a(xo.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fhf.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fhd var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.B.a();
      fkq.a(this.B, this.G());
   }

   private void E() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(xp.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fzc $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fza.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fza.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
