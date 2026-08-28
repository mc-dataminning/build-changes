import java.util.UUID;
import java.util.function.Supplier;

public class fsr extends fsk<gap.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final wz E = wz.c("gui.abuseReport.skin.title");
   private fje F;
   private fim G;

   private fsr(fod $$0, gao $$1, gap.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fsr(fod $$0, gao $$1, UUID $$2, Supplier<grl> $$3) {
      this($$0, $$1, new gap.a($$2, $$3, $$1.a().b()));
   }

   public fsr(fod $$0, gao $$1, gap $$2) {
      this($$0, $$1, new gap.a($$2, $$1.a().b()));
   }

   @Override
   protected void C() {
      fmd $$0 = this.z.a(fmd.e().a(8));
      $$0.c().e();
      $$0.a(new fjm(85, 120, this.l.aP(), this.A.e().a()));
      fmd $$1 = $$0.a(fmd.d().a(8));
      this.G = fim.a(c, $$0x -> this.l.a(new fsq(this, this.A.i(), $$0xx -> {
            this.A.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(flv.a(this.o, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.E();
      });
      $$1.a(flv.a(this.o, this.F, r, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void E() {
      gam $$0 = this.A.i();
      if ($$0 != null) {
         this.G.b($$0.b());
      } else {
         this.G.b(c);
      }

      super.E();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.F.b($$0, $$1, $$2);
   }
}
