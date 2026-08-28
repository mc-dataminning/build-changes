import javax.annotation.Nullable;

public class fly extends fln {
   private static final all a = all.b("widget/checkbox_selected_highlighted");
   private static final all b = all.b("widget/checkbox_selected");
   private static final all c = all.b("widget/checkbox_highlighted");
   private static final all d = all.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fly.b p;
   private final fmq q;

   fly(int $$0, int $$1, int $$2, xl $$3, flh $$4, boolean $$5, fly.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fmq($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, xl $$1, flh $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(flh $$0) {
      return Math.max(a($$0), this.q.w());
   }

   static int b(xl $$0, flh $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fly.a a(xl $$0, flh $$1) {
      return new fly.a($$0, $$1);
   }

   public static int a(flh $$0) {
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
   public void a(fpu $$0) {
      $$0.a(fpt.a, this.aO_());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(fpt.d, xl.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(fpt.d, xl.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
      fjx $$4 = fjx.Q();
      flh $$5 = $$4.h;
      all $$6;
      if (this.o) {
         $$6 = this.aM_() ? a : b;
      } else {
         $$6 = this.aM_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gjh::B, $$6, this.D(), this.E(), $$8, $$8, axy.a(this.l));
      int $$9 = this.D() + $$8 + 4;
      int $$10 = this.E() + $$8 / 2 - this.q.w() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final xl a;
      private final flh b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fly.b f = fly.b.a;
      private boolean g = false;
      @Nullable
      private fka<Boolean> h = null;
      @Nullable
      private fnh i = null;

      a(xl $$0, flh $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fly.b($$0, $$1);
      }

      public fly.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fly.a a(fly.b $$0) {
         this.f = $$0;
         return this;
      }

      public fly.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fly.a a(fka<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fly.a a(fnh $$0) {
         this.i = $$0;
         return this;
      }

      public fly.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fly a() {
         fly.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fly $$1 = new fly(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fly.b a = ($$0, $$1) -> {
      };

      void onValueChange(fly var1, boolean var2);
   }
}
