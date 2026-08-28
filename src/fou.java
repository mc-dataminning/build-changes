import javax.annotation.Nullable;

public class fou extends foh {
   private static final akv a = akv.b("widget/checkbox_selected_highlighted");
   private static final akv b = akv.b("widget/checkbox_selected");
   private static final akv c = akv.b("widget/checkbox_highlighted");
   private static final akv d = akv.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fou.b p;
   private final fpm q;

   fou(int $$0, int $$1, int $$2, wp $$3, fob $$4, boolean $$5, fou.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fpm($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wp $$1, fob $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fob $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wp $$0, fob $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fou.a a(wp $$0, fob $$1) {
      return new fou.a($$0, $$1);
   }

   public static int a(fob $$0) {
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
   public void a(fsp $$0) {
      $$0.a(fso.a, this.d());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fso.d, wp.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fso.d, wp.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fod $$0, int $$1, int $$2, float $$3) {
      fli $$4 = fli.Q();
      fob $$5 = $$4.h;
      akv $$6;
      if (this.o) {
         $$6 = this.aM_() ? a : b;
      } else {
         $$6 = this.aM_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gmh::H, $$6, this.F(), this.G(), $$8, $$8, axk.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wp a;
      private final fob b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fou.b f = fou.b.a;
      private boolean g = false;
      @Nullable
      private fll<Boolean> h = null;
      @Nullable
      private fqd i = null;

      a(wp $$0, fob $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fou.b($$0, $$1);
      }

      public fou.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fou.a a(fou.b $$0) {
         this.f = $$0;
         return this;
      }

      public fou.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fou.a a(fll<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fou.a a(fqd $$0) {
         this.i = $$0;
         return this;
      }

      public fou.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fou a() {
         fou.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fou $$1 = new fou(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fou.b a = ($$0, $$1) -> {
      };

      void onValueChange(fou var1, boolean var2);
   }
}
