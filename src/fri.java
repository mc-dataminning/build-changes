import java.util.UUID;
import java.util.function.Supplier;

public class fri extends frb<fzf.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final xp B = xp.c("gui.abuseReport.skin.title");
   private final fkw C = fkw.d().a(8);
   private fhx D;
   private fhf E;
   private fhf F;

   private fri(fne $$0, fze $$1, fzf.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public fri(fne $$0, fze $$1, UUID $$2, Supplier<gqa> $$3) {
      this($$0, $$1, new fzf.a($$2, $$3, $$1.a().b()));
   }

   public fri(fne $$0, fze $$1, fzf $$2) {
      this($$0, $$1, new fzf.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fim(this.l, this.p));
      fkw $$0 = this.C.a(fkw.e().a(8));
      $$0.c().e();
      $$0.a(new fif(85, 120, this.m.aR(), this.x.e().a()));
      fkw $$1 = $$0.a(fkw.d().a(8));
      this.F = fhf.a(c, $$0x -> this.m.a(new frh(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fko.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      $$1.a(fko.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fkw $$2 = this.C.a(fkw.e().a(8));
      $$2.a(fhf.a(xo.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhf.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fhd var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.C.a();
      fkq.a(this.C, this.G());
   }

   private void E() {
      fzc $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fza.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fza.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
