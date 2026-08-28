import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fsf extends fse<gab.a> {
   private static final int y = 120;
   private static final wy z = wy.c("gui.chatReport.title");
   private static final wy A = wy.c("gui.chatReport.select_chat");
   private final flx B = flx.d().a(8);
   private fiy C;
   private fig D;
   private fig E;
   private fig F;

   private fsf(fnx $$0, gai $$1, gab.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fsf(fnx $$0, gai $$1, UUID $$2) {
      this($$0, $$1, new gab.a($$2, $$1.a().b()));
   }

   public fsf(fnx $$0, gai $$1, gab $$2) {
      this($$0, $$1, new gab.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.B.c().b();
      this.B.a(new fjn(this.k, this.o));
      this.E = this.B.a(fig.a(A, $$0x -> this.l.a(new fsh(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.D();
         }))).a(280).a());
      this.F = fig.a(c, $$0x -> this.l.a(new fsk(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.D();
         }))).a(280).a();
      this.B.a(flp.a(this.o, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      this.B.a(flp.a(this.o, this.C, q, $$0x -> $$0x.e(12)));
      flx $$0 = this.B.a(flx.e().a(8));
      $$0.a(fig.a(wx.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fig.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fie var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.B.a();
      flr.a(this.B, this.H());
   }

   private void D() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(wy.a("gui.chatReport.selected_chat", $$0.size()));
      }

      gag $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      gae.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, gae.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
