import java.util.Objects;

public class fmg extends hol {
   private static final int a = 212;
   private static final ww b = ww.c("mco.configure.world.name");
   private static final ww c = ww.c("mco.configure.world.description");
   private final flq C;
   private final fkh D;
   private frz E;
   private frz F;

   public fmg(flq $$0, fkh $$1) {
      super(ww.c("mco.configure.world.settings.title"));
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aN_() {
      int $$0 = this.n / 2 - 106;
      String $$1 = this.D.e == fkh.c.b ? "mco.configure.world.buttons.close" : "mco.configure.world.buttons.open";
      frq $$2 = frq.a(ww.c($$1), $$0x -> {
         if (this.D.e == fkh.c.b) {
            this.m.a(fmc.a(this, ww.c("mco.configure.world.close.question.line1"), $$0xx -> this.C.b()));
         } else {
            this.C.b(false);
         }
      }).a(this.n / 2 - 53, g(0), 106, 20).a();
      this.c($$2);
      this.F = new frz(this.m.h, $$0, g(4), 212, 20, ww.c("mco.configure.world.name"));
      this.F.f(32);
      this.F.a(Objects.requireNonNullElse(this.D.b(), ""));
      this.c(this.F);
      this.E = new frz(this.m.h, $$0, g(8), 212, 20, ww.c("mco.configure.world.description"));
      this.E.f(32);
      this.E.a(this.D.a());
      this.c(this.E);
      frq $$3 = this.c(frq.a(ww.c("mco.configure.world.buttons.done"), $$0x -> this.g()).a($$0 - 2, g(12), 106, 20).a());
      this.F.b($$1x -> $$3.j = !baj.h($$1x));
      this.c(frq.a(wv.e, $$0x -> this.aK_()).a(this.n / 2 + 2, g(12), 106, 20).a());
   }

   @Override
   protected void aB_() {
      this.b(this.F);
   }

   @Override
   public void aK_() {
      this.m.a(this.C);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.b(this.p, b, this.n / 2 - 106, g(3), -1);
      $$0.b(this.p, c, this.n / 2 - 106, g(7), -1);
   }

   public void g() {
      this.C.a(this.F.a(), this.E.a());
   }
}
