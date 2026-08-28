import javax.annotation.Nullable;

public class fps extends fpg {
   private static final aku a = aku.b("widget/checkbox_selected_highlighted");
   private static final aku b = aku.b("widget/checkbox_selected");
   private static final aku c = aku.b("widget/checkbox_highlighted");
   private static final aku d = aku.b("widget/checkbox");
   private static final int f = 14737632;
   private static final int m = 4;
   private static final int n = 8;
   private boolean o;
   private final fps.b p;
   private final fqk q;

   fps(int $$0, int $$1, int $$2, wp $$3, fpa $$4, boolean $$5, fps.b $$6) {
      super($$0, $$1, 0, 0, $$3);
      this.g = this.a($$2, $$3, $$4);
      this.q = new fqk($$3, $$4).d(this.g).c(14737632);
      this.h = this.b($$4);
      this.o = $$5;
      this.p = $$6;
   }

   private int a(int $$0, wp $$1, fpa $$2) {
      return Math.min(b($$1, $$2), $$0);
   }

   private int b(fpa $$0) {
      return Math.max(a($$0), this.q.y());
   }

   static int b(wp $$0, fpa $$1) {
      return a($$1) + 4 + $$1.a($$0);
   }

   public static fps.a a(wp $$0, fpa $$1) {
      return new fps.a($$0, $$1);
   }

   public static int a(fpa $$0) {
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
   public void a(ftn $$0) {
      $$0.a(ftm.a, this.d());
      if (this.j) {
         if (this.aM_()) {
            $$0.a(ftm.d, wp.c("narration.checkbox.usage.focused"));
         } else {
            $$0.a(ftm.d, wp.c("narration.checkbox.usage.hovered"));
         }
      }
   }

   @Override
   public void b(fpc $$0, int $$1, int $$2, float $$3) {
      fmg $$4 = fmg.Q();
      fpa $$5 = $$4.h;
      aku $$6;
      if (this.o) {
         $$6 = this.aM_() ? a : b;
      } else {
         $$6 = this.aM_() ? c : d;
      }

      int $$8 = a($$5);
      $$0.a(gnh::H, $$6, this.F(), this.G(), $$8, $$8, axk.a(this.l));
      int $$9 = this.F() + $$8 + 4;
      int $$10 = this.G() + $$8 / 2 - this.q.y() / 2;
      this.q.c($$9, $$10);
      this.q.b($$0, $$1, $$2, $$3);
   }

   public static class a {
      private final wp a;
      private final fpa b;
      private int c;
      private int d = 0;
      private int e = 0;
      private fps.b f = fps.b.a;
      private boolean g = false;
      @Nullable
      private fmj<Boolean> h = null;
      @Nullable
      private frb i = null;

      a(wp $$0, fpa $$1) {
         this.a = $$0;
         this.b = $$1;
         this.c = fps.b($$0, $$1);
      }

      public fps.a a(int $$0, int $$1) {
         this.d = $$0;
         this.e = $$1;
         return this;
      }

      public fps.a a(fps.b $$0) {
         this.f = $$0;
         return this;
      }

      public fps.a a(boolean $$0) {
         this.g = $$0;
         this.h = null;
         return this;
      }

      public fps.a a(fmj<Boolean> $$0) {
         this.h = $$0;
         this.g = $$0.c();
         return this;
      }

      public fps.a a(frb $$0) {
         this.i = $$0;
         return this;
      }

      public fps.a a(int $$0) {
         this.c = $$0;
         return this;
      }

      public fps a() {
         fps.b $$0 = this.h == null ? this.f : ($$0x, $$1x) -> {
            this.h.a($$1x);
            this.f.onValueChange($$0x, $$1x);
         };
         fps $$1 = new fps(this.d, this.e, this.c, this.a, this.b, this.g, $$0);
         $$1.a(this.i);
         return $$1;
      }
   }

   public interface b {
      fps.b a = ($$0, $$1) -> {
      };

      void onValueChange(fps var1, boolean var2);
   }
}
