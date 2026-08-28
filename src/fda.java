import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fda extends gvf {
   private static final xo a = xo.c("mco.selectServer.popup");
   private static final xo b = xo.c("mco.selectServer.close");
   private static final ale c = new ale("popup/background");
   private static final ale B = new ale("icon/trial_available");
   private static final fiq C = new fiq(new ale("widget/cross_button"), new ale("widget/cross_button_highlighted"));
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
   private static List<ale> P = List.of();
   private final fnc Q;
   private final boolean R;
   @Nullable
   private fhd S;
   private int T;
   private int U;

   public fda(fnc $$0, boolean $$1) {
      super(a);
      this.Q = $$0;
      this.R = $$1;
   }

   public static void a(auo $$0) {
      Collection<ale> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      P = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aM_() {
      this.Q.a(this.m, this.n, this.o);
      if (this.R) {
         this.S = this.c(
            fhd.a(xo.c("mco.selectServer.trial"), flt.b(this, "https://aka.ms/startjavarealmstrial")).a(this.I() - 10 - 99, this.J() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fhd.a(xo.c("mco.selectServer.buy"), flt.b(this, "https://aka.ms/BuyJavaRealms")).a(this.I() - 10 - 99, this.J() - 10 - 20, 99, 20).a());
      fhp $$0 = this.c(new fhp(this.E() + 4, this.F() + 4, 14, 14, C, $$0x -> this.d(), b));
      $$0.a(fio.a(b));
      int $$1 = 142 - (this.R ? 40 : 20);
      fhn $$2 = new fhn(this.I() - 10 - 100, this.F() + 10, 100, $$1, a, this.p);
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.S != null) {
         a($$0, this.S);
      }
   }

   public static void a(fgq $$0, fhd $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(B, $$1.C() + $$1.x() - 8 - 4, $$1.D() + $$1.v() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fgq $$0, int $$1, int $$2, float $$3) {
      this.Q.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, ffe.a);
      this.C();
      this.b($$0);
      $$0.a(c, this.E(), this.F(), 320, 172);
      if (!P.isEmpty()) {
         $$0.a(P.get(this.T), this.E() + 10, this.F() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.n - 320) / 2;
   }

   private int F() {
      return (this.o - 172) / 2;
   }

   private int I() {
      return this.E() + 320;
   }

   private int J() {
      return this.F() + 172;
   }

   @Override
   public void d() {
      this.m.a(this.Q);
   }
}
