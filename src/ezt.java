import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ezt extends grl {
   private static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("mco.terms.title");
   private static final wg c = wg.c("mco.terms.sentence.1");
   private static final wg y = wf.a().b(wg.c("mco.terms.sentence.2").c(xd.a.c(true)));
   private final fjo z;
   private final exp A;
   private boolean B;

   public ezt(fjo $$0, exp $$1) {
      super(b);
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aN_() {
      int $$0 = this.k / 4 - 2;
      this.c(fdp.a(wg.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.k / 4, g(12), $$0, 20).a());
      this.c(fdp.a(wg.c("mco.terms.buttons.disagree"), $$0x -> this.j.a(this.z)).a(this.k / 2 + 4, g(12), $$0, 20).a());
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
      ewy $$0 = ewy.a();

      try {
         $$0.j();
         this.j.a(new ezf(this.z, new fao(this.z, this.A)));
      } catch (eyl var3) {
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
   public wg i() {
      return wf.a(super.i(), c).b(wf.v).b(y);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
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
