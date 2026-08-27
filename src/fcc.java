import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fcc extends fcb<fjo.a> {
   private static final int s = 120;
   private static final tl t = tl.c("gui.chatReport.title");
   private static final tl u = tl.c("gui.chatReport.select_chat");
   private final evy v = evy.d().a(8);
   private etc w;
   private esk x;
   private esk y;
   private esk z;

   private fcc(eye $$0, fjv $$1, fjo.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fcc(eye $$0, fjv $$1, UUID $$2) {
      this($$0, $$1, new fjo.a($$2, $$1.a().b()));
   }

   public fcc(eye $$0, fjv $$1, fjo $$2) {
      this($$0, $$1, new fjo.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.v.c().b();
      this.v.a(new etr(this.e, this.i));
      this.y = this.v.a(esk.a(u, $$0x -> this.f.a(new fce(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.D();
         }))).a(280).a());
      this.z = esk.a(c, $$0x -> this.f.a(new fch(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(280).a();
      this.v.a(evq.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.v.a(evq.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      evy $$0 = this.v.a(evy.e().a(8));
      $$0.a(esk.a(tk.k, $$0x -> this.az_()).a(120).a());
      this.x = $$0.a(esk.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         esi var10000 = this.d($$1);
      });
      this.b();
      this.D();
   }

   @Override
   protected void b() {
      this.v.a();
      evs.a(this.v, this.s());
   }

   private void D() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(tl.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fjt $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fjr.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fjr.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
