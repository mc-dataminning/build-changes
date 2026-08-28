import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class frr extends frq<fzn.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.chatReport.title");
   private static final wu A = wu.c("gui.chatReport.select_chat");
   private final fll B = fll.d().a(8);
   private fim C;
   private fhu D;
   private fhu E;
   private fhu F;

   private frr(fnl $$0, fzu $$1, fzn.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frr(fnl $$0, fzu $$1, UUID $$2) {
      this($$0, $$1, new fzn.a($$2, $$1.a().b()));
   }

   public frr(fnl $$0, fzu $$1, fzn $$2) {
      this($$0, $$1, new fzn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.B.c().b();
      this.B.a(new fjb(this.k, this.o));
      this.E = this.B.a(fhu.a(A, $$0x -> this.l.a(new frt(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.D();
         }))).a(280).a());
      this.F = fhu.a(c, $$0x -> this.l.a(new frw(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.D();
         }))).a(280).a();
      this.B.a(fld.a(this.o, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.D();
      });
      this.B.a(fld.a(this.o, this.C, q, $$0x -> $$0x.e(12)));
      fll $$0 = this.B.a(fll.e().a(8));
      $$0.a(fhu.a(wt.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fhu.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fhs var10000 = this.c($$1);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.B.a();
      flf.a(this.B, this.H());
   }

   private void D() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(wu.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fzs $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fzq.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fzq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
