import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ffe extends hct {
   private static final xd a = xd.c("mco.selectServer.popup");
   private static final xd b = xd.c("mco.selectServer.close");
   private static final alb c = alb.b("popup/background");
   private static final alb B = alb.b("icon/trial_available");
   private static final fln C = new fln(alb.b("widget/cross_button"), alb.b("widget/cross_button_highlighted"));
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
   private static List<alb> P = List.of();
   private final fpt Q;
   private final boolean R;
   @Nullable
   private fka S;
   private int T;
   private int U;

   public ffe(fpt $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(aus $$0) {
      Collection<alb> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aT_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(fka.a(xd.c("mco.selectServer.trial"), fop.b(this, axy.q)).a(this.F() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a());
      }

      this.c(fka.a(xd.c("mco.selectServer.buy"), fop.b(this, axy.r)).a(this.F() - 10 - 99, this.G() - 10 - 20, 99, 20).a());
      fkm $$0 = this.c(new fkm(this.D() + 4, this.E() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(fll.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      fkk $$2 = new fkk(this.F() - 10 - 100, this.E() + 10, 100, $$1, a, this.p);
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
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fjn $$0, fka $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(ghe::C, B, $$1.D() + $$1.y() - 8 - 4, $$1.E() + $$1.w() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256);
      this.B();
      this.b($$0);
      $$0.a(ghe::C, c, this.D(), this.E(), 320, 172);
      if (!P.isEmpty()) {
         $$0.a(ghe::C, P.get(this.T), this.D() + 10, this.E() + 10, 0.0F, 0.0F, 195, 152, 195, 152);
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
