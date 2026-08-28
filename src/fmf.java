import javax.annotation.Nullable;

public class fmf extends flu {
   private static final alj a = alj.b("widget/checkbox_selected_highlighted");
   private static final alj b = alj.b("widget/checkbox_selected");
   private static final alj c = alj.b("widget/checkbox_highlighted");
   private static final alj d = alj.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fmf.b p;
   private final fmx q;

   fmf(int $$0, int $$1, int $$2, xj $$3, flo $$4, boolean $$5, fmf.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fmx($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xj $$1, flo $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(flo $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xj $$0, flo $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fmf.a a(xj $$0, flo $$1) {
      return new fmf.a($$0, $$1);
   }

   public static int a(flo $$0) {
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
   public void a(fqb $$0) {
      $$0.a(fqa.a, this.aN_());
      if (this.j) {
         if (this.aL_()) {
            $$0.a(fqa.d, xj.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fqa.d, xj.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
      fke $$4 = fke.Q();
      flo $$5 = $$4.h;
      alj $$6;
      if (this.o) {
         $$6 = this.aL_() ? a : b;
      } else {
         $$6 = this.aL_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gjq::B, $$6, this.D(), this.E(), $$8, $$8, axx.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xj a;
      private final flo b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fmf.b f = fmf.b.a;
      private boolean g = false;
      @Nullable
      private fkh<Boolean> h = null;
      @Nullable
      private fno i = null;

      a(xj $$0, flo $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fmf.b($$0, $$1);
      }

      public fmf.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fmf.a a(fmf.b $$0) {
         this.f = $$0;
         return this;
      }

      public fmf.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fmf.a a(fkh<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fmf.a a(fno $$0) {
         this.i = $$0;
         return this;
      }

      public fmf.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fmf a() {
         fmf.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fmf $$1 = new fmf(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fmf.b a = ($$0, $$1) -> {
      };

      void onValueChange(fmf var1, boolean var2);
   }
}
