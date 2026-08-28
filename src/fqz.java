import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fqz extends fqy<fyu.a> {
   private static final int y = 120;
   private static final xo z = xo.c("gui.chatReport.title");
   private static final xo A = xo.c("gui.chatReport.select_chat");
   private final fkt B = fkt.d().a(8);
   private fhu C;
   private fhc D;
   private fhc E;
   private fhc F;

   private fqz(fnb $$0, fzb $$1, fyu.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fqz(fnb $$0, fzb $$1, UUID $$2) {
      this($$0, $$1, new fyu.a($$2, $$1.a().b()));
   }

   public fqz(fnb $$0, fzb $$1, fyu $$2) {
      this($$0, $$1, new fyu.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.B.c().b();
      this.B.a(new fij(this.l, this.p));
      this.E = this.B.a(fhc.a(A, $$0x -> this.m.a(new frb(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.D();
         }))).a(280).a());
      this.F = fhc.a(c, $$0x -> this.m.a(new fre(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.D();
         }))).a(280).a();
      this.B.a(fkl.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      this.B.a(fkl.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fkt $$0 = this.B.a(fkt.e().a(8));
      $$0.a(fhc.a(xn.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fhc.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fha var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.B.a();
      fkn.a(this.B, this.G());
   }

   private void D() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(xo.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fyz $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fyx.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fyx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
