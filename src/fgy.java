import java.util.UUID;
import java.util.function.Supplier;

public class fgy extends fgr<foo.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vd v = vd.c("gui.abuseReport.skin.title");
   private final fam w = fam.d().a(8);
   private exq x;
   private ewy y;
   private ewy z;

   private fgy(fct $$0, fon $$1, foo.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fgy(fct $$0, fon $$1, UUID $$2, Supplier<gff> $$3) {
      this($$0, $$1, new foo.a($$2, $$3, $$1.a().b()));
   }

   public fgy(fct $$0, fon $$1, foo $$2) {
      this($$0, $$1, new foo.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.w.c().b();
      this.w.a(new eyf(this.e, this.i));
      fam $$0 = this.w.a(fam.e().a(8));
      $$0.c().e();
      $$0.a(new exy(85, 120, this.f.aO(), this.q.e().a()));
      fam $$1 = $$0.a(fam.d().a(8));
      this.z = ewy.a(c, $$0x -> this.f.a(new fgx(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(fae.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(fae.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fam $$2 = this.w.a(fam.e().a(8));
      $$2.a(ewy.a(vc.k, $$0x -> this.aE_()).a(120).a());
      this.y = $$2.a(ewy.a(a, $$0x -> this.n()).a(120).a());
      this.w.a($$1x -> {
         eww var10000 = this.d($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.w.a();
      fag.a(this.w, this.F());
   }

   private void C() {
      fol $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      foj.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, foj.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
