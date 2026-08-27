import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fac extends gru {
   private static final Logger a = LogUtils.getLogger();
   private static final wi b = wi.c("mco.terms.title");
   private static final wi c = wi.c("mco.terms.sentence.1");
   private static final wi y = wh.a().b(wi.c("mco.terms.sentence.2").c(xf.a.c(true)));
   private final fjx z;
   private final exy A;
   private boolean B;

   public fac(fjx $$0, exy $$1) {
      super(b);
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aM_() {
      int $$0 = this.k / 4 - 2;
      this.c(fdy.a(wi.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.k / 4, g(12), $$0, 20).a());
      this.c(fdy.a(wi.c("mco.terms.buttons.disagree"), $$0x -> this.j.a(this.z)).a(this.k / 2 + 4, g(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.j.a(this.z);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      exh $$0 = exh.a();

      try {
         $$0.j();
         this.j.a(new ezo(this.z, new fax(this.z, this.A)));
      } catch (eyu var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.B) {
         this.j.o.a("https://aka.ms/MinecraftRealmsTerms");
         ac.j().a("https://aka.ms/MinecraftRealmsTerms");
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public wi i() {
      return wh.a(super.i(), c).b(wh.v).b(y);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 17, -1);
      $$0.a(this.m, c, this.k / 2 - 120, g(5), -1, false);
      int $$4 = this.m.a(c);
      int $$5 = this.k / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.m.a(y) + 1;
      int $$8 = $$6 + 1 + 9;
      this.B = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.m, y, this.k / 2 - 120 + $$4, g(5), this.B ? 7107012 : 3368635, false);
   }
}
