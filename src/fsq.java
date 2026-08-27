import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fsq extends fsp<gao.a> {
   private static final int y = 120;
   private static final xe z = xe.c("gui.chatReport.title");
   private static final xe A = xe.c("gui.chatReport.select_chat");
   private final fme B = fme.d().a(8);
   private fjf C;
   private fin D;
   private fin E;
   private fin F;

   private fsq(fon $$0, gav $$1, gao.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fsq(fon $$0, gav $$1, UUID $$2) {
      this($$0, $$1, new gao.a($$2, $$1.a().b()));
   }

   public fsq(fon $$0, gav $$1, gao $$2) {
      this($$0, $$1, new gao.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.B.c().b();
      this.B.a(new fju(this.l, this.p));
      this.E = this.B.a(fin.a(A, $$0x -> this.m.a(new fss(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.C();
         }))).a(280).a());
      this.F = fin.a(c, $$0x -> this.m.a(new fsv(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(280).a();
      this.B.a(flw.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.B.a(flw.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fme $$0 = this.B.a(fme.e().a(8));
      $$0.a(fin.a(xd.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fin.a(a, $$0x -> this.B()).a(120).a());
      this.B.a($$1 -> {
         fil var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.B.a();
      fly.a(this.B, this.G());
   }

   private void C() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(xe.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gat $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      gar.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(y.a($$2, gar.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
