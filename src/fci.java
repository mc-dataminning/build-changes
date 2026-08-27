import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fci extends fhf {
   private static final ajh a = new ajh("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final fhf o;
   @Nullable
   private final ajh p;
   private final vu q;
   private final List<fci.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final fex v = fex.d();

   fci(fhf $$0, int $$1, @Nullable ajh $$2, vu $$3, vu $$4, List<fci.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   public void aG_() {
      super.aG_();
      this.o.q();
   }

   @Override
   protected void aO_() {
      this.v.a(12).c().b();
      this.v.a(new fca(this.e.f().a(n.r), this.i).c(this.u).b(true));
      if (this.p != null) {
         this.v.a(fbt.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new fca(this.q, this.i).c(this.u).b(true));
      this.v.a(this.o());
      this.v.a($$1 -> {
         fbe var10000 = this.c($$1);
      });
      this.c();
   }

   private fex o() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      fex $$2 = fex.e();
      $$2.a(6);

      for (fci.b $$3 : this.r) {
         $$2.a(fbg.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      fer.a(this.v, this.F());
   }

   @Override
   public void b(fat $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, ezg.a);
      this.a($$0);
      $$0.a(a, this.v.B() - 18, this.v.C() - 18, this.v.w() + 36, this.v.u() + 36);
   }

   @Override
   public vu i() {
      return vt.a(this.e, this.q);
   }

   @Override
   public void d() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final fhf a;
      private final vu b;
      private vu c = vt.a;
      private int d = 250;
      @Nullable
      private ajh e;
      private final List<fci.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fhf $$0, vu $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fci.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fci.a a(ajh $$0) {
         this.e = $$0;
         return this;
      }

      public fci.a a(vu $$0) {
         this.c = $$0;
         return this;
      }

      public fci.a a(vu $$0, Consumer<fci> $$1) {
         this.f.add(new fci.b($$0, $$1));
         return this;
      }

      public fci.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fci a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fci(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(vu a, Consumer<fci> b) {
   }
}
