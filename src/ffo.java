import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ffo extends hdk {
   private static final xd a = xd.c("mco.selectServer.popup");
   private static final xd b = xd.c("mco.selectServer.close");
   private static final alc c = alc.b("popup/background");
   private static final alc B = alc.b("icon/trial_available");
   private static final flx C = new flx(alc.b("widget/cross_button"), alc.b("widget/cross_button_highlighted"));
   private static final int D = 236;
   private static final int E = 34;
   private static final int F = 6;
   private static final int G = 195;
   private static final int H = 152;
   private static final int I = 4;
   private static final int J = 10;
   private static final int K = 320;
   private static final int L = 172;
   private static final int M = 100;
   private static final int N = 99;
   private static final int O = 100;
   private static List<alc> P = List.of();
   private final fqd Q;
   private final boolean R;
   @Nullable
   private fkk S;
   private int T;
   private int U;

   public ffo(fqd $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(aut $$0) {
      Collection<alc> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aR_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(fkk.a(xd.c("mco.selectServer.trial"), fpa.b(this, axz.q)).a(this.F() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fkk.a(xd.c("mco.selectServer.buy"), fpa.b(this, axz.r)).a(this.F() - 10 - 99, this.G() - 10 - 20, 99, 20).a());
      fkw $$0 = this.c(new fkw(this.D() + 4, this.E() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(flv.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      fku $$2 = new fku(this.F() - 10 - 100, this.E() + 10, 100, $$1, a, this.p);
      if ($$2.j()) {
         $$2.k(100 - $$2.f());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.U > 100) {
         this.U = 0;
         this.T = (this.T + 1) % P.size();
      }
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fjx $$0, fkk $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(ghq::B, B, $$1.D() + $$1.y() - 8 - 4, $$1.E() + $$1.w() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fjx $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256);
      this.B();
      this.b($$0);
      $$0.a(ghq::B, c, this.D(), this.E(), 320, 172);
      if (!P.isEmpty()) {
         $$0.a(ghq::B, P.get(this.T), this.D() + 10, this.E() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int D() {
      return (this.n - 320) / 2;
   }

   private int E() {
      return (this.o - 172) / 2;
   }

   private int F() {
      return this.D() + 320;
   }

   private int G() {
      return this.E() + 172;
   }

   @Override
   public void d() {
      this.m.a(this.Q);
   }
}
