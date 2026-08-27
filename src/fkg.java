import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fkg extends fkf<frz.a> {
   private static final int r = 120;
   private static final vs t = vs.c("gui.chatReport.title");
   private static final vs u = vs.c("gui.chatReport.select_chat");
   private final fea v = fea.d().a(8);
   private fbc w;
   private fak x;
   private fak y;
   private fak z;

   private fkg(fgh $$0, fsg $$1, frz.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fkg(fgh $$0, fsg $$1, UUID $$2) {
      this($$0, $$1, new frz.a($$2, $$1.a().b()));
   }

   public fkg(fgh $$0, fsg $$1, frz $$2) {
      this($$0, $$1, new frz.a($$2, $$1.a().b()));
   }

   @Override
   protected void aP_() {
      this.v.c().b();
      this.v.a(new fbr(this.e, this.i));
      this.y = this.v.a(fak.a(u, $$0x -> this.f.a(new fki(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.E();
         }))).a(280).a());
      this.z = fak.a(c, $$0x -> this.f.a(new fkl(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(280).a();
      this.v.a(fds.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.v.a(fds.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fea $$0 = this.v.a(fea.e().a(8));
      $$0.a(fak.a(vr.k, $$0x -> this.d()).a(120).a());
      this.x = $$0.a(fak.a(a, $$0x -> this.o()).a(120).a());
      this.v.a($$1 -> {
         fai var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.v.a();
      fdu.a(this.v, this.F());
   }

   private void E() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vs.a("gui.chatReport.selected_chat", $$0.size()));
      }

      fse $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      fsc.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, fsc.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
