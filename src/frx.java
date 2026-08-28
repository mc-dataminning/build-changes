import java.util.UUID;
import java.util.function.Supplier;

public class frx extends frq<fzv.a> {
   private static final int y = 120;
   private static final int z = 85;
   private static final int A = 178;
   private static final wu B = wu.c("gui.abuseReport.skin.title");
   private final fll C = fll.d().a(8);
   private fim D;
   private fhu E;
   private fhu F;

   private frx(fnl $$0, fzu $$1, fzv.a $$2) {
      super(B, $$0, $$1, $$2);
   }

   public frx(fnl $$0, fzu $$1, UUID $$2, Supplier<gqq> $$3) {
      this($$0, $$1, new fzv.a($$2, $$3, $$1.a().b()));
   }

   public frx(fnl $$0, fzu $$1, fzv $$2) {
      this($$0, $$1, new fzv.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.C.c().b();
      this.C.a(new fjb(this.k, this.o));
      fll $$0 = this.C.a(fll.e().a(8));
      $$0.c().e();
      $$0.a(new fiu(85, 120, this.l.aP(), this.x.e().a()));
      fll $$1 = $$0.a(fll.d().a(8));
      this.F = fhu.a(c, $$0x -> this.l.a(new frw(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.D();
         }))).a(178).a();
      $$1.a(fld.a(this.o, this.F, b));
      this.D = this.a(178, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      $$1.a(fld.a(this.o, this.D, q, $$0x -> $$0x.e(12)));
      fll $$2 = this.C.a(fll.e().a(8));
      $$2.a(fhu.a(wt.k, $$0x -> this.d()).a(120).a());
      this.E = $$2.a(fhu.a(a, $$0x -> this.m()).a(120).a());
      this.C.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.C.a();
      flf.a(this.C, this.H());
   }

   private void D() {
      fzs $$0 = this.x.h();
      if ($$0 != null) {
         this.F.b($$0.b());
      } else {
         this.F.b(c);
      }

      fzq.b $$1 = this.x.c();
      this.E.j = $$1 == null;
      this.E.a(x.a($$1, fzq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.D.b($$0, $$1, $$2);
   }
}
