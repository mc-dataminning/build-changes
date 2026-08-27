import java.util.UUID;
import java.util.function.Supplier;

public class fjq extends fjj<frk.a> {
   private static final int r = 120;
   private static final int t = 85;
   private static final int u = 178;
   private static final vq v = vq.c("gui.abuseReport.skin.title");
   private final fde w = fde.d().a(8);
   private fag x;
   private ezo y;
   private ezo z;

   private fjq(ffl $$0, frj $$1, frk.a $$2) {
      super(v, $$0, $$1, $$2);
   }

   public fjq(ffl $$0, frj $$1, UUID $$2, Supplier<gia> $$3) {
      this($$0, $$1, new frk.a($$2, $$3, $$1.a().b()));
   }

   public fjq(ffl $$0, frj $$1, frk $$2) {
      this($$0, $$1, new frk.a($$2, $$1.a().b()));
   }

   @Override
   protected void aQ_() {
      this.w.c().b();
      this.w.a(new fav(this.e, this.i));
      fde $$0 = this.w.a(fde.e().a(8));
      $$0.c().e();
      $$0.a(new fao(85, 120, this.f.aQ(), this.q.e().a()));
      fde $$1 = $$0.a(fde.d().a(8));
      this.z = ezo.a(c, $$0x -> this.f.a(new fjp(this, this.q.h(), $$0xx -> {
            this.q.a($$0xx);
            this.E();
         }))).a(178).a();
      $$1.a(fcw.a(this.i, this.z, b));
      this.x = this.a(178, 9 * 8, $$0x -> {
         this.q.a($$0x);
         this.E();
      });
      $$1.a(fcw.a(this.i, this.x, k, $$0x -> $$0x.e(12)));
      fde $$2 = this.w.a(fde.e().a(8));
      $$2.a(ezo.a(vp.k, $$0x -> this.d()).a(120).a());
      this.y = $$2.a(ezo.a(a, $$0x -> this.o()).a(120).a());
      this.w.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
      this.c();
      this.E();
   }

   @Override
   protected void c() {
      this.w.a();
      fcy.a(this.w, this.F());
   }

   private void E() {
      frh $$0 = this.q.h();
      if ($$0 != null) {
         this.z.b($$0.b());
      } else {
         this.z.b(c);
      }

      frf.b $$1 = this.q.c();
      this.y.j = $$1 == null;
      this.y.a(x.a($$1, frf.b::a));
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      return super.b($$0, $$1, $$2) ? true : this.x.b($$0, $$1, $$2);
   }
}
