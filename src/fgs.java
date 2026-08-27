import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fgs extends fgr<fog.a> {
   private static final int r = 120;
   private static final vd t = vd.c("gui.chatReport.title");
   private static final vd u = vd.c("gui.chatReport.select_chat");
   private final fam v = fam.d().a(8);
   private exq w;
   private ewy x;
   private ewy y;
   private ewy z;

   private fgs(fct $$0, fon $$1, fog.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fgs(fct $$0, fon $$1, UUID $$2) {
      this($$0, $$1, new fog.a($$2, $$1.a().b()));
   }

   public fgs(fct $$0, fon $$1, fog $$2) {
      this($$0, $$1, new fog.a($$2, $$1.a().b()));
   }

   @Override
   protected void aN_() {
      this.v.c().b();
      this.v.a(new eyf(this.e, this.i));
      this.y = this.v.a(ewy.a(u, $$0x -> this.f.a(new fgu(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.C();
         }))).a(280).a());
      this.z = ewy.a(c, $$0x -> this.f.a(new fgx(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.C();
         }))).a(280).a();
      this.v.a(fae.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.C();
      });
      this.v.a(fae.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fam $$0 = this.v.a(fam.e().a(8));
      $$0.a(ewy.a(vc.k, $$0x -> this.aE_()).a(120).a());
      this.x = $$0.a(ewy.a(a, $$0x -> this.n()).a(120).a());
      this.v.a($$1 -> {
         eww var10000 = this.d($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.v.a();
      fag.a(this.v, this.F());
   }

   private void C() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vd.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fol $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      foj.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, foj.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
