import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fpg extends ftw {
   private static final alz a = alz.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final ftw w;
   @Nullable
   private final alz x;
   private final xv y;
   private final List<fpg.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final frw C = frw.d();

   fpg(ftw $$0, int $$1, @Nullable alz $$2, xv $$3, xv $$4, List<fpg.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aK_() {
      super.aK_();
      this.w.n();
   }

   @Override
   protected void aT_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new foy(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(foq.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new foy(this.y, this.p).d(this.B).b(true));
      this.C.a(this.l());
      this.C.a($$1 -> {
         fob var10000 = this.c($$1);
      });
      this.c();
   }

   private frw l() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      frw $$2 = frw.e();
      $$2.a(6);

      for (fpg.b $$3 : this.z) {
         $$2.a(fod.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      frq.a(this.C, this.H());
   }

   @Override
   public void b(fnq $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(glt::B, a, this.C.D() - 18, this.C.E() - 18, this.C.y() + 36, this.C.w() + 36);
   }

   @Override
   public xv i() {
      return xu.a(this.l, this.y);
   }

   @Override
   public void aP_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final ftw a;
      private final xv b;
      private xv c = xu.a;
      private int d = 250;
      @Nullable
      private alz e;
      private final List<fpg.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(ftw $$0, xv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fpg.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fpg.a a(alz $$0) {
         this.e = $$0;
         return this;
      }

      public fpg.a a(xv $$0) {
         this.c = $$0;
         return this;
      }

      public fpg.a a(xv $$0, Consumer<fpg> $$1) {
         this.f.add(new fpg.b($$0, $$1));
         return this;
      }

      public fpg.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fpg a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fpg(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(xv a, Consumer<fpg> b) {
   }
}
