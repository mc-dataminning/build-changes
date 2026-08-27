import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fss extends fon {
   static final akt a = new akt("icon/checkmark");
   private static final xe b = xe.c("gui.chatSelection.title");
   private static final xe c = xe.c("gui.chatSelection.context");
   @Nullable
   private final fon d;
   private final gav r;
   private fin s;
   private fjg u;
   @Nullable
   private fss.a v;
   final gao.a w;
   private final Consumer<gao.a> x;
   private fsr y;

   public fss(@Nullable fon $$0, gav $$1, gao.a $$2, Consumer<gao.a> $$3) {
      super(b);
      this.d = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aN_() {
      this.y = new fsr(this.r, this::a);
      this.u = fjg.a(this.p, c, this.n - 16);
      this.v = this.c(new fss.a(this.m, (this.u.a() + 1) * 9));
      this.c(fin.a(xd.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.s = this.c(fin.a(xd.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.D();
      this.B();
      this.v.a((double)this.v.o());
   }

   private boolean a(gak $$0) {
      return $$0.a(this.w.f());
   }

   private void B() {
      int $$0 = this.v.d();
      this.y.a($$0, this.v);
   }

   void C() {
      this.B();
   }

   void D() {
      this.s.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      xe $$7 = xe.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.n / 2, this.v.I());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public xe i() {
      return xd.a(super.i(), c);
   }

   public class a extends fjj<fss.a.b> implements fsr.a {
      @Nullable
      private fss.a.c m;

      public a(fgj $$1, int $$2) {
         super($$1, fss.this.n, fss.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.n();
         super.a($$0);
         if ((float)this.o() > 1.0E-5F && $$0 <= 1.0E-5F && !aym.b($$0, $$1)) {
            fss.this.C();
         }
      }

      @Override
      public void a(int $$0, gak.a $$1) {
         boolean $$2 = $$1.a(fss.this.w.f());
         gai $$3 = $$1.h();
         fge $$4 = $$3.a($$1.g());
         fss.a.b $$5 = new fss.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(gak.a $$0, boolean $$1) {
         fss.a.b $$2 = new fss.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fss.a.c $$3 = new fss.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(xe $$0) {
         this.c(new fss.a.f());
         this.c(new fss.a.a($$0));
         this.c(new fss.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int d() {
         return aym.e(this.h, this.d);
      }

      @Override
      protected void a(fia $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fss.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aI_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.u() == $$9, $$3);
      }

      private boolean b(fss.a.b $$0) {
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
      protected fss.a.b b(fmr $$0) {
         return this.a($$0, fss.a.b::c);
      }

      public void a(@Nullable fss.a.b $$0) {
         super.a($$0);
         fss.a.b $$1 = this.b(fmr.a);
         if ($$1 == null) {
            fss.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fss.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int I() {
         return this.F() + 9;
      }

      public class a extends fss.a.b {
         private static final int c = -6250336;
         private final xe d;

         public a(xe $$1) {
            this.d = $$1;
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fss.this.p.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fss.this.p, this.d, $$13, $$14, -6250336);
         }

         @Override
         public xe a() {
            return this.d;
         }
      }

      public abstract class b extends fjj.a<fss.a.b> {
         @Override
         public xe a() {
            return xd.a;
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

      static record c(UUID a, fss.a.b b) {
         public boolean a(fss.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fss.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final xj h;
         private final xe i;
         @Nullable
         private final List<axy> j;
         @Nullable
         private final fge.a k;
         @Nullable
         private final List<axy> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, xe $$2, xe $$3, @Nullable fge $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = y.a($$4, fge::f);
            this.l = $$4 != null && $$4.g() != null ? fss.this.p.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            xj $$7 = fss.this.p.a($$2, this.e() - fss.this.p.a(xd.u));
            if ($$2 != $$7) {
               this.h = xj.a($$7, xd.u);
               this.j = fss.this.p.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fss.this.p, uf.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fss.this.b(this.j);
            }

            int $$12 = fss.this.p.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fss.this.b(this.l);
               }
            }
         }

         private void a(fia $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fss.a, $$2, $$5, 9, 8);
            RenderSystem.disableBlend();
         }

         private int e() {
            int $$0 = this.k != null ? this.k.c + 4 : 0;
            return a.this.b() - this.f() - 4 - $$0;
         }

         private int f() {
            return this.n ? 11 : 0;
         }

         @Override
         public xe a() {
            return (xe)(this.b() ? xe.a("narrator.select", this.i) : this.i);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fmo.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fss.this.w.b(this.g);
         }

         @Override
         public boolean c() {
            return true;
         }

         @Override
         public boolean d() {
            return this.m;
         }

         private boolean h() {
            if (this.m) {
               fss.this.w.a(this.g);
               fss.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fss.a.b {
         private static final int c = 12;
         private static final int d = 4;
         private final xe e;
         private final Supplier<gry> f;
         private final boolean g;

         public e(GameProfile $$1, xe $$2, boolean $$3) {
            this.e = $$2;
            this.g = $$3;
            this.f = a.this.c.an().a($$1);
         }

         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fjm.a($$0, this.f.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fss.this.p, this.e, $$10 + 12 + 4, $$12, this.g ? -1 : -1593835521);
         }
      }

      public class f extends fss.a.b {
         @Override
         public void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
