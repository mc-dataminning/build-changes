import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fnv extends hrc {
   private static final xg a = xg.c("mco.selectServer.popup");
   private static final xg b = xg.c("mco.selectServer.close");
   private static final alr c = alr.b("popup/background");
   private static final alr C = alr.b("icon/trial_available");
   private static final fvl D = new fvl(alr.b("widget/cross_button"), alr.b("widget/cross_button_highlighted"));
   private static final int E = 236;
   private static final int F = 34;
   private static final int G = 6;
   private static final int H = 195;
   private static final int I = 152;
   private static final int J = 4;
   private static final int K = 10;
   private static final int L = 320;
   private static final int M = 172;
   private static final int N = 100;
   private static final int O = 99;
   private static final int P = 100;
   private static List<alr> Q = List.of();
   private final fzq R;
   private final boolean S;
   @Nullable
   private fty T;
   private int U;
   private int V;

   public fnv(fzq $$0, boolean $$1) {
      super(a);
      this.R = $$0;
      this.S = $$1;
   }

   public static void a(avo $$0) {
      Collection<alr> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      Q = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aO_() {
      this.R.a(this.m, this.n, this.o);
      if (this.S) {
         this.T = this.c(fty.a(xg.c("mco.selectServer.trial"), fyn.b(this, ayt.q)).a(this.G() - 10 - 99, this.H() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fty.a(xg.c("mco.selectServer.buy"), fyn.b(this, ayt.r)).a(this.G() - 10 - 99, this.H() - 10 - 20, 99, 20).a());
      fuk $$0 = this.c(new fuk(this.E() + 4, this.F() + 4, 14, 14, D, $$0x -> this.aL_(), b));
      $$0.a(fvj.a(b));
      int $$1 = 142 - (this.S ? 40 : 20);
      fui $$2 = new fui(this.G() - 10 - 100, this.F() + 10, 100, $$1, a, this.p);
      if ($$2.q()) {
         $$2.h(94);
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.V > 100) {
         this.V = 0;
         this.U = (this.U + 1) % Q.size();
      }
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.T != null) {
         a($$0, this.T);
      }
   }

   public static void a(ftk $$0, fty $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(gry::H, C, $$1.F() + $$1.A() - 8 - 4, $$1.G() + $$1.y() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      this.R.a($$0, -1, -1, $$3);
      $$0.d();
      fjr $$4 = this.m.h();
      RenderSystem.getDevice().createCommandEncoder().clearDepthTexture($$4.d(), 1.0);
      this.A();
      this.b($$0);
      $$0.a(gry::H, c, this.E(), this.F(), 320, 172);
      if (!Q.isEmpty()) {
         $$0.a(gry::H, Q.get(this.U), this.E() + 10, this.F() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.n - 320) / 2;
   }

   private int F() {
      return (this.o - 172) / 2;
   }

   private int G() {
      return this.E() + 320;
   }

   private int H() {
      return this.F() + 172;
   }

   @Override
   public void aL_() {
      this.m.a(this.R);
   }
}
