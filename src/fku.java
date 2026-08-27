import java.nio.file.Path;
import javax.annotation.Nullable;

public class fku extends fgh {
   private static final int a = 8;
   private static final vs b = vs.c("telemetry_info.screen.title");
   private static final vs c = vs.c("telemetry_info.screen.description").a(n.h);
   private static final vs k = vs.c("telemetry_info.button.privacy_statement");
   private static final vs l = vs.c("telemetry_info.button.give_feedback");
   private static final vs m = vs.c("telemetry_info.button.show_data");
   private static final vs n = vs.c("telemetry_info.opt_in.description");
   private final fgh o;
   private final eyo p;
   @Nullable
   private fkt q;
   private double r;

   public fku(fgh $$0, eyo $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public vs i() {
      return vr.a(super.i(), c);
   }

   @Override
   protected void aP_() {
      fdu $$0 = new fdu();
      $$0.c().a(8);
      $$0.a(this.h);
      fea $$1 = $$0.a(fea.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new fbr(this.p(), this.i));
      $$1.a(new fbe(c, this.i).c(this.g - 16).b(true));
      fdv $$2 = this.a(fak.a(k, this::b).a(), fak.a(l, this::c).a());
      $$1.a($$2);
      fdx $$3 = this.o();
      $$0.a();
      $$3.a();
      int $$4 = $$2.C() + $$2.u();
      int $$5 = $$3.u();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new fkt(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      fdu.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
   }

   @Override
   protected void aG_() {
      this.b(this.q);
   }

   private fdx o() {
      fea $$0 = fea.d();
      $$0.c().b().e(4);
      if (this.f.C()) {
         $$0.a(this.E());
      }

      $$0.a(this.a(fak.a(m, this::d).a(), fak.a(vr.d, this::a).a()));
      return $$0;
   }

   private fai E() {
      eyn<Boolean> $$0 = this.p.af();
      fam $$1 = fam.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.j = this.f.C();
      return $$1;
   }

   private void a(fai $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(fak $$0) {
      this.f.a(this.o);
   }

   private void b(fak $$0) {
      fez.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(fak $$0) {
      fez.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(fak $$0) {
      Path $$1 = this.f.t().b();
      ac.j().a($$1.toUri());
   }

   @Override
   public void d() {
      this.f.a(this.o);
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private fdv a(fai $$0, fai $$1) {
      fdv $$2 = new fdv();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
