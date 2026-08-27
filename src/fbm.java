import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class fbm extends fgh {
   private static final ajc a = new ajc("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final fgh o;
   @Nullable
   private final ajc p;
   private final vs q;
   private final List<fbm.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final fea v = fea.d();

   fbm(fgh $$0, int $$1, @Nullable ajc $$2, vs $$3, vs $$4, List<fbm.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   public void aH_() {
      super.aH_();
      this.o.q();
   }

   @Override
   protected void aP_() {
      this.v.a(12).c().b();
      this.v.a(new fbe(this.e.f().a(n.r), this.i).c(this.u).b(true));
      if (this.p != null) {
         this.v.a(fax.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new fbe(this.q, this.i).c(this.u).b(true));
      this.v.a(this.o());
      this.v.a($$1 -> {
         fai var10000 = this.c($$1);
      });
      this.c();
   }

   private fea o() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      fea $$2 = fea.e();
      $$2.a(6);

      for (fbm.b $$3 : this.r) {
         $$2.a(fak.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      fdu.a(this.v, this.F());
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eyk.a);
      this.a($$0);
      $$0.a(a, this.v.B() - 18, this.v.C() - 18, this.v.w() + 36, this.v.u() + 36);
   }

   @Override
   public vs i() {
      return vr.a(this.e, this.q);
   }

   @Override
   public void d() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final fgh a;
      private final vs b;
      private vs c = vr.a;
      private int d = 250;
      @Nullable
      private ajc e;
      private final List<fbm.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fgh $$0, vs $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public fbm.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public fbm.a a(ajc $$0) {
         this.e = $$0;
         return this;
      }

      public fbm.a a(vs $$0) {
         this.c = $$0;
         return this;
      }

      public fbm.a a(vs $$0, Consumer<fbm> $$1) {
         this.f.add(new fbm.b($$0, $$1));
         return this;
      }

      public fbm.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public fbm a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new fbm(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(vs a, Consumer<fbm> b) {
   }
}
