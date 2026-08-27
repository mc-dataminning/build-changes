import java.util.UUID;
import java.util.function.Supplier;

public class fgh extends fga<fnx.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vb v = vb.c("gui.abuseReport.skin.title");
   private final ezv w = ezv.d().a(8);
   private ewz x;
   private ewh y;
   private ewh z;

   private fgh(fcc $$0, fnw $$1, fnx.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fgh(fcc $$0, fnw $$1, UUID $$2, Supplier<geo> $$3) {
      this($$0, $$1, new fnx.a($$2, $$3, $$1.a().b()));
   }

   public fgh(fcc $$0, fnw $$1, fnx $$2) {
      this($$0, $$1, new fnx.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.w.c().b();
      this.w.a(new exo(this.e, this.i));
      ezv $$0 = this.w.a(ezv.e().a(8));
      $$0.c().e();
      $$0.a(new exh(85, 120, this.f.aO(), this.q.e().a()));
      ezv $$1 = $$0.a(ezv.d().a(8));
      this.z = ewh.a(c, $$0x -> this.f.a(new fgg(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(178).a();
      $$1.a(ezn.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      $$1.a(ezn.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      ezv $$2 = this.w.a(ezv.e().a(8));
      $$2.a(ewh.a(va.k, $$0x -> this.aF_()).a(120).a());
      this.y = $$2.a(ewh.a(a, $$0x -> this.l()).a(120).a());
      this.w.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.w.a();
      ezp.a(this.w, this.s());
   }

   private void C() {
      fnu $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      fns.b $$1 = this.q.c();
      this.y.i = $$1 == null;
      this.y.a(x.a($$1, fns.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
