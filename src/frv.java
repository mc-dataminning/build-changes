import java.util.UUID;
import java.util.function.Supplier;

public class frv extends fro<fzt.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final wu B = wu.c("gui.abuseReport.skin.title");
   private final flj C = flj.d().a(8);
   private fik D;
   private fhs E;
   private fhs F;

   private frv(fnj $$0, fzs $$1, fzt.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frv(fnj $$0, fzs $$1, UUID $$2, Supplier<gqo> $$3) {
      this($$0, $$1, new fzt.a($$2, $$3, $$1.a().b()));
   }

   public frv(fnj $$0, fzs $$1, fzt $$2) {
      this($$0, $$1, new fzt.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.C.c().b();
      this.C.a(new fiz(this.k, this.o));
      flj $$0 = this.C.a(flj.e().a(8));
      $$0.c().e();
      $$0.a(new fis(85, 120, this.l.aR(), this.x.e().a()));
      flj $$1 = $$0.a(flj.d().a(8));
      this.F = fhs.a(c, $$0x -> this.l.a(new fru(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(flb.a(this.o, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      $$1.a(flb.a(this.o, this.D, q, $$0x -> $$0x.e(12)));
      flj $$2 = this.C.a(flj.e().a(8));
      $$2.a(fhs.a(wt.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhs.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.C.a();
      fld.a(this.C, this.H());
   }

   private void E() {
      fzq $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fzo.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fzo.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
