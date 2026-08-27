import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fcj extends fci<fju.a> {
   private static final int s = 120;
   private static final tn t = tn.c("gui.chatReport.title");
   private static final tn u = tn.c("gui.chatReport.select_chat");
   private final ewf v = ewf.d().a(8);
   private etk w;
   private ess x;
   private ess y;
   private ess z;

   private fcj(eym $$0, fkb $$1, fju.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fcj(eym $$0, fkb $$1, UUID $$2) {
      this($$0, $$1, new fju.a($$2, $$1.a().b()));
   }

   public fcj(eym $$0, fkb $$1, fju $$2) {
      this($$0, $$1, new fju.a($$2, $$1.a().b()));
   }

   @Override
   protected void aH_() {
      this.v.c().b();
      this.v.a(new ety(this.e, this.i));
      this.y = this.v.a(ess.a(u, $$0x -> this.f.a(new fcl(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.D();
         }))).a(280).a());
      this.z = ess.a(c, $$0x -> this.f.a(new fco(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(280).a();
      this.v.a(evx.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.v.a(evx.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      ewf $$0 = this.v.a(ewf.e().a(8));
      $$0.a(ess.a(tm.k, $$0x -> this.az_()).a(120).a());
      this.x = $$0.a(ess.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         esq var10000 = this.d($$1);
      });
      this.b();
      this.D();
   }

   @Override
   protected void b() {
      this.v.a();
      evz.a(this.v, this.s());
   }

   private void D() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(tn.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fjz $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fjx.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fjx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
