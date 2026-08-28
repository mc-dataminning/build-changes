import javax.annotation.Nullable;

public class fse extends frs {
   private static final alg a = alg.b("widget/checkbox_selected_highlighted");
   private static final alg b = alg.b("widget/checkbox_selected");
   private static final alg c = alg.b("widget/checkbox_highlighted");
   private static final alg d = alg.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fse.b p;
   private final fsw q;

   fse(int $$0, int $$1, int $$2, wy $$3, frm $$4, boolean $$5, fse.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fsw($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wy $$1, frm $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(frm $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wy $$0, frm $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fse.a a(wy $$0, frm $$1) {
      return new fse.a($$0, $$1);
   }

   public static int a(frm $$0) {
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
   public void a(fvz $$0) {
      $$0.a(fvy.a, this.d());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fvy.d, wy.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fvy.d, wy.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fro $$0, int $$1, int $$2, float $$3) {
      fos $$4 = fos.Q();
      frm $$5 = $$4.h;
      alg $$6;
      if (this.o) {
         $$6 = this.aI_() ? a : b;
      } else {
         $$6 = this.aI_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gqc::H, $$6, this.F(), this.G(), $$8, $$8, axw.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wy a;
      private final frm b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fse.b f = fse.b.a;
      private boolean g = false;
      @Nullable
      private fov<Boolean> h = null;
      @Nullable
      private ftn i = null;

      a(wy $$0, frm $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fse.b($$0, $$1);
      }

      public fse.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fse.a a(fse.b $$0) {
         this.f = $$0;
         return this;
      }

      public fse.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fse.a a(fov<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fse.a a(ftn $$0) {
         this.i = $$0;
         return this;
      }

      public fse.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fse a() {
         fse.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fse $$1 = new fse(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fse.b a = ($$0, $$1) -> {
      };

      void onValueChange(fse var1, boolean var2);
   }
}
