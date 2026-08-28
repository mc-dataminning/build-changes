import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fnf extends frw {
   private static final alj a = alj.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final frw w;
   @Nullable
   private final alj x;
   private final xj y;
   private final List<fnf.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fpw C = fpw.d();

   fnf(frw $$0, int $$1, @Nullable alj $$2, xj $$3, xj $$4, List<fnf.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aI_() {
      super.aI_();
      this.w.o();
   }

   @Override
   protected void aR_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new fmx(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fmq.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new fmx(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fmb var10000 = this.c($$1);
      });
      this.c();
   }

   private fpw m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fpw $$2 = fpw.e();
      $$2.a(6);

      for (fnf.b $$3 : this.z) {
         $$2.a(fmd.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      fpq.a(this.C, this.H());
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(gjq::B, a, this.C.D() - 18, this.C.E() - 18, this.C.y() + 36, this.C.w() + 36);
   }

   @Override
   public xj i() {
      return xi.a(this.l, this.y);
   }

   @Override
   public void aO_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final frw a;
      private final xj b;
      private xj c = xi.a;
      private int d = 250;
      @Nullable
      private alj e;
      private final List<fnf.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(frw $$0, xj $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fnf.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fnf.a a(alj $$0) {
         this.e = $$0;
         return this;
      }

      public fnf.a a(xj $$0) {
         this.c = $$0;
         return this;
      }

      public fnf.a a(xj $$0, Consumer<fnf> $$1) {
         this.f.add(new fnf.b($$0, $$1));
         return this;
      }

      public fnf.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fnf a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fnf(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xj a, Consumer<fnf> b) {
   }
}
