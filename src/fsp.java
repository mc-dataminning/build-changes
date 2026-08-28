import java.util.UUID;
import java.util.function.Supplier;

public class fsp extends fsi<gan.a> {
   private static final int z = 120;
   private static final int A = 85;
   private static final int B = 178;
   private static final wz C = wz.c("gui.abuseReport.skin.title");
   private final fmb D = fmb.d().a(8);
   private fjc E;
   private fik F;
   private fik G;

   private fsp(fob $$0, gam $$1, gan.a $$2) {
      super(C, $$0, $$1, $$2);
   }

   public fsp(fob $$0, gam $$1, UUID $$2, Supplier<grj> $$3) {
      this($$0, $$1, new gan.a($$2, $$3, $$1.a().b()));
   }

   public fsp(fob $$0, gam $$1, gan $$2) {
      this($$0, $$1, new gan.a($$2, $$1.a().b()));
   }

   @Override
   protected void aT_() {
      this.D.c().b();
      this.D.a(new fjr(this.k, this.o));
      fmb $$0 = this.D.a(fmb.e().a(8));
      $$0.c().e();
      $$0.a(new fjk(85, 120, this.l.aP(), this.y.e().a()));
      fmb $$1 = $$0.a(fmb.d().a(8));
      this.G = fik.a(c, $$0x -> this.l.a(new fso(this, this.y.h(), $$0xx -> {
            this.y.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(flt.a(this.o, this.G, b));
      this.E = this.a(178, 9 * 8, $$0x -> {
         this.y.a($$0x);
         this.C();
      });
      $$1.a(flt.a(this.o, this.E, r, $$0x -> $$0x.e(12)));
      fmb $$2 = this.D.a(fmb.e().a(8));
      $$2.a(fik.a(wy.k, $$0x -> this.d()).a(120).a());
      this.F = $$2.a(fik.a(a, $$0x -> this.m()).a(120).a());
      this.D.a($$1x -> {
         fii var10000 = this.c($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.D.a();
      flv.a(this.D, this.H());
   }

   private void C() {
      gak $$0 = this.y.h();
      if ($$0 != null) {
         this.G.b($$0.b());
      } else {
         this.G.b(c);
      }

      gai.b $$1 = this.y.c();
      this.F.j = $$1 == null;
      this.F.a(x.a($$1, gai.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.E.b($$0, $$1, $$2);
   }
}
