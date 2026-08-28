import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fqs extends fvi {
   private static final aku a = aku.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fvi w;
   @Nullable
   private final aku x;
   private final wp y;
   private final List<fqs.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fti C = fti.d();

   fqs(fvi $$0, int $$1, @Nullable aku $$2, wp $$3, wp $$4, List<fqs.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aJ_() {
      super.aJ_();
      this.w.o();
   }

   @Override
   protected void aR_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fqk(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fqd.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fqk(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fpo var10000 = this.c($$1);
      });
      this.c();
   }

   private fti m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fti $$2 = fti.e();
      $$2.a(6);

      for (fqs.b $$3 : this.z) {
         $$2.a(fpq.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      ftc.a(this.C, this.J());
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(gnh::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public wp i() {
      return wo.a(this.l, this.y);
   }

   @Override
   public void aO_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final fvi a;
      private final wp b;
      private wp c = wo.a;
      private int d = 250;
      @Nullable
      private aku e;
      private final List<fqs.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fvi $$0, wp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fqs.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fqs.a a(aku $$0) {
         this.e = $$0;
         return this;
      }

      public fqs.a a(wp $$0) {
         this.c = $$0;
         return this;
      }

      public fqs.a a(wp $$0, Consumer<fqs> $$1) {
         this.f.add(new fqs.b($$0, $$1));
         return this;
      }

      public fqs.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fqs a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fqs(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wp a, Consumer<fqs> b) {
   }
}
