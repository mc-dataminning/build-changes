import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fhb extends fly {
   private static final akm a = new akm("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int r = 130;
   private static final int s = 64;
   private static final int u = 250;
   private final fly v;
   @Nullable
   private final akm w;
   private final wx x;
   private final List<fhb.b> y;
   @Nullable
   private final Runnable z;
   private final int A;
   private final fjq B = fjq.d();

   fhb(fly $$0, int $$1, @Nullable akm $$2, wx $$3, wx $$4, List<fhb.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.v = $$0;
      this.w = $$2;
      this.x = $$4;
      this.y = $$5;
      this.z = $$6;
      this.A = $$1 - 36;
   }

   @Override
   public void aF_() {
      super.aF_();
      this.v.o();
   }

   @Override
   protected void aM_() {
      this.B.a(12).c().b();
      this.B.a(new fgt(this.l.f().a(n.r), this.p).d(this.A).b(true));
      if (this.w != null) {
         this.B.a(fgm.a(130, 64, this.w, 130, 64));
      }

      this.B.a(new fgt(this.x, this.p).d(this.A).b(true));
      this.B.a(this.m());
      this.B.a($$1 -> {
         ffx var10000 = this.c($$1);
      });
      this.c();
   }

   private fjq m() {
      int $$0 = 6 * (this.y.size() - 1);
      int $$1 = Math.min((this.A - $$0) / this.y.size(), 150);
      fjq $$2 = fjq.e();
      $$2.a(6);

      for (fhb.b $$3 : this.y) {
         $$2.a(ffz.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.v.a(this.m, this.n, this.o);
      this.B.a();
      fjk.a(this.B, this.G());
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      this.v.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, fdz.a);
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
      private final fly a;
      private final wx b;
      private wx c = ww.a;
      private int d = 250;
      @Nullable
      private akm e;
      private final List<fhb.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fly $$0, wx $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fhb.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fhb.a a(akm $$0) {
         this.e = $$0;
         return this;
      }

      public fhb.a a(wx $$0) {
         this.c = $$0;
         return this;
      }

      public fhb.a a(wx $$0, Consumer<fhb> $$1) {
         this.f.add(new fhb.b($$0, $$1));
         return this;
      }

      public fhb.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fhb a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fhb(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wx a, Consumer<fhb> b) {
   }
}
