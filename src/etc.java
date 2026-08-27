import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class etc extends gkn {
   private static final vf a = vf.c("mco.selectServer.popup");
   private static final vf b = vf.c("mco.selectServer.close");
   private static final ahg c = new ahg("popup/background");
   private static final ahg v = new ahg("icon/trial_available");
   private static final eyr w = new eyr(new ahg("widget/cross_button"), new ahg("widget/cross_button_highlighted"));
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
   private static List<ahg> J = List.of();
   private final fcz K;
   private final boolean L;
   @Nullable
   private exe M;
   private int N;
   private int O;

   public etc(fcz $$0, boolean $$1) {
      super(a);
      this.K = $$0;
      this.L = $$1;
   }

   public static void a(aqh $$0) {
      Collection<ahg> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      J = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aN_() {
      this.K.a(this.f, this.g, this.h);
      if (this.L) {
         this.M = this.d(
            exe.a(vf.c("mco.selectServer.trial"), fbr.b(this, "https://aka.ms/startjavarealmstrial")).a(this.E() - 10 - 99, this.H() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.d(exe.a(vf.c("mco.selectServer.buy"), fbr.b(this, "https://aka.ms/BuyJavaRealms")).a(this.E() - 10 - 99, this.H() - 10 - 20, 99, 20).a());
      exq $$0 = this.d(new exq(this.C() + 4, this.D() + 4, 14, 14, w, $$0x -> this.aE_(), b));
      $$0.a(eyp.a(b));
      int $$1 = 142 - (this.L ? 40 : 20);
      exo $$2 = new exo(this.E() - 10 - 100, this.D() + 10, 100, $$1, a, this.i);
      if ($$2.j()) {
         $$2.l(100 - $$2.f());
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
   public void a(ews $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M != null) {
         a($$0, this.M);
      }
   }

   public static void a(ews $$0, exe $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(v, $$1.B() + $$1.w() - 8 - 4, $$1.C() + $$1.u() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(ews $$0, int $$1, int $$2, float $$3) {
      this.K.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, evg.a);
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

   private int H() {
      return this.D() + 172;
   }

   @Override
   public void aE_() {
      this.f.a(this.K);
   }
}
