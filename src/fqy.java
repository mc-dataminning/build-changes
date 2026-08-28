import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fqy extends fmy {
   static final alb a = new alb("icon/checkmark");
   private static final xl b = xl.c("gui.chatSelection.title");
   private static final xl c = xl.c("gui.chatSelection.context");
   @Nullable
   private final fmy d;
   private final fyy r;
   private fgz s;
   private fhs u;
   @Nullable
   private fqy.a v;
   final fyr.a w;
   private final Consumer<fyr.a> x;
   private fqx y;

   public fqy(@Nullable fmy $$0, fyy $$1, fyr.a $$2, Consumer<fyr.a> $$3) {
      super(b);
      this.d = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aN_() {
      this.y = new fqx(this.r, this::a);
      this.u = fhs.a(this.p, c, this.n - 16);
      this.v = this.c(new fqy.a(this.m, (this.u.a() + 1) * 9));
      this.c(fgz.a(xk.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.s = this.c(fgz.a(xk.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.D();
      this.m();
      this.v.a((double)this.v.o());
   }

   private boolean a(fyn $$0) {
      return $$0.a(this.w.f());
   }

   private void m() {
      int $$0 = this.v.d();
      this.y.a($$0, this.v);
   }

   void C() {
      this.m();
   }

   void D() {
      this.s.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xl $$7 = xl.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.n / 2, this.v.I());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public xl i() {
      return xk.a(super.i(), c);
   }

   public class a extends fhv<fqy.a.b> implements fqx.a {
      @Nullable
      private fqy.a.c m;

      public a(final ffa $$1, final int $$2) {
         super($$1, fqy.this.n, fqy.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.n();
         super.a($$0);
         if ((float)this.o() > 1.0E-5F && $$0 <= 1.0E-5F && !ayu.b($$0, $$1)) {
            fqy.this.C();
         }
      }

      @Override
      public void a(int $$0, fyn.a $$1) {
         boolean $$2 = $$1.a(fqy.this.w.f());
         fyl $$3 = $$1.h();
         fev $$4 = $$3.a($$1.g());
         fqy.a.b $$5 = new fqy.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fyn.a $$0, boolean $$1) {
         fqy.a.b $$2 = new fqy.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fqy.a.c $$3 = new fqy.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xl $$0) {
         this.c(new fqy.a.f());
         this.c(new fqy.a.a($$0));
         this.c(new fqy.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int d() {
         return ayu.e(this.h, this.d);
      }

      @Override
      protected void a(fgm $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fqy.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aJ_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.u() == $$9, $$3);
      }

      private boolean b(fqy.a.b $$0) {
         if ($$0.c()) {
            boolean $$1 = this.h() == $$0;
            boolean $$2 = this.h() == null;
            boolean $$3 = this.u() == $$0;
            return $$1 || $$2 && $$3 && $$0.d();
         } else {
            return false;
         }
      }

      @Nullable
      protected fqy.a.b b(fld $$0) {
         return this.a($$0, fqy.a.b::c);
      }

      public void a(@Nullable fqy.a.b $$0) {
         super.a($$0);
         fqy.a.b $$1 = this.b(fld.a);
         if ($$1 == null) {
            fqy.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fqy.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int I() {
         return this.F() + 9;
      }

      public class a extends fqy.a.b {
         private static final int b = -6250336;
         private final xl c;

         public a(final xl $$1) {
            this.c = $$1;
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fqy.this.p.a(this.c);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fqy.this.p, this.c, $$13, $$14, -6250336);
         }

         @Override
         public xl a() {
            return this.c;
         }
      }

      public abstract class b extends fhv.a<fqy.a.b> {
         @Override
         public xl a() {
            return xk.a;
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

      static record c(UUID a, fqy.a.b b) {
         public boolean a(fqy.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fqy.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xq g;
         private final xl h;
         @Nullable
         private final List<ayg> i;
         @Nullable
         private final fev.a j;
         @Nullable
         private final List<ayg> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final xl $$2, final xl $$3, @Nullable final fev $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fev::f);
            this.k = $$4 != null && $$4.g() != null ? fqy.this.p.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xq $$7 = fqy.this.p.a($$2, this.e() - fqy.this.p.a(xk.u));
            if ($$2 != $$7) {
               this.g = xq.a($$7, xk.u);
               this.i = fqy.this.p.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fqy.this.p, um.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fqy.this.b(this.i);
            }

            int $$12 = fqy.this.p.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fqy.this.b(this.k);
               }
            }
         }

         private void a(fgm $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fqy.a, $$2, $$5, 9, 8);
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
         public xl a() {
            return (xl)(this.b() ? xl.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fla.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fqy.this.w.b(this.f);
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
               fqy.this.w.a(this.f);
               fqy.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fqy.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final xl d;
         private final Supplier<gpu> e;
         private final boolean f;

         public e(final GameProfile $$1, final xl $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.am().a($$1);
         }

         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fhy.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fqy.this.p, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fqy.a.b {
         @Override
         public void a(fgm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
