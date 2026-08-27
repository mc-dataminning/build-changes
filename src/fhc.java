import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhc extends flz {
   private static final akn a = new akn("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final flz v;
   @Nullable
   private final akn w;
   private final wx x;
   private final List<fhc.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final fjr B = fjr.d();

   fhc(flz $$0, int $$1, @Nullable akn $$2, wx $$3, wx $$4, List<fhc.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aG_() {
      super.aG_();
      this.v.o();
   }

   @Override
   protected void aN_() {
      this.B.a(12).c().b();
      this.B.a(new fgu(this.l.f().a(n.r), this.p).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fgn.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fgu(this.x, this.p).d(this.A).b(true));
      this.B.a(this.m());
      this.B.a($$1 -> {
         ffy var10000 = this.c($$1);
      });
      this.c();
   }

   private fjr m() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      fjr $$2 = fjr.e();
      $$2.a(6);

      for (fhc.b $$3 : this.y) {
         $$2.a(fga.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.m, this.n, this.o);
      this.B.a();
      fjl.a(this.B, this.G());
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, feb.a);
      this.b($$0);
      $$0.a(a, this.B.C() - 18, this.B.D() - 18, this.B.x() + 36, this.B.v() + 36);
   }

   @Override
   public wx i() {
      return ww.a(this.l, this.x);
   }

   @Override
   public void d() {
      if (this.z != null) {
         this.z.run();
      }

      this.m.a(this.v);
   }

   public static class a {
      private final flz a;
      private final wx b;
      private wx c = ww.a;
      private int d = 250;
      @Nullable
      private akn e;
      private final List<fhc.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(flz $$0, wx $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhc.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fhc.a a(akn $$0) {
         this.e = $$0;
         return this;
      }

      public fhc.a a(wx $$0) {
         this.c = $$0;
         return this;
      }

      public fhc.a a(wx $$0, Consumer<fhc> $$1) {
         this.f.add(new fhc.b($$0, $$1));
         return this;
      }

      public fhc.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fhc a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fhc(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wx a, Consumer<fhc> b) {
   }
}
