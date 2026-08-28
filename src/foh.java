import javax.annotation.Nullable;

public class foh extends fnw {
   private static final alz a = alz.b("widget/checkbox_selected_highlighted");
   private static final alz b = alz.b("widget/checkbox_selected");
   private static final alz c = alz.b("widget/checkbox_highlighted");
   private static final alz d = alz.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final foh.b p;
   private final fpa q;

   foh(int $$0, int $$1, int $$2, xv $$3, fnq $$4, boolean $$5, foh.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fpa($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xv $$1, fnq $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fnq $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xv $$0, fnq $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static foh.a a(xv $$0, fnq $$1) {
      return new foh.a($$0, $$1);
   }

   public static int a(fnq $$0) {
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
   public void a(fsd $$0) {
      $$0.a(fsc.a, this.aR_());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fsc.d, xv.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fsc.d, xv.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fns $$0, int $$1, int $$2, float $$3) {
      fmg $$4 = fmg.Q();
      fnq $$5 = $$4.h;
      alz $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(glv::C, $$6, this.D(), this.E(), $$8, $$8, ayp.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xv a;
      private final fnq b;
      private int c;
      private int d = 0;
      private int e = 0;
      private foh.b f = foh.b.a;
      private boolean g = false;
      @Nullable
      private fmj<Boolean> h = null;
      @Nullable
      private fpr i = null;

      a(xv $$0, fnq $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = foh.b($$0, $$1);
      }

      public foh.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public foh.a a(foh.b $$0) {
         this.f = $$0;
         return this;
      }

      public foh.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public foh.a a(fmj<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public foh.a a(fpr $$0) {
         this.i = $$0;
         return this;
      }

      public foh.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public foh a() {
         foh.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         foh $$1 = new foh(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      foh.b a = ($$0, $$1) -> {
      };

      void onValueChange(foh var1, boolean var2);
   }
}
