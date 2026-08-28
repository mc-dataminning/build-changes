import javax.annotation.Nullable;

public class fua extends fto {
   private static final alr a = alr.b("widget/checkbox_selected_highlighted");
   private static final alr b = alr.b("widget/checkbox_selected");
   private static final alr c = alr.b("widget/checkbox_highlighted");
   private static final alr d = alr.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fua.b p;
   private final fus q;

   fua(int $$0, int $$1, int $$2, xg $$3, fti $$4, boolean $$5, fua.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fus($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xg $$1, fti $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fti $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(xg $$0, fti $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fua.a a(xg $$0, fti $$1) {
      return new fua.a($$0, $$1);
   }

   public static int a(fti $$0) {
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
   public void a(fxv $$0) {
      $$0.a(fxu.a, this.d());
      if (this.j) {
         if (this.aJ_()) {
            $$0.a(fxu.d, xg.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fxu.d, xg.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      fqq $$4 = fqq.Q();
      fti $$5 = $$4.h;
      alr $$6;
      if (this.o) {
         $$6 = this.aJ_() ? a : b;
      } else {
         $$6 = this.aJ_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gry::H, $$6, this.F(), this.G(), $$8, $$8, ayh.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xg a;
      private final fti b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fua.b f = fua.b.a;
      private boolean g = false;
      @Nullable
      private fqt<Boolean> h = null;
      @Nullable
      private fvj i = null;

      a(xg $$0, fti $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fua.b($$0, $$1);
      }

      public fua.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fua.a a(fua.b $$0) {
         this.f = $$0;
         return this;
      }

      public fua.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fua.a a(fqt<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fua.a a(fvj $$0) {
         this.i = $$0;
         return this;
      }

      public fua.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fua a() {
         fua.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fua $$1 = new fua(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fua.b a = ($$0, $$1) -> {
      };

      void onValueChange(fua var1, boolean var2);
   }
}
