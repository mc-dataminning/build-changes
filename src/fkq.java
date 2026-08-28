import javax.annotation.Nullable;

public class fkq extends fkf {
   private static final ale a = ale.b("widget/checkbox_selected_highlighted");
   private static final ale b = ale.b("widget/checkbox_selected");
   private static final ale c = ale.b("widget/checkbox_highlighted");
   private static final ale d = ale.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fkq.b p;
   private final fli q;

   fkq(int $$0, int $$1, int $$2, xe $$3, fjz $$4, boolean $$5, fkq.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fli($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xe $$1, fjz $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fjz $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xe $$0, fjz $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fkq.a a(xe $$0, fjz $$1) {
      return new fkq.a($$0, $$1);
   }

   public static int a(fjz $$0) {
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
   public void a(fol $$0) {
      $$0.a(fok.a, this.aP_());
      if (this.j) {
         if (this.aN_()) {
            $$0.a(fok.d, xe.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fok.d, xe.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fkb $$0, int $$1, int $$2, float $$3) {
      fip $$4 = fip.Q();
      fjz $$5 = $$4.h;
      ale $$6;
      if (this.o) {
         $$6 = this.aN_() ? a : b;
      } else {
         $$6 = this.aN_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(ghv::B, $$6, this.D(), this.E(), $$8, $$8, axq.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xe a;
      private final fjz b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fkq.b f = fkq.b.a;
      private boolean g = false;
      @Nullable
      private fis<Boolean> h = null;
      @Nullable
      private flz i = null;

      a(xe $$0, fjz $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fkq.b($$0, $$1);
      }

      public fkq.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fkq.a a(fkq.b $$0) {
         this.f = $$0;
         return this;
      }

      public fkq.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fkq.a a(fis<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fkq.a a(flz $$0) {
         this.i = $$0;
         return this;
      }

      public fkq.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fkq a() {
         fkq.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fkq $$1 = new fkq(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fkq.b a = ($$0, $$1) -> {
      };

      void onValueChange(fkq var1, boolean var2);
   }
}
