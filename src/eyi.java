import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eyi extends fdb {
   private static final ahg a = new ahg("popup/background");
   private static final int b = 12;
   private static final int c = 18;
   private static final int k = 6;
   private static final int l = 130;
   private static final int m = 64;
   private static final int n = 250;
   private final fdb o;
   @Nullable
   private final ahg p;
   private final vf q;
   private final List<eyi.b> r;
   @Nullable
   private final Runnable t;
   private final int u;
   private final fau v = fau.d();

   eyi(fdb $$0, int $$1, @Nullable ahg $$2, vf $$3, vf $$4, List<eyi.b> $$5, @Nullable Runnable $$6) {
      super($$3);
      this.o = $$0;
      this.p = $$2;
      this.q = $$4;
      this.r = $$5;
      this.t = $$6;
      this.u = $$1 - 36;
   }

   @Override
   public void aF_() {
      super.aF_();
      this.o.p();
   }

   @Override
   protected void aN_() {
      this.v.a(12).c().b();
      this.v.a(new eya(this.e.f().a(n.r), this.i).c(this.u).b(true));
      if (this.p != null) {
         this.v.a(ext.a(130, 64, this.p, 130, 64));
      }

      this.v.a(new eya(this.q, this.i).c(this.u).b(true));
      this.v.a(this.n());
      this.v.a($$1 -> {
         exe var10000 = this.d($$1);
      });
      this.c();
   }

   private fau n() {
      int $$0 = 6 * (this.r.size() - 1);
      int $$1 = Math.min((this.u - $$0) / this.r.size(), 150);
      fau $$2 = fau.e();
      $$2.a(6);

      for (eyi.b $$3 : this.r) {
         $$2.a(exg.a($$3.a(), $$1x -> $$3.b().accept(this)).a($$1).a());
      }

      return $$2;
   }

   @Override
   protected void c() {
      this.o.a(this.f, this.g, this.h);
      this.v.a();
      fao.a(this.v, this.F());
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
      this.o.a($$0, -1, -1, $$3);
      $$0.e();
      RenderSystem.clear(256, evi.a);
      this.a($$0);
      $$0.a(a, this.v.B() - 18, this.v.C() - 18, this.v.w() + 36, this.v.u() + 36);
   }

   @Override
   public vf h() {
      return ve.a(this.e, this.q);
   }

   @Override
   public void aE_() {
      if (this.t != null) {
         this.t.run();
      }

      this.f.a(this.o);
   }

   public static class a {
      private final fdb a;
      private final vf b;
      private vf c = ve.a;
      private int d = 250;
      @Nullable
      private ahg e;
      private final List<eyi.b> f = new ArrayList<>();
      @Nullable
      private Runnable g = null;

      public a(fdb $$0, vf $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public eyi.a a(int $$0) {
         this.d = $$0;
         return this;
      }

      public eyi.a a(ahg $$0) {
         this.e = $$0;
         return this;
      }

      public eyi.a a(vf $$0) {
         this.c = $$0;
         return this;
      }

      public eyi.a a(vf $$0, Consumer<eyi> $$1) {
         this.f.add(new eyi.b($$0, $$1));
         return this;
      }

      public eyi.a a(Runnable $$0) {
         this.g = $$0;
         return this;
      }

      public eyi a() {
         if (this.f.isEmpty()) {
            throw new IllegalStateException("Popup must have at least one button");
         } else {
            return new eyi(this.a, this.d, this.e, this.b, this.c, List.copyOf(this.f), this.g);
         }
      }
   }

   static record b(vf a, Consumer<eyi> b) {
   }
}
