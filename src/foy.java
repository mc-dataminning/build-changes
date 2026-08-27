import java.util.UUID;
import java.util.function.Supplier;

public class foy extends foq<fwv.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final ws B = ws.c("gui.abuseReport.skin.title");
   private final fil C = fil.d().a(8);
   private ffm D;
   private feu E;
   private feu F;

   private foy(fkt $$0, fwu $$1, fwv.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public foy(fkt $$0, fwu $$1, UUID $$2, Supplier<gnn> $$3) {
      this($$0, $$1, new fwv.a($$2, $$3, $$1.a().b()));
   }

   public foy(fkt $$0, fwu $$1, fwv $$2) {
      this($$0, $$1, new fwv.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.C.c().b();
      this.C.a(new fgb(this.l, this.p));
      fil $$0 = this.C.a(fil.e().a(8));
      $$0.c().e();
      $$0.a(new ffu(85, 120, this.m.aR(), this.x.e().a()));
      fil $$1 = $$0.a(fil.d().a(8));
      this.F = feu.a(c, $$0x -> this.m.a(new fox(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fid.a(this.p, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      $$1.a(fid.a(this.p, this.D, d, $$0x -> $$0x.e(12)));
      fil $$2 = this.C.a(fil.e().a(8));
      $$2.a(feu.a(wr.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(feu.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.C.a();
      fif.a(this.C, this.G());
   }

   private void C() {
      fws $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fwq.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fwq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
