import java.util.UUID;

public class fge extends fga<fnr.a> {
   private static final int r = 120;
   private static final vb t = vb.c("gui.abuseReport.name.title");
   private final ezv u = ezv.d().a(8);
   private ewz v;
   private ewh w;

   private fge(fcc $$0, fnw $$1, fnr.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fge(fcc $$0, fnw $$1, UUID $$2, String $$3) {
      this($$0, $$1, new fnr.a($$2, $$3, $$1.a().b()));
   }

   public fge(fcc $$0, fnw $$1, fnr $$2) {
      this($$0, $$1, new fnr.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.u.c().b();
      this.u.a(new exo(this.e, this.i));
      vb $$0 = vb.b(this.q.e().a()).a(n.o);
      this.u.a(new exo(vb.a("gui.abuseReport.name.reporting", $$0), this.i), $$0x -> $$0x.a().a(0, 8));
      this.v = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.u.a(ezn.a(this.i, this.v, k, $$0x -> $$0x.e(12)));
      ezv $$1 = this.u.a(ezv.e().a(8));
      $$1.a(ewh.a(va.k, $$0x -> this.aF_()).a(120).a());
      this.w = $$1.a(ewh.a(a, $$0x -> this.l()).a(120).a());
      this.C();
      this.u.a($$1x -> {
         ewf var10000 = this.d($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.u.a();
      ezp.a(this.u, this.s());
   }

   private void C() {
      fns.b $$0 = this.q.c();
      this.w.i = $$0 == null;
      this.w.a(x.a($$0, fns.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.v.b($$0, $$1, $$2);
   }
}
