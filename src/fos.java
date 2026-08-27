import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fos extends foq<fwn.a> {
   private static final int y = 120;
   private static final ws z = ws.c("gui.chatReport.title");
   private static final ws A = ws.c("gui.chatReport.select_chat");
   private final fil B = fil.d().a(8);
   private ffm C;
   private feu D;
   private feu E;
   private feu F;

   private fos(fkt $$0, fwu $$1, fwn.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fos(fkt $$0, fwu $$1, UUID $$2) {
      this($$0, $$1, new fwn.a($$2, $$1.a().b()));
   }

   public fos(fkt $$0, fwu $$1, fwn $$2) {
      this($$0, $$1, new fwn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.B.c().b();
      this.B.a(new fgb(this.l, this.p));
      this.E = this.B.a(feu.a(A, $$0x -> this.m.a(new fou(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.C();
         }))).a(280).a());
      this.F = feu.a(c, $$0x -> this.m.a(new fox(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(280).a();
      this.B.a(fid.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.B.a(fid.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fil $$0 = this.B.a(fil.e().a(8));
      $$0.a(feu.a(wr.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(feu.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fes var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.B.a();
      fif.a(this.B, this.G());
   }

   private void C() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(ws.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fws $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fwq.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fwq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
