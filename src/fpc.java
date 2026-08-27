import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fpc extends fpb<fwx.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.chatReport.title");
   private static final wu A = wu.c("gui.chatReport.select_chat");
   private final fiv B = fiv.d().a(8);
   private ffw C;
   private ffe D;
   private ffe E;
   private ffe F;

   private fpc(fld $$0, fxe $$1, fwx.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public fpc(fld $$0, fxe $$1, UUID $$2) {
      this($$0, $$1, new fwx.a($$2, $$1.a().b()));
   }

   public fpc(fld $$0, fxe $$1, fwx $$2) {
      this($$0, $$1, new fwx.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.B.c().b();
      this.B.a(new fgl(this.l, this.p));
      this.E = this.B.a(ffe.a(A, $$0x -> this.m.a(new fpe(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.C();
         }))).a(280).a());
      this.F = ffe.a(c, $$0x -> this.m.a(new fph(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.C();
         }))).a(280).a();
      this.B.a(fin.a(this.p, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.C();
      });
      this.B.a(fin.a(this.p, this.C, d, $$0x -> $$0x.e(12)));
      fiv $$0 = this.B.a(fiv.e().a(8));
      $$0.a(ffe.a(wt.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(ffe.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         ffc var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.B.a();
      fip.a(this.B, this.G());
   }

   private void C() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(wu.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fxc $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fxa.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fxa.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
