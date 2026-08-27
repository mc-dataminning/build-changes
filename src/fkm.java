import java.util.UUID;
import java.util.function.Supplier;

public class fkm extends fkf<fsh.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vs v = vs.c("gui.abuseReport.skin.title");
   private final fea w = fea.d().a(8);
   private fbc x;
   private fak y;
   private fak z;

   private fkm(fgh $$0, fsg $$1, fsh.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fkm(fgh $$0, fsg $$1, UUID $$2, Supplier<giy> $$3) {
      this($$0, $$1, new fsh.a($$2, $$3, $$1.a().b()));
   }

   public fkm(fgh $$0, fsg $$1, fsh $$2) {
      this($$0, $$1, new fsh.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.w.c().b();
      this.w.a(new fbr(this.e, this.i));
      fea $$0 = this.w.a(fea.e().a(8));
      $$0.c().e();
      $$0.a(new fbk(85, 120, this.f.aQ(), this.q.e().a()));
      fea $$1 = $$0.a(fea.d().a(8));
      this.z = fak.a(c, $$0x -> this.f.a(new fkl(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fds.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      $$1.a(fds.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fea $$2 = this.w.a(fea.e().a(8));
      $$2.a(fak.a(vr.k, $$0x -> this.d()).a(120).a());
      this.y = $$2.a(fak.a(a, $$0x -> this.o()).a(120).a());
      this.w.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.w.a();
      fdu.a(this.w, this.F());
   }

   private void E() {
      fse $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fsc.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, fsc.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
