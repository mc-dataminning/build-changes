import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fgb extends fga<fnp.a> {
   private static final int r = 120;
   private static final vb t = vb.c("gui.chatReport.title");
   private static final vb u = vb.c("gui.chatReport.select_chat");
   private final ezv v = ezv.d().a(8);
   private ewz w;
   private ewh x;
   private ewh y;
   private ewh z;

   private fgb(fcc $$0, fnw $$1, fnp.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fgb(fcc $$0, fnw $$1, UUID $$2) {
      this($$0, $$1, new fnp.a($$2, $$1.a().b()));
   }

   public fgb(fcc $$0, fnw $$1, fnp $$2) {
      this($$0, $$1, new fnp.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.v.c().b();
      this.v.a(new exo(this.e, this.i));
      this.y = this.v.a(ewh.a(u, $$0x -> this.f.a(new fgd(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = ewh.a(c, $$0x -> this.f.a(new fgg(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(ezn.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(ezn.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      ezv $$0 = this.v.a(ezv.e().a(8));
      $$0.a(ewh.a(va.k, $$0x -> this.aF_()).a(120).a());
      this.x = $$0.a(ewh.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.v.a();
      ezp.a(this.v, this.s());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vb.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fnu $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fns.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fns.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
