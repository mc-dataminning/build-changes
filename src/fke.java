import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fke extends hhs {
   private static final Logger a = LogUtils.getLogger();
   private static final xk b = xk.c("mco.terms.title");
   private static final xk c = xk.c("mco.terms.sentence.1");
   private static final xk C = xj.a().b(xk.c("mco.terms.sentence.2").c(yh.a.c(true)));
   private final ftr D;
   private final fic E;
   private boolean F;

   public fke(ftr $$0, fic $$1) {
      super(b);
      this.D = $$0;
      this.E = $$1;
   }

   @Override
   public void aT_() {
      int $$0 = this.n / 4 - 2;
      this.c(fny.a(xk.c("mco.terms.buttons.agree"), $$0x -> this.E()).a(this.n / 4, g(12), $$0, 20).a());
      this.c(fny.a(xk.c("mco.terms.buttons.disagree"), $$0x -> this.m.a(this.D)).a(this.n / 2 + 4, g(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.D);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void E() {
      fhb $$0 = fhb.a();

      try {
         $$0.j();
         this.m.a(new fjr(this.D, new fkx(this.D, this.E)));
      } catch (fix var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.F) {
         this.m.p.a(ayq.s.toString());
         ae.m().a(ayq.s);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public xk i() {
      return xj.a(super.i(), c).b(xj.v).b(C);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.b(this.p, c, this.n / 2 - 120, g(5), -1);
      int $$4 = this.p.a(c);
      int $$5 = this.n / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.p.a(C) + 1;
      int $$8 = $$6 + 1 + 9;
      this.F = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.b(this.p, C, this.n / 2 - 120 + $$4, g(5), this.F ? 7107012 : 3368635);
   }
}
