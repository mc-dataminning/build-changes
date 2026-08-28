import javax.annotation.Nullable;

public class fqp extends fqd {
   private static final ald a = ald.b("widget/checkbox_selected_highlighted");
   private static final ald b = ald.b("widget/checkbox_selected");
   private static final ald c = ald.b("widget/checkbox_highlighted");
   private static final ald d = ald.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fqp.b p;
   private final frh q;

   fqp(int $$0, int $$1, int $$2, wv $$3, fpx $$4, boolean $$5, fqp.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new frh($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wv $$1, fpx $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fpx $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wv $$0, fpx $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fqp.a a(wv $$0, fpx $$1) {
      return new fqp.a($$0, $$1);
   }

   public static int a(fpx $$0) {
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
   public void a(fuk $$0) {
      $$0.a(fuj.a, this.d());
      if (this.j) {
         if (this.aI_()) {
            $$0.a(fuj.d, wv.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fuj.d, wv.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fpz $$0, int $$1, int $$2, float $$3) {
      fnd $$4 = fnd.Q();
      fpx $$5 = $$4.h;
      ald $$6;
      if (this.o) {
         $$6 = this.aI_() ? a : b;
      } else {
         $$6 = this.aI_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(goi::H, $$6, this.F(), this.G(), $$8, $$8, axu.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wv a;
      private final fpx b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fqp.b f = fqp.b.a;
      private boolean g = false;
      @Nullable
      private fng<Boolean> h = null;
      @Nullable
      private fry i = null;

      a(wv $$0, fpx $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fqp.b($$0, $$1);
      }

      public fqp.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fqp.a a(fqp.b $$0) {
         this.f = $$0;
         return this;
      }

      public fqp.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fqp.a a(fng<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fqp.a a(fry $$0) {
         this.i = $$0;
         return this;
      }

      public fqp.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fqp a() {
         fqp.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fqp $$1 = new fqp(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fqp.b a = ($$0, $$1) -> {
      };

      void onValueChange(fqp var1, boolean var2);
   }
}
