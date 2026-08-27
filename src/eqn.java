import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class eqn extends ghe {
   private static final ur a = ur.c("mco.selectServer.popup");
   private static final ur b = ur.c("mco.selectServer.close");
   private static final agg c = new agg("popup/background");
   private static final agg v = new agg("icon/trial_available");
   private static final evz w = new evz(new agg("widget/cross_button"), new agg("widget/cross_button_highlighted"));
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
   private static List<agg> J = List.of();
   private final fah K;
   private final boolean L;
   @Nullable
   private eum M;
   private int N;
   private int O;

   public eqn(fah $$0, boolean $$1) {
      super(a);
      this.K = $$0;
      this.L = $$1;
   }

   public static void a(apd $$0) {
      Collection<agg> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      J = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aO_() {
      this.K.a(this.f, this.g, this.h);
      if (this.L) {
         this.M = this.d(
            eum.a(ur.c("mco.selectServer.trial"), eyz.b(this, "https://aka.ms/startjavarealmstrial")).a(this.E() - 10 - 99, this.F() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.d(eum.a(ur.c("mco.selectServer.buy"), eyz.b(this, "https://aka.ms/BuyJavaRealms")).a(this.E() - 10 - 99, this.F() - 10 - 20, 99, 20).a());
      euy $$0 = this.d(new euy(this.C() + 4, this.D() + 4, 14, 14, w, $$0x -> this.aE_(), b));
      $$0.a(evx.a(b));
      int $$1 = 142 - (this.L ? 40 : 20);
      euw $$2 = new euw(this.E() - 10 - 100, this.D() + 10, 100, $$1, a, this.i);
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
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M != null) {
         a($$0, this.M);
      }
   }

   public static void a(eub $$0, eum $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(v, $$1.p() + $$1.k() - 8 - 4, $$1.r() + $$1.i() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      this.K.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, esr.a);
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
   public void aE_() {
      this.f.a(this.K);
   }
}
