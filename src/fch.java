import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fch extends fcg<fjs.a> {
   private static final int s = 120;
   private static final tm t = tm.c("gui.chatReport.title");
   private static final tm u = tm.c("gui.chatReport.select_chat");
   private final ewd v = ewd.d().a(8);
   private eti w;
   private esq x;
   private esq y;
   private esq z;

   private fch(eyk $$0, fjz $$1, fjs.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fch(eyk $$0, fjz $$1, UUID $$2) {
      this($$0, $$1, new fjs.a($$2, $$1.a().b()));
   }

   public fch(eyk $$0, fjz $$1, fjs $$2) {
      this($$0, $$1, new fjs.a($$2, $$1.a().b()));
   }

   @Override
   protected void aI_() {
      this.v.c().b();
      this.v.a(new etw(this.e, this.i));
      this.y = this.v.a(esq.a(u, $$0x -> this.f.a(new fcj(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.D();
         }))).a(280).a());
      this.z = esq.a(c, $$0x -> this.f.a(new fcm(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(280).a();
      this.v.a(evv.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.v.a(evv.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      ewd $$0 = this.v.a(ewd.e().a(8));
      $$0.a(esq.a(tl.k, $$0x -> this.az_()).a(120).a());
      this.x = $$0.a(esq.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         eso var10000 = this.d($$1);
      });
      this.b();
      this.D();
   }

   @Override
   protected void b() {
      this.v.a();
      evx.a(this.v, this.s());
   }

   private void D() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(tm.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fjx $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fjv.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fjv.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
