import java.nio.file.Path;
import javax.annotation.Nullable;

public class fsd extends fnj {
   private static final wu a = wu.c("telemetry_info.screen.title");
   private static final wu b = wu.c("telemetry_info.screen.description").b(-4539718);
   private static final wu c = wu.c("telemetry_info.button.privacy_statement");
   private static final wu q = wu.c("telemetry_info.button.give_feedback");
   private static final wu r = wu.c("telemetry_info.button.show_data");
   private static final wu s = wu.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fft.Q().D();
   private final fnj w;
   private final ffx x;
   private final flf y = new flf(this, 16 + 9 * 5 + 20, v ? 33 + fhu.a(fft.Q().h) : 33);
   @Nullable
   private fsc z;
   @Nullable
   private fim A;
   private double B;

   public fsd(fnj $$0, ffx $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aP_() {
      flj $$0 = this.y.a(flj.d().a(4));
      $$0.c().b();
      $$0.a(new fiz(a, this.o));
      this.A = $$0.a(new fim(b, this.o).b(true));
      flj $$1 = $$0.a(flj.e().a(8));
      $$1.a(fhs.a(c, this::a).a());
      $$1.a(fhs.a(q, this::b).a());
      flj $$2 = this.y.b(flj.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      flj $$3 = $$2.a(flj.e().a(8));
      $$3.a(fhs.a(r, this::c).a());
      $$3.a(fhs.a(wt.d, $$0x -> this.d()).a());
      flj $$4 = this.y.c(flj.d().a(8));
      this.z = $$4.a(new fsc(0, 0, this.m - 40, this.y.d(), this.o));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhq var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.z != null) {
         this.z.a(this.B);
         this.z.k(this.m - 40);
         this.z.l(this.y.d());
         this.z.j();
      }

      if (this.A != null) {
         this.A.d(this.m - 16);
      }

      this.y.a();
   }

   @Override
   protected void aE_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fhq m() {
      ffw<Boolean> $$0 = this.x.ai();
      return fhu.a(s, this.o).a($$0).a(this::a).a();
   }

   private void a(fhq $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhs $$0) {
      fmg.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhs $$0) {
      fmg.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhs $$0) {
      Path $$1 = this.l.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.l.a(this.w);
   }
}
