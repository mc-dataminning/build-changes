import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fjd extends fjc<fqu.a> {
   private static final int r = 120;
   private static final vq t = vq.c("gui.chatReport.title");
   private static final vq u = vq.c("gui.chatReport.select_chat");
   private final fcx v = fcx.d().a(8);
   private ezz w;
   private ezh x;
   private ezh y;
   private ezh z;

   private fjd(ffe $$0, frb $$1, fqu.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fjd(ffe $$0, frb $$1, UUID $$2) {
      this($$0, $$1, new fqu.a($$2, $$1.a().b()));
   }

   public fjd(ffe $$0, frb $$1, fqu $$2) {
      this($$0, $$1, new fqu.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.v.c().b();
      this.v.a(new fao(this.e, this.i));
      this.y = this.v.a(ezh.a(u, $$0x -> this.f.a(new fjf(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.E();
         }))).a(280).a());
      this.z = ezh.a(c, $$0x -> this.f.a(new fji(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(280).a();
      this.v.a(fcp.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.v.a(fcp.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fcx $$0 = this.v.a(fcx.e().a(8));
      $$0.a(ezh.a(vp.k, $$0x -> this.d()).a(120).a());
      this.x = $$0.a(ezh.a(a, $$0x -> this.o()).a(120).a());
      this.v.a($$1 -> {
         ezf var10000 = this.d($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.v.a();
      fcr.a(this.v, this.F());
   }

   private void E() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vq.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fqz $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fqx.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, fqx.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
