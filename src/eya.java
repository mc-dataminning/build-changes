import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eya extends fct {
   private static final ahd a = new ahd("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final fct o;
   @Nullable
   private final ahd p;
   private final vd q;
   private final List<eya.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final fam v = fam.d();

   eya(fct $$0, int $$1, @Nullable ahd $$2, vd $$3, vd $$4, List<eya.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   protected void aN_() {
      this.v.a(12).c().b();
      this.v.a(new exs(this.e.f().a(n.r), this.i).c(this.u).b(true));
      if (this.p != null) {
         this.v.a(exl.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new exs(this.q, this.i).c(this.u).b(true));
      this.v.a(this.n());
      this.v.a($$1 -> {
         eww var10000 = this.d($$1);
      });
      this.c();
   }

   private fam n() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      fam $$2 = fam.e();
      $$2.a(6);

      for (eya.b $$3 : this.r) {
         $$2.a(ewy.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      fag.a(this.v, this.F());
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, eva.a);
      this.a($$0);
      $$0.a(a, this.v.B() - 18, this.v.C() - 18, this.v.w() + 36, this.v.u() + 36);
   }

   @Override
   public vd h() {
      return vc.a(this.e, this.q);
   }

   @Override
   public void aE_() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final fct a;
      private final vd b;
      private vd c = vc.a;
      private int d = 250;
      @Nullable
      private ahd e;
      private final List<eya.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fct $$0, vd $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public eya.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eya.a a(ahd $$0) {
         this.e = $$0;
         return this;
      }

      public eya.a a(vd $$0) {
         this.c = $$0;
         return this;
      }

      public eya.a a(vd $$0, Consumer<eya> $$1) {
         this.f.add(new eya.b($$0, $$1));
         return this;
      }

      public eya.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public eya a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new eya(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(vd a, Consumer<eya> b) {
   }
}
