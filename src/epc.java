import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class epc extends gfd {
   private static final Logger a = LogUtils.getLogger();
   private static final tn b = tn.c("mco.terms.title");
   private static final tn c = tn.c("mco.terms.sentence.1");
   private static final tn y = tm.a().b(tn.c("mco.terms.sentence.2").c(uj.a.c(true)));
   private final eym z;
   private final emy A;
   private boolean B;

   public epc(eym $$0, emy $$1) {
      super(b);
      this.z = $$0;
      this.A = $$1;
   }

   @Override
   public void aH_() {
      int $$0 = this.g / 4 - 2;
      this.d(ess.a(tn.c("mco.terms.buttons.agree"), $$0x -> this.D()).a(this.g / 4, h(12), $$0, 20).a());
      this.d(ess.a(tn.c("mco.terms.buttons.disagree"), $$0x -> this.f.a(this.z)).a(this.g / 2 + 4, h(12), $$0, 20).a());
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

   private void D() {
      emh $$0 = emh.a();

      try {
         $$0.i();
         this.f.a(new eoo(this.z, new epw(this.z, this.A)));
      } catch (enu var3) {
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
   public tn g() {
      return tm.a(super.g(), c).b(tm.u).b(y);
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
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
