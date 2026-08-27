import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class eom extends gex {
   private static final tl a = tl.c("mco.selectServer.popup");
   private static final tl b = tl.c("mco.selectServer.close");
   private static final aez c = new aez("popup/background");
   private static final aez y = new aez("icon/trial_available");
   private static final etx z = new etx(new aez("widget/cross_button"), new aez("widget/cross_button_highlighted"));
   private static final int A = 236;
   private static final int B = 34;
   private static final int C = 6;
   private static final int D = 195;
   private static final int E = 152;
   private static final int F = 4;
   private static final int G = 10;
   private static final int H = 320;
   private static final int I = 172;
   private static final int J = 100;
   private static final int K = 99;
   private static final int L = 100;
   private static List<aez> M = List.of();
   private final eye N;
   private final boolean O;
   @Nullable
   private esk P;
   private int Q;
   private int R;

   public eom(eye $$0, boolean $$1) {
      super(a);
      this.N = $$0;
      this.O = $$1;
   }

   public static void a(anw $$0) {
      Collection<aez> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      M = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aH_() {
      this.N.a(this.f, this.g, this.h);
      if (this.O) {
         this.P = this.d(esk.a(tl.c("mco.selectServer.trial"), $$0x -> this.f.a(new ewx($$0xx -> {
               if ($$0xx) {
                  ac.i().a("https://aka.ms/startjavarealmstrial");
               }

               this.f.a(this);
            }, "https://aka.ms/startjavarealmstrial", true))).a(this.F() - 10 - 99, this.G() - 10 - 4 - 40, 99, 20).a());
      }

      this.a(this.d(esk.a(tl.c("mco.selectServer.buy"), $$0x -> this.f.a(new ewx($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/BuyJavaRealms");
            }

            this.f.a(this);
         }, "https://aka.ms/BuyJavaRealms", true))).a(this.F() - 10 - 99, this.G() - 10 - 20, 99, 20).a()));
      esw $$0 = this.d(new esw(this.D() + 4, this.E() + 4, 14, 14, z, $$0x -> this.az_(), b));
      $$0.a(etv.a(b));
      int $$1 = 142 - (this.O ? 40 : 20);
      esu $$2 = new esu(this.F() - 10 - 100, this.E() + 10, 100, $$1, a, this.i);
      if ($$2.v()) {
         $$2.d(100 - $$2.f());
      }

      this.d($$2);
   }

   @Override
   public void c() {
      super.c();
      if (++this.R > 100) {
         this.R = 0;
         this.Q = (this.Q + 1) % M.size();
      }
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.P != null) {
         a($$0, this.P);
      }
   }

   public static void a(erz $$0, esk $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(y, $$1.r() + $$1.l() - 8 - 4, $$1.t() + $$1.i() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      this.N.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eqp.a);
      this.a($$0);
      $$0.a(c, this.D(), this.E(), 320, 172);
      if (!M.isEmpty()) {
         $$0.a(M.get(this.Q), this.D() + 10, this.E() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int D() {
      return (this.g - 320) / 2;
   }

   private int E() {
      return (this.h - 172) / 2;
   }

   private int F() {
      return this.D() + 320;
   }

   private int G() {
      return this.E() + 172;
   }

   @Override
   public void az_() {
      this.f.a(this.N);
   }
}
