import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fpe extends fld {
   static final akh a = new akh("icon/checkmark");
   private static final wu b = wu.c("gui.chatSelection.title");
   private static final wu c = wu.c("gui.chatSelection.context");
   @Nullable
   private final fld d;
   private final fxe r;
   private ffe s;
   private ffx u;
   @Nullable
   private fpe.a v;
   final fwx.a w;
   private final Consumer<fwx.a> x;
   private fpd y;

   public fpe(@Nullable fld $$0, fxe $$1, fwx.a $$2, Consumer<fwx.a> $$3) {
      super(b);
      this.d = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aM_() {
      this.y = new fpd(this.r, this::a);
      this.u = ffx.a(this.p, c, this.n - 16);
      this.v = this.c(new fpe.a(this.m, (this.u.a() + 1) * 9));
      this.c(ffe.a(wt.k, $$0 -> this.d()).a(this.n / 2 - 155, this.o - 32, 150, 20).a());
      this.s = this.c(ffe.a(wt.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.n / 2 - 155 + 160, this.o - 32, 150, 20).a());
      this.D();
      this.m();
      this.v.a((double)this.v.o());
   }

   private boolean a(fwt $$0) {
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wu $$7 = wu.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.p, $$7, this.n / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.n / 2, this.v.I());
   }

   @Override
   public void d() {
      this.m.a(this.d);
   }

   @Override
   public wu i() {
      return wt.a(super.i(), c);
   }

   public class a extends fga<fpe.a.b> implements fpd.a {
      @Nullable
      private fpe.a.c m;

      public a(fde $$1, int $$2) {
         super($$1, fpe.this.n, fpe.this.o - $$2 - 80, 40, 16);
      }

      @Override
      public void a(double $$0) {
         double $$1 = this.n();
         super.a($$0);
         if ((float)this.o() > 1.0E-5F && $$0 <= 1.0E-5F && !axz.b($$0, $$1)) {
            fpe.this.C();
         }
      }

      @Override
      public void a(int $$0, fwt.a $$1) {
         boolean $$2 = $$1.a(fpe.this.w.f());
         fwr $$3 = $$1.h();
         fcz $$4 = $$3.a($$1.g());
         fpe.a.b $$5 = new fpe.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fwt.a $$0, boolean $$1) {
         fpe.a.b $$2 = new fpe.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fpe.a.c $$3 = new fpe.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wu $$0) {
         this.c(new fpe.a.f());
         this.c(new fpe.a.a($$0));
         this.c(new fpe.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int d() {
         return axz.e(this.h, this.d);
      }

      @Override
      protected void a(fer $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fpe.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aI_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.u() == $$9, $$3);
      }

      private boolean b(fpe.a.b $$0) {
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
      protected fpe.a.b b(fji $$0) {
         return this.a($$0, fpe.a.b::c);
      }

      public void a(@Nullable fpe.a.b $$0) {
         super.a($$0);
         fpe.a.b $$1 = this.b(fji.a);
         if ($$1 == null) {
            fpe.this.C();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fpe.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int I() {
         return this.F() + 9;
      }

      public class a extends fpe.a.b {
         private static final int c = -6250336;
         private final wu d;

         public a(wu $$1) {
            this.d = $$1;
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fpe.this.p.a(this.d);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fpe.this.p, this.d, $$13, $$14, -6250336);
         }

         @Override
         public wu a() {
            return this.d;
         }
      }

      public abstract class b extends fga.a<fpe.a.b> {
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

      static record c(UUID a, fpe.a.b b) {
         public boolean a(fpe.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fpe.a.b {
         private static final int c = 9;
         private static final int d = 8;
         private static final int e = 11;
         private static final int f = 4;
         private final int g;
         private final wz h;
         private final wu i;
         @Nullable
         private final List<axl> j;
         @Nullable
         private final fcz.a k;
         @Nullable
         private final List<axl> l;
         private final boolean m;
         private final boolean n;

         public d(int $$1, wu $$2, wu $$3, @Nullable fcz $$4, boolean $$5, boolean $$6) {
            this.g = $$1;
            this.k = x.a($$4, fcz::f);
            this.l = $$4 != null && $$4.g() != null ? fpe.this.p.c($$4.g(), a.this.b()) : null;
            this.m = $$5;
            this.n = $$6;
            wz $$7 = fpe.this.p.a($$2, this.e() - fpe.this.p.a(wt.u));
            if ($$2 != $$7) {
               this.h = wz.a($$7, wt.u);
               this.j = fpe.this.p.c($$2, a.this.b());
            } else {
               this.h = $$2;
               this.j = null;
            }

            this.i = $$3;
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.m) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fpe.this.p, tv.a().a(this.h), $$10, $$11, this.m ? -1 : -1593835521);
            if (this.j != null && $$8) {
               fpe.this.b(this.j);
            }

            int $$12 = fpe.this.p.a(this.h);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.k != null) {
               int $$6 = $$2 + ($$3 - this.k.d) / 2;
               this.k.a($$0, $$1, $$6);
               if (this.l != null && $$4 >= $$1 && $$4 <= $$1 + this.k.c && $$5 >= $$6 && $$5 <= $$6 + this.k.d) {
                  fpe.this.b(this.l);
               }
            }
         }

         private void a(fer $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fpe.a, $$2, $$5, 9, 8);
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
         public wu a() {
            return (wu)(this.b() ? wu.a("narrator.select", this.i) : this.i);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fjf.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fpe.this.w.b(this.g);
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
               fpe.this.w.a(this.g);
               fpe.this.D();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fpe.a.b {
         private static final int c = 12;
         private static final int d = 4;
         private final wu e;
         private final Supplier<gny> f;
         private final boolean g;

         public e(GameProfile $$1, wu $$2, boolean $$3) {
            this.e = $$2;
            this.g = $$3;
            this.f = a.this.c.an().a($$1);
         }

         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fgd.a($$0, this.f.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fpe.this.p, this.e, $$10 + 12 + 4, $$12, this.g ? -1 : -1593835521);
         }
      }

      public class f extends fpe.a.b {
         @Override
         public void a(fer $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
