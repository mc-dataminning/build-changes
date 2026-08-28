import java.nio.file.Path;
import javax.annotation.Nullable;

public class fsf extends fnl {
   private static final wu a = wu.c("telemetry_info.screen.title");
   private static final wu b = wu.c("telemetry_info.screen.description").b(-4539718);
   private static final wu c = wu.c("telemetry_info.button.privacy_statement");
   private static final wu q = wu.c("telemetry_info.button.give_feedback");
   private static final wu r = wu.c("telemetry_info.button.show_data");
   private static final wu s = wu.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffw.Q().D();
   private final fnl w;
   private final fga x;
   private final flh y = new flh(this, 16 + 9 * 5 + 20, v ? 33 + fhw.a(ffw.Q().h) : 33);
   @Nullable
   private fse z;
   @Nullable
   private fio A;
   private double B;

   public fsf(fnl $$0, fga $$1) {
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
      fll $$0 = this.y.a(fll.d().a(4));
      $$0.c().b();
      $$0.a(new fjb(a, this.o));
      this.A = $$0.a(new fio(b, this.o).b(true));
      fll $$1 = $$0.a(fll.e().a(8));
      $$1.a(fhu.a(c, this::a).a());
      $$1.a(fhu.a(q, this::b).a());
      fll $$2 = this.y.b(fll.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fll $$3 = $$2.a(fll.e().a(8));
      $$3.a(fhu.a(r, this::c).a());
      $$3.a(fhu.a(wt.d, $$0x -> this.d()).a());
      fll $$4 = this.y.c(fll.d().a(8));
      this.z = $$4.a(new fse(0, 0, this.m - 40, this.y.d(), this.o));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhs var10000 = this.c($$1x);
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

   private fhs m() {
      ffz<Boolean> $$0 = this.x.ai();
      return fhw.a(s, this.o).a($$0).a(this::a).a();
   }

   private void a(fhs $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhu $$0) {
      fmi.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhu $$0) {
      fmi.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhu $$0) {
      Path $$1 = this.l.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.l.a(this.w);
   }
}
