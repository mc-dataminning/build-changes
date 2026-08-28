import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class frp extends fwf {
   private static final ald a = ald.b("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int d = 6;
   private static final int s = 130;
   private static final int u = 64;
   private static final int v = 250;
   private final fwf w;
   @Nullable
   private final ald x;
   private final wv y;
   private final List<frp.b> z;
   @Nullable
   private final Runnable A;
   private final int B;
   private final fuf C = fuf.d();

   frp(fwf $$0, int $$1, @Nullable ald $$2, wv $$3, wv $$4, List<frp.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.w = $$0;
      this.x = $$2;
      this.y = $$4;
      this.z = $$5;
      this.A = $$6;
      this.B = $$1 - 36;
   }

   @Override
   public void aF_() {
      super.aF_();
      this.w.o();
   }

   @Override
   protected void aN_() {
      this.w.b(this.m, this.n, this.o);
      this.C.a(12).c().b();
      this.C.a(new frh(this.l.f().a(n.r), this.p).d(this.B).b(true));
      if (this.x != null) {
         this.C.a(fra.a(130, 64, this.x, 130, 64));
      }

      this.C.a(new frh(this.y, this.p).d(this.B).b(true));
      this.C.a(this.m());
      this.C.a($$1 -> {
         fql var10000 = this.c($$1);
      });
      this.c();
   }

   private fuf m() {
      int $$0 = 6 * (this.z.size() - 1);
      int $$1 = Math.min((this.B - $$0) / this.z.size(), 150);
      fuf $$2 = fuf.e();
      $$2.a(6);

      for (frp.b $$3 : this.z) {
         $$2.a(fqn.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.w.a(this.m, this.n, this.o);
      this.C.a();
      ftz.a(this.C, this.J());
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      this.w.a($$0, -1, -1, $$3);
      $$0.d();
      RenderSystem.clear(256);
      this.b($$0);
      $$0.a(goi::H, a, this.C.F() - 18, this.C.G() - 18, this.C.A() + 36, this.C.y() + 36);
   }

   @Override
   public wv i() {
      return wu.a(this.l, this.y);
   }

   @Override
   public void aK_() {
      if (this.A != null) {
         this.A.run();
      }

      this.m.a(this.w);
   }

   public static class a {
      private final fwf a;
      private final wv b;
      private wv c = wu.a;
      private int d = 250;
      @Nullable
      private ald e;
      private final List<frp.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fwf $$0, wv $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public frp.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public frp.a a(ald $$0) {
         this.e = $$0;
         return this;
      }

      public frp.a a(wv $$0) {
         this.c = $$0;
         return this;
      }

      public frp.a a(wv $$0, Consumer<frp> $$1) {
         this.f.add(new frp.b($$0, $$1));
         return this;
      }

      public frp.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public frp a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new frp(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(wv a, Consumer<frp> b) {
   }
}
