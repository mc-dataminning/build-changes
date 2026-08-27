import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nullable;

public class eok extends ged {
   private static final te a = te.c("mco.selectServer.popup");
   private static final te b = te.c("mco.selectServer.close");
   private static final aep c = new aep("popup/background");
   private static final aep y = new aep("icon/trial_available");
   private static final ett z = new ett(new aep("widget/cross_button"), new aep("widget/cross_button_highlighted"));
   private static final int A = 236;
   private static final int B = 34;
   private static final int C = 6;
   private static final int D = 195;
   private static final int E = 152;
   private static final int F = 4;
   private static final int G = 10;
   private static final int H = 320;
   private static final int I = 172;
   private static final int J = 99;
   private static final int K = 99;
   private static final int L = 100;
   private static List<aep> M = List.of();
   private final exv N;
   private final boolean O;
   @Nullable
   private esi P;
   private int Q;
   private int R;

   public eok(exv $$0, boolean $$1) {
      super(a);
      this.N = $$0;
      this.O = $$1;
   }

   public static void a(ank $$0) {
      Collection<aep> $$1 = $$0.b("textures/gui/images", $$0x -> $$0x.a().endsWith(".png")).keySet();
      M = $$1.stream().filter($$0x -> $$0x.b().equals("realms")).toList();
   }

   @Override
   protected void aE_() {
      this.N.a(this.f, this.g, this.h);
      if (this.O) {
         this.P = this.d(esi.a(te.c("mco.selectServer.trial"), $$0x -> this.f.a(new ewn($$0xx -> {
               if ($$0xx) {
                  ac.i().a("https://aka.ms/startjavarealmstrial");
               }

               this.f.a(this);
            }, "https://aka.ms/startjavarealmstrial", true))).a(this.D() - 10 - 99, this.E() - 10 - 4 - 40, 99, 20).a());
      }

      this.d(esi.a(te.c("mco.selectServer.buy"), $$0x -> this.f.a(new ewn($$0xx -> {
            if ($$0xx) {
               ac.i().a("https://aka.ms/BuyJavaRealms");
            }

            this.f.a(this);
         }, "https://aka.ms/BuyJavaRealms", true))).a(this.D() - 10 - 99, this.E() - 10 - 20, 99, 20).a());
      esu $$0 = this.d(new esu(this.B() + 4, this.C() + 4, 14, 14, z, $$0x -> this.au_(), b));
      $$0.a(etr.a(b));
      this.d(new ess(this.D() - 10 - 99, this.C() + 10, 99, 127, a, this.i));
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
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.P != null) {
         a($$0, this.P);
      }
   }

   public static void a(erx $$0, esi $$1) {
      int $$2 = 8;
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 110.0F);
      $$0.a(y, $$1.p() + $$1.k() - 8 - 4, $$1.r() + $$1.h() / 2 - 4, 8, 8);
      $$0.c().b();
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      this.N.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eqn.a);
      this.a($$0);
      $$0.a(c, this.B(), this.C(), 320, 172);
      if (!M.isEmpty()) {
         $$0.a(M.get(this.Q), this.B() + 10, this.C() + 10, 0, 0.0F, 0.0F, 195, 152, 195, 152);
      }
   }

   private int B() {
      return (this.g - 320) / 2;
   }

   private int C() {
      return (this.h - 172) / 2;
   }

   private int D() {
      return this.B() + 320;
   }

   private int E() {
      return this.C() + 172;
   }

   @Override
   public void au_() {
      this.f.a(this.N);
   }
}
