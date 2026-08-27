import java.nio.file.Path;
import javax.annotation.Nullable;

public class fpg extends fkt {
   private static final ws a = ws.c("telemetry_info.screen.title");
   private static final ws b = ws.c("telemetry_info.screen.description").b(-4539718);
   private static final ws c = ws.c("telemetry_info.button.privacy_statement");
   private static final ws d = ws.c("telemetry_info.button.give_feedback");
   private static final ws r = ws.c("telemetry_info.button.show_data");
   private static final ws s = ws.c("telemetry_info.opt_in.description");
   private static final int u = 8;
   private static final boolean v = fcu.Q().D();
   private final fkt w;
   private final fcy x;
   private final fih y = new fih(this, 16 + 9 * 5 + 20, v ? 33 + few.a(fcu.Q().h) : 33);
   @Nullable
   private fpf z;
   @Nullable
   private ffo A;
   private double B;

   public fpg(fkt $$0, fcy $$1) {
      super(a);
      this.w = $$0;
      this.x = $$1;
   }

   @Override
   public ws i() {
      return wr.a(super.i(), b);
   }

   @Override
   protected void aM_() {
      fil $$0 = this.y.a(fil.d().a(4));
      $$0.c().b();
      $$0.a(new fgb(a, this.p));
      this.A = $$0.a(new ffo(b, this.p).b(true));
      fil $$1 = $$0.a(fil.e().a(8));
      $$1.a(feu.a(c, this::a).a());
      $$1.a(feu.a(d, this::b).a());
      fil $$2 = this.y.b(fil.d().a(4));
      if (v) {
         $$2.a(this.m());
      }

      fil $$3 = $$2.a(fil.e().a(8));
      $$3.a(feu.a(r, this::c).a());
      $$3.a(feu.a(wr.d, $$0x -> this.d()).a());
      fil $$4 = this.y.c(fil.d().a(8));
      this.z = $$4.a(new fpf(0, 0, this.n - 40, this.y.d(), this.p));
      this.z.a($$0x -> this.B = $$0x);
      this.y.a($$1x -> {
         fes var10000 = this.c($$1x);
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

   private fes m() {
      fcx<Boolean> $$0 = this.x.ai();
      return few.a(s, this.p).a($$0).a(this::a).a();
   }

   private void a(fes $$0, boolean $$1) {
      if (this.z != null) {
         this.z.b($$1);
      }
   }

   private void a(feu $$0) {
      fjk.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void b(feu $$0) {
      fjk.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void c(feu $$0) {
      Path $$1 = this.m.u().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.m.a(this.w);
   }
}
