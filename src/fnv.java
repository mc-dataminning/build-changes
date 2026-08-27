import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fnv extends fnu<fvr.a> {
   private static final int v = 120;
   private static final wi w = wi.c("gui.chatReport.title");
   private static final wi x = wi.c("gui.chatReport.select_chat");
   private final fhp y = fhp.d().a(8);
   private feq z;
   private fdy A;
   private fdy B;
   private fdy C;

   private fnv(fjx $$0, fvy $$1, fvr.a $$2) {
      super(w, $$0, $$1, $$2);
   }

   public fnv(fjx $$0, fvy $$1, UUID $$2) {
      this($$0, $$1, new fvr.a($$2, $$1.a().b()));
   }

   public fnv(fjx $$0, fvy $$1, fvr $$2) {
      this($$0, $$1, new fvr.a($$2, $$1.a().b()));
   }

   @Override
   protected void aM_() {
      this.y.c().b();
      this.y.a(new fff(this.i, this.m));
      this.B = this.y.a(fdy.a(x, $$0x -> this.j.a(new fnx(this, this.s, this.u, $$0xx -> {
            this.u = $$0xx;
            this.C();
         }))).a(280).a());
      this.C = fdy.a(c, $$0x -> this.j.a(new foa(this, this.u.h(), $$0xx -> {
            this.u.a($$0xx);
            this.C();
         }))).a(280).a();
      this.y.a(fhh.a(this.m, this.C, b));
      this.z = this.a(280, 9 * 8, $$0x -> {
         this.u.a($$0x);
         this.C();
      });
      this.y.a(fhh.a(this.m, this.z, d, $$0x -> $$0x.e(12)));
      fhp $$0 = this.y.a(fhp.e().a(8));
      $$0.a(fdy.a(wh.k, $$0x -> this.d()).a(120).a());
      this.A = $$0.a(fdy.a(a, $$0x -> this.m()).a(120).a());
      this.y.a($$1 -> {
         fdw var10000 = this.c($$1);
      });
      this.c();
      this.C();
   }

   @Override
   protected void c() {
      this.y.a();
      fhj.a(this.y, this.G());
   }

   private void C() {
      IntSet $$0 = this.u.a();
      if ($$0.isEmpty()) {
         this.B.b(x);
      } else {
         this.B.b(wi.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fvw $$1 = this.u.h();
      if ($$1 != null) {
         this.C.b($$1.b());
      } else {
         this.C.b(c);
      }

      fvu.b $$2 = this.u.c();
      this.A.j = $$2 == null;
      this.A.a(x.a($$2, fvu.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.z.b($$0, $$1, $$2);
   }
}
