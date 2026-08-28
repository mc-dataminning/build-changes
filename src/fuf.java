import java.util.UUID;
import java.util.function.Supplier;

public class fuf extends fty<gcg.a> {
   private static final int C = 85;
   private static final int D = 178;
   private static final xd E = xd.c("gui.abuseReport.skin.title");
   private fks F;
   private fka G;

   private fuf(fpt $$0, gcf $$1, gcg.a $$2) {
      super(E, $$0, $$1, $$2);
   }

   public fuf(fpt $$0, gcf $$1, UUID $$2, Supplier<gxl> $$3) {
      this($$0, $$1, new gcg.a($$2, $$3, $$1.a().b()));
   }

   public fuf(fpt $$0, gcf $$1, gcg $$2) {
      this($$0, $$1, new gcg.a($$2, $$1.a().b()));
   }

   @Override
   protected void D() {
      fns $$0 = this.z.a(fns.e().a(8));
      $$0.c().e();
      $$0.a(new fla(85, 120, this.m.aS(), this.A.e().a()));
      fns $$1 = $$0.a(fns.d().a(8));
      this.G = fka.a(c, $$0x -> this.m.a(new fue(this, this.A.i(), gce.b, $$0xx -> {
            this.A.a($$0xx);
            this.F();
         }))).a(178).a();
      $$1.a(fnk.a(this.p, this.G, b));
      this.F = this.a(178, 9 * 8, $$0x -> {
         this.A.a($$0x);
         this.F();
      });
      $$1.a(fnk.a(this.p, this.F, d, $$0x -> $$0x.e(12)));
   }

   @Override
   protected void F() {
      gcd $$0 = this.A.i();
      if ($$0 != null) {
         this.G.b($$0.b());
      } else {
         this.G.b(c);
      }

      super.F();
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.F.b($$0, $$1, $$2);
   }
}
