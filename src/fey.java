import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fey extends fex<fmk.a> {
   private static final int r = 120;
   private static final uv t = uv.c("gui.chatReport.title");
   private static final uv u = uv.c("gui.chatReport.select_chat");
   private final eys v = eys.d().a(8);
   private evw w;
   private eve x;
   private eve y;
   private eve z;

   private fey(faz $$0, fmr $$1, fmk.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fey(faz $$0, fmr $$1, UUID $$2) {
      this($$0, $$1, new fmk.a($$2, $$1.a().b()));
   }

   public fey(faz $$0, fmr $$1, fmk $$2) {
      this($$0, $$1, new fmk.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.v.c().b();
      this.v.a(new ewl(this.e, this.i));
      this.y = this.v.a(eve.a(u, $$0x -> this.f.a(new ffa(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = eve.a(c, $$0x -> this.f.a(new ffd(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(eyk.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(eyk.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      eys $$0 = this.v.a(eys.e().a(8));
      $$0.a(eve.a(uu.k, $$0x -> this.aG_()).a(120).a());
      this.x = $$0.a(eve.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.v.a();
      eym.a(this.v, this.s());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(uv.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fmp $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fmn.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fmn.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
