import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fha extends fgz<foo.a> {
   private static final int r = 120;
   private static final vf t = vf.c("gui.chatReport.title");
   private static final vf u = vf.c("gui.chatReport.select_chat");
   private final fau v = fau.d().a(8);
   private exy w;
   private exg x;
   private exg y;
   private exg z;

   private fha(fdb $$0, fow $$1, foo.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fha(fdb $$0, fow $$1, UUID $$2) {
      this($$0, $$1, new foo.a($$2, $$1.a().b()));
   }

   public fha(fdb $$0, fow $$1, foo $$2) {
      this($$0, $$1, new foo.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.v.c().b();
      this.v.a(new eyn(this.e, this.i));
      this.y = this.v.a(exg.a(u, $$0x -> this.f.a(new fhc(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.D();
         }))).a(280).a());
      this.z = exg.a(c, $$0x -> this.f.a(new fhf(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.D();
         }))).a(280).a();
      this.v.a(fam.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.D();
      });
      this.v.a(fam.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fau $$0 = this.v.a(fau.e().a(8));
      $$0.a(exg.a(ve.k, $$0x -> this.aE_()).a(120).a());
      this.x = $$0.a(exg.a(a, $$0x -> this.n()).a(120).a());
      this.v.a($$1 -> {
         exe var10000 = this.d($$1);
      });
      this.c();
      this.D();
   }

   @Override
   protected void c() {
      this.v.a();
      fao.a(this.v, this.F());
   }

   private void D() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vf.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fou $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fos.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, fos.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
