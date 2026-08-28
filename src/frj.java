import java.util.UUID;
import java.util.function.Supplier;

public class frj extends frc<fzg.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final xp B = xp.c("gui.abuseReport.skin.title");
   private final fkx C = fkx.d().a(8);
   private fhy D;
   private fhg E;
   private fhg F;

   private frj(fnf $$0, fzf $$1, fzg.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frj(fnf $$0, fzf $$1, UUID $$2, Supplier<gqb> $$3) {
      this($$0, $$1, new fzg.a($$2, $$3, $$1.a().b()));
   }

   public frj(fnf $$0, fzf $$1, fzg $$2) {
      this($$0, $$1, new fzg.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fin(this.l, this.p));
      fkx $$0 = this.C.a(fkx.e().a(8));
      $$0.c().e();
      $$0.a(new fig(85, 120, this.m.aR(), this.x.e().a()));
      fkx $$1 = $$0.a(fkx.d().a(8));
      this.F = fhg.a(c, $$0x -> this.m.a(new fri(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fkp.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      $$1.a(fkp.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fkx $$2 = this.C.a(fkx.e().a(8));
      $$2.a(fhg.a(xo.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhg.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fhe var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.C.a();
      fkr.a(this.C, this.G());
   }

   private void E() {
      fzd $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fzb.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fzb.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
