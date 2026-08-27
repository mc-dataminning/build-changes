import java.util.UUID;
import java.util.function.Supplier;

public class flk extends fld<fth.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vu v = vu.c("gui.abuseReport.skin.title");
   private final fex w = fex.d().a(8);
   private fby x;
   private fbg y;
   private fbg z;

   private flk(fhf $$0, ftg $$1, fth.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public flk(fhf $$0, ftg $$1, UUID $$2, Supplier<gjy> $$3) {
      this($$0, $$1, new fth.a($$2, $$3, $$1.a().b()));
   }

   public flk(fhf $$0, ftg $$1, fth $$2) {
      this($$0, $$1, new fth.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.w.c().b();
      this.w.a(new fcn(this.e, this.i));
      fex $$0 = this.w.a(fex.e().a(8));
      $$0.c().e();
      $$0.a(new fcg(85, 120, this.f.aR(), this.q.e().a()));
      fex $$1 = $$0.a(fex.d().a(8));
      this.z = fbg.a(c, $$0x -> this.f.a(new flj(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fep.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      $$1.a(fep.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fex $$2 = this.w.a(fex.e().a(8));
      $$2.a(fbg.a(vt.k, $$0x -> this.d()).a(120).a());
      this.y = $$2.a(fbg.a(a, $$0x -> this.o()).a(120).a());
      this.w.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.w.a();
      fer.a(this.w, this.F());
   }

   private void E() {
      fte $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      ftc.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, ftc.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
