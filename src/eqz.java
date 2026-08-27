import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class eqz extends ghr {
   private static final ur a = ur.c("mco.selectServer.popup");
   private static final ur b = ur.c("mco.selectServer.close");
   private static final agi c = new agi("popup/background");
   private static final agi v = new agi("icon/trial_available");
   private static final ewm w = new ewm(new agi("widget/cross_button"), new agi("widget/cross_button_highlighted"));
   private static final int x = 236;
   private static final int y = 34;
   private static final int z = 6;
   private static final int A = 195;
   private static final int B = 152;
   private static final int C = 4;
   private static final int D = 10;
   private static final int E = 320;
   private static final int F = 172;
   private static final int G = 100;
   private static final int H = 99;
   private static final int I = 100;
   private static List<agi> J = List.of();
   private final fau K;
   private final boolean L;
   @Nullable
   private euz M;
   private int N;
   private int O;

   public eqz(fau $$0, boolean $$1) {
      super(a);
      this.K = $$0;
      this.L = $$1;
   }

   public static void a(aph $$0) {
      Collection<agi> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      J = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aP_() {
      this.K.a(this.f, this.g, this.h);
      if (this.L) {
         this.M = this.d(
            euz.a(ur.c("mco.selectServer.trial"), ezm.b(this, "https://aka.ms/startjavarealmstrial")).a(this.E() - 10 - 99, this.F() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.d(euz.a(ur.c("mco.selectServer.buy"), ezm.b(this, "https://aka.ms/BuyJavaRealms")).a(this.E() - 10 - 99, this.F() - 10 - 20, 99, 20).a());
      evl $$0 = this.d(new evl(this.C() + 4, this.D() + 4, 14, 14, w, $$0x -> this.aF_(), b));
      $$0.a(ewk.a(b));
      int $$1 = 142 - (this.L ? 40 : 20);
      evj $$2 = new evj(this.E() - 10 - 100, this.D() + 10, 100, $$1, a, this.i);
      if ($$2.u()) {
         $$2.d(100 - $$2.f());
      }

      this.d($$2);
   }

   @Override
   public void d() {
      super.d();
      if (++this.O > 100) {
         this.O = 0;
         this.N = (this.N + 1) % J.size();
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M != null) {
         a($$0, this.M);
      }
   }

   public static void a(euo $$0, euz $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(v, $$1.p() + $$1.k() - 8 - 4, $$1.r() + $$1.i() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      this.K.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, etd.a);
      this.a($$0);
      $$0.a(c, this.C(), this.D(), 320, 172);
      if (!J.isEmpty()) {
         $$0.a(J.get(this.N), this.C() + 10, this.D() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int C() {
      return (this.g - 320) / 2;
   }

   private int D() {
      return (this.h - 172) / 2;
   }

   private int E() {
      return this.C() + 320;
   }

   private int F() {
      return this.D() + 172;
   }

   @Override
   public void aF_() {
      this.f.a(this.K);
   }
}
