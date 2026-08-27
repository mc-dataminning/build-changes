import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class eps extends gfx {
   private static final Logger a = LogUtils.getLogger();
   private static final ui b = ui.c("mco.terms.title");
   private static final ui c = ui.c("mco.terms.sentence.1");
   private static final ui y = uh.a().b(ui.c("mco.terms.sentence.2").c(vf.a.c(true)));
   private final ezd z;
   private final eno A;
   private boolean B;

   public eps(ezd $$0, eno $$1) {
      super(b);
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.g / 4 - 2;
      this.d(etj.a(ui.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.g / 4, h(12), $$0, 20).a());
      this.d(etj.a(ui.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.z)).a(this.g / 2 + 4, h(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.z);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      emx $$0 = emx.a();

      try {
         $$0.j();
         this.f.a(new epe(this.z, new eqn(this.z, this.A)));
      } catch (eok var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.B) {
         this.f.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.i().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public ui h() {
      return uh.a(super.h(), c).b(uh.u).b(y);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, c, this.g / 2 - 120, h(5), -1, false);
      int $$4 = this.i.a(c);
      int $$5 = this.g / 2 - 121 + $$4;
      int $$6 = h(5);
      int $$7 = $$5 + this.i.a(y) + 1;
      int $$8 = $$6 + 1 + 9;
      this.B = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.i, y, this.g / 2 - 120 + $$4, h(5), this.B ? 7107012 : 3368635, false);
   }
}
