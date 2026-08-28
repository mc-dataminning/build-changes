import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fer extends gwq {
   private static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("mco.terms.title");
   private static final wz c = wz.c("mco.terms.sentence.1");
   private static final wz B = wy.a().b(wz.c("mco.terms.sentence.2").c(xw.a.c(true)));
   private final fod C;
   private final fcp D;
   private boolean E;

   public fer(fod $$0, fcp $$1) {
      super(b);
      this.C = $$0;
      this.D = $$1;
   }

   @Override
   public void aT_() {
      int $$0 = this.m / 4 - 2;
      this.c(fim.a(wz.c("mco.terms.buttons.agree"), $$0x -> this.C()).a(this.m / 4, g(12), $$0, 20).a());
      this.c(fim.a(wz.c("mco.terms.buttons.disagree"), $$0x -> this.l.a(this.C)).a(this.m / 2 + 4, g(12), $$0, 20).a());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.a(this.C);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private void C() {
      fby $$0 = fby.a();

      try {
         $$0.j();
         this.l.a(new fed(this.C, new ffm(this.C, this.D)));
      } catch (fdj var3) {
         a.error("Couldn't agree to TOS", var3);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.E) {
         this.l.o.a(axj.s.toString());
         ad.k().a(axj.s);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public wz i() {
      return wy.a(super.i(), c).b(wy.v).b(B);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, c, this.m / 2 - 120, g(5), -1, false);
      int $$4 = this.o.a(c);
      int $$5 = this.m / 2 - 121 + $$4;
      int $$6 = g(5);
      int $$7 = $$5 + this.o.a(B) + 1;
      int $$8 = $$6 + 1 + 9;
      this.E = $$5 <= $$1 && $$1 <= $$7 && $$6 <= $$2 && $$2 <= $$8;
      $$0.a(this.o, B, this.m / 2 - 120 + $$4, g(5), this.E ? 7107012 : 3368635, false);
   }
}
