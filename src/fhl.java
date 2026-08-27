import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fhl extends fhk<fpb.a> {
   private static final int r = 120;
   private static final vg t = vg.c("gui.chatReport.title");
   private static final vg u = vg.c("gui.chatReport.select_chat");
   private final fbf v = fbf.d().a(8);
   private eyj w;
   private exr x;
   private exr y;
   private exr z;

   private fhl(fdm $$0, fpi $$1, fpb.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fhl(fdm $$0, fpi $$1, UUID $$2) {
      this($$0, $$1, new fpb.a($$2, $$1.a().b()));
   }

   public fhl(fdm $$0, fpi $$1, fpb $$2) {
      this($$0, $$1, new fpb.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.v.c().b();
      this.v.a(new eyy(this.e, this.i));
      this.y = this.v.a(exr.a(u, $$0x -> this.f.a(new fhn(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.E();
         }))).a(280).a());
      this.z = exr.a(c, $$0x -> this.f.a(new fhq(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(280).a();
      this.v.a(fax.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.v.a(fax.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fbf $$0 = this.v.a(fbf.e().a(8));
      $$0.a(exr.a(vf.k, $$0x -> this.d()).a(120).a());
      this.x = $$0.a(exr.a(a, $$0x -> this.o()).a(120).a());
      this.v.a($$1 -> {
         exp var10000 = this.d($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.v.a();
      faz.a(this.v, this.F());
   }

   private void E() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vg.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fpg $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fpe.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, fpe.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
