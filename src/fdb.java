import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fdb extends fda<fkn.a> {
   private static final int s = 120;
   private static final ui t = ui.c("gui.chatReport.title");
   private static final ui u = ui.c("gui.chatReport.select_chat");
   private final ewx v = ewx.d().a(8);
   private eub w;
   private etj x;
   private etj y;
   private etj z;

   private fdb(ezd $$0, fku $$1, fkn.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fdb(ezd $$0, fku $$1, UUID $$2) {
      this($$0, $$1, new fkn.a($$2, $$1.a().b()));
   }

   public fdb(ezd $$0, fku $$1, fkn $$2) {
      this($$0, $$1, new fkn.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.v.c().b();
      this.v.a(new euq(this.e, this.i));
      this.y = this.v.a(etj.a(u, $$0x -> this.f.a(new fdd(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = etj.a(c, $$0x -> this.f.a(new fdg(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(ewp.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(ewp.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      ewx $$0 = this.v.a(ewx.e().a(8));
      $$0.a(etj.a(uh.k, $$0x -> this.aC_()).a(120).a());
      this.x = $$0.a(etj.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.v.a();
      ewr.a(this.v, this.s());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(ui.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fks $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fkq.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fkq.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
