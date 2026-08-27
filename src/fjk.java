import it.unimi.dsi.fastutil.ints.IntSet;
import java.util.UUID;

public class fjk extends fjj<frc.a> {
   private static final int r = 120;
   private static final vq t = vq.c("gui.chatReport.title");
   private static final vq u = vq.c("gui.chatReport.select_chat");
   private final fde v = fde.d().a(8);
   private fag w;
   private ezo x;
   private ezo y;
   private ezo z;

   private fjk(ffl $$0, frj $$1, frc.a $$2) {
      super(t, $$0, $$1, $$2);
   }

   public fjk(ffl $$0, frj $$1, UUID $$2) {
      this($$0, $$1, new frc.a($$2, $$1.a().b()));
   }

   public fjk(ffl $$0, frj $$1, frc $$2) {
      this($$0, $$1, new frc.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.v.c().b();
      this.v.a(new fav(this.e, this.i));
      this.y = this.v.a(ezo.a(u, $$0x -> this.f.a(new fjm(this, this.p, this.q, $$0xx -> {
            this.q = $$0xx;
            this.E();
         }))).a(280).a());
      this.z = ezo.a(c, $$0x -> this.f.a(new fjp(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(280).a();
      this.v.a(fcw.a(this.i, this.z, b));
      this.w = this.a(280, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      this.v.a(fcw.a(this.i, this.w, k, $$0x -> $$0x.e(12)));
      fde $$0 = this.v.a(fde.e().a(8));
      $$0.a(ezo.a(vp.k, $$0x -> this.d()).a(120).a());
      this.x = $$0.a(ezo.a(a, $$0x -> this.o()).a(120).a());
      this.v.a($$1 -> {
         ezm var10000 = this.c($$1);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.v.a();
      fcy.a(this.v, this.F());
   }

   private void E() {
      IntSet $$0 = this.q.a();
      if ($$0.isEmpty()) {
         this.y.b(u);
      } else {
         this.y.b(vq.a("gui.chatReport.selected_chat", $$0.size()));
      }

      frh $$1 = this.q.h();
      if ($$1 != null) {
         this.z.b($$1.b());
      } else {
         this.z.b(c);
      }

      frf.b $$2 = this.q.c();
      this.x.j = $$2 == null;
      this.x.a(x.a($$2, frf.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.w.b($$0, $$1, $$2);
   }
}
