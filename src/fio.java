import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fio extends fid {
   private static final akr a = akr.b("widget/checkbox_selected_highlighted");
   private static final akr b = akr.b("widget/checkbox_selected");
   private static final akr c = akr.b("widget/checkbox_highlighted");
   private static final akr d = akr.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fio.b p;
   private final fjg q;

   fio(int $$0, int $$1, int $$2, wz $$3, fhx $$4, boolean $$5, fio.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fjg($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wz $$1, fhx $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fhx $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(wz $$0, fhx $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fio.a a(wz $$0, fhx $$1) {
      return new fio.a($$0, $$1);
   }

   public static int a(fhx $$0) {
      return 9 + 8;
   }

   @Override
   public void b() {
      this.o = !this.o;
      this.p.onValueChange(this, this.o);
   }

   public boolean a() {
      return this.o;
   }

   @Override
   public void a(fmi $$0) {
      $$0.a(fmh.a, this.aQ_());
      if (this.j) {
         if (this.aO_()) {
            $$0.a(fmh.d, wz.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fmh.d, wz.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
      fgo $$4 = fgo.Q();
      RenderSystem.enableDepthTest();
      fhx $$5 = $$4.h;
      $$0.a(1.0F, 1.0F, 1.0F, this.l);
      RenderSystem.enableBlend();
      akr $$6;
      if (this.o) {
         $$6 = this.aO_() ? a : b;
      } else {
         $$6 = this.aO_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a($$6, this.D(), this.E(), $$8, $$8);
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wz a;
      private final fhx b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fio.b f = fio.b.a;
      private boolean g = false;
      @Nullable
      private fgr<Boolean> h = null;
      @Nullable
      private fjx i = null;

      a(wz $$0, fhx $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fio.b($$0, $$1);
      }

      public fio.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fio.a a(fio.b $$0) {
         this.f = $$0;
         return this;
      }

      public fio.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fio.a a(fgr<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fio.a a(fjx $$0) {
         this.i = $$0;
         return this;
      }

      public fio.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fio a() {
         fio.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fio $$1 = new fio(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fio.b a = ($$0, $$1) -> {
      };

      void onValueChange(fio var1, boolean var2);
   }
}
