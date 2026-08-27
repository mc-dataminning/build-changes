import java.nio.file.Path;
import javax.annotation.Nullable;

public class fpq extends fld {
   private static final wu a = wu.c("telemetry_info.screen.title");
   private static final wu b = wu.c("telemetry_info.screen.description").b(-4539718);
   private static final wu c = wu.c("telemetry_info.button.privacy_statement");
   private static final wu d = wu.c("telemetry_info.button.give_feedback");
   private static final wu r = wu.c("telemetry_info.button.show_data");
   private static final wu s = wu.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fde.Q().D();
   private final fld w;
   private final fdi x;
   private final fir y = new fir(this, 16 + 9 * 5 + 20, v ? 33 + ffg.a(fde.Q().h) : 33);
   @Nullable
   private fpp z;
   @Nullable
   private ffy A;
   private double B;

   public fpq(fld $$0, fdi $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      fiv $$0 = this.y.a(fiv.d().a(4));
      $$0.c().b();
      $$0.a(new fgl(a, this.p));
      this.A = $$0.a(new ffy(b, this.p).b(true));
      fiv $$1 = $$0.a(fiv.e().a(8));
      $$1.a(ffe.a(c, this::a).a());
      $$1.a(ffe.a(d, this::b).a());
      fiv $$2 = this.y.b(fiv.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fiv $$3 = $$2.a(fiv.e().a(8));
      $$3.a(ffe.a(r, this::c).a());
      $$3.a(ffe.a(wt.d, $$0x -> this.d()).a());
      fiv $$4 = this.y.c(fiv.d().a(8));
      this.z = $$4.a(new fpp(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         ffc var10000 = this.c($$1x);
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

   private ffc m() {
      fdh<Boolean> $$0 = this.x.ai();
      return ffg.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(ffc $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(ffe $$0) {
      fju.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(ffe $$0) {
      fju.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(ffe $$0) {
      Path $$1 = this.m.u().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
