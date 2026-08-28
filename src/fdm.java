import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fdm extends gwj {
   private static final wy a = wy.c("mco.selectServer.popup");
   private static final wy b = wy.c("mco.selectServer.close");
   private static final akq c = akq.b("popup/background");
   private static final akq A = akq.b("icon/trial_available");
   private static final fjt B = new fjt(akq.b("widget/cross_button"), akq.b("widget/cross_button_highlighted"));
   private static final int C = 236;
   private static final int D = 34;
   private static final int E = 6;
   private static final int F = 195;
   private static final int G = 152;
   private static final int H = 4;
   private static final int I = 10;
   private static final int J = 320;
   private static final int K = 172;
   private static final int L = 100;
   private static final int M = 99;
   private static final int N = 100;
   private static List<akq> O = List.of();
   private final fnx P;
   private final boolean Q;
   @Nullable
   private fig R;
   private int S;
   private int T;

   public fdm(fnx $$0, boolean $$1) {
      super(a);
      this.P = $$0;
      this.Q = $$1;
   }

   public static void a(aud $$0) {
      Collection<akq> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      O = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aP_() {
      this.P.a(this.l, this.m, this.n);
      if (this.Q) {
         this.R = this.c(
            fig.a(wy.c("mco.selectServer.trial"), fmu.b(this, "https://aka.ms/startjavarealmstrial")).a(this.F() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fig.a(wy.c("mco.selectServer.buy"), fmu.b(this, "https://aka.ms/BuyJavaRealms")).a(this.F() - 10 - 99, this.G() - 10 - 20, 99, 20).a());
      fis $$0 = this.c(new fis(this.D() + 4, this.E() + 4, 14, 14, B, $$0x -> this.d(), b));
      $$0.a(fjr.a(b));
      int $$1 = 142 - (this.Q ? 40 : 20);
      fiq $$2 = new fiq(this.F() - 10 - 100, this.E() + 10, 100, $$1, a, this.o);
      if ($$2.j()) {
         $$2.k(100 - $$2.f());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.T > 100) {
         this.T = 0;
         this.S = (this.S + 1) % O.size();
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.R != null) {
         a($$0, this.R);
      }
   }

   public static void a(fht $$0, fig $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(A, $$1.D() + $$1.y() - 8 - 4, $$1.E() + $$1.w() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
      this.P.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fgi.a);
      this.B();
      this.b($$0);
      $$0.a(c, this.D(), this.E(), 320, 172);
      if (!O.isEmpty()) {
         $$0.a(O.get(this.S), this.D() + 10, this.E() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int D() {
      return (this.m - 320) / 2;
   }

   private int E() {
      return (this.n - 172) / 2;
   }

   private int F() {
      return this.D() + 320;
   }

   private int G() {
      return this.E() + 172;
   }

   @Override
   public void d() {
      this.l.a(this.P);
   }
}
