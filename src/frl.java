import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class frl extends fnd {
   static final akk a = new akk("icon/checkmark");
   private static final wu b = wu.c("gui.chatSelection.title");
   private static final wu c = wu.c("gui.chatSelection.context");
   @Nullable
   private final fnd q;
   private final fzm r;
   private fhm s;
   private fif u;
   @Nullable
   private frl.a v;
   final fzf.a w;
   private final Consumer<fzf.a> x;
   private frk y;

   public frl(@Nullable fnd $$0, fzm $$1, fzf.a $$2, Consumer<fzf.a> $$3) {
      super(b);
      this.q = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aO_() {
      this.y = new frk(this.r, this::a);
      this.u = fif.a(this.o, c, this.m - 16);
      this.v = this.c(new frl.a(this.l, (this.u.a() + 1) * 9));
      this.c(fhm.a(wt.k, $$0 -> this.d()).a(this.m / 2 - 155, this.n - 32, 150, 20).a());
      this.s = this.c(fhm.a(wt.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.m / 2 - 155 + 160, this.n - 32, 150, 20).a());
      this.F();
      this.m();
      this.v.b((double)this.v.p());
   }

   private boolean a(fzb $$0) {
      return $$0.a(this.w.f());
   }

   private void m() {
      int $$0 = this.v.c();
      this.y.a($$0, this.v);
   }

   void E() {
      this.m();
   }

   void F() {
      this.s.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wu $$7 = wu.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.o, $$7, this.m / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.m / 2, this.v.J());
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   @Override
   public wu i() {
      return wt.a(super.i(), c);
   }

   public class a extends fii<frl.a.b> implements frk.a {
      @Nullable
      private frl.a.c m;

      public a(final ffn $$1, final int $$2) {
         super($$1, frl.this.m, frl.this.n - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !aye.b($$0, $$1)) {
            frl.this.E();
         }
      }

      @Override
      public void a(int $$0, fzb.a $$1) {
         boolean $$2 = $$1.a(frl.this.w.f());
         fyz $$3 = $$1.h();
         ffi $$4 = $$3.a($$1.g());
         frl.a.b $$5 = new frl.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fzb.a $$0, boolean $$1) {
         frl.a.b $$2 = new frl.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         frl.a.c $$3 = new frl.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wu $$0) {
         this.c(new frl.a.f());
         this.c(new frl.a.a($$0));
         this.c(new frl.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return aye.e(this.h, this.d);
      }

      @Override
      protected void a(fgz $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         frl.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aJ_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(frl.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.h() == $$0;
            boolean $$2 = this.h() == null;
            boolean $$3 = this.v() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected frl.a.b b(flq $$0) {
         return this.a($$0, frl.a.b::c);
      }

      public void a(@Nullable frl.a.b $$0) {
         super.a($$0);
         frl.a.b $$1 = this.b(flq.a);
         if ($$1 == null) {
            frl.this.E();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         frl.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends frl.a.b {
         private static final int b = -6250336;
         private final wu c;

         public a(final wu $$1) {
            this.c = $$1;
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = frl.this.o.a(this.c);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(frl.this.o, this.c, $$13, $$14, -6250336);
         }

         @Override
         public wu a() {
            return this.c;
         }
      }

      public abstract class b extends fii.a<frl.a.b> {
         @Override
         public wu a() {
            return wt.a;
         }

         public boolean b() {
            return false;
         }

         public boolean c() {
            return false;
         }

         public boolean d() {
            return this.c();
         }
      }

      static record c(UUID a, frl.a.b b) {
         public boolean a(frl.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends frl.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final wz g;
         private final wu h;
         @Nullable
         private final List<axq> i;
         @Nullable
         private final ffi.a j;
         @Nullable
         private final List<axq> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wu $$2, final wu $$3, @Nullable final ffi $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, ffi::f);
            this.k = $$4 != null && $$4.g() != null ? frl.this.o.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            wz $$7 = frl.this.o.a($$2, this.e() - frl.this.o.a(wt.u));
            if ($$2 != $$7) {
               this.g = wz.a($$7, wt.u);
               this.i = frl.this.o.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(frl.this.o, ts.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               frl.this.b(this.i);
            }

            int $$12 = frl.this.o.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  frl.this.b(this.k);
               }
            }
         }

         private void a(fgz $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(frl.a, $$2, $$5, 9, 8);
            RenderSystem.disableBlend();
         }

         private int e() {
            int $$0 = this.j != null ? this.j.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.m ? 11 : 0;
         }

         @Override
         public wu a() {
            return (wu)(this.b() ? wu.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fln.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return frl.this.w.b(this.f);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.l;
         }

         private boolean h() {
            if (this.l) {
               frl.this.w.a(this.f);
               frl.this.F();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends frl.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wu d;
         private final Supplier<gqi> e;
         private final boolean f;

         public e(final GameProfile $$1, final wu $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.am().a($$1);
         }

         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fil.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(frl.this.o, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends frl.a.b {
         @Override
         public void a(fgz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
