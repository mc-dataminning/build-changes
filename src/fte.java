import java.nio.file.Path;
import javax.annotation.Nullable;

public class fte extends fon {
   private static final xe a = xe.c("telemetry_info.screen.title");
   private static final xe b = xe.c("telemetry_info.screen.description").b(-4539718);
   private static final xe c = xe.c("telemetry_info.button.privacy_statement");
   private static final xe d = xe.c("telemetry_info.button.give_feedback");
   private static final xe r = xe.c("telemetry_info.button.show_data");
   private static final xe s = xe.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fgj.Q().D();
   private final fon w;
   private final fgn x;
   private final fma y = new fma(this, 16 + 9 * 5 + 20, v ? 33 + fip.a(fgj.Q().h) : 33);
   @Nullable
   private ftd z;
   @Nullable
   private fjh A;
   private double B;

   public fte(fon $$0, fgn $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public xe i() {
      return xd.a(super.i(), b);
   }

   @Override
   protected void aN_() {
      fme $$0 = this.y.a(fme.d().a(4));
      $$0.c().b();
      $$0.a(new fju(a, this.p));
      this.A = $$0.a(new fjh(b, this.p).b(true));
      fme $$1 = $$0.a(fme.e().a(8));
      $$1.a(fin.a(c, this::a).a());
      $$1.a(fin.a(d, this::b).a());
      fme $$2 = this.y.b(fme.d().a(4));
      if (v) {
         $$2.a(this.B());
      }

      fme $$3 = $$2.a(fme.e().a(8));
      $$3.a(fin.a(r, this::c).a());
      $$3.a(fin.a(xd.d, $$0x -> this.d()).a());
      fme $$4 = this.y.c(fme.d().a(8));
      this.z = $$4.a(new ftd(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fil var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.a(this.B);
         this.z.k(this.n - 40);
         this.z.l(this.y.d());
         this.z.j();
      }

      if (this.A != null) {
         this.A.d(this.n - 16);
      }

      this.y.a();
   }

   @Override
   protected void aC_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fil B() {
      fgm<Boolean> $$0 = this.x.ai();
      return fip.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fil $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fin $$0) {
      fnd.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fin $$0) {
      fnd.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fin $$0) {
      Path $$1 = this.m.u().b();
      ad.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
