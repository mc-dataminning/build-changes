import java.util.UUID;
import java.util.function.Supplier;

public class frp extends fri<fzn.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final wu B = wu.c("gui.abuseReport.skin.title");
   private final fld C = fld.d().a(8);
   private fie D;
   private fhm E;
   private fhm F;

   private frp(fnd $$0, fzm $$1, fzn.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frp(fnd $$0, fzm $$1, UUID $$2, Supplier<gqi> $$3) {
      this($$0, $$1, new fzn.a($$2, $$3, $$1.a().b()));
   }

   public frp(fnd $$0, fzm $$1, fzn $$2) {
      this($$0, $$1, new fzn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aO_() {
      this.C.c().b();
      this.C.a(new fit(this.k, this.o));
      fld $$0 = this.C.a(fld.e().a(8));
      $$0.c().e();
      $$0.a(new fim(85, 120, this.l.aR(), this.x.e().a()));
      fld $$1 = $$0.a(fld.d().a(8));
      this.F = fhm.a(c, $$0x -> this.l.a(new fro(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fkv.a(this.o, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      $$1.a(fkv.a(this.o, this.D, q, $$0x -> $$0x.e(12)));
      fld $$2 = this.C.a(fld.e().a(8));
      $$2.a(fhm.a(wt.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhm.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fhk var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.C.a();
      fkx.a(this.C, this.H());
   }

   private void E() {
      fzk $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fzi.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fzi.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
