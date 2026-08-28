import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fsh extends fnx {
   static final akq a = akq.b("icon/checkmark");
   private static final wy b = wy.c("gui.chatSelection.title");
   private static final wy c = wy.c("gui.chatSelection.context");
   @Nullable
   private final fnx q;
   private final gai r;
   private fig s;
   private fiz u;
   @Nullable
   private fsh.a v;
   final gab.a w;
   private final Consumer<gab.a> x;
   private fsg y;

   public fsh(@Nullable fnx $$0, gai $$1, gab.a $$2, Consumer<gab.a> $$3) {
      super(b);
      this.q = $$0;
      this.r = $$1;
      this.w = $$2.d();
      this.x = $$3;
   }

   @Override
   protected void aP_() {
      this.y = new fsg(this.r, this::a);
      this.u = fiz.a(this.o, c, this.m - 16);
      this.v = this.c(new fsh.a(this.l, (this.u.a() + 1) * 9));
      this.c(fig.a(wx.k, $$0 -> this.d()).a(this.m / 2 - 155, this.n - 32, 150, 20).a());
      this.s = this.c(fig.a(wx.d, $$0 -> {
         this.x.accept(this.w);
         this.d();
      }).a(this.m / 2 - 155 + 160, this.n - 32, 150, 20).a());
      this.E();
      this.m();
      this.v.b((double)this.v.p());
   }

   private boolean a(fzx $$0) {
      return $$0.a(this.w.f());
   }

   private void m() {
      int $$0 = this.v.c();
      this.y.a($$0, this.v);
   }

   void D() {
      this.m();
   }

   void E() {
      this.s.j = !this.w.a().isEmpty();
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 10, 16777215);
      AbuseReportLimits $$4 = this.r.a().b();
      int $$5 = this.w.a().size();
      int $$6 = $$4.maxReportedMessageCount();
      wy $$7 = wy.a("gui.chatSelection.selected", $$5, $$6);
      $$0.a(this.o, $$7, this.m / 2, 16 + 9 * 3 / 2, -1);
      this.u.a($$0, this.m / 2, this.v.J());
   }

   @Override
   public void d() {
      this.l.a(this.q);
   }

   @Override
   public wy i() {
      return wx.a(super.i(), c);
   }

   public class a extends fjc<fsh.a.b> implements fsg.a {
      @Nullable
      private fsh.a.c m;

      public a(final fgi $$1, final int $$2) {
         super($$1, fsh.this.m, fsh.this.n - $$2 - 80, 40, 16);
      }

      @Override
      public void b(double $$0) {
         double $$1 = this.n();
         super.b($$0);
         if ((float)this.p() > 1.0E-5F && $$0 <= 1.0E-5F && !ayn.b($$0, $$1)) {
            fsh.this.D();
         }
      }

      @Override
      public void a(int $$0, fzx.a $$1) {
         boolean $$2 = $$1.a(fsh.this.w.f());
         fzv $$3 = $$1.h();
         fgd $$4 = $$3.a($$1.g());
         fsh.a.b $$5 = new fsh.a.d($$0, $$1.b(), $$1.c(), $$4, $$2, true);
         this.c($$5);
         this.a($$1, $$2);
      }

      private void a(fzx.a $$0, boolean $$1) {
         fsh.a.b $$2 = new fsh.a.e($$0.f(), $$0.d(), $$1);
         this.c($$2);
         fsh.a.c $$3 = new fsh.a.c($$0.e(), $$2);
         if (this.m != null && this.m.a($$3)) {
            this.d(this.m.b());
         }

         this.m = $$3;
      }

      @Override
      public void a(wy $$0) {
         this.c(new fsh.a.f());
         this.c(new fsh.a.a($$0));
         this.c(new fsh.a.f());
         this.m = null;
      }

      @Override
      public int b() {
         return Math.min(350, this.g - 50);
      }

      @Override
      public int c() {
         return ayn.e(this.h, this.d);
      }

      @Override
      protected void a(fht $$0, int $$1, int $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8) {
         fsh.a.b $$9 = this.d($$4);
         if (this.b($$9)) {
            boolean $$10 = this.h() == $$9;
            int $$11 = this.aK_() && $$10 ? -1 : -8355712;
            this.a($$0, $$6, $$7, $$8, $$11, -16777216);
         }

         $$9.a($$0, $$4, $$6, $$5, $$7, $$8, $$1, $$2, this.v() == $$9, $$3);
      }

      private boolean b(fsh.a.b $$0) {
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
      protected fsh.a.b b(fmk $$0) {
         return this.a($$0, fsh.a.b::c);
      }

      public void a(@Nullable fsh.a.b $$0) {
         super.a($$0);
         fsh.a.b $$1 = this.b(fmk.a);
         if ($$1 == null) {
            fsh.this.D();
         }
      }

      @Override
      public boolean a(int $$0, int $$1, int $$2) {
         fsh.a.b $$3 = this.h();
         return $$3 != null && $$3.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
      }

      @Override
      public int J() {
         return this.G() + 9;
      }

      public class a extends fsh.a.b {
         private static final int b = -6250336;
         private final wy c;

         public a(final wy $$1) {
            this.c = $$1;
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$2 + $$5 / 2;
            int $$11 = $$3 + $$4 - 8;
            int $$12 = fsh.this.o.a(this.c);
            int $$13 = ($$3 + $$11 - $$12) / 2;
            int $$14 = $$10 - 9 / 2;
            $$0.b(fsh.this.o, this.c, $$13, $$14, -6250336);
         }

         @Override
         public wy a() {
            return this.c;
         }
      }

      public abstract class b extends fjc.a<fsh.a.b> {
         @Override
         public wy a() {
            return wx.a;
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

      static record c(UUID a, fsh.a.b b) {
         public boolean a(fsh.a.c $$0) {
            return $$0.a.equals(this.a);
         }
      }

      public class d extends fsh.a.b {
         private static final int b = 9;
         private static final int c = 8;
         private static final int d = 11;
         private static final int e = 4;
         private final int f;
         private final xd g;
         private final wy h;
         @Nullable
         private final List<axz> i;
         @Nullable
         private final fgd.a j;
         @Nullable
         private final List<axz> k;
         private final boolean l;
         private final boolean m;

         public d(final int $$1, final wy $$2, final wy $$3, @Nullable final fgd $$4, final boolean $$5, final boolean $$6) {
            this.f = $$1;
            this.j = x.a($$4, fgd::f);
            this.k = $$4 != null && $$4.g() != null ? fsh.this.o.c($$4.g(), a.this.b()) : null;
            this.l = $$5;
            this.m = $$6;
            xd $$7 = fsh.this.o.a($$2, this.e() - fsh.this.o.a(wx.u));
            if ($$2 != $$7) {
               this.g = xd.a($$7, wx.u);
               this.i = fsh.this.o.c($$2, a.this.b());
            } else {
               this.g = $$2;
               this.i = null;
            }

            this.h = $$3;
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            if (this.b() && this.l) {
               this.a($$0, $$2, $$3, $$5);
            }

            int $$10 = $$3 + this.f();
            int $$11 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fsh.this.o, tv.a().a(this.g), $$10, $$11, this.l ? -1 : -1593835521);
            if (this.i != null && $$8) {
               fsh.this.b(this.i);
            }

            int $$12 = fsh.this.o.a(this.g);
            this.a($$0, $$10 + $$12 + 4, $$2, $$5, $$6, $$7);
         }

         private void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
            if (this.j != null) {
               int $$6 = $$2 + ($$3 - this.j.d) / 2;
               this.j.a($$0, $$1, $$6);
               if (this.k != null && $$4 >= $$1 && $$4 <= $$1 + this.j.c && $$5 >= $$6 && $$5 <= $$6 + this.j.d) {
                  fsh.this.b(this.k);
               }
            }
         }

         private void a(fht $$0, int $$1, int $$2, int $$3) {
            int $$5 = $$1 + ($$3 - 8) / 2;
            RenderSystem.enableBlend();
            $$0.a(fsh.a, $$2, $$5, 9, 8);
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
         public wy a() {
            return (wy)(this.b() ? wy.a("narrator.select", this.h) : this.h);
         }

         @Override
         public boolean a(double $$0, double $$1, int $$2) {
            a.this.a(null);
            return this.h();
         }

         @Override
         public boolean a(int $$0, int $$1, int $$2) {
            return fmh.a($$0) ? this.h() : false;
         }

         @Override
         public boolean b() {
            return fsh.this.w.b(this.f);
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
               fsh.this.w.a(this.f);
               fsh.this.E();
               return true;
            } else {
               return false;
            }
         }
      }

      public class e extends fsh.a.b {
         private static final int b = 12;
         private static final int c = 4;
         private final wy d;
         private final Supplier<grf> e;
         private final boolean f;

         public e(final GameProfile $$1, final wy $$2, final boolean $$3) {
            this.d = $$2;
            this.f = $$3;
            this.e = a.this.c.am().a($$1);
         }

         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
            int $$10 = $$3 - 12 + 4;
            int $$11 = $$2 + ($$5 - 12) / 2;
            fjf.a($$0, this.e.get(), $$10, $$11, 12);
            int $$12 = $$2 + 1 + ($$5 - 9) / 2;
            $$0.b(fsh.this.o, this.d, $$10 + 12 + 4, $$12, this.f ? -1 : -1593835521);
         }
      }

      public class f extends fsh.a.b {
         @Override
         public void a(fht $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, float $$9) {
         }
      }
   }
}
