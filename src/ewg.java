import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class ewg extends gob {
   private static final vs a = vs.c("mco.selectServer.popup");
   private static final vs b = vs.c("mco.selectServer.close");
   private static final ajc c = new ajc("popup/background");
   private static final ajc v = new ajc("icon/trial_available");
   private static final fbx w = new fbx(new ajc("widget/cross_button"), new ajc("widget/cross_button_highlighted"));
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
   private static List<ajc> J = List.of();
   private final fgh K;
   private final boolean L;
   @Nullable
   private fak M;
   private int N;
   private int O;

   public ewg(fgh $$0, boolean $$1) {
      super(a);
      this.K = $$0;
      this.L = $$1;
   }

   public static void a(asf $$0) {
      Collection<ajc> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      J = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aP_() {
      this.K.a(this.f, this.g, this.h);
      if (this.L) {
         this.M = this.c(
            fak.a(vs.c("mco.selectServer.trial"), fez.b(this, "https://aka.ms/startjavarealmstrial")).a(this.I() - 10 - 99, this.J() - 10 - 4 - 40, 99, 20).a()
         );
      }

      this.c(fak.a(vs.c("mco.selectServer.buy"), fez.b(this, "https://aka.ms/BuyJavaRealms")).a(this.I() - 10 - 99, this.J() - 10 - 20, 99, 20).a());
      faw $$0 = this.c(new faw(this.E() + 4, this.H() + 4, 14, 14, w, $$0x -> this.d(), b));
      $$0.a(fbv.a(b));
      int $$1 = 142 - (this.L ? 40 : 20);
      fau $$2 = new fau(this.I() - 10 - 100, this.H() + 10, 100, $$1, a, this.i);
      if ($$2.j()) {
         $$2.k(100 - $$2.f());
      }

      this.c($$2);
   }

   @Override
   public void e() {
      super.e();
      if (++this.O > 100) {
         this.O = 0;
         this.N = (this.N + 1) % J.size();
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.M != null) {
         a($$0, this.M);
      }
   }

   public static void a(ezx $$0, fak $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(v, $$1.B() + $$1.w() - 8 - 4, $$1.C() + $$1.u() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.K.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eyk.a);
      this.a($$0);
      $$0.a(c, this.E(), this.H(), 320, 172);
      if (!J.isEmpty()) {
         $$0.a(J.get(this.N), this.E() + 10, this.H() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int E() {
      return (this.g - 320) / 2;
   }

   private int H() {
      return (this.h - 172) / 2;
   }

   private int I() {
      return this.E() + 320;
   }

   private int J() {
      return this.H() + 172;
   }

   @Override
   public void d() {
      this.f.a(this.K);
   }
}
