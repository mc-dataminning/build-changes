import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fgr extends hdp {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.terms.title");
   private static final xe c = xe.c("mco.terms.sentence.1");
   private static final xe B = xd.a().b(xe.c("mco.terms.sentence.2").c(yb.a.c(true)));
   private final fqh C;
   private final fep D;
   private boolean E;

   public fgr(fqh $$0, fep $$1) {
      super(b);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aS_() {
      int $$0 = this.n / 4 - 2;
      this.c(fko.a(xe.c("mco.terms.buttons.agree"), $$0x -> this.D()).a(this.n / 4, g(12), $$0, 20).a());
      this.c(fko.a(xe.c("mco.terms.buttons.disagree"), $$0x -> this.m.a(this.C)).a(this.n / 2 + 4, g(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.C);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void D() {
      fdy $$0 = fdy.a();

      try {
         $$0.j();
         this.m.a(new fgd(this.C, new fhm(this.C, this.D)));
      } catch (ffj var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.E) {
         this.m.p.a(ayb.s.toString());
         ad.m().a(ayb.s);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public xe i() {
      return xd.a(super.i(), c).b(xd.v).b(B);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, c, this.n / 2 - 120, g(5), -1, false);
      int $$4 = this.p.a(c);
      int $$5 = this.n / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.p.a(B) + 1;
      int $$8 = $$6 + 1 + 9;
      this.E = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.p, B, this.n / 2 - 120 + $$4, g(5), this.E ? 7107012 : 3368635, false);
   }
}
