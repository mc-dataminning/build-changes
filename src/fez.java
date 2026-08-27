import java.util.UUID;
import java.util.function.Supplier;

public class fez extends fes<fmn.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final ur v = ur.c("gui.abuseReport.skin.title");
   private final eyn w = eyn.d().a(8);
   private evr x;
   private euz y;
   private euz z;

   private fez(fau $$0, fmm $$1, fmn.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fez(fau $$0, fmm $$1, UUID $$2, Supplier<gcu> $$3) {
      this($$0, $$1, new fmn.a($$2, $$3, $$1.a().b()));
   }

   public fez(fau $$0, fmm $$1, fmn $$2) {
      this($$0, $$1, new fmn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.w.c().b();
      this.w.a(new ewg(this.e, this.i));
      eyn $$0 = this.w.a(eyn.e().a(8));
      $$0.c().e();
      $$0.a(new evz(85, 120, this.f.aO(), this.q.e().a()));
      eyn $$1 = $$0.a(eyn.d().a(8));
      this.z = euz.a(c, $$0x -> this.f.a(new fey(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(eyf.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(eyf.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      eyn $$2 = this.w.a(eyn.e().a(8));
      $$2.a(euz.a(uq.k, $$0x -> this.aF_()).a(120).a());
      this.y = $$2.a(euz.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         eux var10000 = this.d($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.w.a();
      eyh.a(this.w, this.s());
   }

   private void C() {
      fmk $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fmi.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fmi.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
