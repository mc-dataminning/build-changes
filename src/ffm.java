import java.nio.file.Path;
import javax.annotation.Nullable;

public class ffm extends faz {
   private static final int a = 8;
   private static final uv b = uv.c("telemetry_info.screen.title");
   private static final uv c = uv.c("telemetry_info.screen.description").a(n.h);
   private static final uv k = uv.c("telemetry_info.button.privacy_statement");
   private static final uv l = uv.c("telemetry_info.button.give_feedback");
   private static final uv m = uv.c("telemetry_info.button.show_data");
   private static final uv n = uv.c("telemetry_info.opt_in.description");
   private final faz o;
   private final etm p;
   @Nullable
   private ffl q;
   private double r;

   public ffm(faz $$0, etm $$1) {
      super(b);
      this.o = $$0;
      this.p = $$1;
   }

   @Override
   public uv h() {
      return uu.a(super.h(), c);
   }

   @Override
   protected void aQ_() {
      eym $$0 = new eym();
      $$0.c().a(8);
      $$0.a(this.h);
      eys $$1 = $$0.a(eys.d(), $$0.b().a(0.5F, 0.0F));
      $$1.c().b().e(8);
      $$1.a(new ewl(this.m(), this.i));
      $$1.a(new evy(c, this.i).j(this.g - 16).b(true));
      eyn $$2 = this.a(eve.a(k, this::b).a(), eve.a(l, this::c).a());
      $$1.a($$2);
      eyp $$3 = this.l();
      $$0.a();
      $$3.a();
      int $$4 = $$2.r() + $$2.i();
      int $$5 = $$3.i();
      int $$6 = this.h - $$4 - $$5 - 16;
      this.q = new ffl(0, 0, this.g - 40, $$6, this.f.h);
      this.q.a(this.r);
      this.q.a($$0x -> this.r = $$0x);
      this.c(this.q);
      $$1.a(this.q);
      $$1.a($$3);
      $$0.a();
      eym.a($$0, 0, 0, this.g, this.h, 0.5F, 0.0F);
      $$0.a($$1x -> {
         evc var10000 = this.d($$1x);
      });
   }

   private eyp l() {
      eys $$0 = eys.d();
      $$0.c().b().e(4);
      if (this.f.A()) {
         $$0.a(this.C());
      }

      $$0.a(this.a(eve.a(m, this::d).a(), eve.a(uu.d, this::a).a()));
      return $$0;
   }

   private evc C() {
      etl<Boolean> $$0 = this.p.af();
      evg $$1 = evg.a(n, this.f.h).a($$0).a(this::a).a();
      $$1.i = this.f.A();
      return $$1;
   }

   private void a(evc $$0, boolean $$1) {
      if (this.q != null) {
         this.q.b($$1);
      }
   }

   private void a(eve $$0) {
      this.f.a(this.o);
   }

   private void b(eve $$0) {
      ezr.a(this, "http://go.microsoft.com/fwlink/?LinkId=521839");
   }

   private void c(eve $$0) {
      ezr.a(this, "https://aka.ms/javafeedback?ref=game");
   }

   private void d(eve $$0) {
      Path $$1 = this.f.t().b();
      ac.i().a($$1.toUri());
   }

   @Override
   public void aG_() {
      this.f.a(this.o);
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      this.b($$0);
   }

   private eyn a(evc $$0, evc $$1) {
      eyn $$2 = new eyn();
      $$2.c().b().f(4);
      $$2.a($$0, 0, 0);
      $$2.a($$1, 0, 1);
      return $$2;
   }
}
