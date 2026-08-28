import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class fcs extends gvm {
   private static final wu a = wu.c("mco.selectServer.popup");
   private static final wu b = wu.c("mco.selectServer.close");
   private static final akk c = new akk("popup/background");
   private static final akk A = new akk("icon/trial_available");
   private static final fiz B = new fiz(new akk("widget/cross_button"), new akk("widget/cross_button_highlighted"));
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
   private static List<akk> O = List.of();
   private final fnd P;
   private final boolean Q;
   @Nullable
   private fhm R;
   private int S;
   private int T;

   public fcs(fnd $$0, boolean $$1) {
      super(a);
      this.P = $$0;
      this.Q = $$1;
   }

   public static void a(atu $$0) {
      Collection<akk> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      O = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aO_() {
      this.P.a(this.l, this.m, this.n);
      if (this.Q) {
         this.R = this.c(
            fhm.a(wu.c("mco.selectServer.trial"), fma.b(this, "https://aka.ms/startjavarealmstrial")).a(this.G() - 10 - 99, this.J() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fhm.a(wu.c("mco.selectServer.buy"), fma.b(this, "https://aka.ms/BuyJavaRealms")).a(this.G() - 10 - 99, this.J() - 10 - 20, 99, 20).a());
      fhy $$0 = this.c(new fhy(this.E() + 4, this.F() + 4, 14, 14, B, $$0x -> this.d(), b));
      $$0.a(fix.a(b));
      int $$1 = 142 - (this.Q ? 40 : 20);
      fhw $$2 = new fhw(this.G() - 10 - 100, this.F() + 10, 100, $$1, a, this.o);
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
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.R != null) {
         a($$0, this.R);
      }
   }

   public static void a(fgz $$0, fhm $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(A, $$1.D() + $$1.y() - 8 - 4, $$1.E() + $$1.w() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(fgz $$0, int $$1, int $$2, float $$3) {
      this.P.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, ffn.a);
      this.C();
      this.b($$0);
      $$0.a(c, this.E(), this.F(), 320, 172);
      if (!O.isEmpty()) {
         $$0.a(O.get(this.S), this.E() + 10, this.F() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.m - 320) / 2;
   }

   private int F() {
      return (this.n - 172) / 2;
   }

   private int G() {
      return this.E() + 320;
   }

   private int J() {
      return this.F() + 172;
   }

   @Override
   public void d() {
      this.l.a(this.P);
   }
}
