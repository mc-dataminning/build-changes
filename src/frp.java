import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class frp extends fro<fzl.a> {
   private static final int y = 120;
   private static final wu z = wu.c("gui.chatReport.title");
   private static final wu A = wu.c("gui.chatReport.select_chat");
   private final flj B = flj.d().a(8);
   private fik C;
   private fhs D;
   private fhs E;
   private fhs F;

   private frp(fnj $$0, fzs $$1, fzl.a $$2) {
      super(z, $$0, $$1, $$2);
   }

   public frp(fnj $$0, fzs $$1, UUID $$2) {
      this($$0, $$1, new fzl.a($$2, $$1.a().b()));
   }

   public frp(fnj $$0, fzs $$1, fzl $$2) {
      this($$0, $$1, new fzl.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.B.c().b();
      this.B.a(new fiz(this.k, this.o));
      this.E = this.B.a(fhs.a(A, $$0x -> this.l.a(new frr(this, this.w, this.x, $$0xx -> {
            this.x = $$0xx;
            this.E();
         }))).a(280).a());
      this.F = fhs.a(c, $$0x -> this.l.a(new fru(this, this.x.h(), $$0xx -> {
            this.x.a($$0xx);
            this.E();
         }))).a(280).a();
      this.B.a(flb.a(this.o, this.F, b));
      this.C = this.a(280, 9 * 8, $$0x -> {
         this.x.a($$0x);
         this.E();
      });
      this.B.a(flb.a(this.o, this.C, q, $$0x -> $$0x.e(12)));
      flj $$0 = this.B.a(flj.e().a(8));
      $$0.a(fhs.a(wt.k, $$0x -> this.d()).a(120).a());
      this.D = $$0.a(fhs.a(a, $$0x -> this.m()).a(120).a());
      this.B.a($$1 -> {
         fhq var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.B.a();
      fld.a(this.B, this.H());
   }

   private void E() {
      IntSet $$0 = this.x.a();
      if ($$0.isEmpty()) {
         this.E.b(A);
      } else {
         this.E.b(wu.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fzq $$1 = this.x.h();
      if ($$1 != null) {
         this.F.b($$1.b());
      } else {
         this.F.b(c);
      }

      fzo.b $$2 = this.x.c();
      this.D.j = $$2 == null;
      this.D.a(x.a($$2, fzo.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.C.b($$0, $$1, $$2);
   }
}
