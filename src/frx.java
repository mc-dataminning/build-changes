import java.nio.file.Path;
import javax.annotation.Nullable;

public class frx extends fnd {
   private static final wu a = wu.c("telemetry_info.screen.title");
   private static final wu b = wu.c("telemetry_info.screen.description").b(-4539718);
   private static final wu c = wu.c("telemetry_info.button.privacy_statement");
   private static final wu q = wu.c("telemetry_info.button.give_feedback");
   private static final wu r = wu.c("telemetry_info.button.show_data");
   private static final wu s = wu.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = ffn.Q().D();
   private final fnd w;
   private final ffr x;
   private final fkz y = new fkz(this, 16 + 9 * 5 + 20, v ? 33 + fho.a(ffn.Q().h) : 33);
   @Nullable
   private frw z;
   @Nullable
   private fig A;
   private double B;

   public frx(fnd $$0, ffr $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public wu i() {
      return wt.a(super.i(), b);
   }

   @Override
   protected void aO_() {
      fld $$0 = this.y.a(fld.d().a(4));
      $$0.c().b();
      $$0.a(new fit(a, this.o));
      this.A = $$0.a(new fig(b, this.o).b(true));
      fld $$1 = $$0.a(fld.e().a(8));
      $$1.a(fhm.a(c, this::a).a());
      $$1.a(fhm.a(q, this::b).a());
      fld $$2 = this.y.b(fld.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fld $$3 = $$2.a(fld.e().a(8));
      $$3.a(fhm.a(r, this::c).a());
      $$3.a(fhm.a(wt.d, $$0x -> this.d()).a());
      fld $$4 = this.y.c(fld.d().a(8));
      this.z = $$4.a(new frw(0, 0, this.m - 40, this.y.d(), this.o));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fhk var10000 = this.c($$1x);
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
   protected void aD_() {
      if (this.z != null) {
         this.b(this.z);
      }
   }

   private fhk m() {
      ffq<Boolean> $$0 = this.x.ai();
      return fho.a(s, this.o).a($$0).a(this::a).a();
   }

   private void a(fhk $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(fhm $$0) {
      fma.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(fhm $$0) {
      fma.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(fhm $$0) {
      Path $$1 = this.l.u().b();
      ac.k().a($$1.toUri());
   }

   @Override
   public void d() {
      this.l.a(this.w);
   }
}
