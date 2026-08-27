import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fet extends fes<fmf.a> {
   private static final int r = 120;
   private static final ur t = ur.c("gui.chatReport.title");
   private static final ur u = ur.c("gui.chatReport.select_chat");
   private final eyn v = eyn.d().a(8);
   private evr w;
   private euz x;
   private euz y;
   private euz z;

   private fet(fau $$0, fmm $$1, fmf.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fet(fau $$0, fmm $$1, UUID $$2) {
      this($$0, $$1, new fmf.a($$2, $$1.a().b()));
   }

   public fet(fau $$0, fmm $$1, fmf $$2) {
      this($$0, $$1, new fmf.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.v.c().b();
      this.v.a(new ewg(this.e, this.i));
      this.y = this.v.a(euz.a(u, $$0x -> this.f.a(new fev(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = euz.a(c, $$0x -> this.f.a(new fey(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(eyf.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(eyf.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      eyn $$0 = this.v.a(eyn.e().a(8));
      $$0.a(euz.a(uq.k, $$0x -> this.aF_()).a(120).a());
      this.x = $$0.a(euz.a(a, $$0x -> this.l()).a(120).a());
      this.v.a($$1 -> {
         eux var10000 = this.d($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.v.a();
      eyh.a(this.v, this.s());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(ur.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fmk $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fmi.b $$2 = this.q.c();
      this.x.i = $$2 == null;
      this.x.a(x.a($$2, fmi.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
